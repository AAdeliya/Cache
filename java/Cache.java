import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String, Integer> cache;

    public Cache() {
        cache = new HashMap<>();
    }

    public void put(String key, int value) {
        cache.put(key, value);
    }

    public int get(String key) {
        return cache.getOrDefault(key, -1);  // Return -1 if the key doesn't exist
    }

    public void remove(String key) {
        cache.remove(key);
    }

    public void clear() {
        cache.clear();
    }

    public int size() {
        return cache.size();
    }

    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }
}
