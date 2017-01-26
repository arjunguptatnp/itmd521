import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.sql.*;
import java.util.Calendar;

public class q2code {
	public static void main(String[] args) throws Exception {
		 String myDriver = "org.gjt.mm.mysql.Driver";
	     String myUrl = "jdbc:mysql://localhost/arjweek2";
	     Class.forName(myDriver);
	     Connection conn = DriverManager.getConnection(myUrl, "root", "password");
	    
		FileInputStream fis2 = new FileInputStream("/home/ubuntu/all/1990.gz");
		GZIPInputStream gis = new GZIPInputStream(fis2);
		//FileOutputStream fos2 = new FileOutputStream("/home/ubuntu/all/1990.csv");
		Reader decoder = new InputStreamReader(gis);
		BufferedReader br = new BufferedReader(decoder);
		String line;
		while((line  = br.readLine()) != null){
		//System.out.println(line);
                String ul1 = line.substring(0,3);
                String usafwsi = line.substring(4,9);
                String wban= line.substring(10,14);
		String Year = line.substring(15,19);
                String DateMonth = line.substring(19,22);
		String hour = line.substring(23,26);
                String ul2 = line.substring(26,27); //should be 27 only but it is useless so no issues
		String latitude = line.substring(28,33);
                String longitude = line.substring(34,40);
                String ul3 = line.substring(41,45); 
		String elevation = line.substring(46,50);
                String ul4 = line.substring(51,55);
                String ul5 = line.substring(56,59);
		String wind_direction = line.substring(60,62);
                String qc1 = line.substring(62,63); //should be 63 only but we are not displaying it so no issues
     		String ul6 = line.substring(63,64); //should be 64 only but it is useless so no issues	
                String ul7 = line.substring(65,68);
                String ul8 = line.substring(68,69); //should be 69 only but it is useless so no issues
                String sky_cieling= line.substring(70,74);
                String qc2 = line.substring(74,75); //should be 75 only but we are not displaying it so no issues  
                String ul9 = line.substring(75,76); //should be 76 only but it is useless so no issues
                String ul10 = line.substring(76,77); //should be 77 only but it is useless so no issues
		String visibility= line.substring(78,83); 
                String qc3 = line.substring(83,84); //should be 84 only but we are not displaying it so no issues
                String ul11 = line.substring(84,85); //should be 85 only but it is useless so no issues
                String ul12 = line.substring(85,86); //should be 86 only but it is useless so no issues
                String Temp = line.substring(87,91);
		String qc4 = line.substring(91,92); //should be 92 only but we are not displaying it so no issues
		String dew_point = line.substring(93,97);   
                String qc5 = line.substring(97,98); //should be 98 only but we are not displaying it so no issues
		String atm_pressure= line.substring(99,103);   
                String qc6 = line.substring(103,104); //should be 104 only but we are not displaying it so no issues                        
                               
                               
        



		
		
	//	System.out.println(qc1);
		String query = "insert into  arjweek2(ul1,usafwsi,wban,Year,DateMonth,hour,ul2,latitude,longitude,ul3,elevation,ul4,ul5,wind_direction,qc1,ul6,ul7,ul8,sky_cieling,qc2,ul9,ul10,visibility,qc3,ul11,ul12,Temp,qc4,dew_point,qc5,atm_pressure,qc6) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement preparedStmt = conn.prepareStatement(query);
             preparedStmt.setString (1, ul1);
	     preparedStmt.setString (2,usafwsi);
	     preparedStmt.setString (3, wban);
	     preparedStmt.setString (4, Year);
	     preparedStmt.setString (5, DateMonth);
	     preparedStmt.setString (6, hour);
	     preparedStmt.setString (7, ul2);
	     preparedStmt.setString (8, latitude);
	     preparedStmt.setString (9, longitude);
	     preparedStmt.setString (10, ul3);
	     preparedStmt.setString (11, elevation);
	     preparedStmt.setString (12, ul4);
	     preparedStmt.setString (13, ul5);
	     preparedStmt.setString (14, wind_direction);
	     preparedStmt.setString (15, qc1);
	     preparedStmt.setString (16, ul6);
	     preparedStmt.setString (17, ul7);
	     preparedStmt.setString (18, ul8);
	     preparedStmt.setString (19, sky_cieling);
	     preparedStmt.setString (20, qc2);
	     preparedStmt.setString (21, ul9);
	     preparedStmt.setString (22, ul10);
	     preparedStmt.setString (23, visibity);
	     preparedStmt.setString (24, qc3);
	     preparedStmt.setString (25, ul11);
	     preparedStmt.setString (26, ul12);
	     preparedStmt.setString (27, Temp);
	     preparedStmt.setString (28, qc4);
	     preparedStmt.setString (29, dew_point);
	     preparedStmt.setString (30, qc5);
	     preparedStmt.setString (31, atm_pressure);
             preparedStmt.setString (32, qc6);
			
	     // 32 parameters being reported instead of 31 which is an error
	     preparedStmt.executeUpdate();
		}
	}
}
