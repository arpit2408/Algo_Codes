/**
 * 
 */
package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author arpit2408
 *
 */
public class InterviewBit_Decode_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] a= {389, 299, 65, 518, 361, 103, 342, 406, 24, 79, 192, 181, 178, 205, 38, 298, 218, 143, 446, 324, 82, 41, 312, 166, 252, 59, 91, 6, 248, 395, 157, 332, 352, 57, 106, 246, 506, 261, 16, 470, 224, 228, 286, 121, 193, 241, 203, 36, 264, 234, 386, 471, 225, 466, 81, 58, 253, 468, 31, 197, 15, 282, 334, 171, 358, 209, 213, 158, 355, 243, 75, 411, 43, 485, 291, 270, 25, 100, 194, 476, 70, 402, 403, 109, 322, 421, 313, 239, 327, 238, 257, 433, 254, 328, 163, 436, 520, 437, 392, 199, 63, 482, 222, 500, 454, 84, 265, 508, 416, 141, 447, 258, 384, 138, 47, 156, 172, 319, 137, 62, 85, 154, 97, 18, 360, 244, 272, 93, 263, 262, 266, 290, 369, 357, 176, 317, 383, 333, 204, 56, 521, 502, 326, 353, 469, 455, 190, 393, 453, 314, 480, 189, 77, 129, 439, 139, 441, 443, 351, 528, 182, 101, 501, 425, 126, 231, 445, 155, 432, 418, 95, 375, 376, 60, 271, 74, 11, 419, 488, 486, 54, 460, 321, 341, 174, 408, 131, 115, 107, 134, 448, 532, 292, 289, 320, 14, 323, 61, 481, 371, 151, 385, 325, 472, 44, 335, 431, 187, 51, 88, 105, 145, 215, 122, 162, 458, 52, 496, 277, 362, 374, 26, 211, 452, 130, 346, 10, 315, 459, 92, 531, 467, 309, 34, 281, 478, 477, 136, 519, 196, 240, 12, 288, 302, 119, 356, 503, 527, 22, 27, 55, 343, 490, 127, 444, 308, 354, 278, 497, 191, 294, 117, 1, 396, 125, 148, 285, 509, 208, 382, 297, 405, 245, 5, 330, 311, 133, 274, 275, 118, 463, 504, 39, 99, 442, 337, 169, 140, 104, 373, 221, 499, 413, 124, 510, 159, 465, 80, 276, 83, 329, 524, 255, 387, 259, 397, 491, 517, 23, 4, 230, 48, 349, 412, 142, 114, 487, 381, 164, 35, 67, 498, 73, 440, 108, 226, 96, 132, 144, 207, 235, 33, 69, 128, 236, 364, 198, 475, 173, 493, 150, 90, 515, 111, 68, 232, 340, 112, 526, 492, 512, 495, 429, 146, 336, 17, 350, 251, 7, 184, 76, 380, 359, 293, 19, 49, 345, 227, 212, 430, 89, 474, 279, 201, 398, 347, 273, 37, 185, 177, 102, 304, 295, 422, 94, 426, 514, 116, 183, 180, 494, 42, 305, 152, 390, 30, 247, 451, 32, 388, 331, 78, 424, 368, 394, 188, 306, 449, 8, 214, 120, 179, 280, 511, 409, 338, 153, 507, 370, 461, 217, 161, 483, 147, 242, 86, 417, 268, 71, 462, 420, 167, 513, 379, 307, 522, 435, 113, 296, 457, 525, 45, 529, 423, 427, 2, 438, 64, 316, 46, 40, 13, 516, 367, 233, 110, 318, 250, 283, 216, 186, 310, 237, 377, 365, 175, 479, 378, 66, 414, 473, 165, 210, 50, 348, 372, 363, 339, 20, 168, 284, 415, 505, 206, 53, 223, 434, 202, 123, 399, 400, 135, 269, 428, 219, 456, 28, 464, 267, 489, 98, 391, 195, 366, 300, 484, 533, 229, 213, 149, 160, 256, 303, 530, 301, 29, 404, 344, 401, 220, 287, 9, 407, 170, 450, 523, 249, 72, 410, 3, 21, 200, 260 };
		Integer[] b={3,1,2,5,3,6,7,8,9};
		System.out.println(repeat(Arrays.asList(a)));
		//System.out.println(repeatedNumber(Arrays.asList(b)));
	}
	/*public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    ArrayList<Integer> newlist=new ArrayList<Integer>();
	    long sum=0;
	    long sumactual=0;
	    long squaresum=0;
	    long squaresumactual=0;
	    int A=0;
	    int B=0;
	    for(int i=1;i<=a.size();i++)
	    {
	        sumactual+=i;
	        squaresumactual=(long)(squaresumactual+Math.pow(i, 2));
	    }
	    for(int i=0;i<a.size();i++)
	    {
	        sum+=a.get(i);
	        squaresum=(long)(squaresum+Math.pow(a.get(i), 2));
	    }
	    if(squaresumactual>squaresum)
	    A=(int)(squaresumactual-squaresum+(sum-sumactual))/2;
	    else
	    	A=(int)(squaresum-squaresumactual+(sum-sumactual))/2;
	    B=(int) (A-(sum-sumactual));
	    newlist.add(A);
	    newlist.add(B);
	    return newlist;
	}*/
	public static ArrayList<Integer> repeat(final List<Integer> a)
	{
		ArrayList<Integer> res = new ArrayList<>();
		   long sum = 0;
	       long squareSum = 0;
	       long temp;
	       for (int i = 0; i < a.size(); i++) {
	           temp = a.get(i);
	           sum += temp;
	           sum -= (i + 1);
	           squareSum += (temp * temp);
	           squareSum -= ((long)(i + 1) * (long)(i + 1));
	       }
	       // sum = A - B
	       // squareSum = A^2 - B^2 = (A - B)(A + B)
	       // squareSum / sum = A + B
	       squareSum /= sum;

	       // Now we have A + B and A - B. Lets figure out A and B now. 
	       int A = (int) ((sum + squareSum) / 2);
	       int B = (int)squareSum - A;
	       res.add(A);
	       res.add(B);
	       return res;

	}
	public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
	    
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    Collections.sort(A);
	    int n = A.size();
	    int rep = -1;
	    int miss = -1;
	    long sum = A.get(0);
	    
	    for (int i = 1; i < n; i++) {
	        if (A.get(i).intValue() == A.get(i - 1).intValue()) {
	            rep = A.get(i);
	        }
            sum += A.get(i);
	    }
	    
	    miss = (int) ((1L * n * (1L * n + 1)) / 2 - sum + rep);
	    
	    res.add(rep);
	    res.add(miss);
	    
	    return res;
	    
	}
	 
}
