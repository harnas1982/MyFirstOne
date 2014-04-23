package logic;

import model.MainModel;

public class MainStarter {
	
	private MainModel model;
	
	public MainStarter() {
		
		model = new MainModel();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainStarter starter = new MainStarter();
		starter.model.isEmpty();
		
	}

}
