
package projectjava;

import java.sql.*;

public class DBConnect {
    public Connection conn = null;
    public Statement stmt ;
    public ResultSet rs;
    
    private String url = "jdbc:mysql://localhost:3306/nisitdata";
    private String username = "tester";//root
    private String password = "admin";//admin12
    
    public DBConnect(){
        try{
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Successful");
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public ResultSet getConnect(String sql){
        try{
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public void getUpdate(String sql){
        try{
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void disconnect(){
        try{
            stmt.close();
            conn.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
