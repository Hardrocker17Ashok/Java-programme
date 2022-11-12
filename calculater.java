import java.util.Scanner;

public class calculater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the five subject number out of 100 ");
        System.out.println("enter the  number of os out of 100 ");
        int num1 = sc.nextInt();
        System.out.println("enter the  number of wdm out of 100 ");
        int num2 = sc.nextInt();
        System.out.println("enter the  number of maths out of 100 ");
        int num3 = sc.nextInt();
        System.out.println("enter the  number of c++ out of 100 ");
        int num4 = sc.nextInt();
        System.out.println("enter the  number of account out of 100");
        int num5 = sc.nextInt();
        System.out.println("enter the  number of dbms out of 100 ");
        int num6 = sc.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5 + num6;
        System.out.println("sum of all subject number is = " + sum);
        float per = (sum * 100) / 600;    //calculate from assosiativ low
        System.out.println("the persantage is = " + per);
    }
}
