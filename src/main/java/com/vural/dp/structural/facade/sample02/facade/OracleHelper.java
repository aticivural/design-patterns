package com.vural.dp.structural.facade.sample02.facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDBConnection() {
        /*get MySql Db connection using connection parameters*/
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection connection) {
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection connection) {
        //get data from table and generate pdf report
    }
}
