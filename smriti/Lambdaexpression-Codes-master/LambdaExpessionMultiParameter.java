package lambdaExpression;

interface Addable{
	int add(int a, int b);
}

public class LambdaExpessionMultiParameter {
	public static void main(String[] args) {
		
		Addable add1=(a,b)->(a+b);
		System.out.println(add1.add(19, 23));
		
		Addable add2=(int a, int b)->(a+b);
		System.out.println(add2.add(4, 6));
	}
}
