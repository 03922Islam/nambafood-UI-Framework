package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        try {
            // daem put' k nawemu failu
            String path = "src/test/resources/configuration.properties";

            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties(); // budet brat' danye s faila
            properties.load(inputStream); // budet brat' s faila configuration
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key).trim();
    }
}
