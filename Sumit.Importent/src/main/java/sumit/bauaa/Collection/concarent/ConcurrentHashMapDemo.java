package sumit.bauaa.Collection.concarent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread { //Child Thread
    public static ConcurrentHashMap m=new ConcurrentHashMap();
    
    public void run(){  //Child Thread trying to add elements in Map  	
    	try{
    		m.put("E", "elephant");
    	Thread.sleep(1000);
    	    m.put("F", "frog");
    	Thread.sleep(1000);
    	    m.put("G", "Game");
    	}catch(InterruptedException e){}
    }
    
	public static void main(String[] args) throws InterruptedException { //Main Thread
		m.put("A", "apple");
    	m.put("B", "ball");
    	m.put("C", "cat");
    	m.put("D", "dog"); //Now Map has 4 elements
    	/*Start Child Thread*/
    	ConcurrentHashMapDemo obj=new ConcurrentHashMapDemo();
    	obj.start(); //Child Thread Started
    	//----Main Thread is iterating Map------
    	List l=new ArrayList(m.entrySet());
    	Iterator itr=l.iterator();
    	while(itr.hasNext()){
    		System.out.println(itr.next());
    		Thread.sleep(1000);
    	}
    	
	}

}
