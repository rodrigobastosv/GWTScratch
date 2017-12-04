package com.example.gwtscratch;

import com.example.gwtscratch.client.GWTScratchTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class GWTScratchSuite extends GWTTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Tests for GWTScratch");
		suite.addTestSuite(GWTScratchTest.class);
		return suite;
	}
}
