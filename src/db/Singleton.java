package db;

import java.sql.*;

public class Singleton
{
	private static Singleton instance;
	private Connection con;
    /*
    * La m�thode getInstance n'est sur pour les threads
    * (possibilite de creer plusieurs Singleton) donc
    * on a besoin de securiser celle-ci avec synchronized.
    */    
    public static synchronized Singleton getInstance()
    {
        if (instance == null)
        	instance = new Singleton();
        
        return instance;
    }
    
	private Singleton()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			con = DriverManager.getConnection("jdbc:oracle:oci8:@RUSSIGMAPTEST", "FLX92", "novelis" );
		}
		catch( Exception e ) 
		{
		     e.printStackTrace();
		}
	}

    
    public Connection getCon() 
    {
        return con;
    }
}