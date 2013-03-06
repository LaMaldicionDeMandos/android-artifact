/*
* Copyright (c) 2013 Zauber S.A. -- All rights reserved
*/
package ${package};

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
* Simple test.
*
* @author Marcelo Pasut
* @since Mar 6, 2013
*/
@RunWith(RealEstateTestRunner.class)
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setUp() {
        activity = new MainActivity();
        activity.onCreate(null);
    }
    @Test
    public void testAppName() {
        String appName = activity.getResources().getString(R.string.app_name);
        assertEquals(appName, "${artifactId}");
    }
}
