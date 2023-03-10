import java.util.*;

public class BtoDconversions {
	public static void main (String[] args) {
		Scanner fortnit = new Scanner(System.in);
		long fort=2;
		long eren=0;
		String nite;
		ArrayList fortnite = new ArrayList<Integer>();
		
		System.out.println("1. Binary to Decimal or 2. Decimal to Binary? (1 or 2 only)");
		fort = fortnit.nextInt();
		
		if (fort==1) {
		
			System.out.println("Decimal Number input: ");
			fort = fortnit.nextLong();
		
			while(fort>=1) {
				fortnite.add(fort%2);
				fort = fort/2;
			}
		
			for (int i = fortnite.size()-1;i>=0;i--) {
				System.out.print(fortnite.get(i));
		}
		
		}
		else if (fort == 2) {
			System.out.println("Binary Number input: ");
			nite = fortnit.next();
			int n = nite.length()-1;
			fortnite = new ArrayList<Integer>();
		
			for(int i = 0;i<nite.length();i++) {
				
				fort = (int)Math.pow(2,n)*(Integer.parseInt(""+(nite).charAt(i)));
//				System.out.println(fort);
				eren += fort;
				n--;
			}
		
			System.out.println(eren);
			
		}
		
		else {
			System.out.println("Silly! Enter 1 or 2!");
		}
	}
	
}
