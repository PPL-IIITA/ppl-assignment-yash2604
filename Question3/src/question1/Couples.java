package question1;
public class Couples extends BOY implements java.io.Closeable
{
    Object gift_arr;
	public Couples()
	{
	}
	public Couples(BOY b, Girl g)
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
	public BOY bob = new BOY();
	public int compatibility;
	public int happiness;
	public Girl gob = new Girl();


	public void close()
	{
	}

}