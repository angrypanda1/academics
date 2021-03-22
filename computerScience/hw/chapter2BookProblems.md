# Chapter 2 Book Problems

19. Fill in the following table, indicating an expression that will generate each sequence. 

| Sequence           | Expression          |
|--------------------|---------------------|
| 2,4,6,8,10,12      | `count * 2`         |
| 4,19,34,30,64,79   | `(count * 15) - 11` |
| 30,20,10,0,-10,-30 | `(count * -10) + 40` |
| -7,-3,1,5,9,13     | `(count * 4) - 13`  |
| 97,94,91,88,85,82  | `(count * -3) + 100` |

20. Complete the code for the following for loop:

``` java
for (int i =1; i<=6; i++) {
    int num = (-22 + 18*i);
    System.out.println(num);
}
```
21. What is the output of the following `oddStuff` method?

``` java
public static void oddStuff() {
    int number =  4;
    for (int count = 1; count <= number; count++) {
        System.out.println(number);
        number = number/2;
    }

}
```
``` 
4
2
```
22. What is the output of the following loop?
``` java
int total = 25;
for (int number = 1; number <= (total/2); number++) {
    total = total - number;
    System.out.println(total + " " + number);
}
```

```
24 1
22 2
19 3
15 4
10 5
```
23. What is the output of the following loop? 

``` java
System.out.println("+---+");
    for (int i=1; i <=3; i++) {
        System.out.println("\\    /");
        System.out.println("/    \\");
}
```

```
+---+
\    /
/    \
\    /
/    \
\    /
/    \
```
24. What is the output of the following loop? 

``` java
for (int i =1; i <=3; i++)
    System.out.println("How many lines");
    System.out.println("are printed?");
```
$\fbox{None, because there is a syntax error.}$

25. What is the output of the following loop?

``` java
System.out.print("T-minus ");
for (int i = 5; i >= 1; i--) {
    System.out.print(i + ", ");
}
System.out.println("Blastoff!");
```
`T-minus 5, 4, 3, 2, 1, Blastoff!`
