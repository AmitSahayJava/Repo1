package sumit.bauaa.IterateList_Set_Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class PropertiesIterator {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileInputStream fis=new FileInputStream("src/main/resources/ChotaBauaa.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println("MAP CAN NOT BE ITERATED, HENCE CONVERT IT INTO COLLECTION");
		List list=new ArrayList(prop.entrySet());
		//list.add(property.entrySet());
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
