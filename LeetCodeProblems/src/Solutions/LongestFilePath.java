/**
 * 
 */
package Solutions;

/**
 * @author arpit2408
 *
 */
public class LongestFilePath {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		String[] splitstr=str.split("\n");
		int biggestfilenumber=0;
		int biggestsubdir=0;
		String filename="";
		String biggestsubdirname="";
		for(String ele:splitstr)
		{
			String[] name=ele.split("\t");
			System.out.println(name[name.length-1]);
			if(name[name.length-1].contains("sub"))
			{
				String[] subdir=name[name.length-1].split("sub");
				int number=Integer.parseInt(subdir[subdir.length-1].substring(3, subdir[subdir.length-1].length()));
				if(number>biggestsubdir)
				{
					biggestsubdir=number;
					biggestsubdirname=name[name.length-1];
				}
			}
			else if(name[name.length-1].contains("file"))
			{
				String[] number=name[name.length-1].split("file");
				if(number.length>1)
				{
					if(Character.getNumericValue(number[1].charAt(0))>biggestfilenumber)
					{
						biggestfilenumber=Character.getNumericValue(number[1].charAt(0));
						filename=name[name.length-1];
					}
				}
			}
			
		}
		if(biggestsubdir==biggestfilenumber)
		{
			StringBuilder makesubdirstr=new StringBuilder();
			for(int i=0;i<biggestfilenumber;i++)
			{
				makesubdirstr.append(str);
			}
			String biggestpath="dir/"+"subdir2/"+biggestsubdirname+"/file"+biggestfilenumber+".ext";
			System.out.println("successful");
		}
		//System.out.println("Biggest"+biggest);
	}

}
