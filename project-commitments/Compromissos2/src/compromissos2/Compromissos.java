package compromissos2;

import view.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Compromissos {

     public static void main(String[] args) {
        new Login();
               
        System.out.println("Hello World!");
    }
     
    // CONEXÃO COM MYSQL
    public static Connection getConnection() throws SQLException {
        
        Connection conn = null;
        
        try {
            System.out.println("Conectando ao MySQL... ");
            String url = "jdbc:mysql://localhost/compromissos?user=root&password=123456";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException ex) {         
            throw new SQLException(ex.getMessage());
        } 
        
        return conn;
    }
    
    
}
   

