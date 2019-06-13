/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterData.Class;

import DBClass.DBFacade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author chamod
 */
public class UserData {
    DBFacade db = new DBFacade();
    
     public int saveUser(String Name, String userName, String password, String email) {
     int val = 0;

         try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `admin` (`Name`,`UserName`,`Password`,`email`) VALUES (?,?,?,?);");
            pst2.setString(1, Name);
            pst2.setString(2, userName);
            pst2.setString(3, password);
            pst2.setString(4, email);            
            val = pst2.executeUpdate();
           // ResultSet rsmax = (ResultSet) pst2.getGeneratedKeys();
           
            pst2 = null;
           // rsmax = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;   
    } 
//     
//     public ResultSet GetuserData(String id) {
//        ResultSet rs = null;
//        try {
//            String sql = "SELECT AdminId,Name,UserName,Password,email FROM admin where AdminId like '" + id + "%'";
//            rs = (ResultSet) db.fetch(sql);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return rs;
//    }
}
