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

printNumberInWord(1);
printNumberInWord(2);
printNumberInWord(3);
printNumberInWord(4);
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
    public static void printNumberInWord(int number) {

        String numberInWord;
        //numberInWord if assigned seperately
        switch (number) {
            case 0 -> numberInWord = "ZERO";
            case 1 -> numberInWord = "ONE";
            case 2 -> numberInWord = "TWO";
            case 3 -> numberInWord = "THREE";
            case 4 -> numberInWord = "FOUR";
            case 5 -> numberInWord = "FIVE";
            case 6 -> numberInWord = "SIX";
            case 7 -> numberInWord = "SEVEN";
            case 8 -> numberInWord = "EIGHT";
            case 9 -> numberInWord = "NINE";
            default -> numberInWord = "OTHER";
        }
        System.out.println(numberInWord);
    }
}