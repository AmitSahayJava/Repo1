package sumit.bauaa.singleton;

import java.util.Date;
import java.util.Scanner;

/*
 * A CLASS WHICH CAN HAVE ONLY ONE INSTANCE IS CALLED SINGLETON
 */

public class SingletonDesingPattern {
  private static SingletonDesingPattern instance=new SingletonDesingPattern();
  
  /*IF CONSTRUCTOR IS PRIVATE THEN NO ONE CAN CREATE IT'S INSTANCE FROM OUTSIDE*/
  
  private SingletonDesingPattern(){}
  
  /*A STATIC METHOD MUST BE THERE TO RETURN IT'S ALREADY CREATED INSTANCE*/
  
  public static SingletonDesingPattern getInstance(){
	  return instance;
  }
  
  /*THIS CLASS(OBJECT) MUST HAVE SOME WORK*/
  
  public void getUesrInfo(){
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("ENTER YOUR NAME: ");
	  String name=scanner.nextLine();
	  System.out.println("YOUR NAME IS: "+name+"  "+new Date());
  }
}
