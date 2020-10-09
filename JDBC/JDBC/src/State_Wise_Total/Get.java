package State_Wise_Total;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Get {
	public static void main(String[] args) throws Exception {
		try {
			String DRIVER = "com.mysql.jdbc.Driver";
			String URL = "jdbc:mysql://localhost:3306/database1";
			String USER = "root";
			String Pwd = "***********";
			ArrayList<GetData> array = new ArrayList<GetData>();
			Class.forName(DRIVER);
			System.out.println("Driver found");
			System.out.println("Connecting to a database...");
			Connection conn = DriverManager.getConnection(URL, USER, Pwd);
			System.out.println("Connected ");
			Statement stmt = conn.createStatement();

			String sql = "SELECT * FROM  database1.`corona threat table`";
			ResultSet result = stmt.executeQuery(sql);
			while (result.next()) {
				GetData data = new GetData();
				data.setState(result.getString("state"));
				data.setDistrict(result.getString("district"));
				data.setMaleTotal(result.getInt("male"));
				data.setFemaleTotal(result.getInt("female"));
				array.add(data);
			}
			result.close();
			int TN_Male_Total = 0;
			int TN_Female_Total = 0;
			int AP_Male_Total = 0;
			int AP_Female_Total = 0;
			int Kl_Male_Total = 0;
			int Kl_Female_Total = 0;
			for (int i = 0; i <= 5; i++) {
				if ((array.get(i).getState()).equals("Tamilnadu")) {
					TN_Male_Total = TN_Male_Total + array.get(i).getMaleTotal();
					TN_Female_Total = TN_Female_Total + array.get(i).getFemaleTotal();
				}
				if ((array.get(i).getState()).equals("AP")) {
					AP_Male_Total = AP_Male_Total + array.get(i).getMaleTotal();
					AP_Female_Total = AP_Female_Total + array.get(i).getFemaleTotal();
				}
				if ((array.get(i).getState()).equals("Kerala")) {
					Kl_Male_Total = Kl_Male_Total + array.get(i).getMaleTotal();
					Kl_Female_Total = Kl_Female_Total + array.get(i).getFemaleTotal();
				}
			}
			int TN_Total = TN_Male_Total + TN_Female_Total;
			System.out.println("TN Male Total: " + TN_Male_Total);
			System.out.println("TN Female Total: " + TN_Female_Total);
			System.out.println("TN Total : " + TN_Total);

			int AP_Total = AP_Male_Total + AP_Female_Total;
			System.out.println("AP Male Total: " + AP_Male_Total);
			System.out.println("AP Female Total: " + AP_Female_Total);
			System.out.println("AP Total : " + AP_Total);
			int Kl_Total = Kl_Male_Total + Kl_Female_Total;
			System.out.println("Kerela Male Total: " + Kl_Male_Total);
			System.out.println("Kerela Female Total: " + Kl_Female_Total);
			System.out.println("Kerela Total: " + Kl_Total);

			int Total_No_Of_Patients = TN_Total + AP_Total + Kl_Total;
			System.out.println("Total No Of Patients:" + Total_No_Of_Patients);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
