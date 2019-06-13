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
public class DonerData {
    DBFacade db = new DBFacade();
    
     public int saveDoner(String name, String address,String Gender, String BirthDay, String typeId, String contactNo1, String contactNo2,String weight) {
     int val = 0;

         try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `donor` (`name`,`address`,`gender`,`BirthDay`,`type`,`contactNo1`,`contactNo2`,`Weight`) VALUES (?,?,?,?,?,?,?,?);");
            pst2.setString(1, name);
            pst2.setString(2, address);
            pst2.setString(3, Gender); 
            pst2.setString(4, BirthDay);
            pst2.setString(5, typeId);
            pst2.setString(6, contactNo1);
            pst2.setString(7, contactNo2);
             pst2.setString(8,  weight);
            val = pst2.executeUpdate();
           // ResultSet rsmax = (ResultSet) pst2.getGeneratedKeys();
           
            pst2 = null;
           // rsmax = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;   
    }   
     
      public ResultSet ShowDoner(String id){
     ResultSet rs = null;
        try {
            String query = ("SELECT  * FROM donor where  DonorId like  '" + id + "%'");
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
      
      public int updateDoner(String donerId, String name, String address,String gender, String bDay, String contact1, String contact2,String typeId) {
        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE `donor` SET `name` = '" + name + "',"
                    + "`address` = '" + address + "',`gender` = '" + gender + "',"
                    + "`BirthDay` = '" + bDay + "',`type` = '"+typeId+"',`contactNo1` = '"+contact1+"' , `contactNo2` = '"+contact2+"' WHERE `DonorId` = '" + donerId + "'");
            val = pst.executeUpdate();
            System.err.println("update complete");
            val = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }
    
}
