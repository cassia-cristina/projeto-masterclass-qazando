package runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Util {
    Properties properties;

    public Util() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream("src/test/resources/application-local.properties"));
    }

    public String getProperty(String nameProperties) {
        return properties.getProperty(nameProperties);
    }
}
