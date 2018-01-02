package sumit.bauaa.polimorphism;

import java.util.zip.CheckedInputStream;

public class Factory {
    public Parent getInstance(String name){
    	if(name==null){
    		return null;
    	}else if(name.equalsIgnoreCase("child1")){
    		return new Child1();
    	}else if(name.equalsIgnoreCase("child2")){
    		return new Child2();
    	}
    	return null;
    }
}
