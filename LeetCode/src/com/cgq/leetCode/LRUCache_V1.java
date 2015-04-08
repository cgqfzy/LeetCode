package com.cgq.leetCode;

import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. 
 * It should support the following operations: get and set.
 *
 *	get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 *  set(key, value) - Set or insert the value if the key is not already present. 
When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 * @author kkb
 *
 */

public class LRUCache_V1 {

	private int capacity;
	private LinkedHashMap<Integer, Integer> cache;
	public LRUCache_V1(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity);
    }
    
    public int get(int key) {
        System.out.println(cache.containsKey(key));
    	if(cache.containsKey(key)){
    		int old = cache.get(key);
    		cache.remove(key);
    		cache.put(key, old);
    	}
    	return -1;
    }
    
    public void set(int key, int value) {
        
    	if(cache.containsKey(key)){
    		cache.remove(key);
    		cache.put(key, value);
    	}else{
    		if (cache.size() == capacity){
    			cache.remove(cache.entrySet().iterator().next().getKey());
    		}
    		cache.put(key, value);
    	}
    }

	@Override
	public String toString() {
		return "LRUCache_V1 [capacity=" + capacity + ", cache=" + cache + "]";
	}

    
    
}
