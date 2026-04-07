//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
             }
        for (double rate=2.0;rate<6.0;rate++){
            System.out.println("5000rs Intrest rate of "+rate+" is "+calculateIntrest(5000,rate));
        }
        for (double rate=2.0;rate<6.0;rate+=0.75){
            System.out.println("5000rs Intrest rate of "+rate+" is "+calculateIntrest(5000,rate));
        }
    }
    public static double calculateIntrest(double amt,double rate){
        return amt*(rate/100);
    }
}