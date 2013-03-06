package ${package};

import java.io.File;

import org.junit.runners.model.InitializationError;

import com.xtremelabs.robolectric.RobolectricTestRunner;

/**
 * {@link RobolectricTestRunner} that uses test directory as resources folder.
 * 
 * @author Matias Dumrauf
 * @since Feb 26, 2013
 */
public class RealEstateTestRunner extends RobolectricTestRunner {

    public RealEstateTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass, new File(RealEstateTestRunner.class.getResource("/AndroidManifest.xml").getPath()),
                new File(System.getProperty("user.dir") + "/res"));
    }

}
