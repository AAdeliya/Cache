package java;

import java.util.HashMap;
import java.util.Map;

public class CachePrototype implements Cloneable {
    private Map<String, Integer> cache = new HashMap<>();

    public void put(String key, int value) {
        cache.put(key, value);
    }

    public Integer get(String key) {
        return cache.getOrDefault(key, -1);
    }

    @Override
    protected CachePrototype clone() throws CloneNotSupportedException {
        CachePrototype clonedCache = (CachePrototype) super.clone();
        clonedCache.cache = new HashMap<>(this.cache); // Deep copy of the cache map
        return clonedCache;
    }

    public static void main(String[] args) {
        CachePrototype originalCache = new CachePrototype();
        originalCache.put("key1", 10);
        
        try {
            // Clone the cache
            CachePrototype clonedCache = originalCache.clone();
            System.out.println("Original cache value: " + originalCache.get("key1")); // Output: 10
            System.out.println("Cloned cache value: " + clonedCache.get("key1")); // Output: 10
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

