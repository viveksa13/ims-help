package FunctionalInterface;

//Non-Functional Interface
interface doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
  
@FunctionalInterface  
interface sayable1 extends doable{  
    void say(String msg);   // abstract method  
}  
  
public class FunctionalInterfaceExtendingNonFunctionalInterface implements sayable1{  
  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	FunctionalInterfaceExtendingNonFunctionalInterface fie = new FunctionalInterfaceExtendingNonFunctionalInterface();  
        fie.say("Hello World");  
        fie.doIt();  
    }  
}  
