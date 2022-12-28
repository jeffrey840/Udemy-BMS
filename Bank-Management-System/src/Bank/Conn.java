package Bank;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{
//            forname will load the driver
//            needs mysql connetion library
            Class.forName("com.mysql.jdbc.Driver");
//            location of database
//            root is the usernme of the client
//            pw
            c =DriverManager.getConnection("jdbc:mysql:///bms","root","codeup");
//            passes queries
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  