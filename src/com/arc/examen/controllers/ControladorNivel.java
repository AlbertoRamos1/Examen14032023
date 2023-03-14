package com.arc.examen.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.arc.examen.models.Nivel;
import com.arc.examen.views.CRUD;

public class ControladorNivel {

	public static List<Nivel> findAll(String sql) {
		List<Nivel> niveles = new ArrayList<Nivel>();
		
		try {
			Connection conn = ConnectionManagerV1.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Nivel n = new Nivel();
				n.setId(rs.getInt("id"));
				n.setDescripcion(rs.getString("descripcion"));
				n.setIdCentro(rs.getInt("idCentro"));
				
				niveles.add(n);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return niveles;
	}
}
