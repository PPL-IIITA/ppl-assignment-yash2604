package question1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class random_generate implements java.io.Closeable
{
	public random_generate() throws IOException
	{       
            
                File input = new File("input.txt");
                FileWriter myfile =  new FileWriter(input);
                Random rand = new Random();
		int x = 5 + rand.nextInt(100000) % 1101;
                myfile.write(x + "\n");
		int i;
		for (i = 1; i <= x; i++)
		{
                        myfile.write("Girl_id" + i + "\n");
                        myfile.write(10 + rand.nextInt(10000)%100 + "\n");
                        myfile.write(10 + rand.nextInt(10000)%100 + "\n");
                        myfile.write(100 + rand.nextInt(10000)%1000 + "\n");
			int ty = rand.nextInt(100) % 3;
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
		int y = x + rand.nextInt(10000) % 500;
		
                  myfile.write(y + "\n");
		for (i = 1; i <= y; i++)
		{
			
                    myfile.write("Boy_id" + i + "\n");
                        myfile.write(10 + rand.nextInt(10000)%100 + "\n");
                        myfile.write(10 + rand.nextInt(10000)%100 + "\n");
                        myfile.write(100 + rand.nextInt(10000)%1000 + "\n");
                    
			int ty = rand.nextInt(100) % 3;
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


	}

	public void close()
	{
	}

}