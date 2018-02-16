import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import static java.util.Locale.*;

public class question9 {

    public static void main(String[] args)
    {
        Date today = new Date();
        DateFormat fmt ;

        Locale[] locales = { US, UK, GERMANY, FRANCE };

        for (int i = 0; i <locales.length; i++)

        {
            System.out.println("\nThe Date for " + locales[i].getDisplayCountry() + ":");

                fmt = DateFormat.getDateInstance(i);
                System.out.println(" is "+fmt.format(today));

        }

    }
}