package ModelPrep;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DBAbstract implements DBInterface {
    private Connection connection;   // The DB Connections
    private int numQueries;
    private String DBName;    // name of DB to connect to
    private String PWFilePath;  // File that contains the PW and USer
    private String PassW;
    private String UserId;
    public DBAbstract(String DBName, String PWFilePath ){
        this.DBName = DBName;
        this.PWFilePath = PWFilePath;
        this.setPW( PWFilePath );
        System.out.printf("Pw='%s' and user='%s'",  PassW,  UserId );
        // Now have this.passw Set and this.userid set
        this.setConnect();
    }

    private void setConnect(){
        // Establish a connection
        try {
            String dbInfo = "jdbc:mysql://" + this.DBName;
            System.out.printf( "dbInfo=%s, user=%s PW=%s", dbInfo, this.UserId, this.PassW );
            connection = DriverManager.getConnection
                    ( dbInfo, this.UserId, this.PassW );

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("\n CONNECTED FAILED ");
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("Database connected");
    }
    public ResultSet doQuery( String SQL ) {
        // Create a statement
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            System.out.printf("SQL=%s", SQL);
            resultSet = statement.executeQuery(SQL);
        } catch (Exception e){
            System.out.printf("\n SQL Statement failed: %s", SQL);
            System.out.printf("\n exception: %s", e.toString());
        }
        return resultSet;
    }
    public  ArrayList<String> doQueryAL(String sql) {
        ArrayList<String> retData = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            // Try to execute the provided SQL
            Statement statement = connection.createStatement();
            // Execute a statement
            resultSet = statement.executeQuery( sql );
        } catch (Exception e ) {
            System.out.printf("\n SQL Statement failed: %s", sql);
            System.out.printf("\n exception: %s", e.toString());
        }
        // Iterate through the result and print the student names
        try {
            // Try to get the results
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (resultSet.next()) {
                String columnValue = "";
                String results = "";
                String cma = "";
                for (int i = 1; i <= columnsNumber; i++) {
                    if ( i>1) cma=";";
                    columnValue += cma + resultSet.getString(i);
                }
                retData.add( columnValue);
            }
        } catch ( Exception e ) {
            System.out.printf("\n Result set failed: %s", sql);
            System.out.printf("\n exception: %s", e.toString());
        }
        return retData;
    }

    public  void setPW( String fName ) {
        //String fName = "pw.txt";
        System.out.println(System.getProperty( fName ));
        File file = new File( fName );
        try {
            Scanner scnr = new Scanner(file);
            int lineNumber = 1;
            this.UserId = scnr.nextLine();
            this.PassW = scnr.nextLine();
            //while(scnr.hasNextLine()){
            // line = scnr.nextLine();
            //    System.out.println("line " + lineNumber + " :" + line);
            //    lineNumber++;
            // }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public boolean doQueryUpdate( String SQL ) {
        boolean result = true;
        try {
            Statement statement = connection.createStatement();
            //System.out.printf("SQL=%s", SQL);
            statement.executeUpdate(SQL);
        } catch (Exception e ){
            System.out.printf("\n Update SQL:%s Failed", SQL);
            System.out.printf("Exception:%s", e);
        }
        return result;
    }
}

