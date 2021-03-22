# Practice Exercises: Strings and Printing
1. Can the value of a string be changed after it is created?

No.

2. What is the operator for string concatenation?

The operator is "+". 

3. Write a Java statement to get the 5th character of a string called `str`.
```
import java.util.Scanner;
class getString {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String str = input.nextLine();
        char charAtFive = str.charAt(4);
        System.out.println(charAtFive);
    }
}
```
4. What does the `trim` method do?

This function eliminates leading/trailing spaces. 

5. What is the difference between `print` and `println`? Use the Java API.

`println` prints on the next line, while `print` prints on the same line.

6. Write a Java program to print the following to the console. Use 3 lines of code: 
```
My name is (your name)
and I love Java!!
```
```
public class printingProblem {
public static void main(String[] args) {
        System.out.print("My name is Svadrut ");
        System.out.print("and I love ");
        System.out.print("Java!! ");
    }
}
```
7. Write a Java program to print `Go Skyline Spartans!` to the console on one line. Use 3 separate statements. 
```
public class skylineSpartans {
    public static void main(String[] args) {
        System.out.print("Go ");
        System.out.print("Skyline ");
        System.out.print("Spartans! "); 
    }
}
```
8. What output is produced by these statements?
```
System.out.println("\ta\tb\tc");
System.out.println("\\\\"); 
System.out.println("'");
System.out.println("\"\""");
System.out.println("C:\nin\the downward spiral");
```
```
    a	  b	c
\\
'
""
C:
in	he downward spiral
```
9. Write a Java statement to produce this output. 
```
/ \ // \\ /// \\\
```
```
public class slashes{
    public static void main(String[] args) {
        System.out.print("/ \\ // \\\\ /// \\\\\\");
    }
}
```
