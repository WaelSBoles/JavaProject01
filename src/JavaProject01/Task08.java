package JavaProject01;

public class Task08 {
    public static void main(String[] args) {
        /*. Maximum and minimum number in the array?*/

        int [] num={5,10,15,30,50,100};

        int max=num[0];
        int min=num[0];

        for (int i = 1; i <num.length ; i++) {
            if(num[i]>max){
                    max=num[i];
                }else if(num[i]<min){
                min=num[i];
            }

            }
        System.out.println("The Maximum number :" + max);
        System.out.println("the Minuim number :" + min);
        }

    }



