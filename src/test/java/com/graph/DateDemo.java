package com.graph;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		String start_date = "01-04-2024";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = sdf.parse(start_date);
		Date d2 = new Date();
		long diffInDays = TimeUnit.MILLISECONDS.toDays(d2.getTime() - d1.getTime());
		System.out.println(diffInDays);

	}

}
