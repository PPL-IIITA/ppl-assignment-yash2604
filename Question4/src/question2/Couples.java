package question2;
import java.util.*;



public class Couples implements java.io.Closeable
{
	public Couples()
	{
	}
	public Couples(Boy b, Girl g)
	{
			couple_id = b.boy_id + "_" + g.girl_id; 
                        bob=b;
			bob.copyFrom(b);
 
                        gob=g;
			gob.copyFrom(g);
			happiness = 0;
			compatibility = 0;
	}
	 public String couple_id;
	public Boy bob = new Boy();
	public int compatibility;
	public int happiness;
	public Girl gob = new Girl();
	public ArrayList<Gift> gift_arr = new ArrayList<Gift>();

	public void close()
	{
	}

}