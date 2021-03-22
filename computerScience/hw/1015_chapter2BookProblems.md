# Chapter 2 Book Problems Part 2

26. What is the output of the following sequence of loops? 
``` java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 10; j++) {
        System.out.print((i * j) + " ");
    }
    System.out.println();
}
```
```
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40 
5 10 15 20 25 30 35 40 45 50 
```
27. What is the output of the following sequence of loops? 
```
         *
        ***
       ***** 
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
```
28. What is the output of the following sequence of loops? 
```
****!****!****!
****!****!****!
```
29. What is the output of the following sequence of loops?
```
************!
************!
```
30. What is the output of the following sequence of loops?
```
*!*!*!*!
*!*!*!*!
```
---
5. Write nested `for` loops to produce the following output.
``` java
Public class nestedLoopOne {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
        System.out.println();
        }
    }
}
```
6. Write nested `for` loops to produce the following output:
``` java
public class nestedLoopTwo {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(count);
                
            }
        count++;
        System.out.println();
        }
    }
}
```
7. Write nested `for` loops to produce the following output: 
``` java
public class nestedLoopThree
{
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
		    for (int j = 5-i; j > 0; j--) {
		        System.out.print(" ");
		    }
		 System.out.println(i);
		}
			}
}
```

8. Write nested `for` loops to produce the following output: 

``` java
public class nestedLoopFour
{
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
		    for (int j = 5-i; j > 0; j--) {
		        System.out.print(" ");
		    }
		 for (int k = 0; k <= i; k++){
		 System.out.print(i);
		 }	 
		 System.out.println();
			}
	}
}
```

