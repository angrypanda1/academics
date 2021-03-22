import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        
    }
    public static int minGap(int[] arr){
        int placeholder = arr[1] - arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i+1] - arr[i] < placeholder) {
                placholder = arr[i+1] - arr[i];
            }
        }
        return placeholder
    }
}