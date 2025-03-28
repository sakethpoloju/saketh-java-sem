package sakethh;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asser1 {
@Test

public  void login()
{
	System.out.println("This is login test");
	Assert.assertTrue(false);
}
@Test(dependsOnMethods="login")
public void logout()
{
	System.out.println("This is logout test");

}
public void runthistestisfaild()
{
	System.out.println("test got faild");
}
}
