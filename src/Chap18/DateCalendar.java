package Chap18;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateCalendar {
    public static void main(String[] args) {
        //현재 날짜 Date형으로 얻기
        Date now = new Date();
//        System.out.println("now date: " + now);
        //얻은 날짜 정보  Calendar에 설정
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        //Calendar 에서 day값 얻는다
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        // 얻은 값에 100더한값을 calendar의 일에 설정
        int future = day + 100;

        calendar.set(Calendar.DAY_OF_MONTH, future);
        //Calendar 날짜 정보 Date형으로 변환
        Date futuredate = calendar.getTime();
        //SimpleDateFormat 이용해 Date 인스턴스 내용 표시
        SimpleDateFormat sdf = new SimpleDateFormat("서기 yyyy년 MM월 dd일");

        //출력
        System.out.println(sdf.format(futuredate));
    }
}
