public  class whileloop {
    public static void main(String[] args) {

        System.out.println("----------------------------");

        // 1 to 10 num 

        // int i = 1;
        // while(i <10){
        //     System.out.println("Number : "+i);
        //     i++;
        // }

        System.out.println("----------------------------");
        // 1 to 10 num reverse 

        // while(i>0){
        //     System.out.println("Reverse : "+i);
        //     i--;
        // }

        System.out.println("----------------------------");

        //Even number
        // int n = 1;

        // while (n <= 100) {
        //     if (n % 2 == 0) {
        //         System.out.println("Even number : " + n);
        //     }
        //     n++;
        // }

        System.out.println("----------------------------");

        //Old Number 
        // while (n <= 100) {
            
        //     System.out.println("Old number : " + n);
        //     n = n+2;
        // }

        System.out.println("----------------------------");

        //Multiplication 
        int n = 5;
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }

        System.out.println("----------------------------");

        //sum of n number 
        int num = 100;
        int j = 1;
        int sum = 0;

        while(j<=num){
            sum = sum +j;
            j++;
        }

        System.out.println("Sum of Number : " +sum);



    }
}