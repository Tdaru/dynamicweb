package com.register.online.login.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.register.online.login.registerdto;

public class registerdao {
	
	
	public static  int save(registerdto emp)
	{
		int status=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_salary","root","password");
			  PreparedStatement stm= con.prepareStatement("insert into registration(name,place,mobile)values(?,?,?)");
			  stm.setString(1,emp.getUsername());
			  stm.setString(2,emp.getPlace());
			  stm.setString(3,emp.getMobile());
		status =stm.executeUpdate();
			  con.close();
			  
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		return status;
		
	}

}
