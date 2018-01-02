package sumit.bauaa.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	private String name;
	private String color;
	private int waight;
	private String breed;
	public Dog(String name, String color, int waight, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.waight = waight;
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "name=" + name + ", color=" + color + ", waight=" + waight + ", breed=" + breed + "]";
	}
	
}

class Cat implements Serializable{
	private String name;
	private String color;
	private int waight;
	public Cat(String name, String color, int waight) {
		super();
		this.name = name;
		this.color = color;
		this.waight = waight;
	}
	@Override
	public String toString() {
		return "name=" + name + ", color=" + color + ", waight=" + waight + "]";
	}
	
}

class Rat implements Serializable{
	private String color;
	private int waight;
	public Rat(String color, int waight) {
		super();
		this.color = color;
		this.waight = waight;
	}
	@Override
	public String toString() {
		return "color=" + color + ", waight=" + waight + "]";
	}
		
}

public class Serialize_Deserialize_MultiType_Object {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("bauaa.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Dog d=new Dog("tommy", "black", 40, "kane");
        Cat c=new Cat("pussy", "white", 6);
        Rat r=new Rat("black", 1);
        
        //Serialization
        oos.writeObject(d);
        oos.writeObject(c);
        oos.writeObject(r);
        //Deserialization
        FileInputStream fis=new FileInputStream("bauaa.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        for(int i=0;i<3;i++){
        Object o=ois.readObject();
        	
        	if(o instanceof Cat){
        		System.out.println(o);
        	}else if(o instanceof Rat){
        		System.out.println(o);
        	}else if(o instanceof Dog)
        		System.out.println(o);
        }
	}

}
