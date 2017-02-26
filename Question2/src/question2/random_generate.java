package question2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class random_generate implements java.io.Closeable
{
	public random_generate() throws IOException
	{       File outfile = new File("input.txt");
                Random rand = new Random();
                FileWriter myfile = new FileWriter(outfile);
		int x = 5 + rand.nextInt(10000) % 15;
                myfile.write(x + "\n");
		int i;
		for (i = 1; i <= x; i++)
		{
                    myfile.write("Girl_id" + i + "\n");
                    myfile.write(10 + rand.nextInt(1000)%100 + "\n");
                    myfile.write(10 + rand.nextInt(1000)%100 + "\n");
                    myfile.write(100 + rand.nextInt(1000)%1000 + "\n");
                    int ty = rand.nextInt(1000)%3;
			 if (ty == 0)
			 {
                                                myfile.write("Choosy" + "\n");
			 }
					else if (ty == 1)
					{
                                                 myfile.write("Normal" + "\n");

					}
					else
					{
                                                myfile.write("Desperate" + "\n");

					}
		
		}
		int y = x + rand.nextInt(1000) % 50;
                myfile.write(y + "\n");

		for (i = 1; i <= y; i++)
		{
		
                     myfile.write("Boy_id" + i + "\n");
                    myfile.write(10 + rand.nextInt(1000)%100 + "\n");
                    myfile.write(10 + rand.nextInt(1000)%100 + "\n");
                    myfile.write(100 + rand.nextInt(1000)%1000 + "\n");
                    int ty = rand.nextInt(1000)%3;
			 if (ty == 0)
			 {
                                                myfile.write("Miser" + "\n");
			 }
					else if (ty == 1)
					{
                                                  myfile.write("Generous" + "\n");

					}
					else
					{
                                                 myfile.write("Geek" + "\n");

					}
		}
		myfile.close();
                File outfile1 = new File("gift.txt");
                FileWriter myfile1 = new FileWriter(outfile1);
                int ng;
                int vl;
                int cs;
                ng = 500 + rand.nextInt(10000) % 501;
                myfile1.write(ng+ "\n");
                for (i = 1;i <= ng;i++)
                {
                    String s = "gift_id_";
                    myfile1.write(s);
                    myfile1.append(i+ "\n");
                    cs = 50 + rand.nextInt(1000) % 250;
                    myfile1.write(cs + "\n");
                    x = rand.nextInt(1000) % 2;
                    if (x == 0)
                    {
                        vl = cs + rand.nextInt(1000) % 100;
                    }
                    else
                    {
                        vl = cs - rand.nextInt(1000)% 50;
                    }
                    myfile1.write(vl + "\n");
                    int ty = rand.nextInt(1000) % 3;
                    if (ty == 0)
                    {
                        myfile1.write("Essential" + "\n");
                    }
                    else if (ty == 1)
                    {
                        myfile1.write("Luxury" + "\n");
                    }
                    else
                    {
                        myfile1.write("Utility" + "\n");
                    }

		  }
            myfile1.close();


	}

	public void close()
	{
	}

}
