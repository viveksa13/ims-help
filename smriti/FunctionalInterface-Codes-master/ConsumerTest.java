package Consumer;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		Consumer<Integer> c1=s->System.out.println(s);
		c.accept("Hello");
		c.accept("World");
		c1.accept(10);
	}
}
