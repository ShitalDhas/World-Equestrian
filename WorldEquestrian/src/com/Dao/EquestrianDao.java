package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Configuration.EquestrianConfiguration;
import com.Media.Equestrian;


public class EquestrianDao {

	public ArrayList<Equestrian> getEquestrianInfo() throws SQLException {
		Connection con = EquestrianConfiguration.getEquestConfig();
		Statement stmt = con.createStatement();
		String sql = "select * from equestrian";
		ResultSet rs = stmt.executeQuery(sql);
		ArrayList<Equestrian> al = new ArrayList<>();		
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String gender = rs.getString(3);
				String country = rs.getString(4);
				int medals = rs.getInt(5);
				Equestrian e = new Equestrian(id,name,gender,country,medals);
				al.add(e);
			}
		System.out.println("\n\tEquestrians Data Store Safely.......\n");
		return al;
	}
	
	public String setEquetsrianInfo(int id, String name, String gender, String country, int medals ) throws SQLException {
		Connection con = EquestrianConfiguration.getEquestConfig();
		PreparedStatement ps = con.prepareStatement("insert into equestrian(id,name,gender,country,medals) values(?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, gender);
		ps.setString(4, country);
		ps.setInt(5, medals);
		System.out.println("Id = " + id + ",  Name = "+ name + ",  Gender = " + gender + ",  Country = " + country + ",  Medals = " + medals );
		return "Data Inserted.....!!!!! \n\n";
	}
	
	public String deleteEquestrianData(int id) throws SQLException {
		Connection con = EquestrianConfiguration.getEquestConfig();
		PreparedStatement ps = con.prepareStatement("delete from equestrian where id = ?");
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Equestrian data deleted.....!!!!!");
		return "Data deleted....!!!!!! \n\n";
	}
	
	public String UpdateEquestrianData(int id) throws SQLException {
		Connection con = EquestrianConfiguration.getEquestConfig();
		PreparedStatement ps = con.prepareStatement("update equestrian set name = 'Jessica Von Bredow Werndl' where id = ?");
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Equestrian data Updated.....!!!!!");
		return "Data Updated....!!!!!!";
	}
	
	
	
	
}
