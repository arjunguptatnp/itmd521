//Reference: https://lstsal.wordpress.com/2015/08/23/mapreduce-programme-find-highest-temperature-for-each-year-in-ncdc-data-set/
//Reference: http://beginnersbook.com/2013/12/java-string-substring-method-example/
//Reference: http://www.java2s.com/Code/Java/File-Input-Output/Readsomedatafromagzipfile.htm
//Reference: https://www.tutorialspoint.com/jdbc/jdbc-sample-code.htm
//Reference: http://www.java2s.com/Code/JavaAPI/java.sql/PreparedStatementsetStringintparameterIndexStringx.htm

/*
Concept used: I have first used a tutorial from the internet(link added) to connect to the database.
After that used the concept of FileInput Stream and GZIP input stream to read the file.
Then using the schema provided in the book, I used substringfunction to parse the data
Then I inserted the data into the database.
*/
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
	     String myUrl = "jdbc:mysql://localhost/arjweek2"; //arjweek2 is name of the schema
	     Class.forName(myDriver);
	     Connection conn = DriverManager.getConnection(myUrl, "root", "password"); 
		//this part has been taken from the internet
		//Reference of above part is: https://www.tutorialspoint.com/jdbc/jdbc-sample-code.htm
	   
		FileInputStream f1 = new FileInputStream("/home/ubuntu/all/1990.gz"); //I put the .gz file in 'all' folder
		GZIPInputStream g1 = new GZIPInputStream(f1);
		
		Reader d1 = new InputStreamReader(g1);
		BufferedReader br = new BufferedReader(d1);
		//Reference of above part is: http://www.java2s.com/Code/Java/File-Input-Output/Readsomedatafromagzipfile.htm
		String l1;
		while((l1  = br.readLine()) != null){
		//System.out.println(line);
                String ul1 = l1.substring(0,3);
                String usafwsi = l1.substring(4,9);
                String wban= l1.substring(10,14);
		String Year = l1.substring(15,19);
                String DateMonth = l1.substring(19,22);
		String hour = l1.substring(23,26);
                String ul2 = l1.substring(26,27); //should be 27 only but it is useless so no issues
		String latitude = l1.substring(28,33);
                String longitude = l1.substring(34,40);
                String ul3 = l1.substring(41,45); 
		String elevation = l1.substring(46,50);
                String ul4 = l1.substring(51,55);
                String ul5 = l1.substring(56,59);
		String wind_direction = l1.substring(60,62);
                String qc1 = l1.substring(62,63); //should be 63 only but we are not displaying it so no issues
     		String ul6 = l1.substring(63,64); //should be 64 only but it is useless so no issues	
                String ul7 = l1.substring(65,68);
                String ul8 = l1.substring(68,69); //should be 69 only but it is useless so no issues
                String sky_cieling= l1.substring(70,74);
                String qc2 = l1.substring(74,75); //should be 75 only but we are not displaying it so no issues  
                String ul9 = l1.substring(75,76); //should be 76 only but it is useless so no issues
                String ul10 = l1.substring(76,77); //should be 77 only but it is useless so no issues
		String visibility= l1.substring(78,83); 
                String qc3 = l1.substring(83,84); //should be 84 only but we are not displaying it so no issues
                String ul11 = l1.substring(84,85); //should be 85 only but it is useless so no issues
                String ul12 = l1.substring(85,86); //should be 86 only but it is useless so no issues
                String Temp = l1.substring(87,91);
		String qc4 = l1.substring(91,92); //should be 92 only but we are not displaying it so no issues
		String dew_point = l1.substring(93,97);   
                String qc5 = l1.substring(97,98); //should be 98 only but we are not displaying it so no issues
		String atm_pressure= l1.substring(99,103);   
                String qc6 = l1.substring(103,104); //should be 104 only but we are not displaying it so no issues                        
                               
		String query = "insert into  arjweek2(ul1,usafwsi,wban,Year,DateMonth,hour,ul2,latitude,longitude,ul3,elevation,ul4,ul5,wind_direction,qc1,ul6,ul7,ul8,sky_cieling,qc2,ul9,ul10,visibility,qc3,ul11,ul12,Temp,qc4,dew_point,qc5,atm_pressure,qc6);";
		}
	}
}
