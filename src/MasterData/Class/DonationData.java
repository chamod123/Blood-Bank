/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterData.Class;

import DBClass.DBFacade;
import java.sql.PreparedStatement;

/**
 *
 * @author chamod
 */
public class DonationData {

    DBFacade db = new DBFacade();

    public int SaveDonationData(String DonerId, String StockId, String Descreption) {
        int val = 0;

        try {
            PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO `doner_detail` (`DonerId`,`Descreption`,`InsertDate`,`StockId`) "
                    + "VALUES (?,?,NOW(),(SELECT  (MAX(StockId) +1 ) AS maxStock FROM  stock));");
            pst2.setString(1, DonerId);
            pst2.setString(2, Descreption);
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
