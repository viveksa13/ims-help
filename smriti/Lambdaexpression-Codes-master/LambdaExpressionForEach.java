package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionForEach {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Smruti");
		list.add("Ranjan");
		list.add("Gouda");
		list.forEach((n)->System.out.println(n));
	}
}
