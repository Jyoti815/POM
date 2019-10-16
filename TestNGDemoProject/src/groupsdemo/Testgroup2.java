package groupsdemo;

import org.testng.annotations.Test;

public class Testgroup2 {
	

	@Test(groups={"regression"})
	public void Test5(){
		System.out.println("My regression second test case");
	}
	@Test(groups={"regression"})
	public void Test6(){
		System.out.println("My regression third test case");
	}
		
		@Test(groups={"regression"})
		public void Test7(){
			System.out.println("My regression fourth test case");	
}
		@Test(groups={"smoke"})
		public void Test8(){
			System.out.println("My smoke sixth test case");
}
		}