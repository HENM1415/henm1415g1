/*
 * Database.java
 */

package henm.group1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * Stores the database credentials and provides query execution methods.
 * 
 */
public class Database{
	
	private Connection connection = null;
	private boolean isConnected = false;
	
	private String username = "henmUser";
	private String password = "FEQvWhd5LpE4JmUP";
	private String database = "henm_database";
	private String host = "delange.diskstation.me";
	private int port = 3306;
	
	
	/**
	 * 
	 * Constructor for a database instance.

	 */
	public Database(){
            try {
                this.connect();
            } catch (Exception ex) {
                //TODO
            }
	}
	
	
	/**
	 * 
	 * Connects to the database.
	 * 
	 * @return true, if connected
	 * 
	 * @throws ClassNotFoundException if the driver was not found
	 * @throws SQLException if connecting did not work
	 * 
	 */
	public boolean connect() throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String urlPrefix = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database;
			this.connection = DriverManager.getConnection(urlPrefix, this.username, this.password);
			
			if(!this.connection.isClosed()){
				this.isConnected = true;
				return true;
			}
			else{
				return false;
			}
		} 
		catch (ClassNotFoundException e){
			throw new ClassNotFoundException("JDBC-Driver for MySQL database type not found! Make sure the library is placed in the library folder!", e);
		}
		catch (SQLException e){
			throw e;
		}
	}
	
	
	/**
	 * 
	 * Disconnects from the database.
	 * 
	 * @return true, if correctly disconnected
	 * 
	 */
	public boolean disconnect(){
		try{
			this.connection.close();
			this.isConnected = false;
			this.connection = null;
			
			return true;
		} 
		catch (SQLException e){
			e.printStackTrace();
			this.isConnected = false;
			this.connection = null;
		}
		return false;
	}
	
	
	/**
	 * 
	 * Checks, if this database instance is currently connected.
	 * 
	 * @return true, if connected
	 * 
	 */
	public boolean isConnected(){
		try{
			return (this.isConnected && this.connection != null && !this.connection.isClosed());
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ResultSet query(PreparedStatement statement) throws SQLException{
		// make sure one is connected to a database
		if(!isConnected())
                    throw new SQLException("Not connected!");
                
		ResultSet resultSet = statement.executeQuery();
		return resultSet;
	}
	
	
	public void insert(PreparedStatement statement) throws SQLException{
		// make sure one is connected to a database
		if(!isConnected())
			throw new SQLException("Not connected!");
		statement.executeUpdate();
	}
	
}