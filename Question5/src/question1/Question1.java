package question1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Question1
{
	public static void main(String[] args)
	{
            try {
                random_generate r = new random_generate();
                q1 x = new q1();
                x.read();
                x.makecouples();
                x.out();
            } catch (IOException ex) {
                Logger.getLogger(Question1.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
}
