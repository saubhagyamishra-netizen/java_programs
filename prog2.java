//#4-To convert each word of a sentence to pig latin 

import java.util.Scanner;
class PigLatin
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence:");
String sentence = sc.nextLine();
sentence = sentence.trim() + " ";
String word = "";
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
System.out.print(toPigLatin(word) + " ");
}
word = "";
}
}
}
public static String toPigLatin(String w)
{
w = w.toUpperCase();
char first = w.charAt(0);
if(first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U')
{
return w + "AY";
}
else
{
int pos = -1;
for(int i = 0; i < w.length(); i++)
{
char c = w.charAt(i);
if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
{
pos = i;
break;
}
}
if(pos == -1)
{
return w + "AY";
}
else
{
return w.substring(pos) + w.substring(0,pos) + "AY";
}
}
}
}
