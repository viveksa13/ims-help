package lambdaExpression;

public class LambdaExpressionThread {

	public static void main(String[] args) {
		//Without lambda
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread withuot lambda is running........");				
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		//With Lambda
		Runnable r2=()->{
			System.out.println("Thread with lambda is running........");
		};
		Thread t2=new Thread(r2);
		t2.start();
	}
}
