package sumit.bauaa.Multithreading;
/*
 * HERE CHILD THREAD WILL WAIT FOR PARENT THREAD
 * */
class MyThread extends Thread{
	public static Thread t;
	
	private String yourName;
	public MyThread(String yourName){
		this.yourName=yourName;
	}
	public void run(){
		try{
			t.join();
		}catch(Exception e){}
		
		for(int i=0;i<10;i++){
			System.out.println("Child Thread prints "+yourName+" i");
		}
	}
}

public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread.t=Thread.currentThread();
		
		MyThread mt1=new MyThread("Sumit kumar");
		mt1.start();
		for(int i=0;i<5;i++){
			System.out.println("I am Main Thread");
			Thread.sleep(1000);
		}
	}
}
