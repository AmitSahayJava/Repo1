package sumit.bauaa.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human implements Externalizable{
	private int weight;
	private String name;
	private String address;
	private int pincode;
	public Human(int weight,String name,String address,int pincode) {
		this.weight=weight;
		this.name=name;
		this.address=address;
		this.pincode=pincode;
	}
	public Human() {
		System.out.println("Zero param constructor");
	}
	public void writeExternal(ObjectOutput oos) throws IOException {
		oos.writeObject(name);
		oos.writeInt(pincode);
	}
	public void readExternal(ObjectInput ois) throws IOException, ClassNotFoundException {
		name=(String)ois.readObject();
		pincode=ois.readInt();
	}
	@Override
	public String toString() {
		return weight+" "+name+" "+address+" "+pincode;
	}
}

public class ExternalizationDemo {

	public static void main(String[] args) throws Exception {
		Human h=new Human(65, "Amit", "Patna", 800026);
        FileOutputStream fos=new FileOutputStream("bauaa.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        FileInputStream fis=new FileInputStream("bauaa.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        oos.writeObject(h);
        System.out.println("Object is Serialized");
        Human human=(Human)ois.readObject();
        System.out.println(human);
	}

}
