package com.kh.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat trans = new SimpleDateFormat("yyyy_MMdd HH:mm");
		String strDate = trans.format(date);
		System.out.println(strDate);
		
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		int ampm = today.get(Calendar.AM_PM);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		int test = today.get(3);
		
		System.out.println("test : " + test);
		
		String sAmPm = (ampm == Calendar.AM) ? "AM" : "PM";
		
		System.out.printf("%d,%d,%d, \n%s,%d,%d,%d\n",year,month,day,sAmPm,hour,min,sec);

		Calendar calendar= new GregorianCalendar();
		calendar.setTime(new Date());
		System.out.println(calendar.getTime());
		
		String changed = trans.format(calendar.getTime());
		System.out.println("changed : " + changed);
 }
}
