package Step_1_Learn_the_basics.Lec_1_Things_to_Know;

public class switch_Statement {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
//                break;
            case 4:
                System.out.println("Wednesday");
//                break;
            case 5:
                System.out.println("Thursday");
//                break;
            case 6:
                System.out.println("Friday");
//                break;
            case 7:
                System.out.println("Saturday");
//                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
