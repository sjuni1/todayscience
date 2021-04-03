package org.pdc.TodayScience.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MariaDBConnect {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement psmt = null;

    private String url = "jdbc:mariadb://incal.site:3306/";
    private String UserId = "root";
    private String UserPw = "tr2042255";

    private Connection connection = null;
    public String Run() {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url,UserId,UserPw);
            return "Connection success";
        } catch (Exception E) {
            return "Connection failure";
        }
    }
}
