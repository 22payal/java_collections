// Java code for adding elements in Set
import java.util.*;
public class question2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a string :");

        String str = scanner.nextLine();


        Set<Character> c = new HashSet<Character>();

        for (int i = 0; i <str.length() ; i++)
        {
         c.add(str.charAt(i))  ;
        }

        System.out.println("No. of unique characters in the entered string are : " + c.size());

    }
}
