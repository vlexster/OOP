package Time_Problem2;

import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements getNow {

	private int year, month, day, hour, minute, second; //define all members of the constructor
	
	public Time(int year, int month, int day, int hour, int minute, int second){
		setYear(year);
		setMonth(month);
		setDay(day);
		setHour(hour);
		setMin(minute);
		setSec(second);
	}
	
	public void setYear(int year){
//		if (Integer.toString(year).length() < 4) throw new InvalidParameterException("Year must be defined in 4-digit format.");
//		else {
//		decided to leave the check out - after all who am I to deny a person to save whatever date they deem fit ;)
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public void setMonth(int month){
		if (month < 0 || month > 12) throw new InvalidParameterException("The month should be a number between 1 and 12!");
		else this.month = month;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public void setDay(int day){
		if (day < 0 || day > 31) throw new InvalidParameterException("The day should be a number between 1 and 31!");
		else this.day = day;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public void setHour(int hour){
		if (hour < 0 || hour > 23) throw new InvalidParameterException("The hour must be a number between 0 and 23!");
		else this.hour = hour;
	}
	
	public int getHour(){
		return this.hour;
	}
	
	public void setMin(int min){
		if (min < 0 || min > 59) throw new InvalidParameterException("The minute must be a number between 0 and 59!");
		else this.minute = min;
	}
	
	public int getMin(){
		return this.minute;
	}
	
	public void setSec(int sec){
 		if (sec < 0 || sec > 59) throw new InvalidParameterException("The second must be a number between 0 and 59!");
 		else this.second = sec;
	}
	
	public int getSec(){
		return this.second;
	}
	
	public String now(){
		return new SimpleDateFormat("hh:mm:ss dd.MM.YYYY").format(new Date());
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d %02d.%02d.%04d", getHour(), getMin(), getSec(), getDay(), getMonth(), getYear());
	}
	
}
