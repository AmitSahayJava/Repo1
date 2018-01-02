package sumit.bauaa.polimorphism;

public abstract class Parent {
    protected String name;
    
    public abstract void getName();
    
    public void display(){
    	System.out.println(name);
    }
}
