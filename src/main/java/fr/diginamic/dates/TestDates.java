package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) {
        Date dateJour = new Date();
        System.out.println(dateJour);

        SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(formateur1.format(dateJour));

        Date date1 = new Date(116, 4, 19,23, 59, 30);
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formateur2.format(date1));

        System.out.println(formateur2.format(dateJour));

        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4, 19, 23, 59, 30 );
        Date date2 = cal.getTime();
        System.out.println(formateur1.format(date2));

        Date date3 = Calendar.getInstance().getTime();
        System.out.println(date3);
        System.out.println(formateur2.format(date3));

        SimpleDateFormat formateur3 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
        System.out.println(formateur3.format(date3));
        SimpleDateFormat formateur4 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
        System.out.println(formateur4.format(date3));
        SimpleDateFormat formateur5 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.forLanguageTag("ru-RU"));
        System.out.println(formateur5.format(date3));
        SimpleDateFormat formateur6 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss");
        System.out.println(formateur6.format(date3));


    }
}
