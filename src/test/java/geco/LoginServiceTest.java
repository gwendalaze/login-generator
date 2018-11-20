
package geco;

import org.junit.*;

import static org.junit.Assert.*;

public class LoginServiceTest{

    private final String[] testLogins = {"nrg2293a","gwendalaze","aspirrosoire","gweynard"};

    private LoginService ls;

    @Before
    public void setUp(){
        ls = new LoginService(testLogins);
    }

    @Test
    public void testLoginExistTrue()
    {
        assertTrue(ls.loginExists("gwendalaze"));
    }

    @Test
    public void testLoginExistFalse()
    {
        assertFalse(ls.loginExists("toto"));
    }

    @Test
    public void testAddLogin()
    {
        ls.addLogin("pepeTheFrog");
        assertTrue(ls.loginExists("pepeTheFrog"));
    }
}