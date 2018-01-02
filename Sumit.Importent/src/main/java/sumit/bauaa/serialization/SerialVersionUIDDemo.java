package sumit.bauaa.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import sumit.bauaa.polimorphism.*;

class Dog1 implements Serializable{
	private static final long serialVersionUID=1l;
	int i=10;
	int j=20;
}



public class SerialVersionUIDDemo {
   	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("bauaa.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        sumit.bauaa.polimorphism.A a1=new sumit.bauaa.polimorphism.A();
        oos.writeObject(a1);
        FileInputStream fis=new FileInputStream("bauaa.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        A a2=(A)ois.readObject();
	}

}
