package FunctionalInterface;

@FunctionalInterface  
interface sayable{  
    void say(String msg);   // abstract method  
      
    // It can contain any number of methods of Object class.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  

public class FunctionalInterfacewithObjectClassMethods implements sayable{
	public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {      	
        FunctionalInterfacewithObjectClassMethods fie = new FunctionalInterfacewithObjectClassMethods();  
        fie.say("Hello World");
    }  
}  
