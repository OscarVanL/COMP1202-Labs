
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/3
 * @author OscarVanL
 *
 */
public class FizzBuzz {
	
	public void play() { //I created a play method so that FizzBuzz can be used as an object, but this could all just be put in the main method instead.
		for(Integer i = new Integer(1); i < 61; i++){ //For-loop, creating count 'i', this will repeat until 'i<61' is no longer satisfied. For every loop 'i' is iterated by 1.
			if(i % 3 != 0 && i % 5 != 0){ //If the modulus of 3 isn't 0 and the modulus of 5 isn't 0 (so it isn't a multiple of 3 or 5)
				System.out.print(i); //Then just print the number. No Fizz, no Buzz.
			}
			if(i % 3 == 0){ //But if the modulus of 3 is 0 (divisible by 3) then print Fizz.
				System.out.print("Fizz");
			}
			if(i % 5 == 0){ //And if the modulus of 5 is 0 (divisible by 5) then print Buzz
				System.out.print("Buzz");
			}
			}
	}
	
}