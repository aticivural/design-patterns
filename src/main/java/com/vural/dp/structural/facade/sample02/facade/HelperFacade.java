package com.vural.dp.structural.facade.sample02.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection connection = null;
        switch (dbType) {
            case MYSQL:
                connection = MySqlHelper.getMysqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateMysqlHTMLReport(tableName, connection);
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, connection);
                }
            case ORACLE:
                connection = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, connection);
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, connection);
                }
        }
    }

    public enum DBTypes {
        MYSQL, ORACLE
    }

    public enum ReportTypes {
        HTML, PDF
    }
}
