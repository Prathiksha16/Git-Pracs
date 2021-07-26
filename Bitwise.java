import java.util.Scanner;
public class Bitwise
{
public static void main(String args[] )
{
int num1, num2, num3;
Scanner sc = new Scanner(System.in);
System.out.print("enter the value of num1:");
num1 =sc.nextInt();
System.out.print("enter the value of num2:");
num2 =sc.nextInt();
num3 =num1 & num2;
System.out.println("num1 & num2 =" +num3);
num3 = num1 | num2;
System.out.println("num1 | num2 =" +num3);
num3 = num1 ^ num2;
System.out.println("num1 ^ num2 =" +num3);
num3 =~num2;
System.out.println("num3~num2 =" +num3);
}
}