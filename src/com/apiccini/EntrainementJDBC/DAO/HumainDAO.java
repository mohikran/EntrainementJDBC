package com.apiccini.EntrainementJDBC.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.apiccini.EntrainementJDBC.Domaine.Humain;

public class HumainDAO {
	String url = "jdbc:mysql://localhost/personne";
	String login = "root";
	// String passwd = "root";
	String passwd = "";
	Connection cn = null;
	Statement st = null;
	java.sql.ResultSet rs = null;

	public Humain getHumainSecu(int secu) {
		String nom, prenom = null;
		// int secu = null;
		Humain humain = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "SELECT * FROM humains WHERE Secu=" + secu;

			rs = st.executeQuery(sql);
			rs.next();

			nom = rs.getString(1);
			prenom = rs.getString(2);
			humain = new Humain(nom, prenom, secu);

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// etape 5 liberer ressources de la memoire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return humain;
	}

	public Collection<Humain> getAllhumain() {
		String nom, prenom = null;
		int secu = 0;
		Humain humain = null;
		ArrayList<Humain> listeGens = new ArrayList<Humain>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "SELECT * FROM humains";

			rs = st.executeQuery(sql);
			//rs.next(); 

			while (rs.next()) {
				nom = rs.getString(1);
				prenom = rs.getString(2);
				secu = rs.getInt(3);

				humain = new Humain(nom, prenom, secu);
				listeGens.add(humain);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// etape 5 liberer ressources de la memoire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listeGens;
	}
}
