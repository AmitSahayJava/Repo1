package sumit.bauaa.immutableClass;

public class ThreadA{
    public static void main(String arg[])throws InterruptedException{
         ThreadB b = new ThreadB();      //Main Thread task
         b.start();
         synchronized(b){
            System.out.println("Main Thread calling wait Method");
            b.wait();  //MEANS Main is waiting for b,  
            System.out.println("Main Got Notification");
            System.out.println(b. totalSum);
      }
    }
}

class ThreadB extends Thread{
    int totalSum = 0;
    public void run(){    //Child Thread Task
          System.out.println("Child Starting calculation");
          for(int i = 1; i<=100; i++){
        	  totalSum = totalSum + i;
          }
          synchronized(this){
                  System.out.println("Child giving notification");
                 this.notify(); //Means notify anyone who is waiting for this
         }
    }
}





