package Chap18;

import java.util.Calendar;
import java.util.Date;

public class CalendaEx {
    public static void main(String[] args) {

        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);

        int year = cal.get(Calendar.YEAR);
        System.out.println("올해는" + year + "년 입니다");

        cal.set(2023, 3, 18, 19, 37, 30);
        Date past1 = cal.getTime();
        System.out.println("past1:"+past1);

        cal.set(Calendar.YEAR, 2025);
        Date past2 = cal.getTime();
        System.out.println("past2:"+past2);
    }
}
