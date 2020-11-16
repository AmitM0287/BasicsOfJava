package hello;
import static java.lang.System.out;

public class HelloJava {
	
	static {
		out.println("Hello Java... In Static.");
	}

	public static void main(String[] args) {
		
		if(out.printf("Hello Java... In If.\n") != null) {
			
		}
		
		out.println("Hello Java... In Main.");
		
	}
	
}
