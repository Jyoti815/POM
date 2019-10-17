package mygroup;

import org.testng.annotations.Test;

public class Testgroup1 {
@Test(groups={"smoke"})
public void test1(){
	System.out.println("My first smoke test case");
}

@Test(groups={"smoke"})
public void test2(){
	System.out.println("My second smoke test case");
}
	
@Test(groups={"smoke"})
public void test3(){
	System.out.println("My third smoke test case");
}

@Test(groups={"regression"})
public void testr1(){
	System.out.println("My regression test case");
}

}
