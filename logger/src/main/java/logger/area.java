package logger;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
public class area 
{
		int i;
		int j;
		private static final Logger LOGGER=Logger.getLogger(area.class.getName());
	    public void standardmaterial(int n)
	    {
	    	i=n;
	    	int k=1200*i;
	    	LOGGER.log(Level.INFO,"total cost is:"+k);
	    }
	    public void abovestandardmaterial(int n)
	    {
	    	i=n;
	    	int k=1500*i;
	    	LOGGER.log(Level.INFO,"total cost is:"+k);
	    	
	    }
	    public void highstandardmaterial(int n)
	    {
	    	i=n;
	    	int k=1800*i;
	    	LOGGER.log(Level.INFO,"total cost is:"+k);
	    	
	    }
	    public void highstandardmaterialandfullyautomatedhome(int n)
	    {
	    	i=n;
	    	int k=2500*i;
	    	LOGGER.log(Level.INFO,"total cost is:"+k);

	    }
	

}
