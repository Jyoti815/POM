package mygroup;

import org.testng.annotations.Test;

public class Testgroup2 {
	@Test(groups={"regression"})
	public void testr2(){
	System.out.println("My regression second test case");
	}
	@Test(groups={"regression"})
	public void testr3(){
		System.out.println("My regression third test case");
	}	
		
	@Test(groups={"regression"})
	public void testr4(){
		System.out.println("My regression fourth test case");
	}	
	
	@Test(groups={"smoke"})
	public void testr5(){
		System.out.println("My smoke fourth test case");
	}
		
}
