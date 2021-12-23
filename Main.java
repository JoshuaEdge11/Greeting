import java.util.Scanner;
public class Main {
public static void main(String[] args)

//This is a simple program that displays Goodmorning if the number entered is lesser than 30, and Goodnight if the nuber entered is greater than 30 
{
int num;
Scanner s= new Scanner(System.in);
System.out.println("Enter a number: ");
num= s.nextInt();
if(num<30)
{
System.out.println("Goodmorning");
}
else
{
System.out.println("Goodnight");
}
}
}
