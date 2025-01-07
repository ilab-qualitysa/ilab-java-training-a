package Chapter2;

public class SwitchStatements {
    public static void main(String[] args) {
        int dayNum = 2;
        String dayOfWeek = "None";

//        if (dayNum == 1) {
//            dayOfWeek = "Monday";
//        } else if (dayNum == 2) {
//            dayOfWeek = "Tuesday";
//        } else if (dayNum == 3) {
//            dayOfWeek = "Wednesday";
//        } else if (dayNum == 4) {
//            dayOfWeek = "Thursday";
//        } else if (dayNum == 5) {
//            dayOfWeek = "Friday";
//        } else if (dayNum == 6) {
//            dayOfWeek = "Saturday";
//        } else if (dayNum == 7) {
//            dayOfWeek = "Sunday";
//        } else {
//            dayOfWeek = "Invalid day number";
//        }
//
//        System.out.println(dayNum + " " + dayOfWeek);

        switch (dayNum) {
            case 1 : dayOfWeek = "Monday";
             break;
            case 2: dayOfWeek = "Tuesday";
             break;
            case 3: dayOfWeek = "Wednesday";
             break;
            case 4: dayOfWeek = "Thursday";
             break;
            case 5: dayOfWeek = "Friday";
             break;
            case 6: dayOfWeek = "Saturday";
             break;
            case 7: dayOfWeek = "Sunday";
            default: dayOfWeek = "Invalid day number";

        }

        System.out.println(dayNum + " " + dayOfWeek);
        System.out.println("=========================================================================");

        /*Supervisor for departments:
        1, 2 and 5 - Smith
        3 - Jones
        4 - Mokoena
         */
        int departmentId = 5;
        String supervisor = switch (departmentId) {
            case 1, 2, 5 -> "Smith";
            case 3 -> "Jones";
            case 4 -> "Mokoena";
            default -> "Undefined";
        };

        System.out.println("The Supervisor is: " + supervisor);

    }
}
