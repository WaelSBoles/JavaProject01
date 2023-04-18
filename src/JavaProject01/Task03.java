package JavaProject01;

public class Task03 {
    public static void main(String[] args) {
        /*3. Create a 2D array or integer type where you will store
               odd and even numbers. Develop a program which will
              identify/print the even numbers only.*/
        int [][] nums={{ 2,3,15,16,18},
                           {1,4,6,7,8},
                           {35,26,100,23}
        
        };

        for (int[] num : nums) {
            for (int i : num) {
                if(i%2==0){
                    System.out.print( i+" ");
                }

            }
            System.out.println();
        }
    }
}
