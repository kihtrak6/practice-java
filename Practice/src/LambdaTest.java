
public class LambdaTest {

	public static void main(String[] args) {

		Lambda l = ()->System.out.println("hello");
		
		l.print();
		
	}

}

interface Lambda{
	void print();
}