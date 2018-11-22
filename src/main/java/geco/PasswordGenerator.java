package geco;

import java.util.Random;

public class PasswordGenerator {

    private static final int NB_CHAR_PASSWORD = 8;

    String getRandomPassword(){
        String s = "";
        Random r = new Random();
        for (int i = 0;i<NB_CHAR_PASSWORD;i++)
            s += (char)(r.nextInt(26) + 'a');
        return s;
    }
}
