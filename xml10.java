package sakethh;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class xml10 {
	@Test
	public void mytest()
	{
		int a;
		System.out.println("this is Test ");
		Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	Assert.assertEquals(a,5);
		
	}

}
