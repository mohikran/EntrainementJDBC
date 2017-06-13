package com.apiccini.EntrainementJDBC.Exceptions;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.apiccini.EntrainementJDBC.DAO.HumainDAO;
import com.apiccini.EntrainementJDBC.Service.HumainService;

public class HumainServiceTest extends TestCase {

	public HumainService humainService;
	public HumainDAO hDAO;

	@Before
	public void initialisation(){
		System.out.println("Initialisation");
		humainService = new HumainService();
	}
	
	@After
	public void nettoyage(){
		System.out.println("nettoyage");
		humainService =null;
	}

	
	
	@Test
	public void testnom() {
		//fail("Not yet implemented");
		String Prenom = hDAO.getHumainSecu(117).getPrenom();
		String expect = "Jean";
		System.out.println("Test nom ");
		assertEquals("Prions que le nom soit le même", expect, Prenom);
	}

}
