package com.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Media.Equestrian;
import com.Service.EquestrianService;

public class EquestrianController {
	
	public void getEquInfoD() throws SQLException {
		EquestrianService es = new EquestrianService();
		ArrayList<Equestrian> al = es.getEquInfo();
		System.out.println("all Equestrians Information");
		System.out.println("---------------------------\n");
		
		for (Equestrian equestrian : al) {
			System.out.println(equestrian);
		}
		System.out.println("\n");
	}
	public void setEquInfoD(int id, String name, String gender, String country, int medals) throws SQLException {
		EquestrianService es = new EquestrianService();
		String set = es.setEquInfo(id, name, gender, country, medals);
		System.out.println("Data Save and " + set);
	}
	public void setDeleteEquData1(int id) throws SQLException {
		EquestrianService es = new EquestrianService();
		String set = es.setDeleteEquData(id);
		System.out.println("Data Save and " + set);
	}
	public void setUpdateEquData1(int id) throws SQLException {
		EquestrianService es = new EquestrianService();
		String set = es.setUpdateEquData(id);
		System.out.println("Data Save and " + set);
	}
	public static void main(String[] args) throws SQLException {
		EquestrianController ec = new EquestrianController();
		ec.getEquInfoD();
		ec.setEquInfoD(109, "Reiner Klimke", "Male", "Germany", 8);
		ec.setDeleteEquData1(9);
		ec.setUpdateEquData1(107);
		}
	}

