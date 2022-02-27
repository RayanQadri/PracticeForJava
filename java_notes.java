import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class java_notes {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        // int number;
        //  number = 10;

        int number2 = 5;
        // data_type variable_name = value;

        int hours = 8;

        //No spaces, no special characters, the first character cannot be an uppercase character and java is case sensitive

        //Types of Data Types: 1. Primitive Data Type and 2. Non-Primitive Data Type
        /*Primitive Data Types: Int (integer), char (single-characters), boolean (true/false), float (decimal), double (decimal),
        byte, short and long.
         */
        /* Non-Primitive Data Types: Strings (word/words) and arrays (lists in python) */

        //WRITING TYPES OF DATA TYPES

        // data_type variable_name = value <---


        // ASSIGNMENT OPERATORS


        //the variable on the left hand side is equal to whatever is on the right hand side
        // 1. num1 = num2;

        /*the final value of the variable on the left hand side is equal to, the value of the variable on the right hand side, plus
        the intial value of the variable (on the left hand side)
        num1 = num1 + num2;
         */
        // 2.  num1 += num2;

        //3.  num1 -= num2;

        //4. num1 *= num2;

        //5. num1 /= num2;

        //6. num1 %= num2;

        //AUTO-INCREMENT AND AUTO-DECREMENT OPERATORS
//        int num1 = 5;
//        int num2 = 7;
//        int num3 = 2;


        /*1. The operation for auto-incrementation is:
        variableName++;
        (The ++ operator adds a value of 1 to the given variable)
         */

        /*2. The operation for auto-decrementation is:
        variableName--;
        (The -- operator subtracts a value of 1 from the given variable)
         */


        //LOGICAL OPERATORS

        /*
        1. &&
        ^This operator returns true if both of the compared values are true, otherwise it will return false
        2. ||
        ^This operator returns false only if both of the compared values are false, otherwise it will return true
        3. !
        ^This operator returns the opposite value of the variable analyzed
         */


        int compare1 = 4;
        int compare2 = 5;


        //System.out.println("The result:" + (compare1 <= compare2));

        //OBTAINING A VALUE FROM THE USER

        /*
        First steps:
        1. Type out: import java.util.Scanner;
        2. In code at top type out: Scanner input = new Scanner(System.in);
         */

        /*
        1. next() <-- input.next()
        ^ Allows the user to input a string (Ex: cat) *note: can only input 1 word
        2. nextLine() <-- input.nextLine()
        ^ Allows the user to input a sentence (Ex. I love cats)
        3. nextInt() <-- input.nextInt()
        ^ Allows the user to input a number (Ex. 50) *note: can input negative and positive numbers
        4. nextDouble() <-- input.nextDouble()
        ^ Allows the user to input a decimal number (Ex. 3.14)
        5. nextBoolean() <-- input.nextBoolean()
        ^ Allows the user to input a true or false value (Ex. true)
         */

        Scanner input = new Scanner(System.in);

        // System.out.println("Hi my name is Rayan!");

        //Program will calculate area:
        //Ask the user for the length of a square
        // System.out.println("Please provide the length of the square");
        // int length = input.nextInt();
        //take input
        //Ask the user for the width of a square
        // System.out.println("Please provide the width of the square");
        // int width = input.nextInt();
        //take input
        //calculate area

        // int area = length*width;

        //System.out.println("The area is " + area + " cm");

        //Calculating the circumference of a circle

//        System.out.println("Input a radius: ");
//        int radius = input.nextInt();
//
//        double pi = 3.14;
//
//        double circum = 2*pi*radius;

        // System.out.println("The circumference is: " + circum);

        //Finding digits
        /*
        Enter a number: 123
        Hundreds digit: 1
        Tens digit: 2
        Ones digit: 3
         */

        // System.out.println("Enter a number: ");
        //int number = input.nextInt();

        //int hundreds = number / 100;

        //System.out.println("The hundreds digit is: " + hundreds);

        //number = number % 100;

        //int tens = number / 10;

        //System.out.println("The tens digit is: " + tens);

        //number = number % 10;

        //int ones = number;

        //System.out.println("The ones digit is: " + ones);



        /*
        Hundreds digit: 1
        Tens digit: 2
        Ones digit: 3
        Output : 123
         */

        // hundreds = hundreds * 100;
        // tens = tens * 10;
        // ones = ones * 1;

        // number = hundreds + tens + ones;

        // System.out.println("The number that you inputed was: " + number);


        //Homework
        //Question 1
        //This program will ask the user for a Farenheit temperature then will output the temperature in celsuis.

//        System.out.println("Enter a Farenheit temprature: ");
//        int farenheit = input.nextInt();
//        int celsuis = (farenheit - 32) * 5 / 9;
//        System.out.println("The temprature in celsuis is: " + celsuis);


        //Question 2
        //This program will ask the user for the amount of change they have in cents and then display the minimum number of coins necessary to make the change.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the change: ");
//        int change = input.nextInt();
//        int quarters = change/25;
//        System.out.println("The quarters are: " + quarters);
//        change = change%25;
//        int dimes = change/10;
//        System.out.println("The dimes are: " + dimes);
//        change = change%10;
//        int nickels = change/5;
//        System.out.println("The nickels are: " + nickels);
//        change = change % 5;
//        int pennies = change;
//        System.out.println("The pennies are: " + pennies);


        //MATH METHODS
        /*
        int num1, num2;
        1. Math.max(num1, num2)
        ^This function gives us the highest value between both of the numbers being compared (num1, num2)

        2. Math.min(num1, num2)
        ^This function gives us the lowest value between both of the numbers being compared (num1, num2)

        3. Math.sqrt(num1)
        ^This function returns the square root of the value being analyzed (num1)

        4. Math.abs(num1)
        ^This function returns the absolute value of the value being analyzed (returns the positive value of num1)

        5. Math.random()
        ^The function returns a random number in between the range of 0.0 and 1.0
        */



        //RANDOM NUMBERS
        /*


         */

//        Random random = new Random();
//        int number = random.nextInt(20-8); //to create a bound from 8-20
//
//        System.out.println(number);


//        Random random = new Random();
//        int value = random.nextInt(50-25) + 25;
//
//        System.out.println(value);

        /* Task:
        1. User the user for 2 numbers
        2. The smaller number will be the lower bound of the range
        3. The larger number will be the upper bound of the range
        4. Generate a random number in between this range
         */


//        System.out.println("Enter your first number:");
//        int num1 = input.nextInt();
//
//        System.out.println("Enter your second number:");
//        int num2 = input.nextInt();
//
//        int min = Math.min(num1, num2);
//        int max = Math.max(num1, num2);
//
//        Random random = new Random();
//        int value = random.nextInt(max - min) + min;
//        System.out.println("The value is " + value);


        /* Warm Up:
        1. Randomly generate a number between the range of 3cm-15cm (this will be the radius)
        2. Find the circumference of a circle
       Note: Equation = 2(pi)(r)

       Harder Warm Up:
       1. Randomly generate a number between the range of 4cm-10cm (width)
       2. Ask the user for a number (length)
       3. Calculate the area of a rectangle
         */


//        Random random = new Random();
//        int radius = random.nextInt(15 - 3) + 3;
//
//        double circum = 2*(3.14)*radius;
//        System.out.println("The circumference of the circle is: " + circum);


//        Random random = new Random();
//        int width = random.nextInt(10 - 4) + 4;
//        System.out.println("Your width is: " + width);
//
//        System.out.println("What is your length:");
//        int length = input.nextInt();
//
//        int area = length*width;
//
//        System.out.println("Your area is: " + area);

        /*
        1. Ask the user for 2 numbers
        2. Determine the distance between the numbers on a number line

        For example:
        Numbers: 5, -3
        Output: 8
         */

//        System.out.println("Enter your first number: ");
//        int num1 = input.nextInt();
//
//        System.out.println("Enter your second number: ");
//        int num2 = input.nextInt();
//
//        int max = Math.max(num1, num2);
//        int min = Math.min(num1, num2);
//
//        int distance = max - min;
//
//        System.out.println("Distance: " + distance);

//  --------------------------------------------------------------------------------------------------------------------

        //Homework 2022-01-03

        System.out.println("Enter your x value of the first coordinate:");

        double x1 = input.nextInt();


        System.out.println("Enter your y value of the first coordinate:");

        double y1 = input.nextInt();

        System.out.println("Enter your x value of the second coordinate:");

        double x2 = input.nextInt();

        System.out.println("Enter your y value of the second coordinate:");

        double y2 = input.nextInt();


        double x = x2 - x1;
        double y = y2 - y1;

        double distance = Math.sqrt(x*x + y*y);
        System.out.println("The distance between the two points is approximately: " + distance);

//  --------------------------------------------------------------------------------------------------------------------
        // Question 2

//        Random random = new Random();
//        double x1 = random.nextInt(100);
//        double y1 = random.nextInt(100);
//        double x2 = random.nextInt(100);
//        double y2 = random.nextInt(100);
//
//        System.out.println("Your x value of your first coordinate is:" + x1);
//        System.out.println("Your y value of your first coordinate is:" + y1);
//        System.out.println("Your x value of your second coordinate is:" + x2);
//        System.out.println("Your y value of your second coordinate is:" + y2);
//
//        double x = x2 - x1;
//        double y = y2 - y1;
//
//        double distance = Math.sqrt(x*x + y*y);
//        System.out.println("The distance between the two points is approximately: " + distance);

//  --------------------------------------------------------------------------------------------------------------------

        //Array Lists
       /* The difference between an array and an array list is that the size of an array cannot be modified thereby you add or remove elements as per your wish. While in ArrayLists you can add elements and remove them however you like.
        */

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //to add a value to the arraylist we have to state the name of the list, type in .add and then in the brackets put the value
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        





    }}