package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateEx1 {
	public static void main(String[] args) {
		// Date ��� - ��¥, �ð� ��� ����
		Date date = new Date();
		System.out.println(date);

		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat
				("yyyy�� mm�� dd�� hh�� E mm�� ss��");
		System.out.println(sdf.format(date));
		
		// LocalDate ��� - ��¥�� ����
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);

		// LocalTime ��� - �ð��� ����
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);

		//LocalDateTime - ��¥, �ð� ��� ����, ������ date�� �ٸ�
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);

	}
}
