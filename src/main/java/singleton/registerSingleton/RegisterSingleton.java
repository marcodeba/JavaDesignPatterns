package singleton.registerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by marcopan on 2018/9/14.
 */
public class RegisterSingleton {
    private static Map<String, Object> register = new ConcurrentHashMap<String, Object>();

    private RegisterSingleton() {
    }

    public static RegisterSingleton getInstance(String name) {
        if ("".equals(name) || name == null) {
            name = RegisterSingleton.class.getName();
        }

        if (register.get(name) == null) {
            register.put(name, new RegisterSingleton());
        }

        return (RegisterSingleton) register.get(name);
    }
}
