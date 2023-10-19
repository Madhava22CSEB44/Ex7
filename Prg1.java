package phonenumber;

/**
 *
 * @author 22cseb40
 */
import java.util.*;
public class Phonenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Phone Number:");
        while(true)
                {
                      String PhoneNumber=sc.next();

                    if(PhoneNumber.length()!=10)
                    {
                        System.out.println("Enter 10 Numbers");
                    }

                        if(PhoneNumber.equals("999"))
                        {
                            break;
                        }

                   System.out.println("("+PhoneNumber.substring(0,3)+")"+PhoneNumber.substring(3,6)+"-"+PhoneNumber.substring(6));
                }
