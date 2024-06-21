package pkg.pwd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class V1 {
	public static void genpwd(int size,int qty) {
		String pwd = "";
		ArrayList<String> upper = new ArrayList<>(Arrays.asList("A","B","C","D"));
		ArrayList<String> lower = new ArrayList<>(Arrays.asList("a","b","c","d"));
		ArrayList <String>nums = new ArrayList<>(Arrays.asList("0","1","2","3"));
		ArrayList <String>all_chars = new ArrayList<>();
		for(int i=0;i<3;i++) {
			all_chars.add(upper.get(i));
			all_chars.add(lower.get(i));
			all_chars.add(nums.get(i));
		}
		
		Random rand1 = new Random();
		int n4;
		for(int j = 0; j<qty;j++) {
			int n1 = rand1.nextInt(0,(upper.size()));
			int n2 = rand1.nextInt(0,(lower.size()));
			int n3 = rand1.nextInt(0,(nums.size()));
			pwd=pwd+upper.get(n1);
			pwd=pwd+lower.get(n2);
			pwd=pwd+nums.get(n3);	
			for(int i=0;i<(size-3);i++){
				n4 = rand1.nextInt(0,(all_chars.size()));
				pwd=pwd+all_chars.get(n4);
			}
			System.out.println(pwd);
			pwd="";
		}
		
	}

	public static void main(String[] args) {
		int size = 8;
		int qty = 10;
		genpwd(size,qty);
	}
}
