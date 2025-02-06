package CS102HW;
import java.util.Scanner;
public class MainMethod {
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a positive integer to create an array.");
        int positiveInteger =  sc.nextInt(); //buradan methoda alıp metohoda array oluştur.
        int [] numbers = new int[positiveInteger];

        Integer answer = -1;
        menuPrint();
        while (answer != 4) {
            answer = sc.nextInt();
            switch (answer) {
                case 1: //finds maximum and minimum
                getMaxiumumAndMinimum(numbers);
                    break;

                case 2: //finds the average
                getAverage(numbers);
                    break;

                case 3: //finds sum of even and odd indexes
                getSumOfEvenOddIndexed(numbers);
                    break;
                menuPrint();
            }
        }
        if (answer==4)
        {
            System.out.println("You have exited!");
        }
        

    }

    public static void menuPrint ()
    {
        System.out.println("1-Find minimum and maximum");
        System.out.println("2-Find the average");
        System.out.println("3-Find the sum of even and odd indexes");
        System.out.println("4-Exit");
        System.out.println("Please choose an option.");
    }

<<<<<<< HEAD
    public String getMaxiumumAndMinimum (int [] givenArray) {

        int min = 0;

        for (int index = 0; index < givenArray.length; index++) {
            if (min > givenArray[index]) {
                min = givenArray[index];
            }
        }

        int max = 0;

        for (int i = 0; i < givenArray.length; i++) {
            if (max < givenArray[i]) {
                max = givenArray[i];
            }
        }

        return "Min of this array is " + min + " and max of this array is " + max ;

    }


=======
public static void getSumOfEvenOddIndexed(int[] array) {
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i < array.length; i++)
    {if (i%2 == 0) evenSum += array[i];
    else oddSum += array[i];}
    System.out.printf("%s%f\n%s%f", "Sum of even indices: ", evenSum, "Sum of odd indices: ", oddSum);
}
>>>>>>> origin/main
}
