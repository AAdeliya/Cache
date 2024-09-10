package java;
public class CacheBuilder {
    private int capacity;
    private boolean useEviction;
    private String evictionPolicy;

    private CacheBuilder(Builder builder) {
        this.capacity = builder.capacity;
        this.useEviction = builder.useEviction;
        this.evictionPolicy = builder.evictionPolicy;
    }

    public static class Builder {
        private int capacity = 100; // default capacity
        private boolean useEviction = false;
        private String evictionPolicy = "FIFO";

        public Builder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder useEviction(boolean useEviction) {
            this.useEviction = useEviction;
            return this;
        }

        public Builder evictionPolicy(String evictionPolicy) {
            this.evictionPolicy = evictionPolicy;
            return this;
        }

        public CacheBuilder build() {
            return new CacheBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "CacheBuilder{" +
                "capacity=" + capacity +
                ", useEviction=" + useEviction +
                ", evictionPolicy='" + evictionPolicy + '\'' +
                '}';
    }
    
    public static void main(String[] args) {
        CacheBuilder cache = new CacheBuilder.Builder()
                                .capacity(500)
                                .useEviction(true)
                                .evictionPolicy("LRU")
                                .build();
        System.out.println(cache);
    }
}
