package javabeginner7;

import java.util.Random;

public class RanStrNum {
	private Random r;
	public int randInt() {
		r=new Random();
		return r.nextInt();
	}
	public int randInt(int intNum) {
		r=new Random();
		return r.nextInt(intNum);
	}
	public int randInt(int intNumSmall,int intNumLarge) {
		 r=new Random();
		 return (r.nextInt((intNumLarge-intNumSmall))+intNumSmall);
	}
	public String randStrLetter(int len) {
		r=new Random();
		double dtemp;
		int itemp;
		char c2str[]=new char[len];
		for(int i=0;i<len;i++) {
			dtemp=r.nextGaussian();
			if(dtemp>=0.5) {
				itemp=(r.nextInt(25)+65);
				c2str[i]=(char)itemp;
			}else {
				itemp=(r.nextInt(25)+97);
				c2str[i]=(char)itemp;
			}
		}
		return String.valueOf(c2str);	
	}
}
