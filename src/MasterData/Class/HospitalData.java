/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterData.Class;

import DBClass.DBFacade;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author chamod
 */
public class HospitalData {

    DBFacade db = new DBFacade();

    public ResultSet GetHospital(String details) {
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM hospital where HId like '" + details + "%'";
            rs = (ResultSet) db.fetch(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet SearchHospital(String id) {
        ResultSet rs = null;
        try {
            // String t = txttot;
            String sql = "SELECT HName FROM hospital Where HId like '" + id + "'";
            rs = (ResultSet) db.fetch(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;

    }

    public int saveHospital(String HName, String des, String contact1, String contact2, String Address) {
        int val = 0;

        try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `hospital` (`HName`,`Description`,`Contact1`,`Contact2`,`Address`) VALUES (?,?,?,?,?);");
            pst2.setString(1, HName);
            pst2.setString(2, des);
            pst2.setString(3, contact1);
            pst2.setString(4, contact2);
            pst2.setString(5, Address);
            val = pst2.executeUpdate();
            // ResultSet rsmax = (ResultSet) pst2.getGeneratedKeys();

            pst2 = null;
            // rsmax = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }

//     public int getMaxHId() {
//         int a = 1;
//        ResultSet rs = null;
//        try {
//            String quary = "SELECT  (MAX(HId) +1 ) AS SysTra FROM  posting ";
//            rs = (ResultSet) db.fetch(quary);
//            while (rs.next()) {
//                a = rs.getInt("SysTra");
//            }
//            rs.close();
//            rs = null;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return a;
//    }
    public int updateHospital(String hospitalId, String hospitalName, String contact1, String contact2, String description, String address) {
        int val = 0;
        try {
            PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE `hospital` SET `HName` = '" + hospitalName + "',"
                    + "`Description` = '" + description + "',`Contact1` = '" + contact1 + "',`Contact2` = '" + contact2 + "',"
                    + "`Address` = '" + address + "' WHERE `HId` = '" + hospitalId + "'");
            val = pst.executeUpdate();
            System.err.println("update complete");
            val = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }

}
