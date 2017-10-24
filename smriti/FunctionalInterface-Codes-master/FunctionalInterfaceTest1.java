package FunctionalInterface;

@FunctionalInterface  
interface message{  
    void alert(String msg);  
}  

public class FunctionalInterfaceTest1 implements message{  
    public void alert(String message){  
        System.out.println(message);  
    }  
    public static void main(String[] args) {  
    	FunctionalInterfaceTest1 fit = new FunctionalInterfaceTest1();  
        fit.alert("Hello World");  
    }  
}  