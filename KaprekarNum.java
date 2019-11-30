import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class KaprekarNum {

   static long countDigits(long sqOfX, long noOfDigits)
    {
        while(sqOfX>0)
        {
            long x = sqOfX%10;
            noOfDigits++;
            sqOfX = sqOfX/10;
        }
        return noOfDigits;
    }

    static long checkKaprekarNumber(long i, long temp, long noOfDigits)
    {
        if(i == 1)
            return i;
        for (long j = noOfDigits/2; j <= noOfDigits; j++) 
        {
            long init = (long) Math.pow(10, (noOfDigits-j));

            long x1 = temp/init;
            long x2 = temp%init;

            if(x2>0)
            {
                if(x1+x2 == i)
                {
                    return i;
                }
            }

        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long lowerLimit = sc.nextInt();
        long upperLimit = sc.nextInt();
        sc.close();
        boolean flag = false;
        for (long i = lowerLimit; i <= upperLimit; i++) 
        {
            long noOfDigits = 0;
            long sqOfX = i*i;
            noOfDigits = countDigits(sqOfX,noOfDigits);
            long temp = sqOfX;
            long kapNum = checkKaprekarNumber(i, temp, noOfDigits);
            if (kapNum > 0)
            {
                System.out.print(kapNum + " ");
                flag = true;
            }
        }
        if(flag == false)
            System.out.println("INVALID RANGE");
    }
}
