public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        int resultNumberOfDaysInMonth = getDaysInMonth(2, 1986);
        System.out.println(resultNumberOfDaysInMonth);
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

                // cases 1, 3, 5, 7, 8, 10, 12 (months that have 31 days)
            case 2:
                if(isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

                // February (case 2 = month 2) could have 28 or 29 days (leap year).
            case 4: case 6: case 9: case 11:
                return 30;

                //cases 4, 6, 9, 11 (months that have 30 days)
            default:
                return -1;

        }
    }

}
