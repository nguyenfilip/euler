package net.nguyen;

public class Day {
	private int day;
	private int weekDay;
	private int year;
	private int month;
	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public  Day() {
		day=1;
		year=1900;
		weekDay=1;
		month=1;
	}
	
	public void incrementDay(){
		incrementWeekDay();
		int days = daysOfMonth(month,year);
		if (day == days) {
			day = 1;
			incrementMonth();
			
			if (month == 1)
				year++;
		} else
			day++;
	}

	private void incrementMonth() {
		if (month == 12)
			month = 1;
		else 
			month++;
	}

	private int daysOfMonth(int month, int year) {
		if (month == 4 || month == 6 || month == 9 || month == 11 )
			return 30;
		
		if (month == 2){
			if (year % 4 == 0) {
				if (year % 100 == 0 && year % 400 != 0)
					return 28;
				else
					return 29;
			} else
				return 28;
		}
			
		return 31;
	}

	private void incrementWeekDay() {
		if (weekDay == 7)
			weekDay=1;
		else
			weekDay++;
	}

	@Override
	public String toString() {
		return "Day [day=" + day + ", weekDay=" + weekDay + ", year=" + year
				+ ", month=" + month + "]";
	}
	
	
}
