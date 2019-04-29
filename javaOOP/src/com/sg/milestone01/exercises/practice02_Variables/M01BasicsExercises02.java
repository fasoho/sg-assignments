package com.sg.milestone01.exercises.practice02_Variables;

/**
 * @project javaOOP
 * @user jp
 * @date 2019-04-29
 */
public class M01BasicsExercises02 {
  /**
   * Exercise 01: In A Bucket
   * Method that practices using variables
   */
  public void InABucket() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 01: In A Bucket **");
    System.out.println();

    // You can declare all KINDS of variables
    String walrus;
    double piesEaten;
    float weightOfTeacupPig;
    int grainsOfSand;

    // But declaring them just sets up the space for data
    // to use the variable, you have to put data IN it first!
    walrus = "Sir Leroy Jenkins III";
    piesEaten = 42.1;

    System.out.println("Meet my pet walrus, " + walrus);
    System.out.print("He was a bit hungry today, and ate this many pies: ");
    System.out.println(piesEaten);
    System.out.println("\n");
  }

  /**
   * Exercise 02: More Buckets More Fun
   * Method that practices using variables - assign variables to other variables
   * Type code into java file
   * What operator are we using to show that the dog ate a bug? (Answer in a comment)
   * Why does the number of bugs not change when we change the number of butterflies?
   * (Answer in a comment
   */
  public void MoreBucketsMoreFun() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 02: More Buckets More Fun **");
    System.out.println();

    // Declare ALL THE VARIABLES
    // Usually it's a good idea to declare them at the beginning of the program
    int butterflies, beetles, bugs;
    String color, size, shape, thing;
    double number;

    // Now give a couple of them values
    butterflies = 2;
    beetles = 4;

    bugs = butterflies + beetles;
    System.out.println("There are only " + butterflies + " butterflies,");
    System.out.println("but " + bugs + " bugs total.");

    System.out.println("Uh oh, my dog ate one.");
    butterflies--;
    System.out.println("Now there are only " + butterflies + " butterflies left.");
    System.out.println("But still " + bugs + " bugs left, wait a minute!!!");
    System.out.println("Maybe I just counted wrong the first time...");
    System.out.println();
  }

  /**
   * Exercise 03: The Order Of Things
   * Method that practices using variables
   * Output looks a little funny, can you fix it?
   * What happens if you output them in a different order than the "official", does it sound okay?
   * (write out some new print outs in a different order, which sounds the best?
   */
  public void TheOrderOfThings() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 03: The Order Of Things **");
    System.out.println();

    double number;
    String opinion, size, age, shape, color, origin, material, purpose;
    String noun;

    number = 5.0;
    opinion = "AWESOME";
    size = "teensy-weensy";
    age = "new";
    shape = "oblong";
    color = "BRIGHT yellow";
    origin = "AlphaCentaurian";
    material = "platinum";
    purpose = "good";
    noun = "dragons";

    // Using the + with strings doesn't add it concatenates
    System.out.println(number + opinion + size + age + shape + color + origin + material + purpose
    + noun);
    System.out.println();
    // Adding spaces to make it read better and changing order
    System.out.println(number + " " + opinion + ", " + age + ", " + size + ", " + color + ", " +
      material + ", " + shape + ", " + purpose + ", " + origin + " " + noun);
    System.out.println();
  }

  /**
   * Exercise 04: Best Adder Ever
   * Method that adds numbers
   * Stores 3 different numbers in different variables and displays their values on the screen
   * Adds those variables together and stores that in a new variables
   * Displays answer twice
   */
  public void BestAdderEver() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 04: Best Adder Ever **");
    System.out.println();

    int num1, num2, num3;

    num1 = 5;
    num2 = 8;
    num3 = 12;

    System.out.println("Number 1: " + num1);
    System.out.println("Number 2: " + num2);
    System.out.println("Number 3: " + num3);

    int answer = num1 + num2 + num3;

    System.out.println("Answer: " + answer);
    System.out.println("Answer: " + answer);
    System.out.println();
  }

  /**
   * Exercise 05: All About Me
   * This is a program that prints answers about me to the screen
   * Talks about name, favorite food, how many pets you have, if I have ever eaten gnocchi,
   * and the age when I learned how to whistle
   * Prints each piece of data on its own line using variables
   */
  public void AllAboutMe() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 05: All About Me **");
    System.out.println();


    String name, faveFood, eatGnocchi;
    int numOfPets, whistleAge;

    name = "Jeff";
    faveFood = "sushi";
    eatGnocchi = "I have never eaten gnocchi before, but I would love to";
    numOfPets = 0;
    whistleAge = 7;

    System.out.println("Name: " + name);
    System.out.println("Favorite Food: " + faveFood);
    System.out.println("Eaten Gnocchi before?: " + eatGnocchi);
    System.out.println("Number of Pets: " + numOfPets);
    System.out.println("Whistle Age: " + whistleAge);

    System.out.println();
  }

  /**
   * Exercise 06: Menu Of Champions
   * Program to display a menu for a restaurant
   * There should be at least 3 different foods, each with their own price.
   * All things should be stored in their own variable.
   * Display restaurant and menu, followed by each food alongside its price
   * Many use ASCII art to decorate menu if desired
   */
  public void MenuOfChampions() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 06: Menu Of Champions **");
    System.out.println();

    String name, item1, item2, item3, item4;
    double item1price, item2price, item3price, item4price;

    name = "Food Junkie";
    item1 = "Volcanic Beef Ribs";
    item2 = "Seat of Yer Pants Spiced Macaroni";
    item3 = "Torched Lava Cake";
    item4 = "Mt. Vesuvius Blast Cooler";
    item1price = 23.99;
    item2price = 10.59;
    item3price = 9.50;
    item4price = 8.25;

    System.out.println("~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~\n");
    System.out.println("                WELCOME TO " + name + "!!!\n");
    System.out.println("~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~\n");
    System.out.println("                     Today's Menu Is...\n");
    System.out.println("             --<>--<>--<>--<>--<>--<>--<>--<>--              \n");

    System.out.printf("         %15s%25s%n", item1, item1price);
    System.out.printf("         %15s%10s%n", item2, item2price);
    System.out.printf("         %15s%25s%n", item3, item3price);
    System.out.printf("         %15s%18s%n", item4, item4price);
    System.out.println();
  }
}
