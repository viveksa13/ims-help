package Consumer;

import java.util.function.Consumer;

public class ConsumerInterfaceTest2 {
	static void printMessage(String name)
	{  
    System.out.println("Hello "+name);  
	}  
	
static void printValue(int val)
	{  
    System.out.println(val);  
	}  

public static void main(String[] args) {  
	
    // Referring method to String type Consumer interface   
    Consumer<String> consumer1 = ConsumerInterfaceTest2::printMessage;  
    consumer1.accept("Smruti");   // Calling Consumer method  
    
    // Referring method to Integer type Consumer interface  
    Consumer<Integer> consumer2 = ConsumerInterfaceTest2::printValue;  
    consumer2.accept(12);   // Calling Consumer method  
}  
}  