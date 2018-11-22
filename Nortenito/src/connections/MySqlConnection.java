package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import interfaces.IConnection;

public class MySqlConnection implements IConnection{
    
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public MySqlConnection() {}

    @Override
    public Connection connect() {
        Connection conexion = null;
        
        try {
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/nortenito?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "usuario", "123");
            
        }
        catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlConnection");
            
        }
        
        return conexion;
    } 
}
