package sumit.bauaa.Multithreading;

public class UseOfYield {

	public static void main(String[] args) {
		//CREATE AND START CHILD THREAD
		YieldDemo1 demo1=new YieldDemo1();
		Thread thread=new Thread(demo1);
		thread.start();
		thread.currentThread().yield();
		
		System.out.println("I am Main Thread(I GOT FIRST CHANCE) and I am going to Yield");
        
        System.out.println("Now i again got chance to execute");
        int i;
        for(i=0;i<=30;i++){
        	i=i+1;
        }
        System.out.println("Printed by Main Thread: "+i);
	}

}

class YieldDemo1 implements Runnable{
	public void run(){
		int i;
		for(i=0;i<=10;i++){
			i+=1;
		}
		System.out.println("Printed by Child Thread: "+i);
	}
}
