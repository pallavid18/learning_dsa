
public class Array {

    public static void main(String[] args) {
        // int[] arr = {10, 20, 30, 40, 50};

        //Sum Of array element 
        // int sum = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum + arr[i];
        // }

        // System.out.println("Sum is : " + sum);

        //Searching the element of array without the algorithum 
        // int target = 130;
        // int i = 0;
        // boolean found = false;

        // while(i< arr.length){
        //     if(arr[i] == target){
        //         found = true;
        //         break;
        //     }
        //     i++;
        // }

        // if(found){
        //     System.out.println("Element Found");
        // }
        // else{
        //     System.err.println("Element Not Found");
        // }


        //Pattern printing
        for (int m = 1; m <= 5; m++) {

            for (int n = 1; n <= m; n++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("---------------");

        // for (int i = 0; i < 3; i++) {

        //     for (int j = i; j < i + 4; j++) {
        //         System.out.print(j);
        //     }

        //     System.out.println(" ");
        // }

        System.out.println("---------------");

        for( int i =1; i<=3; i++){
            for(int j = 1;  j<=3; j++){
                System.out.print("* * *    ");
            }

            System.out.println();
        }

        System.out.println("---------------");

        //Array reverse 
        int [] arr1 ={10,20,30,40,50};

        for (int i = arr1.length-1; i >=0; i--) {
            System.out.print(arr1[i] +" ");
        }


        //swaping the array 

        System.out.println("---------------");

        //Sorting the array 
        int[] arr2 = {100, 20, 530, 40, 50};

        boolean sorted = true;

        for (int i = 0; i < arr2.length - 1; i++) {

            if (arr2[i] > arr2[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }



        System.out.println("---------------");

        //Find the min and max 

        // int[] arr = {10, 20, 5, 40, 15, 2, 30};

        // int max = arr[0];
        // int min = arr[0];

        // for (int i = 1; i < arr.length; i++) {

        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }

        //     if (arr[i] < min) {
        //         min = arr[i];
        //     }
        // }

        // System.out.println("Maximum = " + max);
        // System.out.println("Minimum = " + min);


        //kth term 

        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        // Find maximum k times
        for (int i = 0; i < k; i++) {

            int max = Integer.MIN_VALUE;
            int maxIndex = -1;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }

            System.out.println((i + 1) + " maximum = " + max);

            // Mark the found maximum so it is not selected again
            arr[maxIndex] = Integer.MIN_VALUE;
        }

    }
}
