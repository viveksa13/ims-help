package lambdaExpression;

@FunctionalInterface
interface Drawable{
	public void draw();
}
public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		int width=23;
		Drawable d=()->{
			System.out.println("Width is:"+width);
		};
		d.draw();
	}
}
