 import java.util.Scanner;
class addition{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is:");
        System.out.println(sum);

    }
}
