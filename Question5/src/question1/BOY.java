package question1;
public class BOY implements java.io.Closeable
{
	public BOY()
	{
	}
  public BOY(String s, int a, int i, int b, String t)
  {
		  boy_id = s;
		  attractiveness = a;
		  intelligence = i;
		  budget = b;
		  type = t;
		  commited = false;
		  happiness = 0;
  }
	public String boy_id;
	public int attractiveness;
	public int intelligence;
	public boolean commited;
	public int budget;
	public int happiness;
	public String type;
	public void close()
	{
	}
    void copyFrom(BOY b) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

}