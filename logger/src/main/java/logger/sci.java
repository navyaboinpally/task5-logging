package logger;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
public class sci
{
	private static final Logger LOGGER=Logger.getLogger(sci.class.getName());
	public  static void main(String args[]) throws SecurityException,IOException
    {
    double pr, rate, t, sim,com;
    Scanner sc=new Scanner(System.in);
    LOGGER.log(Level.WARNING,"enter correct details");
    LOGGER.log(Level.INFO,"Enter the amount:");
    pr=sc.nextDouble();
    LOGGER.log(Level.INFO,"Enter the No.of years:");
    t=sc.nextDouble();
    LOGGER.log(Level.INFO,"Enter the Rate of  interest");
    rate=sc.nextDouble();
    sim=(pr * t * rate)/100;
    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
    LOGGER.log(Level.INFO,"Simple Interest="+sim+"\n");
    LOGGER.log(Level.INFO,"Compound Interest="+com);
    }


}
