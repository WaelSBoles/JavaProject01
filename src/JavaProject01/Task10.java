package JavaProject01;

public class Task10 {
    public static void main(String[] args) {
       /* 10. Write a program to print out duplicate elements from
        an Array of Strings?*/

        String[] fruits = {"Apple", "Banana", "Pineapple", "Plum", "Apple", "Plum"};

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i+1 ; j < fruits.length; j++) {
                if (fruits[i].equals(fruits[j])) {
                    System.out.println("Duplicate element is: "+fruits[j]);
                }

            }

        }
    }
}
