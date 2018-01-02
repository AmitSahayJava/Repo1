package sumit.bauaa.propertiesfile;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnectionDemo {

	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("src/main/java/sumit/bauaa/propertiesfile/DB.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("YOUR JAVA PROGRAM IS CONNECTED TO ORACLE DATABASE");
		System.out.println("YOUR url is: "+url+"  "+"USER NAME IS: "+username+"  "+"AND PASSWORD IS: "+password);
	}

}
