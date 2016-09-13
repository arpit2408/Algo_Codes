/**
 * 
 */
package Microsoft_Probs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author arpit2408
 *
 */
public class NHighestOccurChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
		
		try {
			for (String line : Files.readAllLines(Paths.get("src/Randomwords.txt"))) {
				for (String part : line.split("\\s+")) {
				    words.add(part);
				}
			}
			HighesOccuringChar(12,words);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void HighesOccuringChar(int n,ArrayList<String> words )
	{
		HashMap<Integer,String> frequnencyofwords=new HashMap<>();
		int counter=0;
		for(String s:words)
		{
			counter=0;
			for(String sub:words)
				if(s.equals(sub))
					counter++;
			frequnencyofwords.put(counter,s);
		}
		Set<Integer> keys=frequnencyofwords.keySet();
		ArrayList<Integer> sortedkeys=new ArrayList<Integer>(keys);
		Collections.sort(sortedkeys);
		for(int i=0;i<16;i++)
		{
			System.out.println(frequnencyofwords.get(sortedkeys.get(sortedkeys.size()-1-i)));
		}

	
	}

}
