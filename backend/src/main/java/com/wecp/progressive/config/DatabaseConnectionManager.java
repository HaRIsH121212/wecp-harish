package com.wecp.progressive.config;

<<<<<<< HEAD
=======
import java.io.IOException;
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
    private static final Properties properties = new Properties();
<<<<<<< HEAD
    static{
        loadProperties();
    }
    private static void loadProperties(){
        try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
            if(input == null){
                throw new IllegalStateException("resourse.properties not found in classpath");
            }
            properties.load(input);
            
        } catch (Exception e) {
            throw new RuntimeException("Error loading properties filr", e);
        }
    }
        public static Connection getConnection() throws SQLException{
            String url =properties.getProperty("spring.datasource.url");
            String user =properties.getProperty("spring.datasource.username");
            String password =properties.getProperty("spring.datasource.password");
            return DriverManager.getConnection(url,user,password);
        
        } 
    
    
=======

    static {
        loadProperties();
    }

    private static void loadProperties() {
        try(InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties"))
        {
            if(input == null)
            {
                throw new IllegalStateException("resouuce.properties not found in classpath");

            }
            properties.load(input);
        }
            catch(IOException e)
            {
                throw new RuntimeException("Error loading properties file", e);
            }
        

    }
    public static Connection getConnection() throws SQLException
    {
        String url = properties.getProperty("spring.datasource.url");
        String user = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url, user, password);

    }
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373

}
