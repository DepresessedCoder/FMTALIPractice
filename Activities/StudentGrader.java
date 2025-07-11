import java.util.Scanner;

class StudentGrader{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int score;
String retry = "yes";

System.out.println("Enter your exam score: ");
int input = scanner.nextInt();

score = input;

if(input < 40){
score = input - 2;
System.out.println("Your score - 2 = " + score);
}

if(score >= 50){
score = input + 5;
System.out.println("Your score : " + score + " Pass");
}else {
System.out.println("Fail");
}

String status = (score >= 80) ? "Excellent"
:(score >= 60 && score <= 79) ? "Good"
:"Needs improvement";
System.out.println("Status: " + status);


//switch statement
switch(score){
case 0:
case 5:
System.out.println("Nice round number!");
break;

case 1:
case 2:
case 3:
case 4:
System.out.println("Low tail");
break;

case 6:
case 7:
case 8:
case 9:
System.out.println("High tail");
break;

default:
System.out.println("Interesting score");
}

System.out.println("Do you want to retry the grading process");
scanner.nextLine();
retry = scanner.nextLine();

while(retry.equals("yes")){
System.out.println("Enter your exam score: ");
input = scanner.nextInt();


if(input < 40){
score = input - 2;
System.out.println("Your score - 2 = " + score);
}

if(score >= 50){
score = input + 5;
System.out.println("Your score : " + score + " Pass");
}else {
System.out.println("Fail");
}

status = (score >= 80) ? "Excellent"
:(score >= 60 && score <= 79) ? "Good"
:"Needs improvement";
System.out.println("Status: " + status);

retry += 0;
}
 String exitAnswer;

do {
System.out.println("Do you want to exit the program? (yes/no)");
exitAnswer = scanner.nextLine();
} while (!exitAnswer.equals("yes"));

if (exitAnswer.equals("yes")){
System.out.println("Exit");

}
scanner.close();

}
}