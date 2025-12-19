class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        int totalDays = 0;

      
        for (int y = 1971; y < year; y++) {
            totalDays += isLeap(y) ? 366 : 365;
        }

        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

     
        for (int m = 0; m < month - 1; m++) {
            totalDays += monthDays[m];
            if (m == 1 && isLeap(year)) {
                totalDays++; // leap year February
            }
        }

      
        totalDays += day - 1;

        return days[(totalDays + 5) % 7];
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}