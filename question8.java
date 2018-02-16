import java.text.SimpleDateFormat;
import java.util.Date;

public class question8 {

            public static void main(String args[])
            {
                Date today = new Date();


                System.out.println("Today is (unformatted output): " + today);


                SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MMMM-yyyy");
                String date = DATE_FORMAT.format(today);
                System.out.println("Today in dd-MMMM-yyyy format : " + date);


            }

        }
