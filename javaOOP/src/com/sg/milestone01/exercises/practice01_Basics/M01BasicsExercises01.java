package com.sg.milestone01.exercises.practice01_Basics;

/**
 * @project javaOOP
 * @user jp
 * @date 2019-04-29
 *
 * This section introduces some coding exercises on the basics of Java syntax and execution.
 */
public class M01BasicsExercises01 {


  /**
   * Exercise 01: ABeginning
   * Method that prints out text
   */
  public void ABeginning() {
    System.out.println("** Exercise 01: ABeginning **");
    System.out.println();
    System.out.println("Hello World!");
    System.out.println("Hello from the Guild!");
    System.out.println("Typing code is easier than I though ...");
    System.out.println("Typity Typity Type");
    System.out.println("After I finish typing,");
    System.out.println("I'll compile my code.");
    System.out.println("And then when I run it,");
    System.out.println("The console will print out all my brilliant words!");
    System.out.println("And it all starts with \"Hello World!\" ...");
    System.out.println("\n");
  }

  /**
   * Exercise 02: ProjectGutenberg
   * Method that prints out text about Johannes Gutenberg
   */
  public void ProjectGutenberg() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 02: ProjectGutenberg **");
    System.out.println();
    System.out.println("Did you know that in 1440 (or thereabouts)");
    System.out.println("Johannes Gutenberg invented the printing press?");
    System.out.println("He started out as a goldsmith!");
    System.out.println("His invention made rapid and prolific typed volumes");
    System.out.println("Available for the first time ever...!");
    System.out.println("We are like a modern Gutenberg!");
    System.out.println("Printing vast amounts to the waiting console with ease!");
    System.out.println("\n");
  }

  /**
   * Exercise 03: CommentingCode
   * Method to practice learning about commenting and commenting out your code
   */
  public void CommentingCode() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 03: CommentingCode **");
    System.out.println();
    // Comments are written to explain code in an easily
    // understandable way
    // Basically for single lines
    // anything after // is considered a comment
    System.out.println("Normal code is compiled and runs ...");
    System.out.println("Comments however ... "); // do not execute

    // Comments can be on their own line
    System.out.println("..."); // or they can share like this

    // However if you put the // BEFORE a line of code
    // System.out.println("Then it is considered a comment");
    // System.out.println("and won't execute!");

    /*

      This is a multi-lined comment!
      Named because, well, it spans SO many lines!

     */

    System.out.println("What you should see:");
    System.out.println("Normal code is compiled and runs ...");
    System.out.println("Comments however ...");
    System.out.println("\n");
  }

  /**
   * Exercise 04: AllTheMaths
   * Take code below and type it into a java class file. Make it work!
   * Then go back and change each of the "???" into a mathematical expression using the math
   * operators
   * BONUS: Go back and remove all the decimals
   */
  public void AllTheMaths() {
    System.out.println("---------------------------------------------------");
    System.out.println("** Exercise 03: CommentingCode **");
    System.out.println();
    System.out.print("1 + 2 is: ");
    System.out.println(1 + 2);
    System.out.print("42001 modulus 5 is: ");
    System.out.println(42001 % 5);
    System.out.print("5565.0 divided by 22.0 is: ");
    System.out.println(5565.0 / 22.0);
    System.out.print("223 times 31 - 42: ");
    System.out.println(223 * 31 - 42);
    System.out.print("Is 4 greater than -1? ");
    System.out.println(4 > -1);
    System.out.print("\n****** Now make the computer do some harder math! ******");
    System.out.print("8043.52 minus 4.2 plus 23.0 divided by 56.0 times -76.13 is: ");
    System.out.println(8043.52 - 4.2 + 23.0 / 56.0 * -76.13);
    System.out.print("11111 modulus 3 minus 67 minus 1 plus 9 is: ");
    System.out.println(11111 % 3 - 67 - 1 + 9);
    System.out.print("44 minus 22 minus 11 minus 66 minus 88 minus 76 minus 11 minus 33 is: ");
    System.out.println(44 - 22 - 11 - 66 - 88 - 76 - 11 - 33);
    System.out.print("22 times 3 minus 1 plus 4 times 6 minus -9 is: ");
    System.out.println(22 * 3 - 1 + 4 * 6 - -9);
    System.out.print("Is 67 greater than 4 * 5? ");
    System.out.println(67 > 4 * 5);
    System.out.print("Is 78 less than 4 * 5? ");
    System.out.println(78 < 4 * 5);
    System.out.println();
    System.out.println("What you should see: ");
    System.out.println("1 + 2 is: 3");
    System.out.println("42001 modulus 5 is: 1");
    System.out.println("5565.0 divided by 22.0 is: 252.95454545454547");
    System.out.println("222 times 31 - 42 is: 6871");
    System.out.println("Is 4 greater than -1? true");
    System.out.println("****** Now make the computer do some harder maths!");
    System.out.println("8043.52 minus 4.2 plus 23.0 divided by 56.0 times -76.13 is: 8008.052321428572");
    System.out.println("11111 modulus 3 minus 67 minus 1 plus 9 is: -57");
    System.out.println("44 minus 22 minus 11 minus 66 minus 88 minus 76 minus 11 minus 33 is : -263");
    System.out.println("22 times 3 minus 1 plus 4 times 6 minus -9 is : 80");
    System.out.println("Is 67 greater than 4 * 5? true");
    System.out.println("Is 78 less than than 4 * 5? false");
    System.out.println();
  }

}
