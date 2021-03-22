# Chapter 1 Book Problems
6. Which of the following can be used in a Java program as identifiers?

The identifiers `println`, `AnnualSalary`, `ABC`, `sum_of_data`, and `_average` can all be used as identifiers. 

18. Name the three errors in the following program. 
    
    The three errors are: 
    - First line should be `public class MyProgram {`
    - There's no semicolon in line 3
    - `println` is capitalized in line 3 when it shouldn't be 
      
19. Name the four errors in the following program. 
    
    The four errors are: 
    - Line two doesn't have a `void` keyword
    - `String` should be capitalized
    - There is no closing quote in line 4
    - There is no closing bracket for the class/method

20. Name the four errors in the following program:
    
    The four errors are:
    - There is no opening bracket for class `FamousSpeech`
    - Line 2 should be `public static void main(String[] args)`
    - The comment should be on one line
    - The comment opening and closing should be `//` 

2. Write a complete Java program called `Spikey` that prints the following output: 
```
public class Spikey {
    public static void main(String[] args) {
        System.out.println("   \\/");
        System.out.println("  \\\\//");
        System.out.println(" \\\\\\///");
        System.out.println(" ///\\\\\\");
        System.out.println("  //\\\\");
        System.out.println("   /\\");
    }
}
```
11. Write a Java program called `TwoRockets` that generates the following output. Use static methods to show structure and eliminate redundancy in your solution. Note that there are two rocket ships next to each other. What redundancy can you eliminate using static methods.
```
public class TwoRockets {
      public static void main(String[] args) {
        prTriangle();
        prSquare();
        prUS();
        prSquare();
        prTriangle();
    }
                                                    
    public static void prTriangle() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void prSquare() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void prUS() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
```

