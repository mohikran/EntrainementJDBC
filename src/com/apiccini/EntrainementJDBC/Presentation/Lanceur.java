package com.apiccini.EntrainementJDBC.Presentation;

import com.apiccini.EntrainementJDBC.Service.HumainService;

public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HumainService hservice = new HumainService();
//System.out.println(hservice.getonepersonne(117));
System.out.println(hservice.getallpersonne());

		
	}

}
