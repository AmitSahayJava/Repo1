package sumit.bauaa.exceptions;

import java.util.Scanner;
class Display{           
    public synchronized void display(String name) throws InterruptedException{
	for(int i=0;i<10;i++){
		System.out.println("Hi..."+name);
		Thread.sleep(300);
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



public class ThrowsDemo {
	public static void main(String[] args) throws Exception{
		   Display d=new Display(); 	   
		   MyThread1 t1=new MyThread1(d, "Amit");
		   t1.setPriority(4);
		   t1.start();
		   		   
		   MyThread1 t2=new MyThread1(d, "Sumit");
		   t2.setPriority(8);
		   t2.start();
		   Thread.currentThread().setPriority(7);
	}
}
