//#5-Use string tokeniser to print number of words along with shortest and longest words in a sentence 

import java.util.Scanner;
import java.util.StringTokenizer;
class SentenceAnalysis
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence:");
String sentence = sc.nextLine();
StringTokenizer st = new StringTokenizer(sentence);
int count = st.countTokens();
String longest = "";
String shortest = "";
while(st.hasMoreTokens())
{
String word = st.nextToken();
if(longest.equals("") || word.length() > longest.length())
{
longest = word;
}
if(shortest.equals("") || word.length() < shortest.length())
{
shortest = word;
}
}
System.out.println("Number of words: " + count);
System.out.println("Longest word: " + longest);
System.out.println("Shortest word: " + shortest);
}
}
