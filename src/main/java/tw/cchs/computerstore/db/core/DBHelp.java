package tw.cchs.computerstore.db.core;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelp {

    private static Properties info = new Properties();

    static {
        // 取得 config.properties 文件輸入流
        InputStream in = DBHelp.class.getClassLoader().getResourceAsStream("resources/config.properties");

        try {
            // 從文件讀取變量 info
            info.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName(info.getProperty("driver"));

        Connection connection = DriverManager.getConnection(info.getProperty("url"), info);
        return connection;

    }

}
