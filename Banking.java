import java.sql.*;
import java.util.Scanner;
public class Banking {
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");   
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("select choice among below options provided");
			System.out.println("1. create account");
			System.out.println("2. view balance");
			System.out.println("3. credit ammount/deposit");
			System.out.println("4. withdraw");
			a=sc.nextInt();
			String rs;
			if(a==1)
			{
				System.out.println("Enter name,id,balance");
				int id,balance;
				String name;
				name=sc.next();
				id=sc.nextInt();
				balance=sc.nextInt();
				rs="Insert into bank (personid,name,balance) values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(rs);
				pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setInt(3, balance);
                pstmt.executeUpdate();
                System.out.println("1 row inserted");
                pstmt.close();
			}
			else if(a==2)
			{
				System.out.println("Enter personid to retrieve balance:");
				int id;
				id=sc.nextInt();
				rs="select * from bank where personid=?";
				PreparedStatement psstmt=con.prepareStatement(rs);
				psstmt.setInt(1,id);
				ResultSet r=psstmt.executeQuery();
				if(r.next())
				{
					System.out.println("Balance:"+r.getInt("balance"));
				}
				else
				{
					System.out.println("ID not found");
				}
				psstmt.close();
			}
			else if(a==3)
			{
				int id,amount;
				System.out.println("Enter personid:");
				id=sc.nextInt();
				System.out.println("Enter amount:");
				amount=sc.nextInt();
				rs="select balance from bank where personid=?";
				PreparedStatement psstmt=con.prepareStatement(rs);
				psstmt.setInt(1,id);
				ResultSet r=psstmt.executeQuery();
				if(r.next())
				{
					int bal=amount;
					bal=bal+r.getInt("balance");
					String query="update bank set balance=? where personid=?";
					PreparedStatement psstmt1=con.prepareStatement(query);
					psstmt1.setInt(1,bal);
					psstmt1.setInt(2, id);
					psstmt1.executeUpdate();
					System.out.println(bal);
					psstmt1.close();
				}
				else
				{
					System.out.println("Problem occured");
				}
				psstmt.close();
			}
			else if(a==4)
			{
				int id,amount;
				System.out.println("Enter personid:");
				id=sc.nextInt();
				System.out.println("Enter amount:");
				amount=sc.nextInt();
				rs="select balance from bank where personid=?";
				PreparedStatement psstmt=con.prepareStatement(rs);
				psstmt.setInt(1,id);
				ResultSet r=psstmt.executeQuery();
				if(r.next())
				{
					int bal=amount;
					bal=r.getInt("balance")-bal;
					if(bal>0) {
					String query="update bank set balance=? where personid=?";
					PreparedStatement psstmt1=con.prepareStatement(query);
					psstmt1.setInt(1,bal);
					psstmt1.setInt(2, id);
					psstmt1.executeUpdate();
					System.out.println(bal);
					psstmt1.close();
					}
					else
					{
						System.out.println("insufficient money");
					}
				}
				else
				{
					System.out.println("problem occured");
				}
				psstmt.close();
			}
		}
		catch(Exception E)
		{
			System.out.print("Exception occured"+" "+E);
		}
		
		
	}
}
