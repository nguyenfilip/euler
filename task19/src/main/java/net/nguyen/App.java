package net.nguyen;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.commons.io.FileUtils;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		Day day = new Day();
		
		while (day.getYear() != 1901) {
			day.incrementDay();
			System.out.println(day);
		}
		
		int sundays=0;
		while (!(day.getYear()==2000 && day.getMonth()==12 && day.getDay()==31)){
			if (day.getDay()==1 && day.getWeekDay()==7)
				sundays++;
			day.incrementDay();

		}
		System.out.println("Sundays: "+ sundays);
	}
}
