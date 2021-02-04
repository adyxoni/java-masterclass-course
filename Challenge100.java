import java.util.Scanner;

public class Challenge100 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter your array length:");
        int arrayLength = scanner.nextInt();
        int[] unorderedArray = getIntegers(arrayLength);
        System.out.println("-- The unordered array --");
        printArray(unorderedArray);

        int[] orderedArray = sortIntegers(unorderedArray);

        System.out.println("-- The ordered array --");
        printArray(orderedArray);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " numbers:");
        int[] userArray = new int[number];
        for(int i=0; i<userArray.length; i++){
            userArray[i] = scanner.nextInt();
        }
        return userArray;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(i+1 + ". value on position [" + i + "] is: " + array[i]);
        }
        System.out.println("-- -- -- -- -- -- -- --");
    }

    public static int[] sortIntegers(int[] array){
        int[] newArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            newArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<newArray.length-1; i++){
                if(newArray[i] < newArray[i+1]){
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }
}
