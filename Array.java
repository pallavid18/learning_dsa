
public class Array {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

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

        int [] arr1 ={10,20,30,40,50};

        for (int i = arr1.length-1; i >=0; i--) {
            System.out.print(arr1[i] +" ");
        }
    }
}
