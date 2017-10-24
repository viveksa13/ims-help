package lambdaExpression;

interface Drawable1{
	public void draw();
}
public class WithoutLambdaExample1 {
	public static void main(String[] args) {
		int width=30;
		Drawable1 d=new Drawable1() {			
			@Override
			public void draw() {
				System.out.println("Width is:"+width);
				
			}
		};
		d.draw();
	}
}
