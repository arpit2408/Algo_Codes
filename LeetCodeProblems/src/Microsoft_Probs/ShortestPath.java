/**
 * 
 */
package Microsoft_Probs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @author arpit2408
 *
 */
public class ShortestPath {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		boolean flag=true;
		int numberofcases=0;
		ArrayList<String> totallines=new ArrayList<String>();
		ArrayList<String> totalcase=new ArrayList<String>();
		ArrayList<ArrayList<String>> totalcases =new ArrayList<ArrayList<String>>();
		for (String line : Files.readAllLines(Paths.get("src/ShortestPath.txt"))) {
			//System.out.println(line);
			if(flag)
			{
				numberofcases=Integer.parseInt(line);
				flag=false;
				totallines.add(line);
			}
			else
			{
				totallines.add(line);
			}
		}
		int sizeofcase=0;
		int l=0;
		boolean checkforfirst=true;
		for(int i=2;i<totallines.size();i=i+l)
		{
			totalcase.clear();
			if(checkforfirst)
			{
				sizeofcase=Integer.parseInt(totallines.get(l+2));
				checkforfirst=false;
			}
			else
			{
				sizeofcase=Integer.parseInt(totallines.get(3+l+2));
			}
			for(int j=0;j<sizeofcase;j++)
			{
				totalcase.add(totallines.get(l+2));
				l++;
			}
			totalcases.add(totalcase);
			if(totalcases.size()==numberofcases)
			{
				System.out.println("totalcases.size()"+totalcases.size());
				break;
			}
		}
		for(ArrayList<String> str:totalcases)
		{
			for(String s:str)
				System.out.println(s);
			System.out.println();
		}
		
	}
}
