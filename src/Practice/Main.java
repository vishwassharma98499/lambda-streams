package Practice;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World 2");
            }
        };
        greeting1.sayHello();

        Greeting greeting2 = () -> System.out.println("hello world 3");
        greeting2.sayHello();

        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber;
        };

        System.out.println(calculator.calculate(1, 2));

        /*
         * IntBinaryOperator is an in-Build functional interface that takes 2 args
         * and return one value. So instead of creating an interface we can use an existing one.
         */
        IntBinaryOperator inBuild = (int x, int y) -> x + y;
        System.out.println(inBuild.applyAsInt(5, 4));
    }
}
