
package analysis0falgo;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author arpit2408
 *
 */
public class CodingaStringHuffmanCode {

	/**
	 * @param args
	 */
	static HashMap<Character,Double> charprobfreq=new HashMap<Character,Double>();
	public static void main(String[] args) {
		int sum=0;
		int spacecount=0;
		int linecount=0;
		HashMap<Character,Integer> charprob=new HashMap<Character,Integer>();
		
		try {
			for(String line:Files.readAllLines(Paths.get("src/StringEncode.txt")))
			{
				linecount++;
				for(String part:line.split("\\s+"))
				{
					spacecount++;
					for(int i=0;i<part.length();i++)
					{
						Character c=part.charAt(i);
						if(charprob.containsKey(c))
						{
							int frequency=charprob.get(c);
							frequency++;
							charprob.put(c, frequency);
							sum++;
						}
						else
						{
							charprob.put(c, 1);
							sum++;
						}
					}
				}
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		charprob.put(' ',spacecount-linecount);
		double sumofprobability=0.0;
		for(Character c:charprob.keySet())
		{
			double charprobability=(double)charprob.get(c)/sum;
			BigDecimal bd=new BigDecimal(charprobability);
			bd.setScale(2, RoundingMode.HALF_UP);
			charprobfreq.put(c, bd.doubleValue());
			sumofprobability+=bd.doubleValue();
			System.out.print(c+"  "+charprobfreq.get(c));
		}
		
		charprobfreq = sortByValues(charprobfreq);; 
		System.out.println();
		System.out.println(charprobfreq);
		System.out.println("Sum"+sum);
		System.out.println("sumofprobability"+sumofprobability);
		NodeTree root1;
		NodeTree root2;
		int counter=0;
		double first2min=0.0;
		for(Character c:charprobfreq.keySet())
		{
			if(counter==1)
			{
				root1=new NodeTree(c);
				first2min+=charprobfreq.get(c);
				counter++;
			}
			if(counter==2)
			{
				root2=new NodeTree(c);
				counter++;
				first2min+=charprobfreq.get(c);
			}
			else
			{
				findminimum(first2min);
			}
		}
		
	}
	public static void findminimum(double numberadded)
	{
		
	}
	public static void addNode(Character c,NodeTree root)
	{
		NodeTree newNode=new NodeTree(c);	
		if(root == null)
		{
			root=new NodeTree(c);
		}
		else
		{
			NodeTree focusNode = root;
			NodeTree parent;
			while(true)
			{
				parent=focusNode;
				if(charprobfreq.get(c)<charprobfreq.get(focusNode.data))
					{
						focusNode = focusNode.left;
						if(focusNode==null)
						{
							parent.left=newNode;
							break;
						}
					}
				else
				{
					focusNode=focusNode.right;
					if(focusNode == null)
					{
						parent.right=newNode;
						break;
					}
				}
			}
		}		
	
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static HashMap<Character,Double> sortByValues(HashMap<Character,Double> map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	}
	
}
class NodeTree
{
    Character data;
    NodeTree left;
    NodeTree right;
    NodeTree(Character data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}


