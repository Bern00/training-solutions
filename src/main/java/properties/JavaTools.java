package properties;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;


public class JavaTools {

    private static final String ENCODING_UTF8 = "UTF-8";
    Properties config;

    public JavaTools() {

        try (InputStream inputStream = JavaTools.class.getResourceAsStream("/javatools.properties")) {
            load(inputStream);
        } catch (IOException ioe) {
            throw new RuntimeException("File not found", ioe);
        }
    }

    public Set<String> getToolKeys() {
        Set<String> keys = new HashSet<>();
        for(String str: config.stringPropertyNames()) {
            keys.add(str.substring(0, str.indexOf(".")));
        }
        return keys;
    }

    public Set<String> getTools() {
        Set<String> values = new HashSet<>();
        for(String str: config.stringPropertyNames()) {

            if(str.contains("name")) {
                values.add(config.getProperty(str));
            }

        }
        return values;
    }

    public String getName(String str) {
        return config.getProperty(str + ".name");
    }

    public String getUrl(String str) {
        return config.getProperty(str + ".url");
    }

    private Properties load(InputStream inputStream) {
        config = new Properties();
        try (InputStreamReader reader = new InputStreamReader(inputStream, ENCODING_UTF8)) {
            config.load(reader);
        } catch (IOException ioe) {
            throw new RuntimeException("File not found", ioe);
        }
        return config;
    }

}
