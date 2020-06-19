package com.vural.dp.structural.facade.sample02.facade;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMysqlDBConnection() {
        /*get MySql Db connection using connection parameters*/
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection connection) {
        //get data from table and generate pdf report
    }

    public void generateMysqlHTMLReport(String tableName, Connection connection) {
        //get data from table and generate pdf report
    }
}
