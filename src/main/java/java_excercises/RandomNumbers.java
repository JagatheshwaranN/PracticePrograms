package java_excercises;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {

	public static void main(String ar[]) {

		Random random = new Random();

		System.out.println("Random Numbers using Random class");
		System.out.println("Random Integers> " + random.nextInt());

		System.out.println("Random Numbers using Math Random function");
		System.out.println("Random Doubles> " + Math.random());

		System.out.println("Random Numbers using Thread Local Random class");
		System.out.println("Random Floats> " + ThreadLocalRandom.current().nextFloat());
	}

}
