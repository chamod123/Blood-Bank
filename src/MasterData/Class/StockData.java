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
public class StockData {

    DBFacade db = new DBFacade();
    GetSetValue typeid = new GetSetValue();

    public ResultSet GetStock(String type) {
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM stock where TypeId like '" + type + "%' and Vol !='0' order by expierDate";
            rs = (ResultSet) db.fetch(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public Boolean updateStock(String id, int cont) {
        boolean val = false;
        int a = 0;
        try {
            ResultSet rs = null;
            String sql = "SELECT Vol FROM stock WHERE StockId LIKE '" + id + "'";
            rs = (ResultSet) db.fetch(sql);
            rs.beforeFirst();
            while (rs.next()) {
                a = (Integer.parseInt(rs.getString("Vol")) - cont);
            }

            // PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE stock SET Vol ='"+a+"' WHERE StockId LIKE '"+id+"'");
            //  pst.executeUpdate();
            String sql1 = "UPDATE stock SET Vol ='" + a + "' WHERE StockId LIKE '" + id + "'";
            db.saveForUpdate(sql1);
            val = true;
        } catch (Exception e) {
            e.printStackTrace();
            val = false;
        }
        return val;
    }

    public ResultSet Showstock(String id) {
     
       ResultSet rs = null;
        try {
            String query = ("SELECT  * FROM stock where  StockId like  '" + id + "%'  and Vol !='0' ");
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet ShowstockBloodType(String id) {
     
       ResultSet rs = null;
        try {
            String query = ("SELECT  * FROM stock where  TypeId like  '" + id + "%'  and Vol !='0' ");
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    
     public int AddItemToStock(String Vol, String TypeId) {
        int val = 0;
        try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `stock` (`Vol`,`TypeId`,`AddedDate`,`expierDate`) VALUES (?,?,NOW(),NOW());");
            pst2.setString(1, Vol);
            pst2.setString(2, TypeId);
            
           val = pst2.executeUpdate();
           // ResultSet rsmax = (ResultSet) pst2.getGeneratedKeys();
           // if (rsmax.next()) {
           //     val = rsmax.getInt(1);
           // }
            pst2 = null;
           // rsmax = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }
       
}
