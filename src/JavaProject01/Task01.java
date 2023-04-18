package JavaProject01;

public class Task01 {
    public static void main(String[] args) {
           /*Create a Java program that uses an array to store a list of
                     temperatures for a week, and then uses a loop to find
                  the highest and lowest temperature for the week.*/
        double[] temps = {77.5, 88.3,70.5, 75.5, 88.9};

        double highestTemp = temps[0];
        double lowestTemp =temps[0] ;
        for (int i = 0; i <temps.length ; i++) {
            if (temps[i]>highestTemp){
                highestTemp=temps[i];
            }if (temps[i]<lowestTemp){
           lowestTemp=temps[i];
            }

        }
        System.out.println("the highest tempature is "+highestTemp+" degree");
        System.out.println("The lowest temperature is " +lowestTemp+" degree");
    }
}