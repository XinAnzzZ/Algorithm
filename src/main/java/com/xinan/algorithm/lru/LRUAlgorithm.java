package com.xinan.algorithm.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU = Least Recently Used. 最近最少使用算法。
 *
 * @author Moore
 * @since 2020/04/07
 */
public class LRUAlgorithm {

    public static void main(String[] args) {

    }

    public static class LRUCacheByLinkedHashMap<K, V> {

        private final int CACHE_SIZE;

        private LinkedHashMap<K, V> cache;

        public LRUCacheByLinkedHashMap(int cacheSize) {
            CACHE_SIZE = cacheSize;
            this.cache = new LinkedHashMap<K, V>(CACHE_SIZE, 0.75F, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry eldest) {
                    return cache.size() + 1 >= CACHE_SIZE;
                }
            };
        }

        public Object getByKey(K key) {
            return cache.get(key);
        }

        public V set(K key, V value) {
            return cache.put(key, value);
        }

        public V removeByKey(K key) {
            return cache.remove(key);
        }
    }
}
