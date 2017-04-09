package question1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;




public class q1 implements java.io.Closeable
{
	public q1()
	{
	}
	public final void read() throws IOException{
                FileReader myfile = null;
            try {
              
                myfile = new FileReader("input.txt");
                BufferedReader buf = new BufferedReader(myfile);
                int ng = 0;
                int i;
                String c;
                String name;
                String type = null,temp;
                int nb;
                int at;
                int intl;
                int bud;
                   
                        ng = Integer.parseInt(buf.readLine());
                for (i = 1; i <= ng; i++)
                {
                   
                   
                        name = buf.readLine();
                    
                   
                        at =Integer.parseInt(buf.readLine());
                  
                        intl = Integer.parseInt(buf.readLine());
                   
                   
                        
                        bud = Integer.parseInt(buf.readLine());
                        type = buf.readLine();
                   
                   
                    Girl g = new Girl(name, at, intl, bud, type);
                    girl_arr.add(g);
                }
                    
                        nb = Integer.parseInt(buf.readLine());
                   
                for (i = 1; i <= nb; i++)
                {
                    
                        name = buf.readLine();
                 
                   
                        at = Integer.parseInt(buf.readLine());
                  
                 
                        intl =Integer.parseInt(buf.readLine());
                   
                    bud = Integer.parseInt(buf.readLine());
                    try {
                       
                        type = buf.readLine();
                    } catch (IOException ex) {
                        Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
                    }
			BOY b = new BOY(name, at, intl, bud, type);
			boy_arr.add(b);
		}
            } catch (FileNotFoundException ex) {
                Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    myfile.close();
                } catch (IOException ex) {
                    Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	}
	public final void makecouples() throws IOException 
	{
           
                File Event = new File("CoupleFormation.txt");
                 FileWriter   Out = new FileWriter(Event);
                try {
                  
                    Out.write("Event\t\t\t\t\t\t" + "Couple ID \t \t \t \t" +"\n");
                } catch (IOException ex) {
                    Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
          
                
                int j;
                int i;
                for (i = 0; i < girl_arr.size(); i++)
                {
                    
                    for (j = 0; j < boy_arr.size(); j++)
                    {
                        if (boy_arr.get(j).budget >= girl_arr.get(i).maintenance_cost  && boy_arr.get(j).commited == false)
                        {
                           
                                girl_arr.get(i).commited = true;
                                boy_arr.get(j).commited = true;
                                Couples Cp = new Couples(boy_arr.get(j), girl_arr.get(i));
                                
                                
                            try {
                                
                                Out.write("Couple Formation---->\t \t" + Cp.couple_id + "\t \t"  + "\n");
                            } catch (IOException ex) {
                                Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                
                                couple_arr.add(Cp);
                                
                                
                                break;
                            
                        }
                        
                    }
                }
           
              
                try {
                    Out.close();
                } catch (IOException ex) {
                    Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
                }

	}
        
	public void out() 
	{
          
                try {
                    int i;
                    File couples = new File("couples.txt");
                   FileWriter myfile = new FileWriter(couples);

                    
                    for (i = 0; i < couple_arr.size(); i++)
                    {
                       
                        myfile.write(" Match Is Found : " + couple_arr.get(i).gob.girl_id + " with " + couple_arr.get(i).bob.boy_id + "\n");
		}
                    myfile.close();
                } catch (IOException ex) {
                    Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                }

	}
  public ArrayList<BOY> boy_arr = new ArrayList<BOY>();
	public ArrayList<Girl> girl_arr = new ArrayList<Girl>();
	public ArrayList<Couples> couple_arr = new ArrayList<Couples>();
	public q1(q1 orig)
	{
	}
	public void close()
	{
	}

}
