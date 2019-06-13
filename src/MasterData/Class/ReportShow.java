/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterData.Class;

import DBClass.DBFacade;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author chamod
 */
public class ReportShow {

    public void shoePendingRequest() {
        try {
            Connection con = (Connection) DBFacade.connect();
            JasperDesign jd = new JasperDesign();
            jd = JRXmlLoader.load("./src/Report/request.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Map<String, Object> params = new HashMap<String, Object>();
            //params.put("leaveStatus", leaveStatus);
            // params.put("userType", userType);
            // params.put("fromDate", fromDate);
            // params.put("toDate", toDate);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            Logger.getLogger(ReportShow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void shoePendingRequestIDOrder(String toCode,String fromCode) {
        try {
            Connection con = (Connection) DBFacade.connect();
            JasperDesign jd = new JasperDesign();
            jd = JRXmlLoader.load("./src/Report/AllRequestIDs.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("to", toCode);
            params.put("from", fromCode);
            // params.put("fromDate", fromDate);
            // params.put("toDate", toDate);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            Logger.getLogger(ReportShow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showPendingRequestDateOrder(String fromDate,String toDate) {
        try {
            Connection con = (Connection) DBFacade.connect();
            JasperDesign jd = new JasperDesign();
            jd = JRXmlLoader.load("./src/Report/AllRequestDate.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("toDate", toDate);
            params.put("fromDate", fromDate);
            // params.put("fromDate", fromDate);
            // params.put("toDate", toDate);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            Logger.getLogger(ReportShow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void showAllStockData() {
        try {
            Connection con = (Connection) DBFacade.connect();
            JasperDesign jd = new JasperDesign();
            jd = JRXmlLoader.load("./src/Report/StockData.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Map<String, Object> params = new HashMap<String, Object>();
            //params.put("toDate", toDate);
            //params.put("fromDate", fromDate);
            // params.put("fromDate", fromDate);TypeId
            // params.put("toDate", toDate);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            Logger.getLogger(ReportShow.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
      public void showStockTypeOreder(String type) {
        try {
            Connection con = (Connection) DBFacade.connect();
            JasperDesign jd = new JasperDesign();
            jd = JRXmlLoader.load("./src/Report/StockTypeOreder.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("TypeId", type);
            //params.put("fromDate", fromDate);
            // params.put("fromDate", fromDate);
            // params.put("toDate", toDate);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            Logger.getLogger(ReportShow.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      
      public void showAllDonation() {
        try {
            Connection con = (Connection) DBFacade.connect();
            JasperDesign jd = new JasperDesign();
            jd = JRXmlLoader.load("./src/Report/DonationDetails.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Map<String, Object> params = new HashMap<String, Object>();
            //params.put("TypeId", type);
            //params.put("fromDate", fromDate);
            // params.put("fromDate", fromDate);
            // params.put("toDate", toDate);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            Logger.getLogger(ReportShow.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      
      public void showAllDonationBloodType(String type) {
        try {
            Connection con = (Connection) DBFacade.connect();
            JasperDesign jd = new JasperDesign();
            jd = JRXmlLoader.load("./src/Report/DonationGroupedByBloodType.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("bloodType", type);
            //params.put("fromDate", fromDate);
            // params.put("fromDate", fromDate);
            // params.put("toDate", toDate);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer.viewReport(jp, false);
            
        } catch (Exception ex) {
            Logger.getLogger(ReportShow.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      
       public void showHospitalData() {
        try {
            Connection con = (Connection) DBFacade.connect();
            JasperDesign jd = new JasperDesign();
            jd = JRXmlLoader.load("./src/Report/HospitalDetails.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Map<String, Object> params = new HashMap<String, Object>();
           // params.put("bloodType", type);
            //params.put("fromDate", fromDate);
            // params.put("fromDate", fromDate);
            // params.put("toDate", toDate);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            Logger.getLogger(ReportShow.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
