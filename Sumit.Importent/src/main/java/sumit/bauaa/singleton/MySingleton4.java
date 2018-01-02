package sumit.bauaa.singleton;

public class MySingleton4 {
    private static MySingleton4 instance=new MySingleton4();
    
    private MySingleton4(){}
    
    public static MySingleton4 getInstance(){
    	return instance;
    }
    
    public void Task(){
    	System.out.println("I WISH YOU A BEST OF LUCK");
    }
}
