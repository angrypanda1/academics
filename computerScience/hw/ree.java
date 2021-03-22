public class ree { 
    public static int product2D(int[][] arr) {
        int product = 1; // placeholder product
        for (int i=0; i<arr.length;i++) { // iterate through the row
            for (int j = 0; j < arr[0].length; j++) { // iterate through the column while on one of the numbers in the row
                if(arr[i][j] == 0) { // if the array entry is equal to zero
                    ; // do nothing
                }
                else {
                    product *= arr[i][j]; // multiply each array entry by each other
                }
            }
        }
        return product; // return the product
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {1,0,2}, {2,1,2}};
        System.out.println(product2D(arr));
    }
}