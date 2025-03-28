package sakethh;

import org.testng.annotations.Test;

public class datapro {
//1. Admin1 password1
	//2. Admin1 password2
	//3. Admin1 password3
	@Test(dataProvider="logindData")
	public void test1(String user,String password)
	{
		System.out.println("open chrom");
		System.out.println("go to page");
		System.out.println("Enter username as"+user);
		System.out.println("Enter passwordb as");
		System.out.println("click on logion");
		System.out.println("*************************");
	}
}
	/*@Dataprovider
	public String[][] loginData()
	{
		String data[][]= {{"Admin","password1"},
				{"Admin2","password2"},
				{"Admin3","password3"}
		};
		return data;
		
	} 
	@Dataprovider
	public String[][] loginData1()
	{
		String data[][]= {{"Admin","password1"},
				{"Admin2","password2"},
				{"Admin3","password3"}
		};
		return data;
	}
}*/
