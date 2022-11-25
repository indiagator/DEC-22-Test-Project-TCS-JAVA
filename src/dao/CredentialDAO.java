package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CredentialDAO
{

    public CredentialDAO()
    {
        dbConnection = new DbConnection();
    }

    private DbConnection dbConnection;
    //Credential credential;

    public String getPassword(String username) throws SQLException
    {

        String password=null;
        String query = "SELECT * FROM credential WHERE username='"+username+"'  ";
        Statement statement = null;
        ResultSet resultSet = null;

        statement = dbConnection.getDbconnection().createStatement();
        resultSet = statement.executeQuery(query);

        if(resultSet.next())
        {
            password = resultSet.getString(2);
            return password;
        }
        else
        {
            return password;
        }

    }

   // public void setCredential(Credential credential) {
     //   this.credential = credential;
   // }

   // static void save(Credential credential)
   // {

   // }



}
