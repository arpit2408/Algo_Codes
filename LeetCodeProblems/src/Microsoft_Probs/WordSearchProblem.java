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
public class WordSearchProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Character[][] words=new Character[100][100];
		ArrayList<String> dicwords=new ArrayList<>();
		ArrayList<String> puzzlewords=new ArrayList<>();
		try {
			for (String line : Files.readAllLines(Paths.get("src/DictionaryWords.txt"))) {
				for (String part : line.split("\\s+")) {
					dicwords.add(part.trim());
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		int i=0;
		int j=0;
		try {
			for (String line : Files.readAllLines(Paths.get("src/WordSearch.txt"))) {
				j=0;
				for (String part : line.split("\\s+")) {
					words[i][j]=part.trim().charAt(0);
					j++;
				}
				i++;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		int verticallength=i;
		int horizontallength=j;
		StringBuilder wordmaker=new StringBuilder();
		for(i=0;i<verticallength;i++)
		{
			for(j=0;j<horizontallength;j++)
			{
				wordmaker.append(words[i][j]);
				if(dicwords.contains(wordmaker.toString()))
				{
					puzzlewords.add(wordmaker.toString());
				}
			}
			wordmaker.setLength(0);
			for(j=horizontallength-1;j>=0;j--)
			{
				wordmaker.append(words[i][j]);
				if(dicwords.contains(wordmaker.toString()))
				{
					puzzlewords.add(wordmaker.toString());
				}
			}
			wordmaker.setLength(0);
			for(int k=0;k<verticallength;k++)
			{
				wordmaker.append(words[k][i]);
				if(dicwords.contains(wordmaker.toString().toLowerCase()))
				{
					puzzlewords.add(wordmaker.toString());
				}
			}
			wordmaker.setLength(0);
			for(int k=verticallength-1;k>=0;k--)
			{
				wordmaker.append(words[k][i]);
				if(dicwords.contains(wordmaker.toString().toLowerCase()))
				{
					puzzlewords.add(wordmaker.toString());
				}
			}
			wordmaker.setLength(0);
		}
		for(String element:puzzlewords)
		{
			System.out.println(element);
		}
		

	}

}
