package gsm;

import java.util.Scanner;

public class HalloweenSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();;

        int d = sc.nextInt();;

        int m = sc.nextInt();;

        int s = sc.nextInt();;

        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);

        sc.close();


	}

	private static int howManyGames(int basePrice, int discountEveryIteration, int limit, int totalMoney) 
	{
		if(basePrice > totalMoney) return 0;
		int count = 0;
		while( !(basePrice <= limit))
		{
			if(totalMoney >= basePrice)
			{
				count++;
				totalMoney -= basePrice;
				basePrice -= discountEveryIteration;
				if(basePrice > totalMoney) return count;
			}
			
		}
		if(totalMoney >= limit)
		{
			int remainingCount = totalMoney/limit;
			count += remainingCount;
		}
		
		return count;
	}

}
