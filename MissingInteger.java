import java.util.Arrays;

public class App {

    public static int solution(int[] A) {
        int result = 1;
        
        int N = A.length;
        
        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            if(A[i] == result) {
                result++; // increment the result if the current element is equal to the result
            } else if (A[i] > result) {
                break; // break the loop if the current element is greater than the result
            } // calculate the sum of the array elements
        }
       
        return result; // return the sorted array    
    }
   
    public static void main(String[] args) throws Exception {
        int[] arr = {4, 3, 2}; // create an array of integers
        System.out.println(solution(arr)); // call the solution method with the array
    }
}
