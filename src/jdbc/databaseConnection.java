package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class databaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juneclass", "root", "Zeshan1@");
			Statement stmt = connection.createStatement();
			ResultSet results = stmt.executeQuery("Select * from consutantinfo");
			
			while(results.next()) {
				System.out.println(results.getString("name")+" - "+results.getString("email")+" - "+results.getString("address") );
				
			}
			results.close();
			stmt.close();
			connection.close();
			
		}
		catch(Exception exp) {
			exp.printStackTrace();
		}
	}

}
