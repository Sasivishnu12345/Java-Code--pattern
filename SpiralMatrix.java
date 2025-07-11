import java.util.*;
public class SpiralMatrix{
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16}
        };

        ArrayList<Integer> ls =new ArrayList<>();
        int left=0,top=0;
        int right=arr[0].length-1,bottom=arr.length-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ls.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ls.add(arr[i][right]);
            }
            right--;
            for(int i=right;i>=left;i--){
                ls.add(arr[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                ls.add(arr[i][left]);
            }
            left++;
        }
        System.out.println(ls);
    }
    
}
