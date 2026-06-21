//#6-To print the nearest twin prime pair to a given integer

import java.util.Scanner;
class NearestTwinPrime
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int num = sc.nextInt();
int below1 = num, below2 = num;
int above1 = num, above2 = num;
boolean foundBelow = false;
boolean foundAbove = false;
for(int i = num; i >= 3; i--)
{
if(isPrime(i) && isPrime(i - 2))
{
below1 = i - 2;
below2 = i;
foundBelow = true;
break;
}
}
for(int i = num; ; i++)
{
if(isPrime(i) && isPrime(i + 2))
{
above1 = i;
above2 = i + 2;
foundAbove = true;
break;
}
}
if(!foundBelow)
{
System.out.println("Nearest twin prime pair: (" + above1 + ", " + above2 + ")");
}
else
{
int distBelow = Math.abs(num - (below1 + below2) / 2);
int distAbove = Math.abs(num - (above1 + above2) / 2);
if(distBelow <= distAbove)
{
System.out.println("Nearest twin prime pair: (" + below1 + ", " + below2 + ")");
}
else
{
System.out.println("Nearest twin prime pair: (" + above1 + ", " + above2 + ")");
}
}
}
public static boolean isPrime(int n)
{
if(n < 2)
return false;
for(int i = 2; i <= n / 2; i++)
{
if(n % i == 0)
return false;
}
return true;
}
}
