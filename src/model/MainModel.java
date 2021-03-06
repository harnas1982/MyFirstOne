package model;

import java.util.HashMap;
import java.util.Map;

public class MainModel {

	
	private Map<Integer, String> mainMap = new HashMap<Integer, String>();
	
	public MainModel() {
		
	}
	
	public MainModel(Map<Integer, String> map) {
		
		mainMap = map;
	}
	
	public boolean isEmpty() {
		if (mainMap == null) { 
			throw new RuntimeException();
		}
		return mainMap.isEmpty();
	}
	
	public void generateRandomDataForModelMap() {
		
		Integer howManyTimes = Double.valueOf(Math.random()*10).intValue();
		
		
		for (int i=0; i<howManyTimes; i++) {
			mainMap.put(i, Integer.toString(i));
		}
		
	}
	
	public Map<Integer,String> getMainModelMap() {
		return mainMap;
		
	}
	
	// introducing few comments
	//check this out
	// second comments
	// third comments
	// last
		
	
}
