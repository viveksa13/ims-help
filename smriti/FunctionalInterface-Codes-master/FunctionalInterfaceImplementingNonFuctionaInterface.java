package FunctionalInterface;

interface sayable2{  
    void say(String msg);   // abstract method  
}  

@FunctionalInterface  
interface doable1 extends sayable{  
    // Invalid '@FunctionalInterface' annotation; doable1 is not a functional interface  
    void doIt();  
}  

public class FunctionalInterfaceImplementingNonFuctionaInterface {

	public static void main(String[] args) {

	}
}
