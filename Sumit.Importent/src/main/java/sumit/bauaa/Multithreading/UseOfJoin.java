package sumit.bauaa.Multithreading;

public class UseOfJoin {

	public static void main(String[] args) throws InterruptedException {
		Ladies lady=new Ladies();
		Thread thread=new Thread(lady);
		thread.start();
		System.out.println("I want to use value produced by Ladies Thread (SO I MUST WAIT FOR IT)");
		thread.join();
		System.out.println("The value of Layies is: "+lady.value);
	}

}

class Ladies implements Runnable{
	public int value;
	public void run() {
		for(int i=0;i<=20;i++){
			value=value+i;
		}
	}
}
