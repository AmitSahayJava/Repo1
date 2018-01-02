package sumit.bauaa.Collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("src/main/java/sumit/bauaa/Collection/property.password");
		Properties p=new Properties();
		p.load(fis);
        System.out.println(p);
        String password1=p.getProperty("sumit");
        System.out.println("Sumit's password is: "+password1);
             //------ADDING NEW PROPERTY INTO FILE
        p.setProperty("nikhil", "ganduBhaiJI");//Set property
             //Open OutputStream
        FileOutputStream fos=new FileOutputStream("src/main/java/sumit/bauaa/Collection/property.password");
             //Store property using FileOutputStream
        p.store(fos, "A new Comment from Sumit");        
	}

}
