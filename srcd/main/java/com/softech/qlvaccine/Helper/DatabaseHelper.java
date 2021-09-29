/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.qlvaccine.Helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author leduc
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://C9HPC:1433;databaseName=QLVaccine";
            String dbusername ="sa";
            String password ="123";
            Connection con = DriverManager.getConnection(url, dbusername, password);
           return con;
    }
}
