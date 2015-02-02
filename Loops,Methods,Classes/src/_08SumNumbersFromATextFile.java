import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;




public class _08SumNumbersFromATextFile {

	public static void main(String[] args){
		String fileName="input.txt";
		ArrayList<Integer> numbers = new ArrayList<>();
		int sum = 0;
	       try{

	          FileReader inputFile = new FileReader(fileName);
	          BufferedReader bufferReader = new BufferedReader(inputFile);
	          String line;
	          while ((line = bufferReader.readLine()) != null)   {
	            numbers.add(Integer.parseInt(line));
	          }
	          bufferReader.close();
	       }catch(Exception e){
	          System.out.println("Error");                      
	       }
	       for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
	       System.out.println(sum);

		
	}
}
