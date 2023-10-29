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
	
	public static int findMax(int[] intList) {
	    int rtn = 0;
	    for (int i = 0; i < intList.length; i++) {
	        if (intList[i] > rtn) {
	            rtn = intList[i];     
	        }
	    }
	    return rtn;
	}
	
	public static int findMin(int[] intList) {
	    int rtn = 0;
	    for (int i = 0; i <intList.length; i++) {
	        if (intList[i] < rtn) {
	            rtn = intList[i];
	        }
	    }
	    return rtn;
	}
	
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
	
	public static double calcAverage(int[] intList) {
	    double rtn = 0;
	    for(int i: intList) {
	        rtn += i;
	    }
	    
	    return rtn/intList.length;
	}
	
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
	
	public static int findInList(int[] theList, int valueToFind) {
	    for(int i = 0; i < theList.length; i++) {
	        if (theList[i] == valueToFind) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
	
	public static int findInList(int[] theList, int valueToFind, int startingIndex) {
	    for(int i = startingIndex; i < theList.length; i++) {
	        if (theList[i] == valueToFind) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
	
	public static int findInList(String[] theList, String valueToFind) {
	    for(int i = 0; i < theList.length; i++) {
	        if (theList[i] == valueToFind) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
	
	public static int findInList(String[] theList, String valueToFind, int startingIndex) {
	    for(int i = startingIndex; i < theList.length; i++) {
	        if (theList[i] == valueToFind) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
}
