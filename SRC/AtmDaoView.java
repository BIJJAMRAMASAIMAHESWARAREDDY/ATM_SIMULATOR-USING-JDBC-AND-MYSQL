package DaoView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import atmModal.modalView;

public class AtmDaoView {
	Connection connect = null;
	public AtmDaoView() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public modalView fetchAccountDetails(int accountNo) {
		modalView st = null;
		try {
			String query = "select * from atm where accountNo = ?";
			PreparedStatement ps = connect.prepareStatement(query);
			ps.setInt(1, accountNo);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				st = new modalView();
				st.setAccountDetails(rs.getString("accountDetails"));
				st.setAccountHolderName(rs.getString("accountHolderName"));
				st.setBalance(rs.getInt("balance"));
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return st;
		
	}
	
	
	
	public List<modalView> fetchAll(){
		List<modalView> list = new ArrayList();
		
		return list;
		
	}

}
