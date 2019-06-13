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
public class ReservedData {

    DBFacade db = new DBFacade();

    public int addResMas(String reqId, String bType, int resVol) {
        int val = 0;
        try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `respondmaster` (`RequestId`,`BType`,`ResVol`,`Date`) VALUES (?,?,?,NOW());");
            pst2.setString(1, reqId);
            pst2.setString(2, bType);
            pst2.setInt(3, resVol);
            val = pst2.executeUpdate();
            ResultSet rsmax = (ResultSet) pst2.getGeneratedKeys();
            if (rsmax.next()) {
                val = rsmax.getInt(1);
            }
            pst2 = null;
            rsmax = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }

    public int addResDetail(int resMas, String stock1, String stock2, String stock3, String stock4) {
        int val = 0;
        try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `respond` (`ResMas`,`StockID1`,`StockID2`,`StockID3`,`StockID4`) VALUES (?,?,?,?,?);");
            pst2.setInt(1, resMas);
            pst2.setString(2, stock1);
            pst2.setString(3, stock2);
            pst2.setString(4, stock3);
            pst2.setString(5, stock4);            
            val = pst2.executeUpdate();           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }
    
      public ResultSet ShowReserved(String Reid){   
       
       ResultSet rs = null;
        try {
            String query = ("SELECT  * FROM respondmaster where  RequestId like  '" + Reid + "%' and Ishued like '0'");
            rs =  (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
      
       public boolean updateIshu(String id) {
        boolean val = false;
        try {
            // String datetime=new SimpleDateFormat("dd/MM/yyyy HH.mm.ss").format(new Date());
            PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE  respondmaster SET  Ishued='1' WHERE ResMas='" + id + "'");
            pst.executeUpdate();
            String sql = "UPDATE  respondmaster SET  ishuedDate=NOW() WHERE ResMas='" + id + "'";
            db.saveForUpdate(sql);
            val = true;
        } catch (Exception e) {
            e.printStackTrace();
            val = false;
        }
        return val;
    }
      
    

}
