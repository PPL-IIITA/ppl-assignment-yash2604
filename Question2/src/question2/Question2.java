
package question2;

import java.io.IOException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Question2 {

	public static int cmp1(Gift a,Gift b)
	{
		if (a.cost != b.cost)
		{
			if (a.cost < b.cost)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if (a.value > b.value)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
	public static int cmp2(Couples a,Couples b)
	{
		if (a.happiness != b.happiness)
		{
			if (a.happiness > b.happiness)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
				return 0;
		}
	}
	public static int cmp3(Couples a,Couples b)
	{
		if (a.compatibility != b.compatibility)
		{
			if (a.compatibility > b.compatibility)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
				return 0;
		}
	}
	public static void main(String[] args)
	{
            try {
                random_generate r = new random_generate();
                
                q2 x = new q2();
                x.read();
                x.makecouples();
                x.out();
                x.read_gift();
                
                x.gift_distribute();
                x.calculation();

                x.out1();

                x.out2();
   
             } catch (IOException ex) {
                Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

}