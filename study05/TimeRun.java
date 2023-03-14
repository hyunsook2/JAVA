package study05;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;


public class TimeRun {
	public static void main(String[] args) {
		//java.time 기본 클래스
		//LocalDate(날짜), LocalTime(시간),LocalDateTime(날짜,시간둘다)
		//ZonedDateTime(지역포함)
		//차이 Period(날짜차), Duration(시간차)
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		date = LocalDate.of(2022, 8, 4);
		time = LocalTime.of(12, 11, 30);
		dateTime = LocalDateTime.of(date, time);
		zoneDateTime = ZonedDateTime.of(dateTime,
				  ZoneId.of("America/New_York"));
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		System.out.println(zoneDateTime);
		//받아오기
		System.out.println();
		System.out.println(date.getYear()); //연도
		System.out.println(date.getMonthValue());//월
		System.out.println(date.getMonth());//월(영어출력)
		System.out.println(date.getDayOfMonth());//일
		System.out.println(date.getDayOfYear());//일(365일중 몇번째일)
		System.out.println(date.getDayOfWeek());//요일
		System.out.println(date.getDayOfWeek().getValue());//몇번째요일인지
		System.out.println(date.lengthOfMonth());//달의 총일수
		System.out.println(date.lengthOfYear());//년의 총일수
		System.out.println(date.isLeapYear());//윤년인지(2월29일)
		
		System.out.println(time.getHour());//시
		System.out.println(time.getMinute());//분
		System.out.println(time.getSecond());//초
		System.out.println(time.getNano());//나노초
		
		//값을 변경
		System.out.println(date.withYear(2002));
		System.out.println(date.withMonth(11));
		System.out.println(date.withDayOfMonth(25));
		System.out.println(date.withDayOfYear(120));
		System.out.println(date);
		System.out.println(time.withHour(1));
		System.out.println(time.withMinute(26));
		System.out.println(time.withSecond(15));
		System.out.println(time.withNano(123456789));
		System.out.println(time);
		
		LocalDate date2 = date.withYear(2002);
		System.out.println(date2);
		
		//날짜 계산
		System.out.println(date2.plusYears(20));
		System.out.println(date2.plusWeeks(1));
		System.out.println(date2.plusMonths(5));
		System.out.println(date2.plusDays(7));
		System.out.println(date2.minusYears(2));
		System.out.println(date2.minusWeeks(1));
		System.out.println(date2.minusMonths(2));
		System.out.println(date2.minusDays(7));
		
		LocalTime time2 = LocalTime.now();
		String sAmpm;
		if(time2.get(ChronoField.AMPM_OF_DAY)==0) {
			sAmpm="오전";
		}else {
			sAmpm="오후";
		}
		System.out.println("지금 "+sAmpm+" "+time2.getHour()+"시/ "
		+time2.get(ChronoField.CLOCK_HOUR_OF_AMPM)+"시");
		
		System.out.println(dateTime.get(ChronoField.YEAR));//연도
		System.out.println(dateTime.get(ChronoField.MONTH_OF_YEAR));//달
		System.out.println(dateTime.get(ChronoField.DAY_OF_MONTH));//일
		System.out.println(dateTime.get(ChronoField.DAY_OF_WEEK));//요일
		System.out.println(dateTime.get(ChronoField.AMPM_OF_DAY));//오전 오후
		System.out.println(dateTime.get(ChronoField.HOUR_OF_DAY));//시(0~23)
		System.out.println(dateTime.get(ChronoField.CLOCK_HOUR_OF_DAY));//시(1~24)
		System.out.println(dateTime.get(ChronoField.HOUR_OF_AMPM));//시(0~11)
		System.out.println(dateTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));//시(1~12)
		System.out.println(dateTime.get(ChronoField.MINUTE_OF_HOUR));//분
		System.out.println(dateTime.get(ChronoField.SECOND_OF_MINUTE));//초
		System.out.println(dateTime.get(ChronoField.DAY_OF_YEAR));//연도의 일수 (몇번째일인지)
		
		LocalDate date3 = LocalDate.of(2015, 6, 15);
		LocalDate date4 = LocalDate.of(2015, 5, 15);
		LocalTime time3 = LocalTime.of(15, 30, 25);
		
		LocalDateTime dateTime2 = LocalDateTime.of(2015,6,15,15,30,30);
		System.out.println(dateTime2);
		LocalDateTime dateTime3 = date3.atTime(time3);
		System.out.println(dateTime3);
		LocalDateTime dateTime4 = time3.atDate(date4);
		System.out.println(dateTime4);
		
		LocalDate date5 = dateTime2.toLocalDate();
		LocalTime time5 = dateTime2.toLocalTime();
		System.out.println(date5);
		System.out.println(time5);
		
		//isAfter() isBefore() isEqual()
		System.out.println(date3+" "+date4);
		System.out.println(date3.isAfter(date4)); // date3이 date4보다 후냐? t.f
		System.out.println(date3.isBefore(date4));// datr3이 date3보다 전이냐?
		System.out.println(date3.isEqual(date4));// 둘이같나
		
		//TemporalAdjusters 필요한 계산
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		LocalDate nextYear = dt.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println(nextYear);
		LocalDate nextMon = dt.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(nextMon);
		LocalDate dow  = dt.with(TemporalAdjusters.firstInMonth(DayOfWeek.THURSDAY));
		LocalDate dow2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
		System.out.println(dow2);
		LocalDate dow3 = dt.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println(dow3);
		LocalDate dow4 = dt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println(dow4);
		LocalDate dow5 = dt.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(dow5);
		System.out.println("dd");
		LocalDate dow6 = dt.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
		System.out.println(dow6);
		LocalDate dow7 = dt.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.THURSDAY));
		System.out.println(dow7);
		
		//period duration
		LocalDate lDate1 = LocalDate.of(2002, 7, 8);
		LocalDate lDate2 = LocalDate.of(2018, 7, 8);
		LocalTime lTime1 = LocalTime.of(8,	30,	12);
		LocalTime lTime2 = LocalTime.of(15, 16, 22);
		
		Period pe = Period.between(lDate1, lDate2); // 두날짜의 차이
		Duration du = Duration.between(lTime1, lTime2);
		
		System.out.println(pe);
		System.out.println(pe.getYears());
		System.out.println(pe.getMonths());
		System.out.println(pe.getDays());
		System.out.println(du);
		System.out.println(du.getSeconds());
		LocalTime se = LocalTime.of(0, 0, 0).plusSeconds(du.getSeconds());
		System.out.println(se.getHour());
		System.out.println(se.getMinute());
		System.out.println(se.getSecond());

		Period pe2 = lDate1.until(lDate2);
		System.out.println(pe2.getYears());
		System.out.println(pe2.getMonths());
		System.out.println(pe2.getDays());
		
		System.out.println(lDate1.until(lDate2, ChronoUnit.YEARS));
		System.out.println(lTime1.until(lTime2, ChronoUnit.HOURS));
		
		System.out.println(pe);
		System.out.println(du);
		System.out.println(pe.toTotalMonths());
		System.out.println(du.toMinutes());
		System.out.println(pe.withYears(1));
		System.out.println(du.withSeconds(100));
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter form = 
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a HH시 mm분")
						 .withLocale(Locale.forLanguageTag("ko"));
		System.out.println(ldt.format(form));
		
	}
}