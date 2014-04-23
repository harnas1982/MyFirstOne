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
	
	public Map<Integer,String> getMainModelMap() {
		return mainMap;
	}
	
	public void setMainModelMap(Map<Integer, String> map) {
		
		mainMap = map;
	}
		
	
}
