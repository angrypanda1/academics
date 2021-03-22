# Chapter 3 Problems

12. What is wrong with the following program?

```java
public class Temperature {
    public static double ftoc(double tempf) {
        return (tempf - 32) * 5.0 / 9;
    }
    public static void main(String[] args) {
        double tempf = 98.6;
        double tempc = 0.0;
        tempc = ftoc(tempf); 
        System.out.println("Body temp in C is " + tempc);
    }
    
}
```

14. What output is produced by the following program? 

```markdown
3 0 
1 2 4
4 3 
5 2 4 
8 1 
5 9 4 
```

16. Write a method called `min` that takes three integers as parameters and returns the smallest of the three values; for example, a call of `min(3, -2, 7)` would return `-2`, and a call of `min(19, 27, 6)` would return `6`. Use `Math.min` to write your solution. 

```java
import java.lang.Math;
public class test {
    public static int minimum(int a, int b, int c) {
        return Math.min(a, Math.min(b,c));
    }
}
```

17. Write a method called `countQuarters` that takes an `int` representing a number of cents as a parameters and returns the number of quarter coins represented by that many cents. Don't count any whole dollars, because those would be dispensed as dollars. For example, `countQuarters(64)` would return `2`, because 64 cents is equivalent to 2 quarters with 14 cents left over. A call of `countQuarters(1278)` would return 3, because after the 12 dollars are taken out, 3 quarters remain in the 78 cents that are left. 

```java
public class test {
    public static void main(String [] args) {
        int result = countQuarters(64); 
        System.out.println(result);
    }
    public static int countQuarters(int a) {
        int remainder = a % 100;
        int quarters = remainder/25;
        return quarters;
    }
}
```

22. In a program reading user input by means of a `Scanner`, the user types the following line of input: `Hello there. 1+2 is 3 and 1.5 squared is 2.25!`

```text
12
```

23. Consider the following code fragment: 

```java
Scanner console = new Scanner(System.in);
System.out.print("How much money do you have? "); 
double money = console.nextDouble();
```

`34.5`

`6.0`

`5.0`

`error`

`error`

`error`

`error`

`645.0`



26. Write Java code that prompts the user for a phrase and a number of times to repeat it, then prints the phrase the requested number of times. 

```java
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your phrase? ");
        String input = s.nextLine();
        System.out.print("How many times should I repeat it? ");
        int num = s.nextInt();
        for(int i=0;i<num;i++) {
            System.out.println(input);
        }
    }
    
}
```

