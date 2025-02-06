import java.util.Scanner;

public class MainMethod {
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a positive integer to create an array.");
        int positiveInteger =  sc.nextInt(); //buradan methoda alıp metohoda array oluştur.
        int [] numbers = createArray(positiveInteger);

        Integer answer = -1;
        menuPrint();
        while (answer != 4) {
            answer = sc.nextInt();
            switch (answer) {
                case 1: //finds maximum and minimum
                getMaxiumumAndMinimum(numbers);
                    break;

                case 2: //finds the average
                diffsFromAverage(numbers);

                    break;

                case 3: //finds sum of even and odd indexes
                getSumOfEvenOddIndexed(numbers);
                    break;
            }
            menuPrint();
        }
        if (answer==4)
        {
            System.out.println("You have exited!");
        }
        
        sc.close();
    }

    //Creates a random integer array at the size of given input
    public static int[] createArray(int positiveInteger){
        int numbers[] = new int[positiveInteger];
        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        return numbers;
    
    }

    public static void menuPrint ()
    {
        System.out.println("1-Find minimum and maximum");
        System.out.println("2-Find the average");
        System.out.println("3-Find the sum of even and odd indexes");
        System.out.println("4-Exit");
        System.out.println("Please choose an option.");
    }


    public static void getSumOfEvenOddIndexed(int[] array) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < array.length; i++)
        {if (i%2 == 0) evenSum += array[i];
        else oddSum += array[i];}
        System.out.printf("%s%d\n%s%d\n", "Sum of even indices: ", evenSum, "Sum of odd indices: ", oddSum);
    }

    public static void diffsFromAverage(int[] arr)
    {
        int sum = 0;
        double average;
        double[] result = new double[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        average = 1.0 * sum / arr.length;

        for (int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i] - average;
        }
        System.out.println("The average of this array is " + average);
        printArrayD(result);
    }

    public static void getMaxiumumAndMinimum (int [] givenArray) {

        int min = 100;

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

        System.out.println( "Min of this array is " + min + " and max of this array is " + max) ;

    }

    public static void printArrayD(double [] array) {
        for (int i = 0; i < array.length-1; i++)
        System.out.printf("%.2f%s", array[i], ", ");
        System.out.printf("%.2f\n", array[array.length-1]);
    }
}
