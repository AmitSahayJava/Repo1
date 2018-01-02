package sumit.bauaa.IterateList_Set_Map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class MyIteratorOverMAP {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileReader reader=new FileReader("src/main/resources/Bauaa.properties");
		Properties prop=new Properties();
        prop.load(reader);	
        
        //CONVERT MAP TO LIST or SET
        List list=new ArrayList(prop.entrySet());
        Iterator itr=list.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}

}
