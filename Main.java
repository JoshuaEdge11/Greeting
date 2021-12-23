import java.util.Scanner;
public class Main {

public static void main(String[] args)

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
