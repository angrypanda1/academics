import java.util.Scanner;
class getString {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String str = input.nextLine();
        char charAtFive = str.charAt(4);
        System.out.println(charAtFive);
    }
}

