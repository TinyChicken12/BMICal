import java.util.Scanner;

public class BMICal {
    public static void main(String[] args) {
        float height,weight,bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap can nang:");
        weight = sc.nextFloat();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Moi ban nhap chieu cao:");
        height = sc1.nextFloat();
        bmi= weight/(height*height);
        if (bmi>=30){
            System.out.println("You are Obese");
        }
        else if (bmi>=25){
            System.out.println("You are Overweight");
        }
        else if (bmi>=18.5){
            System.out.println("You are Normal");
        }
        else
            System.out.println("You are Underweight");
    }
}
