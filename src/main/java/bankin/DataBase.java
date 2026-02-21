package bankin;
import bankin.Account;

import java.sql.*;

public class DataBase  {
    String url = "jdbc:mysql://localhost:3306/cadastro_banco" ;
    String user = "root";
    String pswd = "root";

    Connection connection = null;

    String comando;

    public void insert (Account a) throws SQLException {
        connection = DriverManager.getConnection(url, user, pswd);

        // Mudamos o check para buscar os dados reais, não apenas contar
        String check = "SELECT age, money FROM account WHERE name = ?";
        comando = "INSERT INTO account(name, age, money) VALUES (?, ?, ?)";

        PreparedStatement checkstmt = connection.prepareStatement(check);
        checkstmt.setString(1, a.getName());
        ResultSet rs = checkstmt.executeQuery();

        if (rs.next()) {

            System.out.println("Welcome back, " + a.getName() + "!");

            a.setAge(rs.getInt("age"));
            a.setMoney(rs.getDouble("money"));

            rs.close();
            checkstmt.close();
            connection.close();
            return;
        }


        PreparedStatement stmt = connection.prepareStatement(comando);

        stmt.setString(1, a.getName());
        stmt.setInt(2, a.getAge());
        stmt.setDouble(3, a.getMoney());

        stmt.executeUpdate();
        stmt.close();

        System.out.println("Done!");

        connection.close();

    }

   public void update(Account a) throws SQLException{
        comando = "UPDATE account SET money = ? WHERE name = ?";
        connection = DriverManager.getConnection(url,user,pswd);
        PreparedStatement stmt = connection.prepareStatement(comando);

        stmt.setDouble(1,a.getMoney());
        stmt.setString(2,a.getName());

        stmt.executeUpdate();
        stmt.close();
        connection.close();

   }



}
