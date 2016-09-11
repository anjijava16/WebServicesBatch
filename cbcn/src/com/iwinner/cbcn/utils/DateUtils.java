package com.iwinner.cbcn.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String getCurrentDateTimestamp(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");//yyyy-MM-dd HH:mm:ss.SSSSSS  //yyyyMMddHHmmss
		Date now = new Date();
		//Date rounded = new Date(Math.round((now.getTime() / (1000.0 * 60 * 5))) * (1000 * 60 * 5));
		String timestamp = sdf.format(now);
		return timestamp;

	}
	public static void main(String[] args) {
		System.out.println(getCurrentDateTimestamp());//2016-04-05 14:41:12.000310 2016-04-05 14:41:33.000353
	}
}
