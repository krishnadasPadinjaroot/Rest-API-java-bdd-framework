package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigReader {

    private static final Properties properties = new Properties();

    static {

        try (InputStream input =
                     ConfigReader.class.getClassLoader()
                             .getResourceAsStream("config.properties")) {

            if (input == null) {
                throw new RuntimeException("config.properties not found.");
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Unable to load config.properties", e);
        }
    }

    private ConfigReader() {
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getBaseUrl() {
        return getProperty("base.url");
    }

    public static String getEnvironment() {
        return getProperty("environment");
    }

    public static String getUsername() {
        return getProperty("username");
    }

    public static String getPassword() {
        return getProperty("password");
    }

    public static String getToken() {
        return getProperty("token");
    }

    public static int getConnectionTimeout() {
        return Integer.parseInt(getProperty("connection.timeout"));
    }

    public static int getReadTimeout() {
        return Integer.parseInt(getProperty("read.timeout"));
    }
    public static String getApiKey() {
        return getProperty("api.key");
    }

}