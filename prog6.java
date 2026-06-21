//#8-To generate the fibionachi series upto n terms

import java.util.Scanner;
class FibonacciSeries
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of terms:");
int n = sc.nextInt();
int a = 0;
int b = 1;
System.out.println("Fibonacci series up to " + n + " terms:");
for(int i = 1; i <= n; i++)
{
System.out.print(a + " ");
int c = a + b;
a = b;
b = c;
}
}
}
