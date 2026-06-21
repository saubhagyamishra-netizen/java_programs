//#3-To reverse a sentence wordwise 

import java.util.Scanner;
class ReverseSentence
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence:");
String sentence = sc.nextLine();
sentence = sentence.trim() + " ";
String word = "";
String reversed = "";
for(int i = 0; i < sentence.length(); i++)
{
char ch = sentence.charAt(i);
if(ch != ' ')
{
word = word + ch;
}
else
{
if(word.length() > 0)
{
reversed = word + " " + reversed;
}
word = "";
}
}
System.out.println("Reversed sentence:");
System.out.println(reversed.trim());
}
}
