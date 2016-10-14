package compSec;

import java.util.Scanner;

public class ExtendedEuclidean {

	public static void main(String[] args) {
		int x[],y[],z[],a=0,b=0,gcd=0,b_inv=0,q=0;
		while((a<b)||(b<=0))
		{
		System.out.println("Enter the two integers :");
		Scanner src=new Scanner(System.in);
		a=src.nextInt();
		b=src.nextInt();
		System.out.println("Two Numbers are a:"+a+" b:"+b);
		if((a<b)||(b<=0))
			System.out.println("Expected input (0 < b < a)");
		}
		x = new int [] {1,0,a};
		y= new int [] {0,1,b};
		z= new int [3];
        while(true)
        {
        	if(y[2]==0)
        	{
        		gcd=x[2];
        		System.out.println("GCD of "+a+ " and "+b+" : "+gcd);
        		System.out.println("Multiplicative inverse of "+a+ " and "+b+" does not exists ");
        		break;
        	}
        	if(y[2]==1)
        	{
        		gcd=y[2];
        		if(y[1]<0)
        		{
        			y[1]=y[1]+a;
        		}
        		b_inv=y[1];
        		System.out.println("GCD of "+a+ " and "+b+" : "+gcd);
        		System.out.println("Multiplicative inverse of "+b+ " mod "+a+" : "+b_inv);
        		break;
        	}
        	q=(int) Math.floor((x[2]/y[2]));
        	for (int i=0;i<3;i++)
        		z[i]=x[i]-(q*y[i]);
        	for (int i=0;i<3;i++)
        	{
        		x[i]=y[i];
        		y[i]=z[i];
        	}
        }
	}

}
