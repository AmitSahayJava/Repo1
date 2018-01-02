package sumit.bauaa.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{
	public int weight;	
	public Animal(int w) {
		this.weight=w;
	}
}

class Rhino extends Animal implements Serializable{
	public String name;	
	public Rhino(String name,int w) {
		super(w);
		this.name=name;
	}
}

public class InheretanceDemo {
	public static void main(String[] args) throws Exception {		
        FileOutputStream fos=new FileOutputStream("bauaa.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        FileInputStream fis=new FileInputStream("bauaa.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Rhino r=new Rhino("Brock",286);
        
        oos.writeObject(r);
        Rhino rhino=(Rhino)ois.readObject();
        System.out.println(rhino.weight+"  "+rhino.name);
	}

}
