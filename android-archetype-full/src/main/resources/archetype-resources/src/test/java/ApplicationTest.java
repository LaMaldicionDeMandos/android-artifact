/*
* Copyright (c) 2013 Zauber S.A. -- All rights reserved
*/
package ${package};

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.app.Application;
import com.xtremelabs.robolectric.Robolectric;
/**
* Simple test.
*
* @author Marcelo Pasut
* @since Mar 6, 2013
*/
@RunWith(CustomTestRunner.class)
public class ApplicationTest {

    private Application app;

    @Before
    public void setUp() {
        //app = new Application();
        //Robolectric.application = app;
    }
    @Test
    public void testAppName() {
        String appName = Robolectric.application.getString(R.string.app_name);
        assertEquals(appName, "${artifactId}");
    }
}
