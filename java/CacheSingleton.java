package java;

import java.util.HashMap;
import java.util.Map;

public class CacheSingleton {
    private static CacheSingleton instance;
    private Map<String, Integer> cache;

    private CacheSingleton() {
        cache = new HashMap<>();
    }

    public static CacheSingleton getInstance() {
        if (instance == null) {
            instance = new CacheSingleton();
        }
        return instance;
    }

    public void put(String key, int value) {
        cache.put(key, value);
    }

    public Integer get(String key) {
        return cache.getOrDefault(key, -1);  // Return -1 if the key doesn't exist
    }

    public void remove(String key) {
        cache.remove(key);
    }
}
