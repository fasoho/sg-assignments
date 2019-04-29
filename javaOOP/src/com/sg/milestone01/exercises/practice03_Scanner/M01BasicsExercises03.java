package com.sg.milestone01.exercises.practice03_Scanner;

import java.util.Scanner;

/**
 * @project javaOOP
 * @user jp
 * @date 2019-04-29
 *
 * This section introduces some coding exercises surrounding user input via Scanner
 */
public class M01BasicsExercises03 {

  /**
   * Exercise 01: Quest For The User Input
   * Method that practices using Scanner to get input
   */
  public void QuestForTheUserInput() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 01: Quest For The User Input **");
    System.out.println();

    Scanner input = new Scanner(System.in);

    String name;
    String quest;
    double velocityOfSwallow;

    System.out.print("What is your name? ");
    name = input.nextLine();

    System.out.print("What is your quest? ");
    quest = input.nextLine();

    System.out.print("What is the airspeed velocity of an unladen swallow? (Enter number) ");
    velocityOfSwallow = input.nextDouble();

    System.out.println("How do you know " + velocityOfSwallow + " mph is correct, " + name + ",");
    System.out.println("When you didn't even know if the swallow was African or European??!");
    System.out.println("Maybe skip answering things about birds and instead go " + quest + "!!");

    System.out.println();
  }

  /**
   * Exercise 02: Don't Forget To Store It
   * Method that practices using Scanner to get input
   * Change code so appropriate input is stored in the right variable.
   * Uncomment last two lines in main method to test it out
   */
  public void DontForgetToStoreIt() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 02: Don't Forget To Store It **");
    System.out.println();

    Scanner input = new Scanner(System.in);

    double pi = 3.14159;
    String cheese, color, meaningOfLife;

    System.out.println("Give me pi to at least 5 decimals: ");
    pi = input.nextDouble();

    System.out.println("What is the meaning of life, the universe, and everything? ");
    meaningOfLife = input.next();

    System.out.println("What is your favorite kind of cheese? ");
    cheese = input.next();

    System.out.println("Do you like the color red or blue more? ");
    color = input.next();

    System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
    System.out.println("Pi equals " + pi);
    System.out.println("The meaning of life is " + meaningOfLife);
    System.out.println();
  }

  /**
   * Exercise 03: Bigger Better Adder
   * Method that practices using Scanner to get input
   * Take code from "Best Adder Ever" and instead of using hardcoded values stored in variables,
   * ask user for input for the numbers that they're going to add together and display results
   *
   * @version 2.0
   */
  public void BiggerBetterAdder() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 03: Bigger Better Adder **");
    System.out.println();

    Scanner input = new Scanner(System.in);

    int num1, num2, num3;

    System.out.println("Please enter a number: ");
    num1 = input.nextInt();

    System.out.println("Please enter a number: ");
    num2 = input.nextInt();

    System.out.println("Please enter a number: ");
    num3 = input.nextInt();

    int answer = num1 + num2 + num3;

    System.out.println("Answer: " + answer);
    System.out.println();
  }

  /**
   * Exercise 04: Passing The Turing Test
   * Takes user input in a conversation
   * Asks the user their name, then your name and displays that in a conversational way
   * The same is done for food, number
   * Finally, it says goodbye
   */
  public void PassTheTuringTest() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 04: Passing The Turing Test **");
    System.out.println();

    Scanner input = new Scanner(System.in);

    String personName, yourName, personColor, yourColor, personFruit, yourFruit;
    int personNumber, yourNumber;

    yourName = "Jeff";
    yourColor = "blue";
    yourFruit = "pineapple";
    yourNumber = 20;

    System.out.println("Hello there! ");
    System.out.print("What's your name? ");
    personName = input.next();
    System.out.print("Hi, " + personName + "!! I'm " + yourName + ". What's your favorite color? " );
    personColor = input.next();
    System.out.println("It's " + personColor + "? Mine's " + yourColor + ".");
    System.out.println("I really like " + yourFruit + ". What's your favorite fruit, " + personName + "? " );
    personFruit = input.next();
    System.out.println("Really? That's awesome! I love " + personFruit + "! My favorite fruit is " + yourFruit + ". ");
    System.out.println("Speaking of favorites, what's your favorite number? ");
    personNumber = input.nextInt();
    System.out.println(personNumber + " is a really cool number. Mine's " + yourNumber + ". ");
    System.out.println("Well, thanks for talking with me, " + personName + "!! I had a blast!");

    System.out.println();
  }

  /**
   * Exercise 05: All The Trivia
   * Method that practices using Scanner to get input
   * Ask user for several pieces of trivia, but when you display them, mix up the answers
   */
  public void AllTheTrivia() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 05: All The Trivia **");
    System.out.println();

    Scanner input = new Scanner(System.in);

    String answer1, answer2, answer3, answer4;

    System.out.print("1,024 Gigabytes is equivalent to what? >> ");
    answer1 = input.next();

    System.out.print("In our solar system which is the only planet that rotates clockwise? >> ");
    answer2 = input.next();

    System.out.print("The largest volcano ever discovered in our solar system is located "
      + "on which planet? >> ");
    answer3 = input.next();

    System.out.print("What is the most abundant element in the earth's atmosphere? >> ");
    answer4 = input.next();

    System.out.println("Wow, 1,024 Gigabytes is a " + answer2 + "!!");
    System.out.println("I didn't know that the largest ever volcano was discovered on "
      + answer1 + "!!");
    System.out.println("That's amazing that " + answer3 + " is the most abundant element "
      + "in the atmosphere...");
    System.out.println(answer4 + " is the only planet that rotates clockwise, neat!");

    System.out.println();
  }

  /**
   * Exercise 06: Do It Better
   * Method that practices using Scanner to get input
   * Asks user how many miles they can run, the number of hotdogs they can eat, and the number
   * of languages they know. Immediately after the question, program multiplies number by 2 and
   * adds 1, bragging that computer can do everything you can do better
   */
  public void DoItBetter() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 06: Do It Better **");
    System.out.println();

    Scanner input = new Scanner(System.in);

    int milesRun, numHotdogsEaten, numLanguagesKnown, computerMilesRun, computerNumHotdogsEaten,
    computerNumLanguagesKnown;

    System.out.print("How many miles can you run? ");
    milesRun = input.nextInt();
    computerMilesRun = milesRun * 2 + 1;
    System.out.println("Ha, I can run " + computerMilesRun + "!");

    System.out.print("How many hotdogs can you eat? ");
    numHotdogsEaten = input.nextInt();
    computerNumHotdogsEaten = numHotdogsEaten * 2 + 1;
    System.out.println("Ha, I can eat " + computerNumHotdogsEaten + "!");

    System.out.print("How many languages can you speak? ");
    numLanguagesKnown = input.nextInt();
    computerNumLanguagesKnown = numLanguagesKnown * 2 + 1;
    System.out.println("Ha, I can speak " + computerNumLanguagesKnown + "!");
    System.out.println();
  }



  /**
   * Exercise 07: Healthy Hearts
   * Method that practices using Scanner to get input
   * Simple calculator that asks user for their age.
   * Then it calculates the healthy heart rate range for that age and displays it
   *
   * Maximum heart rate should be 220 - their age.
   * Target heart rate zone is the 50 - 85% of the maximum
   */
  public void HealthyHearts() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 07: Healthy Hearts **");
    System.out.println();

    Scanner input = new Scanner(System.in);

    int age, maxHeartRate, targetHRZoneMin;
    double targetHRZoneMax;

    System.out.print("What is your age? ");
    age = input.nextInt();

    maxHeartRate = 220 - age;

    targetHRZoneMin = maxHeartRate / 2;
    targetHRZoneMax = maxHeartRate * 0.85;

    System.out.println("Your maximum heart rate should be 170 beats per minute");
    System.out.println("Your target heart rate is " + targetHRZoneMin + " - " + (int) targetHRZoneMax
      + ".");

    System.out.println();
  }

  /**
   * Exercise 08: Mini Mad Libs
   * Method that practices using Scanner to get input
   * This program lets you play mad libs
   */
  public void MiniMadLibs() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 08: Mini Mad Libs **");
    System.out.println();

    // When using nextInt() make sure to get rid of \n because nextInt() skips newline \n.
    // You can do that by adding an extra nextLine() to take are of the \n character.

    Scanner input = new Scanner(System.in);
    
    String noun1, noun2, noun3, noun4, noun5, adj1, adj2, verbPresent, verbPast;
    int num;

    System.out.print("Enter a single noun: ");
    noun1 = input.nextLine();
    System.out.print("Enter an adjective: ");
    adj1 = input.nextLine();
    System.out.print("Enter a single noun: ");
    noun2 = input.nextLine();
    System.out.print("Enter a whole number: ");
    num = input.nextInt();
    input.nextLine();
    System.out.print("Enter an adjective: ");
    adj2 = input.nextLine();
    System.out.print("Enter a plural noun: ");
    noun3 = input.nextLine();
    System.out.print("Enter another plural noun: ");
    noun4 = input.nextLine();
    System.out.print("Enter a final plural noun: ");
    noun5 = input.nextLine();
    System.out.print("Enter a present tense verb: ");
    verbPresent = input.nextLine();
    System.out.print("Enter the past tense of the previous verb you entered: ");
    verbPast = input.nextLine();

    System.out.print(noun1 + ": " + "the " + adj1 + " frontier. ");
    System.out.print("These are the voyages of the starship " + noun2 + ". ");
    System.out.print("Its " + num + "-year mission: to explore strange " + adj2 + " " + noun3 
      + ", to seek out " + adj2 + " " + noun4 + " and " + adj2 + " " + noun5 + ", to boldly " 
      + verbPresent + " where no one has " + verbPast + " before!");

    System.out.println();
  }

}
