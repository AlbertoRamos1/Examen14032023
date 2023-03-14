package com.arc.examen.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.arc.examen.models.Materia;

public class ControladorMateria {
	
	public static List<Materia> findAll(String sql) {
		List<Materia> materias = new ArrayList<Materia>();
		
		try {
			Connection conn = ConnectionManagerV1.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Materia m = new Materia();
				m.setId(rs.getInt("id"));
				m.setNombre(rs.getString("nombre"));
				m.setIdNivel(rs.getInt("idNivel"));
				m.setCodigo(rs.getString("codigo"));
				m.setUrlClassroom(rs.getString("urlClassroom"));
				m.setAdmiteMatricula(rs.getBoolean("admiteMatricula"));
				m.setFechaInicio(rs.getString("fechaInicio"));
				
				materias.add(m);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return materias;
	}
	
public static int modificar (Materia m) {
		
		try {
			Connection conn = ConnectionManagerV1.getConexion();
			PreparedStatement ps = conn.prepareStatement(
					"update examen14032023.materia set nombre = ?, idNivel = ?, codigo = ?, urlClassroom = ?, fechaInicio = ? where id = ?");
		
			ps.setString(1, m.getNombre());
			ps.setInt(2, m.getIdNivel());
			ps.setString(3, m.getCodigo());
			ps.setString(4, m.getUrlClassroom());
			ps.setString(5, m.getFechaInicio());
			ps.setInt(6, m.getId());
			int rows = ps.executeUpdate();
			ps.close();
			conn.close();
			return rows;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
