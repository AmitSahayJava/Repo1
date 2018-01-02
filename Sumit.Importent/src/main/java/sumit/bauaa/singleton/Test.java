package sumit.bauaa.singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*SingletonDesingPattern ref1=SingletonDesingPattern.getInstance();
      SingletonDesingPattern ref2=SingletonDesingPattern.getInstance();
      System.out.println(ref1.hashCode()==ref2.hashCode());
      
     // ref1.getUesrInfo();
      MySingleton2 refObject=MySingleton2.getInstance();
      refObject.getUserDetails();
      
      MySingleton3 ref3=MySingleton3.getInstance();
      ref3.displayGreetingMSG();*/
		MySingleton4 reference=MySingleton4.getInstance();
		reference.Task();
	}

}
