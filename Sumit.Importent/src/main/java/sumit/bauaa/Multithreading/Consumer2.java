package sumit.bauaa.Multithreading;
/*
 * Inter Thread Communication Demo
 */
class Producer2 extends Thread{
	public int itemPrice=0;
	public void run(){
		for(int i=0;i<10;i++){
			itemPrice=itemPrice+i;			
		}
		synchronized(this){
			this.notify();
		}
	}
}

public class Consumer2 {

	public static void main(String[] args) throws InterruptedException {
		int a;
		Producer2 ob1=new Producer2();
		ob1.start();
		synchronized(ob1){
			ob1.wait();
			a=ob1.itemPrice;
		}
		System.out.println(a);
	}

}
