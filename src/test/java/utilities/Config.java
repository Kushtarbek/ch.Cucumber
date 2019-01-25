package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

    static Properties prop;


    static{
        String path = "configurations.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            prop = new Properties();
            prop.load(file);
            file.close();
        }catch (Exception e){
            System.out.println("Path: "+path +" - not found.");
        }

    }

    public static String getProperty(String key){
        return prop.getProperty(key);
    }

    public static void main(String[] args) {
        String s= prop.getProperty("name");
        System.out.println(s);
    }



}
