package JavaProject01;

public class Task09 {
    public static void main(String[] args) {
        /* 9. Write a java program to find the second largest
        number in the array?
*/
        int[] num = {5, 10, 15, 30, 50, 100};

        int largest = num[0];
        int secondLargest = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];

            } else if (num[i] > secondLargest) {
                secondLargest = num[i];
            }

        }
        System.out.println("The second Largest is " + secondLargest);
    }
}