//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

DaysOfWeek(0);
DaysOfWeek(1);
DaysOfWeek(2);
DaysOfWeek(3);
DaysOfWeek(4);
DaysOfWeek(5);
DaysOfWeek(6);
DaysOfWeek(7);
        }
       public static void DaysOfWeek(int day){
        String dayweek =switch(day){
            case 0-> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid DAy";
        };
        System.out.println(day+" stands for "+dayweek);
    }
}