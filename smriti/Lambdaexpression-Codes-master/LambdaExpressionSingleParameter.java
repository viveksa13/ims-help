package lambdaExpression;

@FunctionalInterface

interface Sayable{
	public String say(String name);
}

public class LambdaExpressionSingleParameter {
	public static void main(String[] args) {
		Sayable s=(name)->{
			return "Hello "+name;
		};
		System.out.println(s.say("smruti"));
	}
}
