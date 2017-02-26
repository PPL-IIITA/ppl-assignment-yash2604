package question1;
public class Girl implements java.io.Closeable
{
	public Girl()
	{
	}
	public Girl(String s, int a, int i, int b, String t)
	{
			girl_id = s;
			attractiveness = a;
			intelligence = i;
			maintenance_cost = b;
			type = t;
			commited = false;
			happiness = 0;
	}
	public String girl_id;
	public int attractiveness;
	public int intelligence;
	public boolean commited;
	public int maintenance_cost;
	public int happiness;
	public String type;
	public void close()
	{
	}

    void copyFrom(Girl g) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

}
