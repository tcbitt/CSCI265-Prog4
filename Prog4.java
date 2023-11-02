/*
Name: Travis Bittner
Email: travis.bittner@und.edu

Java array manipulation program
*/
public class Prog4
{
	public static void main(String[] args) {
		int ar[] = {1,4,4,672,74,2,9,-4,-33};
		int ar2[] = {1,4,4,672,74,2,9,-4,-33, 12, -4, 11};
		System.out.println(findMax(ar));
		System.out.println(findMin(ar));
		adjustList(ar2, 4, 10);
		
		for(int i:ar2){
		System.out.print(i + " ");
		}
		
		System.out.println("\n" + calcAverage(ar));
		
		int ar3[] = mergeLists(ar, ar2);
		
		for(int i: ar3){
		    System.out.print(i + " ");
		}
		
		int ar4[] = valuesWithinRange(ar, -5, 5);
		System.out.println();
		
		for(int i: ar4){
		    System.out.print(i + " ");
		}
		
		String[] strArr = {"1", "4", "4", "672", "74", "2", "9", "-4", "-33"};
		
		System.out.println("\n" + findInList(ar, -4));
		System.out.println(findInList(strArr, "-4"));
		System.out.println(findInList(ar3, 10, 5));
		System.out.println(findInList(ar3, 10));
		System.out.println(findInList(strArr, "9", 5));
		System.out.println(findInList(strArr, "10", 5));
    }
	/*
	findMax function - iterates through the integer array to find the largest number
                   and returns it.

	Parameters - an integer array.

	Return value- an integer, the largest number in the array
	*/  
	public static int findMax(int[] intList) {
	    if (intList.length == 0) {
		    return -1;
	    }
		
	    int rtn = intList[0];
	    for (int i = 0; i < intList.length; i++) {
	        if (intList[i] > rtn) {
	            rtn = intList[i];     
	        }
	    }
	    return rtn;
	}
	/*
	findMin function - iterates through the integer array to find the smallest number
                   and returns it.

	Parameters - an integer array.

	Return value- an integer, the smallest number in the array
	*/
	public static int findMin(int[] intList) {
	    if (intList.length == 0) {
	    	return -1;
	    }
		
	    int rtn = intList[0];
	    for (int i = 0; i <intList.length; i++) {
	        if (intList[i] < rtn) {
	            rtn = intList[i];
	        }
	    }
	    return rtn;
	}
	/*
	adjustList function - Takes two values, an upper and lower limit, and converts
                      any number that is less than or greater than the limit
                      to that respective number.

	Parameters - two integers, low and high limits; an integer array

	Return value - void
*/
	public static void adjustList(int [] theList, int lowLimit, int highLimit) {
	    for (int i = 0; i < theList.length; i++) {
	        if (theList[i] < lowLimit) {
	            theList[i] = lowLimit;
	        }
	        else if (theList[i] > highLimit) {
	            theList[i] = highLimit;
	        }
	    }
	}
	/*
	calcAverage function - Iterates through the integer array and sums up all the values.
                       Then it returns the sum/size as a double.

	Parameters - an integer array.

	Return value - a double, the average of the integers.
	*/
	public static double calcAverage(int[] intList) {
	    double rtn = 0;
	    for(int i: intList) {
	        rtn += i;
	    }
	    
	    return rtn/intList.length;
	}
	/*
	mergeLists function - This creates a new array the size of both input arrays and fills it
                      with their values consecutively.

	Parameters - two integer arrays.
	
	Return value - an integer array, the new merged array.
	*/
	public static int[] mergeLists (int[] list1, int[] list2) {
	    int[] rtnArr = new int[list1.length + list2.length];
	    
	    for(int i = 0; i < list1.length; i++) {
	        rtnArr[i] = list1[i];
	    }
	    
	    for(int i = 0; i < list2.length; i++) {
	        rtnArr[i + list1.length] = list2[i];
	    }
	    
	    return rtnArr;
	}
	/*
	valuesWithinRange function - Uses two for loops, one to find the size of the value range array;
                             One to populate the array with the values within the range from
                             the input array.

	Parameters - two integers, low/high limits; an integer array.

	Return value - an integer array, containing only the values within the range.
	*/   
	public static int[] valuesWithinRange (int[] theList, int lowLimit, int highLimit) {
	    int rtnArrIndex = 0, rtnArrSize = 0;
	    for(int i: theList){
	        if (i >= lowLimit && i <= highLimit) {
	            rtnArrSize++;
	        }
	    }
	    int rtnArr[] = new int[rtnArrSize];
	    
	    for(int j: theList){
	        if (j >= lowLimit && j <= highLimit) {
	            rtnArr[rtnArrIndex] = j;
	            rtnArrIndex++;
	        }
	    }
	    
	    return rtnArr;
	    
	}
	/*
	findInList function - Iterates through the interger array to find the value requested, return -1 if not found

	Parameters - an integer, the value to find in the array; an integer array.

	Return value - an integer, the index of the value requested.
	*/  
	public static int findInList(int[] theList, int valueToFind) {
	    for(int i = 0; i < theList.length; i++) {
	        if (theList[i] == valueToFind) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
	/*
	findInList function - Iterates through the interger array to find the value requested has the option to use
 			      a starting index, return -1 if not found

	Parameters - an integer, the value to find in the array; an integer array; an optional integer, a starting index.

	Return value - an integer, the index of the value requested.
	*/  
	public static int findInList(int[] theList, int valueToFind, int startingIndex) {
	    for(int i = startingIndex; i < theList.length; i++) {
	        if (theList[i] == valueToFind) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
	/*
	findInList function - Iterates through the string array to find the value requested, return -1 if not found.

	Parameters - an integer and a string, the size of the array and the value to find; a string array.

	Return value - an integer, the index of the value requested.
	*/
	public static int findInList(String[] theList, String valueToFind) {
	    for(int i = 0; i < theList.length; i++) {
	        if (theList[i] == valueToFind) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
	/*
	findInList function - Iterates through the string array to find the value requested has the option to use
  			      a starting index, return -1 if not found.

	Parameters - a string, the value to find; a string array; an optional integer, a starting index.

	Return value - an integer, the index of the value requested.
	*/
	public static int findInList(String[] theList, String valueToFind, int startingIndex) {
	    for(int i = startingIndex; i < theList.length; i++) {
	        if (theList[i] == valueToFind) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
}
