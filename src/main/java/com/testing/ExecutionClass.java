package com.testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Sample1.class,Sample2.class})
public class ExecutionClass {
public static void main(String[] args) {
	Result runClasses = JUnitCore.runClasses(Sample1.class,Sample2.class);
	int runCount = runClasses.getRunCount();
	System.out.println(runCount);
	
}
}
