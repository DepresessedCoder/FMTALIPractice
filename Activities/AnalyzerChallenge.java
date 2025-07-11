import java.util.*;

public class AnalyzerChallenge{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

System.out.println("Please enter a sentence");
String sentence = scanner.nextLine();

System.out.println(sentence.trim());

System.out.println(sentence.toLowerCase());

String[] words = sentence.split(" ");
for(int i = 0; i < words.length; i++){
System.out.println(words[i]);
}

System.out.println("Length : " + words[0].length());

for(int i = 0; i < words[0].length(); i++){
if(words[0].charAt(i) == 'a'){
System.out.println(words[0].indexOf("a"));
break;
}
}


if (words[0].startsWith("j") && words[0].endsWith("g")) {
System.out.println("First word starts with j and last word ends with g");
 }

int value = words[0].length();
System.out.println(String.valueOf(value));

System.out.println("Please enter the second word: ");
String secondWord = scanner.nextLine();

if(words[0].compareTo(secondWord > 0){
System.out.println("Second word comes before the first word");
}else if(secondWord.compareTo(words[0]) < 0){
System.out.println("First word comes before the second word");
}else if(words[0].compareTo(secondWord) == 0){
System.out.println("Both names are the same");
if(words[0].intern() == second word){
System.out.println("Both words refer to the same object ");
String.format("Thank you for your participation, s%" , words[0]);
}
}

String joined = String.join(",", words);
System.out.println(joined);

}
}