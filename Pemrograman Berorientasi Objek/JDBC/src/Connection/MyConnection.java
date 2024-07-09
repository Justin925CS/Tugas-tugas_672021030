/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Lenovo
 */
public class MyConnection {
    public Connection con = null;
    
    public Connection getConnection(){
        try{
            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName("localhost");
            ds.setPort(3306);
            ds.setUser("root");
            ds.setPassword("");
            ds.setDatabaseName("dbpbog");
            con = (Connection) ds.getConnection();
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
