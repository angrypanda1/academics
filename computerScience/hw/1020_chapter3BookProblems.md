# Chapter 3 Book Problems

31. Suppose that you are trying to write a program that produces the following output: 

```java
1 3 5 7 9 11 13 15 17 19 21
1 3 5 7 9 11
```

​	Identify all the errors with this program. 



* In line 11, it should be `count` not `count+2` 

* In line 6, it should be `count+=2` not `count++` 

* There shouldn't be a `count = count + 2` because it is already in the `for` loop

* You can't change `MAX_ODD` to 11 inside the main method. 

32. What is the output of the following unknown method? 

`25 + 16 + 9 + 4 = 55` 

33. Suppose that you have a variable  called `line` that will take on the values `1, 2, 3, 4` and so on, and a class constant named `SIZE` that takes one of two values. You are going to formulate expression in terms of `line` and `SIZE` that will yield different sequences of numbers of characters. Fill in the table below, indicating an expression that will generate each sequence. 



* `(2 * SIZE) + (2 * line)`
* `(4 * line) + (3 * size)`
* `(3 + 2 * SIZE) -line`



15. Write a method called `printDesign` that produces the following output. Use nested `for` loops to capture the structure of the figure. 



```java
public class design {
    public static void printDesign() {
        for (int i = 1; i <= 9; i+=2) {
            for (int j = 0; j < (11 - i) / 2; j++) {
            	System.out.print("-");
            }
            for(int j = 0; j < i; j++) {
            	System.out.print(i);
            }
            for (int j = 0; j < (11 - i) / 2; j++) {
            	System.out.print("-");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        printDesign();
    }
}
```

5. Don't know how to this, unfortunately. 