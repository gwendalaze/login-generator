package geco;

import org.junit.*;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService ls;

    private LoginGenerator lg;

    @Before
    public void setUp(){
        ls = new LoginService(new String []{"JROL","BPER","CGUR","JDU","JRAL","JRAL1"});
        lg = new LoginGenerator(ls);
    }

    @Test
    public void CT(){
        lg.generateLoginForNomAndPrenom("Du","Paul");
        assertTrue(ls.loginExists("PDU"));
    }

    @Test
    public void CT1(){
        lg.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(ls.loginExists("PDUR"));
    }

    @Test
    public void CT2(){
        lg.generateLoginForNomAndPrenom("Rolling","Jean");
        assertTrue(ls.loginExists("JROL1"));
    }

    @Test
    public void CT3(){
        lg.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertTrue(ls.loginExists("PDUR"));
    }


    @Test
    public void CT4(){
        lg.generateLoginForNomAndPrenom("Ralling","John");
        assertTrue(ls.loginExists("JRAL2"));
    }

}
