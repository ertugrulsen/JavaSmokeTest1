import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class BaseTestClassTest {

    @Before
    public void Init()
    {
        Driver.Initialize();
    }


    @After
    public void cleanUp() {

        Driver.Close();

    }

}