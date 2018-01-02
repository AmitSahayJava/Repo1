package sumit.bauaa.Multithreading;

public class DeadLock1 {
	public static void main(String[] args) throws Exception {
		Thread.currentThread().join();
		Thread t=new Thread();
		t.interrupt();
	}
}
class ThreadB extends Thread{
    int total = 0;
    public void run(){    //Child Thread Task
       System.out.println("Child Starting calculation");
       for(int i = 1; i<=100; i++){
         total = total + i;
       }
      synchronized(this){
         System.out.println("Child giving notification");
         this.notify(); //Means notify anyone who is waiting for this
      }
  }
}
