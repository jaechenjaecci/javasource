package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateEx1 {
	public static void main(String[] args) {
		// Date 사용 - 날짜, 시간 모두 나옴
		Date date = new Date();
		System.out.println(date);

		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat
				("yyyy년 mm월 dd일 hh시 E mm분 ss초");
		System.out.println(sdf.format(date));
		
		// LocalDate 사용 - 날짜만 나옴
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);

		// LocalTime 사용 - 시간만 나옴
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);

		//LocalDateTime - 날짜, 시간 모두 나옴, 순서가 date와 다름
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);

	}
}
