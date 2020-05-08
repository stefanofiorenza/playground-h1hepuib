package com.knits.jbasic.labs.test;

import org.junit.Assert;
import org.junit.Test;

import com.knits.jbasic.labs.Labs01;

public class Labs01Test {

	@Test
	public void test()  {
		Assert.assertTrue(Labs01.hello("Stefano").equals("Hello Stefano"));
	}

}