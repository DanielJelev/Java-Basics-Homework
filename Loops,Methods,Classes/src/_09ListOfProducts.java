import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

import javafx.util.converter.NumberStringConverter;


public class _09ListOfProducts {

	public static void main(String[] args) {
		String fileName="listOfProducts.txt";
		TreeMap<Double, String> sortedValues= new TreeMap<>();
		int sum = 0;
	       try{

	          FileReader inputFile = new FileReader(fileName);
	          BufferedReader bufferReader = new BufferedReader(inputFile);
	          String line;
	          while ((line = bufferReader.readLine()) != null)   {
	        	  String[] elements = line.split(" ");
	        	  String products = elements[0];
	        	  double price = Double.parseDouble(elements[1]);
	        	  sortedValues.put(price, products);
	          }
	          bufferReader.close();
	       }catch(Exception e){
	          System.out.println("Error");                      
	       }
	       Set<Double> keys = sortedValues.keySet();
	       for (Double key : keys) {
			System.out.println(key+" "+sortedValues.get(key));
		}
	}
}
