package com.vural.dp.structural.facade.sample02.facade;

import org.junit.Test;

import java.sql.Connection;

public class HelperFacadeTest {

    @Test
    public void facadeTest() {
        String tableName = "Employee";
        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection mysqlDBConnection = MySqlHelper.getMysqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMysqlHTMLReport(tableName, mysqlDBConnection);

        Connection oracleDBConnection = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, oracleDBConnection);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }

}