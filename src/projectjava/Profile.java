
package projectjava;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JPanel;

public class Profile {
    String id;
    String name;
    String faculty;
    String major;
    String gender;
    String dorm;
    String room;
    String phone;
    double fee;
    byte[] image;
    Profile(String name,String id,String facul,String maj,String gen,String dorm,String room,String ph,double dormfee,byte[] img){
        this.name = name;
        this.id = id;
        faculty = facul;
        major = maj;
        gender = gen;
        this.dorm = dorm;
        this.room = room;
        phone = ph;
        fee = dormfee;
        image = img;
    }
    public String getName(){
        return name;
    }
    
    public boolean checkRoom(String num_room){
        boolean check = false;
        double fee;
        if(dorm == null){
            dorm = num_room.substring(5,6);
            room = num_room.substring(5, 8);
            System.out.println(dorm);
            System.out.println(room);
            int intdorm = Integer.parseInt(dorm);
            if(intdorm % 2 == 0) this.fee = 2000;
            else this.fee = 4000;
            try{
                DBConnect db = new DBConnect();
                String sql = String.format("INSERT INTO nisitdata.all_dorm (ID,Name,Gender,Dormitory,Room) VALUE ('%s','%s','%s','%s','%s')",id,name,gender,dorm,room);
                db.getUpdate(sql);
                sql = String.format("INSERT INTO nisitdata.dorm" + dorm + " (ID,Room,Fee) VALUE ('%s','%s','%f')",id,room,this.fee);
                db.getUpdate(sql);
                db.disconnect();
                System.out.println("BOOK SUCCESS");
                check = true;
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return check;
    }
    
    public void setColor(javax.swing.JLabel[] color ,String dorm){
         
        try{
            DBConnect db = new DBConnect();
            String sql = String.format("SELECT * FROM nisitdata.dorm" + dorm);
            ResultSet rs = db.getConnect(sql);
            int i = 0;
            while(rs.next()){
                i++;
                String new_room = "ROOM ";
                String room_num = rs.getString("Room");
                new_room += room_num;
                for(javax.swing.JLabel paint : color){
                    if(paint.getText().equals(new_room)) {
                        paint.setForeground(Color.red);
                        break;
                    }
                }
            }
            db.disconnect();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public String delete(){
        try{
            DBConnect db = new DBConnect();
            String sql = String.format("DELETE FROM nisitdata.all_dorm WHERE (ID = '%s');",id);
            db.getUpdate(sql);
            db.disconnect();
            System.out.println("DELETE SUCCESS");
            return "DELETE SUCCESS";
            }
            catch(Exception ex){
                ex.printStackTrace();
                return "Something went wrong";
            }
    }
    
//    public boolean getData(){
//        try{
//            DBConnect db = new DBConnect();
//            ResultSet rs = null;
//            String sql = String.format("SELECT * FROM nisitdata.all_dorm WHERE ID = '%s' and Name = '%s'",id,name);
//            rs = db.getConnect(sql);
//            boolean verify = rs.next();
//            String rsdorm = rs.getString("Dormitory");
//            String rsroom = rs.getString("Room");
//            dorm = rsdorm;
//            room = rsroom;
//       
//            db.disconnect();
//            
//            
//            return verify;
//        }
//        catch(Exception ex){
//            ex.printStackTrace();
//            return false;
//        }
//    }
    
    
}
