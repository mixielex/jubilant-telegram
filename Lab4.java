//Alexandra Atlas
import java.util.Scanner; //new comment!
public class Main {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        long decimal=0;
        double exponentValue=0;
        double pastValues = 0;
        double value = 0;



        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal=myScanner.next();
        if (hexadecimal.length() > 1 && (hexadecimal.charAt(0) == '0' && hexadecimal.charAt(1) == 'x')){
            hexadecimal=hexadecimal.substring(2);
        }

        char letter0;
        int x=0;
        x=hexadecimal.length() - 1;

        while (x>=0){
            letter0 = hexadecimal.charAt(0);
            if (letter0 == '0')
                value = 0;
            if (letter0 == '1')
                value = 1;
            if (letter0 == '2')
                value = 2;
            if (letter0 == '3')
                value = 3;
            if (letter0 == '4')
                value = 4;
            if (letter0 == '5')
                value = 5;
            if (letter0 == '6')
                value = 6;
            if (letter0 == '7')
                value = 7;
            if (letter0 == '8')
                value = 8;
            if (letter0 == '9')
                value = 9;
            if (letter0 == 'A' || letter0 == 'a')
                value = 10;
            if (letter0 == 'B' || letter0 == 'b')
                value = 11;
            if (letter0 == 'C' || letter0 == 'c')
                value = 12;
            if (letter0 == 'D' || letter0 == 'd')
                value = 13;
            if (letter0 == 'E' || letter0 == 'e')
                value = 14;
            if (letter0 == 'F' || letter0 == 'f')
                value = 15;
         exponentValue = value * Math.pow(16, x);
         if (value == 0)
             exponentValue = 0;
         pastValues += exponentValue;
         hexadecimal = hexadecimal.substring(1);
         x -= 1;
        }
        decimal = (long) pastValues;
        System.out.println("Your number is " + decimal + " in decimal");
    }
}
