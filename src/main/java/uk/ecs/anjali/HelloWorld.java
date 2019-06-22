package uk.ecs.anjali;

public class HelloWorld {

	static String greet(String name) {
		return "Hello " + name;
	}
	public static void main(String[] args) {
		System.out.println(greet(args[0]));
	
	}

}
