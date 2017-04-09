package question2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class q2 implements java.io.Closeable
{
	public q2()
	{
	}
	public final void read() throws FileNotFoundException, IOException
	{
                FileReader inp = new FileReader("input.txt");
                BufferedReader myfile = new BufferedReader(inp);
		int ng;
		int i;
		String c;
		String name;
		String type;

		int nb;
		int at;
		int intl;
		int bud;
                ng = Integer.parseInt(myfile.readLine());
		for (i = 1; i <= ng; i++)
		{
                        name = myfile.readLine();
                    
                        at = Integer.parseInt(myfile.readLine());

                        intl = Integer.parseInt(myfile.readLine());

                        bud = Integer.parseInt(myfile.readLine());

                        type = myfile.readLine();
			Girl g = new Girl(name, at, intl, bud, type);
			girl_arr.add(g);
		}

                nb = Integer.parseInt(myfile.readLine());
		for (i = 1; i <= nb; i++)
		{

                    name = myfile.readLine();
			
                    at = Integer.parseInt(myfile.readLine());

                    intl = Integer.parseInt(myfile.readLine());

                   bud = Integer.parseInt(myfile.readLine());

                   type = myfile.readLine();
			Boy b = new Boy(name, at, intl, bud, type);
			boy_arr.add(b);
		}
	}
	public final void makecouples() throws IOException
	{

                    File outfile = new File("Couple_formation.txt");
                    FileWriter myfile = new FileWriter(outfile);
		
		myfile.write("Event" + "\t \t \t \t \t" + " Couple ID \t \t \t \t" + "\n");

		int j;
		int i;
		for (i = 0; i < girl_arr.size(); i++)
		{
			for (j = 0; j < boy_arr.size(); j++)
			{
				if (boy_arr.get(j).budget >= girl_arr.get(i).maintenance_cost && boy_arr.get(j).commited == false)
				{
					girl_arr.get(i).commited = true;
					boy_arr.get(j).commited = true;
					Couples Cp = new Couples(boy_arr.get(j), girl_arr.get(i));


				
					String buf = new String(new char[80]);
					
					myfile.write("Formation of couple\t \t" + Cp.couple_id + "\t \t" + buf + "\n");


					couple_arr.add(Cp);


					break;
				}

			}
                        
		}
                myfile.close();




	}
	public final void out() throws IOException
	{
		int i;
                 File outfile = new File("couples.txt");
                    FileWriter myfile = new FileWriter(outfile);

		for (i = 0; i < couple_arr.size(); i++)
		{       
			myfile.write("Match Found --> " + couple_arr.get(i).gob.girl_id + " with " + couple_arr.get(i).bob.boy_id + "\n");
		}
                myfile.close();

	}
	public  void out1() throws IOException
	{
		int i;
		int j;
                 File outfile = new File("happiness.txt");
                    FileWriter myfile = new FileWriter(outfile);
		
		myfile.write("Happiest Couples" + "\n");
	
		for (i = 0; i < couple_arr.size(); i++)
		{
			myfile.write( "Couple_ID -  " + couple_arr.get(i).couple_id + "\t\t\tHappiness -  " + couple_arr.get(i).happiness + "\t\t\t");
			myfile.write(  "Gifts Exchange - " + couple_arr.get(i).gift_arr.size() + "\n");

		}
                myfile.close();
	}
        
        public  void breakup() throws IOException
	{
		int i;
		int j;
                int count= 0;
                 File outfile = new File("breakup.txt");
                    FileWriter myfile = new FileWriter(outfile);
		
		myfile.write("performing breakup of 6 couples" + "\n");
	
		for (i = couple_arr.size()-1; i >= 0; i--)
		{
                    if(count == 6)
                        break;
                        count++;
                        
			myfile.write( "performing breakup of Couple_ID -  " + couple_arr.get(i).couple_id + "\n");
			//myfile.write(  "Gifts Exchange - " + couple_arr.get(i).gift_arr.size() + "\n");

		}
                myfile.close();
	}
        
	public final void out2() throws IOException
	{
		int i;
		int j;
                 File outfile = new File("compatibility.txt");
                    FileWriter myfile = new FileWriter(outfile);
		
		myfile.write("Compatible Couples" + "\n");
		
		for (i = 0; i < couple_arr.size(); i++)
		{

			myfile.write("Couple_ID - " + couple_arr.get(i).couple_id + " \tCompatibility - " + couple_arr.get(i).compatibility + "\t");
			  myfile.write("Gifts Exchange- " + couple_arr.get(i).gift_arr.size() + "\n");
		}
                myfile.close();
	}
	public final void gift_distribute() throws IOException
	{
                    File outfile = new File("Gift_Distr.txt");
                    FileWriter out = new FileWriter(outfile);
		
		out.write ("Event" + "\t \t \t \t" + "Gift_Id \t \t \t" + " Couple_ID\t \t \t" + "\n");
		int y;
		int k;
		int j;
		int x;
		int mc;
		for (k = 0; k < couple_arr.size(); k++)
		{
			if (couple_arr.get(k).bob.type.equals("Miser"))
			{
				mc = couple_arr.get(k).gob.maintenance_cost;
				j = 0;
				x = 0;
				while (j < mc)
				{
					j += gift_arr.get(x).cost;
					couple_arr.get(k).gift_arr.add(gift_arr.get(x));
					
					String buf = new String(new char[80]);

					out.write("Gifts Distribution\t \t" + gift_arr.get(x).gift_id + "\t \t " + couple_arr.get(k).couple_id + "\t \t" + buf + "\n");
					x++;
				}
			}
			else if (couple_arr.get(k).bob.type.equals("Generous"))
			{
				mc = couple_arr.get(k).bob.budget;
				j = 0;
				x = 0;
				while (j < mc)
				{
					j += gift_arr.get(x).cost;
					couple_arr.get(k).gift_arr.add(gift_arr.get(x));
					String buf = new String(new char[80]);
					
					out.write("Gifts Distribution\t \t" + gift_arr.get(x).gift_id + "\t \t " + couple_arr.get(k).couple_id + "\t \t" + buf + "\n");
					x++;
				}
			}
			else
			{
				mc = couple_arr.get(k).gob.maintenance_cost;
				j = 0;
				x = 0;
				while (j < mc)
				{
					j += gift_arr.get(x).cost;
					couple_arr.get(k).gift_arr.add(gift_arr.get(x));
					String buf = new String(new char[80]);
					out.write("Gifts Distribution\t \t" + gift_arr.get(x).gift_id + "\t \t " + couple_arr.get(k).couple_id + "\t \t" + buf + "\n");
					x++;
				}
				y = couple_arr.get(k).bob.budget - j;
				for (j = 0; j < gift_arr.size(); j++)
				{
					if (gift_arr.get(j).type.equals("Luxury") && y >= gift_arr.get(j).cost)
					{
						couple_arr.get(k).gift_arr.add(gift_arr.get(j));
						String buf = new String(new char[80]);
						out.write("Gifts Distribution\t \t" + gift_arr.get(j).gift_id + "\t \t " + couple_arr.get(k).couple_id + "\t \t" + buf + "\n");
					}
				}
			}
		}

	}
   public final void read_gift() throws IOException
   {
              FileReader inp = new FileReader("gift.txt");
                BufferedReader myfile = new BufferedReader(inp);

	   int i;
	   String c;
	   String name;
	   String type;

	   int ng;
	   int cs;
	   int val;
           ng =Integer.parseInt(myfile.readLine());
	   for (i = 1; i <= ng; i++)
	   {

               name = myfile.readLine();
              cs = Integer.parseInt(myfile.readLine());
                   val = Integer.parseInt(myfile.readLine());
                  type = myfile.readLine();
		   Gift g = new Gift(type, cs, val, name);
		   gift_arr.add(g);
	   }

   }
public final void calculation()
{

	int i;
	int j;
	int x;
	int y;
	int mc;
	for (i = 0; i < couple_arr.size(); i++)
	{

		x = 0;
		y = 0;
		int hapg = 0;
		int hapb = 0;
		for (j = 0; j < couple_arr.get(i).gift_arr.size(); j++)
		{
			x += couple_arr.get(i).gift_arr.get(j).cost;
			y += couple_arr.get(i).gift_arr.get(j).value;
		}
		mc = couple_arr.get(i).gob.maintenance_cost;
		if (couple_arr.get(i).gob.type.equals("Choosy"))
		{
			hapg = (int) Math.log10(x - mc + 2 * y);

		}
		else if (couple_arr.get(i).gob.type.equals("Desperate"))
		{
			hapg = (int) Math.exp((x - mc) % 15);

		}
		else
		{
			hapg = x - mc + y;

		}
		if (couple_arr.get(i).bob.type.equals("Miser"))
		{
			hapb = Math.abs(couple_arr.get(i).bob.budget - x);
		}
		else if (couple_arr.get(i).bob.type.equals("Generous"))
		{
			hapb = hapg;
		}
		else
		{
			hapb = couple_arr.get(i).gob.intelligence;
		}
		couple_arr.get(i).bob.happiness = hapb;
		couple_arr.get(i).gob.happiness = hapg;
		couple_arr.get(i).happiness = hapb + hapg;
		couple_arr.get(i).compatibility = couple_arr.get(i).bob.budget - mc + Math.abs(couple_arr.get(i).gob.attractiveness - couple_arr.get(i).bob.attractiveness) + Math.abs(couple_arr.get(i).gob.intelligence - couple_arr.get(i).bob.intelligence);
	}
}
  public ArrayList<Boy> boy_arr = new ArrayList<Boy>();
	public ArrayList<Girl> girl_arr = new ArrayList<Girl>();
	public ArrayList<Couples> couple_arr = new ArrayList<Couples>();
public ArrayList<Gift> gift_arr = new ArrayList<Gift>();
	public q2(q2 orig)
	{



	}
	public void close()
	{
	}

}
