package JavaProject01;

public class Task02 {
    public static void main(String[] args) {

        /*2-. Create an array of integer values. After the array is
         created, calculate the sum of all stored elements in
           that array.*/

            int[] num = {10, 15, 20, 100, 30};

            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum = sum + num[i];

            }
            System.out.println("sum = " + sum);
        }
    }


