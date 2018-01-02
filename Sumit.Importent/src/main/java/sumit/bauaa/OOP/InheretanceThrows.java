package sumit.bauaa.OOP;

import java.io.IOException;

class Baap{
	public void result()throws Exception {
		System.out.println("WWE");
	}
}
class Beta extends Baap{
	public void result() throws IOException{
		System.out.println("Wreslers");
	}
}

class Beta2 extends Baap{
	
}

public class InheretanceThrows {	

	public static void main(String[] args)throws Exception {
		Baap ref=new Beta();
        ref.result();
	}

}
