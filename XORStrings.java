package gsm;

import java.util.Scanner;

public class XORStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

	}
	public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i)) 
                res = res.concat("0");

            else
               res =  res.concat("1");
        }

        return res;
    }


}
