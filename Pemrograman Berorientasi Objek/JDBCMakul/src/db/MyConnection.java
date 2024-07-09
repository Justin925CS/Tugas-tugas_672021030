
package db;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;


public class MyConnection {
    public Connection con = null;

    public Connection getConnection() {
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName("localhost");
            ds.setPort(3306);
            ds.setUser("root");
            ds.setPassword("");
            ds.setDatabaseName("dbpbog");
            con = ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
