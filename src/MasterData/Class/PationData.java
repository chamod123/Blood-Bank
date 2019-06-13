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
public class PationData {
    DBFacade db = new DBFacade();

    public int savePation(String Name, String Address, String IDNumber, String gender, String txtAge,
             String TypeId, String ContactNo1, String ContactNo2,String weight) {
     int val = 0;

         try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `pation` (`Name`,`address`,`IDNumber`,`Gender`,`age`,`Type`,`weight`,`contactNo1`,`ContactNo2`) VALUES (?,?,?,?,?,?,?,?,?);");
            pst2.setString(1, Name);
            pst2.setString(2, Address);
            pst2.setString(3, IDNumber); 
            pst2.setString(4, gender);
            pst2.setString(5, txtAge);
            pst2.setString(6, TypeId);
            pst2.setString(7, weight);
            pst2.setString(8, ContactNo1);
            pst2.setString(9, ContactNo2);
            val = pst2.executeUpdate();           
            pst2 = null;
           // rsmax = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;   
    
    }

    public int updatePation(String Name, String Address, String gender, String Age,String ContactNo1, String ContactNo2, String weight, String IDNumber) {
    int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE `pation` SET `Name` = '" + Name + "',"
                    + "`address` = '" + Address + "',`gender` = '" + gender + "',"
                    + "`age` = '" + Age + "',`contactNo1` = '"+ContactNo1+"',`ContactNo2` = '"+ContactNo2+"' , `weight` = '"+weight+"' WHERE `IDNumber` = '" + IDNumber + "'");
            val = pst.executeUpdate();
            System.err.println("update complete");
            val = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }
    
     public ResultSet showPation(String id){
     ResultSet rs = null;
        try {
            String query = ("SELECT  * FROM pation where  IDNumber like  '" + id + "%'");
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
}
