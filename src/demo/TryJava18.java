package demo;

public class TryJava18 {

	public static void main(String[] args) {
		
		instanceofPatternMatch(67);
		instanceofPatternMatch("xyz");
		
		System.out.println(switchPatternMatch(53));
		System.out.println(switchPatternMatch(578L));
		
		switchNullAndMultiPatternMatch("Foo");
		switchNullAndMultiPatternMatch("Zoo");
		switchNullAndMultiPatternMatch(null);
	}
	
	
	static void instanceofPatternMatch(Object o) {
		if (o instanceof String) {
		    String s = (String) o;
		    System.out.printf("String: %s%n", s);
		}

		if (o instanceof String s) {
			System.out.printf("String: %s%n", s);
		}

		if (o instanceof Integer i) {
			System.out.printf("Integer: %d%n", i);
		}
		
	}
	
	static String switchPatternMatch(Object o) {
	    return switch (o) {
	        case Integer i -> String.format("int %d", i);
	        case Long l    -> String.format("long %d", l);
	        case Double d  -> String.format("double %f", d);
	        case String s  -> String.format("String %s", s);
	        default        -> o.toString();
	    };
	}
	
	static void switchNullAndMultiPatternMatch(String s) {
	    switch (s) {
	        case null         -> System.out.println("Oops");
	        case "Foo", "Bar" -> System.out.println("Great");
	        default           -> System.out.println("Ok");
	    }
	}
	
}
