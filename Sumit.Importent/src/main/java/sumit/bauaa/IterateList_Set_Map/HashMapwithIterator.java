package sumit.bauaa.IterateList_Set_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//---------------------------------------------------------------------------------
class Person{
	private String name,mobile,address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+"  "+getMobile()+"  "+getAddress();
	}
}
//----------------------------------------------------------------------------------
public class HashMapwithIterator {

	public static void main(String[] args) {
		Person p1=new Person(); p1.setName("Sumit");p1.setMobile("9470943875");p1.setAddress("Patna");
		Person p2=new Person();p2.setName("Amit");p2.setMobile("7091043605");p2.setAddress("Mumbai");
		Person p3=new Person();p3.setName("Rahul");p3.setMobile("9488902347");p3.setAddress("Kolkata");
		Person p4=new Person();p4.setName("Sachin"); p4.setMobile("7003728432"); p4.setAddress("Mumbai");  
		Person p5=new Person();p5.setName("Sania"); p5.setMobile("8074032045"); p5.setAddress("Hyderabad");  
		Person p6=new Person();p6.setName("Rock"); p6.setMobile("8078323632"); p6.setAddress("US");  
		Person p7=new Person();p7.setName("Amitabh"); p7.setMobile("9487008897"); p7.setAddress("Mumbai");  
		Person p8=new Person();p8.setName("Amanda"); p8.setMobile("7089982310"); p8.setAddress("Patna");  
		      
		       
		List bsnl=new ArrayList<Person>();
		List airtel=new ArrayList<Person>();
		List others=new ArrayList<Person>();
		
		List listRef=new ArrayList<Person>();
		listRef.add(p1);listRef.add(p2);listRef.add(p3);listRef.add(p4);listRef.add(p5);listRef.add(p6);
		listRef.add(p7);listRef.add(p8);
		      
		Iterator<Person> itr=listRef.iterator();
		while(itr.hasNext()){
			Person p=itr.next();
			if("94".equals(p.getMobile().substring(0, 2))){
				bsnl.add(p);
			}else if("70".equals(p.getMobile().substring(0, 2))){
				airtel.add(p);
			}else{
				others.add(p);
			}
			
		}
		
		//System.out.println("BSNL Customers: "+bsnl);    
		//System.out.println("Airtel Customers: "+airtel);
		//System.out.println("Others: "+others);
		
		//NOW ADD THESE ALL CATEGORIES TO A MAP SO IT WILL BECOME A SINGLE UNIT
		    //SO TRANSFER BETWEEN OTHER LAYERS(PRESENTATION TO BUSINESS, BUSINESS TO INTEGRATION
		        //WILL BE EASY
		Map mapRef=new HashMap();
        mapRef.put("bsnl", bsnl);
        mapRef.put("airtel", airtel);
        mapRef.put("others", others);
        //--------PRINT ENTIRE MAP IN ONE GO------------
        System.out.println(mapRef);
        //-------PRINT BY KEY----------------
        System.out.println("BSNL CUSTOMERS: "+mapRef.get("bsnl"));
        System.out.println("AIRTEL CUSTOMERS: "+mapRef.get("airtel"));
        System.out.println("OTHERS: "+mapRef.get("others"));
	}

}
