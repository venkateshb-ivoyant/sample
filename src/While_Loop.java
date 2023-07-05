import java.util.Scanner;
public class While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Sum
Your math teacher asked you to calculate the sum of the numbers 1 to N, where N is a given number.

Task: Take an integer N from input and output the sum of the numbers 1 to N, inclusive.

Sample Input:

10

Sample Output:

55
*/
       /* int x= sc.nextInt();
        int y=1;
        int sum=0;
        while(y<=x){
            sum+=y;
            y++;
        }
        System.out.println(sum);

        */
        /*Factorial
The factorial of a number N is equal to 1 * 2 * 3 * ... * N

For example, the factorial of 5 is 1* 2 * 3 * 4 * 5  = 120.

Create a program that takes a number from input and output the factorial of that number.*/5
        int x = sc.nextInt();
        int factorial=1;
        for(int y=1;y<=x;y++){
            factorial*=y;

        }
        System.out.println(factorial);

    }
}
