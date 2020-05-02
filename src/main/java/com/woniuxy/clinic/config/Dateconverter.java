package com.woniuxy.clinic.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
//日期转换---json相应中存在date日期格式转为String
public class Dateconverter implements Converter<String, Date> {

//	@Override
//	public Date convert(String source) {
//		if(source==null) {
//			return null;
//		}
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = null;
//		try {
//			date = simpleDateFormat.parse(source);
//		} catch (ParseException e) {
//			throw new RuntimeException(e);
//		}
//		return date;
//	}
	
	 private static final List<String> formarts = new ArrayList<>(4);
	    static{
	        formarts.add("yyyy-MM");
	        formarts.add("yyyy-MM-dd");
	        formarts.add("yyyy-MM-dd hh:mm");
	        formarts.add("yyyy-MM-dd hh:mm:ss");
	    }
	 
	    @Override
	    public Date convert(String source) {
	        String value = source.trim();
	        if ("".equals(value)) {
	            return null;
	        }
	        if(source.matches("^\\d{4}-\\d{1,2}$")){
	            return parseDate(source, formarts.get(0));
	        }else if(source.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")){
	            return parseDate(source, formarts.get(1));
	        }else if(source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}$")){
	            return parseDate(source, formarts.get(2));
	        }else if(source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}$")){
	            return parseDate(source, formarts.get(3));
	        }else {
	            throw new IllegalArgumentException("Invalid boolean value '" + source + "'");
	        }
	    }
	 
	    /**
	     * 格式化日期
	     * @param dateStr String 字符型日期
	     * @param format String 格式
	     * @return Date 日期
	     */
	    public  Date parseDate(String dateStr, String format) {
	        Date date=null;
	        try {
	            DateFormat dateFormat = new SimpleDateFormat(format);
	            date = dateFormat.parse(dateStr);
	        } catch (Exception e) {
	 
	        }
	        return date;
	    }
	
}
