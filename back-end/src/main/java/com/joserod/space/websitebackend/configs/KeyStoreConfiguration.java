package com.joserod.space.websitebackend.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;

@Configuration
class KeyStoreConfiguration {

    public static final String KEYSTORE_VAR = "KEYSTORE";
    public static final String KEYSTORE_PASSWORD_VAR = "KEYSTORE_PASSWORD";

    public static final String TRUSTSTORE_VAR = "TRUSTSTORE";
    public static final String TRUSTSTORE_PASSWORD_VAR = "TRUSTSTORE_PASSWORD";

    private static final String JKS_LOCATION_VAR = "JKS_ROOT_DIRECTORY";

    private static final String FILE_TYPE = "CERTIFICATE_JAVA_FILE_TYPE";

    static final String JAVA_KEYSTORE_PROPERTY = "javax.net.ssl.keyStore";
    static final String JAVA_KEYSTORE_PASSWORD_PROPERTY = "javax.net.ssl.keyStorePassword";

    static final String JAVA_TRUSTSTORE_PROPERTY = "javax.net.ssl.trustStore";
    static final String JAVA_TRUSTSTORE_PASSWORD_PROPERTY = "javax.net.ssl.trustStorePassword";

    private static final Logger logger = LoggerFactory.getLogger(KeyStoreConfiguration.class);

    static {
        setJKSKeystore(KEYSTORE_VAR, JAVA_KEYSTORE_PROPERTY, KEYSTORE_PASSWORD_VAR, JAVA_KEYSTORE_PASSWORD_PROPERTY);
        setJKSKeystore(TRUSTSTORE_VAR, JAVA_TRUSTSTORE_PROPERTY, TRUSTSTORE_PASSWORD_VAR, JAVA_TRUSTSTORE_PASSWORD_PROPERTY);
    }

    /**
     * Base64 decodes the contents of the specified environment variable and writes the result to a file on disk.
     * Sets the specified system property to the absolute path of the decoded file.
     *
     * If the environment variable named by {@param passwordEnvVar} is set, the value of this environment variable
     * is set for the system property specified by {@param systemPasswordProperty}.
     */
    static void setJKSKeystore(String envVar, String systemProperty, String passwordEnvVar, String systemPasswordProperty) {
        final String encodedJks = System.getenv(envVar);
        System.out.println("KEYSTORE_VAR: " + envVar + System.getenv(envVar));
        System.out.println("JAVA_KEYSTORE_PROPERTY: " + systemProperty);
        System.out.println("KEYSTORE_PASSWORD_VAR: " + passwordEnvVar + System.getenv(passwordEnvVar));
        System.out.println("JAVA_KEYSTORE_PASSWORD_PROPERTY: " + systemPasswordProperty + System.getenv(systemPasswordProperty));
        System.out.println("FILE_TYPE: "  + System.getenv(FILE_TYPE));
        if (StringUtils.isEmpty(encodedJks)) {
            logger.info("No " + envVar + " environment variable defined");
            return;
        }

        // allow override of the destination directory
        String dir = System.getenv(JKS_LOCATION_VAR);
        if (StringUtils.isEmpty(dir)) {
            dir = "/home/";
        }
        final String fileType = System.getenv(FILE_TYPE);
        byte[] jks = Base64Utils.decodeFromString(encodedJks);
        System.out.println("Got here");
        try {
            String location = Paths.get(dir, envVar.toLowerCase()) + "." + fileType;
            try (OutputStream stream = new FileOutputStream(location)) {
                stream.write(jks);
            }
            System.setProperty(systemProperty, location);
            logger.info("Created " + fileType + " at {}", location);

            String pass = System.getenv(passwordEnvVar);
            if (!StringUtils.isEmpty(pass)) {
                System.setProperty(systemPasswordProperty, pass);
                logger.info("set password property {}", systemPasswordProperty);
            }
        } catch (IOException e) {
            logger.error("Couldn't write " + fileType + " file", e);
        }
    }
}