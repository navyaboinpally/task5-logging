package logger;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
public class house extends area
{
	private static final Logger LOGGER=Logger.getLogger(area.class.getName());
	public static void main(String args[]) throws IOException
	{
        Scanner sc=new Scanner(System.in);
        
        LOGGER.log(Level.INFO,"Enter requried material name from list below \n");
        LOGGER.log(Level.INFO,"1.standardmaterial\n");
        LOGGER.log(Level.INFO,"2.abovestandardmaterial\n");
        LOGGER.log(Level.INFO,"3.highstandardmaterial\n");
        LOGGER.log(Level.INFO,"4.highstandardmaterialandfullyautomatedhome\n");
        LOGGER.log(Level.WARNING,"enter the material type correctly ");
        LOGGER.log(Level.INFO,"enter material type name");
	    String materialtype=sc.next();
	    LOGGER.log(Level.INFO,"enter the area of  house");
	    int housearea=sc.nextInt();
	    area a=new area();
	    if(materialtype.equals("standardmaterial"))
	    {
	    	a.standardmaterial(housearea);
	    }
	    else if(materialtype.equals("abovestandardmaterial"))
	    {
	    	a.abovestandardmaterial(housearea);
	    }
	    else if(materialtype.equals("highstandardmaterial"))
	    {
	    	a.highstandardmaterial(housearea);
	    }
	    else if(materialtype.equals("highstandardmaterialandfullyautomatedhome"))
	    {
	    	a.highstandardmaterialandfullyautomatedhome(housearea);
	    }
	    
	   

	}

}
