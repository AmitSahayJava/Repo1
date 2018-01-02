package sumit.bauaa.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Test {
	public static void main(String[] args){
		try{
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.println("Hello");
		}catch(FileNotFoundException e){System.out.println("File not found");}
	}	
}
