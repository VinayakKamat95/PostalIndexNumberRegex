//!/bin/bash -x

import java.util.regex.*;

public class PinCode {

   public static boolean isValidPinCode(String pinCode)
    {

        String regex
            = "^[1-9]{1}[0-9]{2}[0-9]{3}";

        Pattern p = Pattern.compile(regex);

        if (pinCode == null) {
            return false;
        }

        Matcher m = p.matcher(pinCode);
        return m.matches();
    }

   public static void main(String args[])
    {

        String num1 = "A132103";
        System.out.println(
            num1 + ": "
            + isValidPinCode(num1));

    }

}
