package practise.tests;

import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar i = Calendar.getInstance();
        System.out.println(i.get(Calendar.DATE));


        Currency c = Currency.getInstance(Locale.US);
        System.out.println(c.getDefaultFractionDigits());
    }


}
