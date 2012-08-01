/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class Test 
{
	private Connection connexion;
	private OracleDataSource ods;
	private static final String url = "jdbc:oracle:thin:FLX92/novelis@RUSSIGMAPTEST:1521:ORCL";
	
        
	public Test()
        {
            try
            {
                ods = new OracleDataSource();
                ods.setURL(url);
                connexion = ods.getConnection();
            }
            catch(SQLException se)
            {
                System.out.println("Connexion impossible : "+se.getMessage());
            }
	}
	
	private void executeQuery(String query)
        {
		try
                {
		Statement stmt = connexion.createStatement ();

		ResultSet rset = stmt.executeQuery (query);

		// Dump the result
		while (rset.next ())
		  System.out.println(rset.getString(1));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Test acces = new Test();
		acces.executeQuery("select 'Hello JDBC: ' || sysdate from dual");
	}
}