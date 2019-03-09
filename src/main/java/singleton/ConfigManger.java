package singleton;

import java.io.*;
import java.util.Properties;

/**
 * Created by marcopan on 17/10/10.
 */
public class ConfigManger {
    private static final String fPath = System.getProperty("user.dir") + File.separator + "singleton.properties";
    private static final ConfigManger configManger = new ConfigManger();
    private File file = null;
    private Properties props = null;
    private long lastModifiedTime = 0;

    private ConfigManger() {
        file = new File(fPath);
        lastModifiedTime = file.lastModified();
        if (lastModifiedTime == 0) {
            System.err.println(fPath + " file doesn't exist");
        }
        props = new Properties();
        try {
            props.load(new FileInputStream(fPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized static ConfigManger getInstance() {
        return configManger;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("property item to read");
            try {
                String line = reader.readLine();
                if ("quit".equals(line)) break;
                System.out.println(ConfigManger.getInstance().getConfigItem(line));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (true);
    }

    private Object getConfigItem(String key) {
        long newModifiedTime = file.lastModified();
        if (newModifiedTime == 0) {
            return null;
        } else if (newModifiedTime > lastModifiedTime) {
            props.clear();
            try {
                props.load(new FileInputStream(fPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        lastModifiedTime = newModifiedTime;
        Object value = props.getProperty(key, "");
        return value;
    }
}
