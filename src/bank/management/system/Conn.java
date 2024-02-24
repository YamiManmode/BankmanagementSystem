
package bank.management.system;
 import java.sql.*;
public class Conn {

    private Connection c;
    Statement  s ;
    public Conn(){
        try{
           
                    c = DriverManager.getConnection("jdbc:mysql:/// bankmanagementsystem", "root","Virus@123");
                    s =  (Statement) c.createStatement();
        } catch  (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
   
    
    
}
