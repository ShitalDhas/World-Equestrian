package com.Service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Dao.EquestrianDao;
import com.Media.Equestrian;

public class EquestrianService {
	public ArrayList<Equestrian> getEquInfo() throws SQLException {
		EquestrianDao ed = new EquestrianDao();
		ArrayList<Equestrian> al = ed.getEquestrianInfo();
		System.out.println("Data Sending to Controller ....!!!! \n" );
		return al;
	}
	
	public String setEquInfo(int id, String name, String gender, String country, int medals) throws SQLException{
		EquestrianDao ed = new EquestrianDao();
		String set = ed.setEquetsrianInfo(id, name, gender, country, medals);
		return set;
	}
	
	public String setDeleteEquData(int id) throws SQLException{
		EquestrianDao ed = new EquestrianDao();
		String set = ed.deleteEquestrianData(id);
		return set;
	}
	
	public String setUpdateEquData(int id) throws SQLException{
		EquestrianDao ed = new EquestrianDao();
		String set = ed.UpdateEquestrianData(id);
		return set;
	}
}
