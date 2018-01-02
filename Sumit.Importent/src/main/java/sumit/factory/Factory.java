package sumit.factory;

public class Factory {
   public static Object getInstance(String className) throws Exception{
	   Class c=Class.forName("sumit.factory."+className);
	   Object obj=c.newInstance();
	   System.out.println("Object Created for "+obj.getClass());
	   return obj;
   }
}
