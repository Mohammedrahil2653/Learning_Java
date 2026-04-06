//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int switchvalue=2;
            int switchvalue2=4;
            switch (switchvalue) {
                case 1:
                    System.out.println("the value is " + switchvalue);
                    break;
                case 2:
                    System.out.println("the value is " + switchvalue);
                    //break; //remove break it will continue till another break
                case 3: case 4: case 5:
                    System.out.println("the value may be " + switchvalue);
                    break;
                default:
                    System.out.println("was not 1,2,3,4,5");
                    break;
            }

        switch (switchvalue2) {
            case 1 -> System.out.println("the value is " + switchvalue2);

            case 2 -> System.out.println("the value is " + switchvalue2);
            //break; //remove break it will continue till another break
            case 3, 4, 5 -> System.out.println("the value may be " + switchvalue2);
            default -> System.out.println("was not 1,2,3,4,5");
        }

        System.out.println("december is the"+getQuater("december")+" quater");
    }
    public static String getQuater(String month){
        return switch(month){
            case "January","February","march"->"!st Quater";
            case "april","may","june"->"2nd Quater";
            case "july","august","September"->"3rd quater";
            case "october","november","december"-> "4th quater";
            default ->"bad";
        };
    }
}