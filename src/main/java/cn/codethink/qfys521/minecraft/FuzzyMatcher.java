package cn.codethink.qfys521.minecraft;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class FuzzyMatcher {
	
	private final String[] list; 
	private float threshold; 
	private int limit; 
	
	public FuzzyMatcher(String[] list) {
		int len = list.length; 
		this.list = Arrays.copyOf(list, len); 
		this.threshold = Float.NaN; 
		this.limit = -1; 
	}
	
	public FuzzyMatcher setThreshold(float threshold) {
		this.threshold = threshold; 
		return this; 
	}
	
	public FuzzyMatcher clearThreshold() {
		this.threshold = Float.NaN; 
		return this; 
	}
	
	public FuzzyMatcher setLimit(int limit) {
		this.limit = limit; 
		return this; 
	}
	
	public FuzzyMatcher clearLimit() {
		this.limit = -1; 
		return this; 
	}
	
	public List<Entry<String, Float>> find(String str) {
		int len = list.length; 
		List<Entry<String, Float>> matches = new ArrayList<Entry<String, Float>>(len); 
		for(int i = 0; i < len; i++) {
			float distance = new FuzzyEvaluator(str, this.list[i]).getDistance(); 
			if(Float.isNaN(this.threshold) || distance <= this.threshold) 
				matches.add(new AbstractMap.SimpleEntry<String, Float>(this.list[i], distance));  
		}
		matches.sort(new Comparator<Entry<String, Float>>() {
			@Override
			public int compare(Entry<String, Float> o1, Entry<String, Float> o2) {
				return Float.compare(o1.getValue(), o2.getValue()); 
			}
		});
		if(this.limit > 0 && this.limit < matches.size()) matches = matches.subList(0, this.limit); 
		return matches; 
	}
	
}
