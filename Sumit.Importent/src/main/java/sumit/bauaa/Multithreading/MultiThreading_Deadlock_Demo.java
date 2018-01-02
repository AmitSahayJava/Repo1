package sumit.bauaa.Multithreading;
/*(1) By extending Thread(C)
 * (2) By implementing Runnable (I)
 * 
 * If someone say extending thread class creates tight coupling then say no
 * the actual reason is if in future our class needs to extends some Abstract class then we will
 * be in trouble.
 * The main motive of tight coupling is to remove dependency from those classes which is not part
 * of java.lang package but Thread, String etc. are part of java.lang 
 * */
public class MultiThreading_Deadlock_Demo{
	private static String name1="Amit Kumar";
	private static String name2="Sumit Kumar";
	private static class T1 extends Thread{
		public void run(){
			synchronized(name1){
				System.out.println(name1+" ");
				try{Thread.sleep(1000);}catch(Exception e){}
				System.out.println("Now T1 wants to get lock on name2");				
				synchronized(name2){
					System.out.println(name2);
				}
			}
		}
	}
	private static class T2 extends Thread{
		public void run(){
			synchronized(name2){
				System.out.println(name2+" ");
				try{Thread.sleep(1000);}catch(Exception e){}
				System.out.println("Now T1 wants to get lock on name1");
				synchronized(name1){
					System.out.println(name1);
				}
			}
		}
	}

	public static void main(String[] args) {
		T1 t1=new T1();
		T2 t2=new T2();
		t1.start();
        t2.start();
        System.out.println("Deadlock occured");
	}

}
