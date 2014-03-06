package jdbc_DidntWork_JarProbelm;

//JdbcTestMssql.java
import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.ResultSet ;
import java.sql.Statement ;
import java.sql.SQLException;

class JdbcTestMssql {
 public static void main (String args[]) {
    try {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    }
    catch (ClassNotFoundException e) {
       System.err.println (e) ;
       System.exit (-1) ;
    }
    try {
       // open connection to database
       Connection connection = DriverManager.getConnection(
       //"jdbc:sqlserver://localhost:1433;databaseName=dbname;user=dbuser;password=dbpwd;"
       "jdbc:sqlserver://192.168.98.125:1433;databaseName=master;user=sa;password=pass;");

       // build query, here we use table "sys.databases"
       String query = "SELECT * From sys.databases" ;

       // execute query
       Statement statement = connection.createStatement () ;
       ResultSet rs = statement.executeQuery (query) ;

       // return query result
       while ( rs.next () )
          // display content from column "name"
          System.out.println ("MS-SQL Query result: " + rs.getString ("name")) ;
       connection.close () ;
    }
    catch (java.sql.SQLException e) {
       System.err.println (e) ;
       System.exit (-1) ;
    }
 }
}