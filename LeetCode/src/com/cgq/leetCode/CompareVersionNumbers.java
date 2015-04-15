package com.cgq.leetCode;
/**
 * @comment Compare two version numbers version1 and version2.
		If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
		
		You may assume that the version strings are non-empty and contain only digits and the . character.
		The . character does not represent a decimal point and is used to separate number sequences.
		For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
		
		Here is an example of version numbers ordering:
		
		0.1 < 1.1 < 1.2 < 13.37
 * @author cgqfzy
 * @version 1.0
 * @date Apr 14, 2015 3:50:32 PM
 * @注意要点：补全成相等长度的在比较
 */
public class CompareVersionNumbers {

	public int compareVersion(String version1, String version2) {
	    String[] levels1 = version1.split("\\.");
	    String[] levels2 = version2.split("\\.");

	    int count = 0;
	    //取最大值
	    while (count < levels1.length || count < levels2.length) {
	    	//补全长度
	    	Integer v1 = count < levels1.length ? Integer.parseInt(levels1[count]) : 0;
	        Integer v2 = count < levels2.length ? Integer.parseInt(levels2[count]) : 0;
	        int compare = v1.compareTo(v2);
	        if (compare != 0) {
	            return compare;
	        }
	        count ++;
		}
	    
	    return 0;
	}
	
}
