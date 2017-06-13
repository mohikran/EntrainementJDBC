package com.apiccini.EntrainementJDBC.Service;

import java.util.Collection;

import com.apiccini.EntrainementJDBC.DAO.HumainDAO;
import com.apiccini.EntrainementJDBC.Domaine.Humain;

public class HumainService {

	HumainDAO hDAO = new HumainDAO();

	public Humain getonepersonne(int secu) {
		return hDAO.getHumainSecu(secu);
	}

	public Collection<Humain> getallpersonne() {
		return hDAO.getAllhumain();
	}
}
