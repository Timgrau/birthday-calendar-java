/* This Programm should be calender were you can store the birthdays of your family or friends
   It should order them by the next upcoming birthday. 
   You can check upcomming birthdays by command
   #EDIT
*/
// class for family and friends to store dates in different folder
// Sort bday by next upcomming bday
// Tell how old someone gets on his next birthday


import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

class birthday {
    // #NEEDS USER INPUT
    
    /* fields */
    String name;
    int day, month, year;
    LocalDate bday;

    /* empty constuctor */
    public birthday() {
	name = "";
	day = 0;
	month = 0;
	year = 0;
    }
    
    /* constructor */
    public birthday(int day, int month, int year, String name) {
	this.name = name;
	this.day = day;
	this.month = month;
	this.year = year;
	this.bday = LocalDate.of(year,month,day);
    }
    
    /* output of a birthday */
    void output() {
	DateTimeFormatter beauty = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(name+"'s birthday is on : "+beauty.format(bday));
    }
    
    /* should give next upcomming birthday */
    static birthday thisyear(birthday all) {
	int actualYear = Calendar.getInstance().get(Calendar.YEAR);
	birthday y = new birthday(all.day, all.month, actualYear,all.name);
	//LocalDate today = LocalDate.now();
	//days = ChronoUnit.DAYS.between(today,all);
	return y;
    }
}


public class birthdayCalendar {
    
    public static void main (String[] args) {
	
	Scanner ein = new Scanner(System.in); 
	birthday a = new birthday(11,07,1997, "Timo");
	birthday b = new birthday(23,07,1995, "Sina");
	a.output();
	b.output();
	birthday.thisyear(a).output();
	//System.out.println(compare(a)+" Tage bis zum nächsten Geburtstag.");
    }
}
