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
 * @author NIBM
 */
public class LoginData {
   DBFacade db = new DBFacade();

    /**
     *
     * @param username
     * @param password
     * @return
     */
    public ResultSet login(String username,String password)
   { ResultSet rs = null;
        try {
            String sql;
        sql = "select*from employee where Username= and Password=? ";
            rs = (ResultSet) db.fetch(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
       
       return rs;
   }
    }
    
