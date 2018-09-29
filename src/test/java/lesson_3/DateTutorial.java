package lesson_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTutorial {

    public static void main(String[] args) throws ParseException {

        //Convert Date to String.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String date = sdf.format(new Date());
        System.out.println(date);

        //Convert String to Date.
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//        String dateInString = "31-08-2018 10:20:56";
//        Date date = sdf.parse(dateInString);
//        System.out.println(date);

        //Get current date time
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date date = new Date();
//        System.out.println(dateFormat.format(date));

       // compareDate();
    }




    public static void compareDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2017-12-31");
        Date date2 = sdf.parse("2018-01-31");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.after(date2)) {
            System.out.println("Date1 is after Date2");
        }

        if (date1.before(date2)) {
            System.out.println("Date1 is before Date2");
        }

        if (date1.equals(date2)) {
            System.out.println("Date1 is equal Date2");
        }
    }

//    Letter    Date or Time Component    Examples
//    G    Era designator    AD
//    y    Year    2018
//    M    Month in year    July or Jul or 07
//    w    Week in year    27
//    W    Week in month    2
//    D    Day in year    189
//    d    Day in month    10
//    F    Day of week in month    2
//    E    Day name in week    Tuesday or Tue
//    u    Day number of week (1 = Monday, ..., 7 = Sunday)    1
//    a    Am/pm marker    PM
//    H    Hour in day (0-23)    0
//    k    Hour in day (1-24)    24
//    K    Hour in am/pm (0-11)    0
//    h    Hour in am/pm (1-12)    12
//    m    Minute in hour    30
//    s    Second in minute    55
//    S    Millisecond    978
//    z    Time zone    Pacific Standard Time; PST; GMT-08:00
//    Z    Time zone    -0800
//    X    Time zone    -08 or -0800 or -08:00`

}
