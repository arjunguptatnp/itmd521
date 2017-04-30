//Made by Arjun
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class FinalURLReducer 
  extends Reducer<Text, Text, Text, Text> {
public static String sort(ArrayList <String> list){
	String maximum = null;
	
	
	Map<String, Integer> map = new HashMap<String, Integer>();

	for(int i = 0; i < list.size(); i++){
	   if(map.get(list.get(i)) == null){
	      map.put(list.get(i),1);
	   }else{
	      map.put(list.get(i), map.get(list.get(i)) + 1);
	   }
	}
	int large = 0;
	for (Entry<String, Integer> entry : map.entrySet()) {
	   String key = entry.getKey();
	   int value = entry.getValue();
	   if( value > large){
	      large = value;
	   }
	}
	ArrayList<Object> a1 = new ArrayList<Object>();
	for (Entry<String, Integer> entry : map.entrySet()) {
	   String key = entry.getKey();
	   int value = entry.getValue();
	   if( value == large){
	       a1.add(key);
	      // System.out.println(a1);
	       for (int k =0 ; k < a1.size(); k++){
	    	   maximum = (String) a1.get(k);
	    	   
	       }
	   }
	}
	
	return maximum;
	}
  public void reduce(Text key, Iterable<Text> values,
      Context context)
      throws IOException, InterruptedException {
String maximum = null;
ArrayList<String> URL = new ArrayList<String>();
// while(values.hasNext()) 
for (Text value : values){
//String value = values.toString();
 
     URL.add(value.toString());
    }

        maximum =sort(URL);

    context.write(key, new Text(maximum));
  }

}

