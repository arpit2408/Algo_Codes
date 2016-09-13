/**
 * 
 */
package Microsoft_Probs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author arpit2408
 *
 */
public class DistinctChar {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*String line;
		try (
		    InputStream fis = new FileInputStream("src/PracticeInput.txt");
		    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		    BufferedReader br = new BufferedReader(isr);
		) {
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		}
		Charset charset = Charset.forName("US-ASCII");
		Path file="/LeetCodeProblems/src/Microsoft_Probs/PracticeInput.txt";
		try (BufferedReader reader = Files.newBufferedReader(, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}*/
		for (String line : Files.readAllLines(Paths.get("/LeetCodeProblems/src/Microsoft_Probs/PracticeInput.txt"))) {
			for (String part : line.split("\\s+")) {
			    System.out.println(part);
			}
		}

	}

}
