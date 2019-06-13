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
public class BloodRequestData {
DBFacade db = new DBFacade();

    public int saveRequest(String HospitalId, String description, String consulten, String vol, String InsertDate, String typeid,String pationid) {
     int val = 0;

         try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `request` (`HId`,`Description`,`ConsultentName`,`RequestVol`,`Date`,`TypeId`,`PationId`) VALUES (?,?,?,?,?,?,?);");
            pst2.setString(1, HospitalId);
            pst2.setString(2, description);
            pst2.setString(3, consulten);
            pst2.setString(4, vol);
            pst2.setString(5, InsertDate);
            pst2.setString(6, typeid);
            pst2.setString(7, pationid);
            val = pst2.executeUpdate();
           // ResultSet rsmax = (ResultSet) pst2.getGeneratedKeys();
           
            pst2 = null;
           // rsmax = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;     
    }
    
    public ResultSet ShowRequest(String Reqid){
     ResultSet rs = null;
        try {
            String query = ("SELECT  * FROM request where  RequestID like  '" + Reqid + "%' AND Settled like '0' order by Date");
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
     public boolean updateRequest(String id) {
        boolean val = false;
        try {
            // String datetime=new SimpleDateFormat("dd/MM/yyyy HH.mm.ss").format(new Date());
            PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE  request SET  Settled='1' , SettledDate=NOW() WHERE RequestID='" + id + "'");
            pst.executeUpdate();
            val = true;
        } catch (Exception e) {
            e.printStackTrace();
            val = false;
        }
        return val;
    }
    
    
    public int saveRequest(String pationId, String description, String vol, String InsertDate, String typeid) {
     int val = 0;

         try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `request` (`PationId`,`Description`,`RequestVol`,`Date`,`TypeId`) VALUES (?,?,?,?,?);");
            pst2.setString(1, pationId);
            pst2.setString(2, description);
            pst2.setString(3, vol);
            pst2.setString(4, InsertDate);
            pst2.setString(5, typeid);
            //pst2.setString(7, pationid);
            val = pst2.executeUpdate();
           // ResultSet rsmax = (ResultSet) pst2.getGeneratedKeys();
           
            pst2 = null;
           // rsmax = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;     
    }
     
}
