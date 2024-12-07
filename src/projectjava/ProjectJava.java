
package projectjava;
import java.sql.*;

public class ProjectJava {

    public static void main(String[] args) {
//        String[] colname = {"ID","Password"};
//        try{
//            DBConnect db = new DBConnect();
//            String sql = String.format("SELECT * FROM nisitdata.general");
//            ResultSet rs = db.getConnect(sql);
//            int i = 0;
//            while(rs.next()){
//                i++;
//                String name = rs.getString("Name");
//                System.out.println(name);
//            }
//            System.out.println("\n");
//            sql = String.format("SELECT gl.ID , gl.Name , gl.Faculty , gl.Major , gl.Gender ,alld.Dormitory ,alld.Room , gl.ph_number \n" +
//"FROM general AS gl INNER JOIN all_dorm AS alld\n" +
//"ON gl.ID = alld.ID ");
//            rs = db.getConnect(sql);
//            i = 0;
//            while(rs.next()){
//                i++;
//                String name = rs.getString("Name");
//                String fac = rs.getString("Faculty");
//                String mag = rs.getString("Major");
//                String gen = rs.getString("Gender");
//                String dor = rs.getString("Dormitory");
//                String roo = rs.getString("Room");
//                String ph = rs.getString("ph_number");
//                System.out.println(name);
//                System.out.println(fac);
//                System.out.println(mag);
//                System.out.println(gen);
//                System.out.println(dor);
//                System.out.println(roo);
//                System.out.println(ph);
//                System.out.println("\n");
//            }
//            
//            
//            
////            sql = String.format("DELETE FROM nisitdata.all_dorm WHERE (ID = '%s');","b1");
////            db.getUpdate(sql);
////            db.disconnect();
//            
////            sql = String.format("INSERT INTO nisitdata.all_dorm (ID,Name,Gender,Dormitory,Room) VALUE ('%s','%s','%s','%s','%s')","b1","Rat Rin","Male","1","121");
////            db.getUpdate(sql);
////            sql = String.format("INSERT INTO nisitdata.dorm1 (ID,Room) VALUE ('%s','%s')","b1","121");
////            db.getUpdate(sql);
//            db.disconnect();
//
////              sql = String.format("UPDATE nisitdata.all_dorm SET Room = '133' WHERE (ID = 'b1')");
////              db.getUpdate(sql);
////              db.disconnect();
//            
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
        new LoginJFrame().setVisible(true);
    }
    
}
