package sumit.bauaa.StringReverse;

public class StringClassMethods {

	public static void main(String[] args) {
		String line="AMIT   KUMAR  IS THE BEST";
		int length=line.length(); System.out.println(length);
		String sub=line.substring(8); System.out.println(sub);
		String sub2=line.substring(4, 10); System.out.println(sub2);
		int comp=line.compareToIgnoreCase("Sumit Kumar"); System.out.println(comp);
		boolean b=line.contains("THE"); System.out.println(b);
		String[] words=line.split("\\s+"); System.out.println(words[0]+"  "+words[2]);
		
		//-----------USE OF .intern()-------------------
		String line2=new String("AMIT   KUMAR  IS THE BEST");
		
		line2=line2.intern();//IT WILL CHECK THE SCP AREA, IF SAME OBJECT IS PRESENT THEN IT WILL
		  //POINT(REFER) TO THAT. HENCE NO NEW OBJECT IS CREATED
		
		System.out.println(line==line2);
		System.out.println(line.equals(line2));
		
	}

}
