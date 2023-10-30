/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.persistencia;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;


/**
 *
 * @author Daniel
 */
public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "root";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void connecterBase(){
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "jdbc:?zeroDateTimeBehavior=convertToNull";
        } catch (ClassNotFoundException e){
            
        }
  
    }

}
                                    
