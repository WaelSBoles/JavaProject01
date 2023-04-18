package JavaProject01;

public class Task04 {
    /*4. Create a 2D array of integers. Develop a program
        which will calculate the sum of even and odd numbers
          for that array.*/

    public static void main(String[] args) {
        int[][] nums = {{2, 3, 15, 16, 18},
                {1, 4, 6, 7, 8},
                {35, 26, 100, 23}

        };
        int sum1 = 0;
        int sum2 = 0;
        for (int[] num : nums) {
            for (int i : num) {
                if (i % 2 == 0) {

                    sum1 = sum1 + i;
                }
                if (i % 2 != 0) {
                    sum2 = sum2 + i;

                }


            }

        }
        System.out.println(sum1);
        System.out.println(sum2);
    }

}
