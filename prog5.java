#7-To print the series of Adam number for n terms

import java.util.Scanner;
class AdamSeries
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of terms:");
int n = sc.nextInt();
int count = 0;
int num = 1;
System.out.println("First " + n + " Adam numbers:");
while(count < n)
{
if(isAdam(num))
{
System.out.print(num + " ");
count++;
}
num++;
}
}
public static boolean isAdam(int num)
{
int sq1 = num * num;
int revNum = reverse(num);
int sq2 = revNum * revNum;
int revSq1 = reverse(sq1);
return sq2 == revSq1;
}
public static int reverse(int n)
{
int rev = 0;
while(n > 0)
{
rev = rev * 10 + (n % 10);
n = n / 10;
}
return rev;
}
}
