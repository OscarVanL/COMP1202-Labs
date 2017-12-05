
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/7
 * Stub class from University of Southampton, finished by myself
 * @author University of Southampton ECS, OscarVanL
 *
 */
public class Calculator {
        Double x;
        
        /*
        * Chops up input on ' ' then decides whether to add or multiply.
        * If the string does not contain a valid format returns null.
        */
        public Double x(String x){
        	/*
        	 * If the operator is +, sets the attribute x to the first number, then calls the x() method with an
        	 * argument of Double (the second number). The returned value is cast to a string and set
        	 * to local variable x. This is later returned as a Double.
        	 */
        	if (x.split(" ")[1].equals("+")) {
        		this.x = new Double(x.split(" ")[0]);
        		x = this.x(new Double(x.split(" ")[2])).toString();
        		return new Double(x);
        	} 
        	
       	 	/* 
       	 	 * If the operator is x, sets the attribute x to the first number, then calls the x() method with an
       	 	 * argument of double (the second number). The returned value is cast to a string and set
       	 	 * to local variable x. This is later returned as a Double.
       	 	 */
        	else if (x.split(" ")[1].equals("x")) {
        		this.x = new Double(x.split(" ")[0]);
        		x = this.x(Double.parseDouble(x.split(" ")[2])).toString();
        		return new Double(x);
        	}
        	
        	/*
        	 * Else statement for invalid mathematical operators.
        	 */
        	else {
        		return null;
        	}
        }

        /*
        * Adds the parameter x to the instance variable x and returns the answer as a Double.
        */
        public Double x(Double x){
        	System.out.println("== Adding ==");
            return new Double(this.x + x);
        }

        /*
        * Multiplies the parameter x by instance variable x and return the value as a Double.
        */
        public Double x(double x){
            System.out.println("== Multiplying ==");
            return new Double(this.x * x);
        }

}
