public class Main {

    //Palidrome

//     public static boolean isPalindrome(String s){
//             s = s.toLowerCase();

//             String rev = "";
//             for ( int i = s.length()-1; i>=0;i--){
//                 rev = rev +s.charAt(i);
//             }

//             return s.equals(rev);
// }
    public static void main(String[] args) {

        //Reverse a string 
        // String str = "Shinchan";
        // String rev ="";
        // for(int i = str.length()-1; i>=0;i--){
        //     rev = rev + str.charAt(i);
        //     }
        //     System.out.println(rev);

        // String s = "Madam";
        // if(isPalindrome(s)){
        //         System.out.println(s + " is a palindrome");

        //     }else{
        //         System.out.println( s + "is not palindrome");
        //     }
            

        //Factorial of number

        // int num = 25;


        // int fact = 1;
        // for(int i = 1; i<=num; i++){
        //     fact = fact * i;
        // }
        // System.out.println("Factorial of " + num + " is : "+ fact);

        //isprime

        // boolean isPrime = true;
        // if(num <=1){
        //     isPrime = false;

        // }else{
        //     for(int i = 2; i<num; i++){
        //         if(num % i ==0){
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if(isPrime){
        //         System.out.println(num  + "is a prime number");
        //     }else{
        //         System.out.println(num  + "is not a prime number");
        //     }
        // }


        //Fibonacci series

        // int n = 10;
        // int a = 0 , b = 1;

        // for(int i =2; i<n;i++){
        //     int c = a +b;
        //     System.out.println(" "+c);
        //     a=b;
        //     b=c;
        // }


        //Armstrong number

        int num = 153;
        int original = num;
        int sum = 0;

        while(num>0){
            int digit = num %10;
            sum = sum + digit * digit * digit;
            num = num/10;
        }

        if(sum == original){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }
    



        }
    }


