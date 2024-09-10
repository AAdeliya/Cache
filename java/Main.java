package java;

public class Main {
    public static void main(String[] args) {
        Cache myCache = new Cache();

        myCache.put("apple", 1);
        myCache.put("banana", 2);
        myCache.put("orange", 3);

        System.out.println("Value for apple: " + myCache.get("apple")); // Output: 1
        System.out.println("Value for banana: " + myCache.get("banana")); // Output: 2
        System.out.println("Value for non-existent key: " + myCache.get("pear")); // Output: -1
        System.out.println("Cache size: " + myCache.size()); // Output: 3

        
        myCache.remove("banana");
        System.out.println("Cache size after removal: " + myCache.size()); // Output: 2
        System.out.println("Contains apple: " + myCache.containsKey("apple")); // Output: true
        System.out.println("Contains banana: " + myCache.containsKey("banana")); // Output: false
        myCache.clear();
        System.out.println("Cache size after clearing: " + myCache.size()); // Output: 0
    }
}

    
