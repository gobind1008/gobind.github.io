package gsm;

import java.util.Scanner;

public class IceCreamParlour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) 
        {
            int m = scanner.nextInt();

            int n = scanner.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                int arrItem = scanner.nextInt();
                arr[i] = arrItem;
            }

            int[] result = icecreamParlor(m, arr);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]+"  ");
            }
           // System.out.println();
        }

        scanner.close();

	}

	private static int[] icecreamParlor(int m, int[] arr) {
		// TODO Auto-generated method stub
		int result[] = new int[2];
		int index=0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i+1; j <= arr.length; j++) {
				if(arr[i-1]+arr[j-1] == m)
				{
					result[index] = i;
					result[++index] = j;
					index++;
					break;
				}
			}
		}
		return result;
	}

}
