package sumit.bauaa.Multithreading;
//
class Display{
	public synchronized void display(String name) throws InterruptedException{
		for(int i=0;i<10;i++){
		System.out.println("Hi..."+name);
		Thread.sleep(1000);
		}
	}
}
class MyThread1 extends Thread{
	private String name;
	private Display d;
	public MyThread1(Display d,String name){
		this.name=name;
		this.d=d;
	}
	public void run(){
		try {
			d.display(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		Display d=new Display();
		Display d2=new Display();
		Display d3=new Display();
		MyThread1 o=new MyThread1(d, "Amit");
		o.start();
		MyThread1 o2=new MyThread1(d2, "Sumit");
		o2.start();
		
		MyThread1 o3=new MyThread1(d3, "Sunny leone");
		o3.start();

	}

}
