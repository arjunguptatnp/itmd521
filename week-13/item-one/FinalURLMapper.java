//Made by Arjun

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class FinalURLMapper
  extends Mapper<LongWritable, Text, Text, Text> {

	
  public void map(LongWritable key,Text value, Context context)
      throws IOException, InterruptedException {
String[] line1= null;
String line2 = value.toString();
line1=line2.split("\\s+");

String month, quality;
String URL="";
try{
	      month=line1[0];
	     quality=line1[10];
		
    if (quality.matches("200") && URL!="/index.*") {
    	
		 URL= line1[4];
   context.write(new Text(month), new Text(URL));  
}
}
catch(StringIndexOutOfBoundsException ex){
	 month = " ";
	 URL =" ";
	 quality = " ";
}
catch(ArrayIndexOutOfBoundsException Ex){
	month = " ";
	URL =" ";
	quality = " ";
}

}
}

