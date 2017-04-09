package question2;
public class Gift implements java.io.Closeable
{
    String gift_id;
	 public Gift()
	 {
	 }
   public Gift(String t, int c, int v, String gi)
   {
		   type = t;
		   cost = c;
		   value = v;
		   gift_id = gi;
   }
	 public String type;
	public int cost;
	public int value;
    
	public String gift;


	public void close()
	{
	}
}
