/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterData.Class;

import DBClass.DBFacade;
import java.sql.ResultSet;


/**
 *
 * @author chamod
 */
public class BloodTypeData {
      DBFacade db = new DBFacade();
    
    public ResultSet GetBloodType(String details) {
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM bloodtype where Type like '" + details + "%'";
            rs = (ResultSet) db.fetch(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet SearchBloodType(String details) {
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM bloodtype where TypeId like '" + details + "'";
            rs = (ResultSet) db.fetch(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
