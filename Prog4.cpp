/*
Name: Travis Bittner
Email: travis.bittner@und.edu

C++ program that modifies arrays using a variety of functions
*/
#include <iostream>

int findMax(int, int[]);
int findMin(int, int[]);
void adjustList(int, int[], int, int);
double calcAverage(int, int[]);
int* mergeLists(int, int[], int, int[]);
int* valuesWithinRange(int, int[], int, int);
int findInList(int, int[], int);
int findInList(int, int[], int, int);
int findInList(int, std::string[], std::string);
int findInList(int, std::string[], std::string, int);

#ifndef COMPILE_MAIN
int main() {
    
    std::string strArr[] = {"0", "7", "7", "4", "12", "10033", "45", "34", "-1", "3"};
    int arr1[10] = {0,7,7,4,12,10033,45,34,-1,3};
    int arr[10] = {0,7,7,4,12,10033,45,34,-1,3};
    std::cout<< findMax(10, arr) << std::endl;
    std::cout<< findMin(10, arr) << std::endl;
    adjustList(10, arr1, 3, 12);
    std::cout << calcAverage(10, arr) << std::endl;
    std::cout << calcAverage(10, arr1) << std::endl;
    
    //Test to check merged list
    int* mergePtr = mergeLists(10, arr, 10, arr1);
    for(int i = 0; i < 20; i++)
        std::cout << *(mergePtr+i) << " ";
    
    std::cout<<std::endl;
    
    //Test to check list range
    //Having to hard code iteration count to check if the array fills properly
    int* rangePtr = valuesWithinRange(10, arr1, 0, 4);
    for(int i = 0; i < 4; i++)
        std::cout << *(rangePtr+i) << " ";
    
    std::cout << std::endl << findInList(10, arr, 7) << std::endl;
    std::cout << findInList(10, arr1, 3, 4) << std::endl;
    
    std::cout<< findInList(10, strArr, "34") << std::endl;
    std::cout<< findInList(10, strArr, "12", 2);
    
    delete mergePtr;
    delete rangePtr;
    return 0;
}
#endif
/*
findMax function - iterates through the integer array to find the largest number
                   and returns it.

Parameters - and integer for size, and an integer array.

Return value- an integer, the largest number in the array
*/    
int findMax(int size, int intList[]) {
    int rtn = -1;
    for (int i = 0; i < size; i++)
        if (intList[i] > rtn)
            rtn = intList[i];

    return rtn;
}
/*
findMin function - iterates through the integer array to find the smallest number
                   and returns it.

Parameters - and integer for size, and an integer array.

Return value- an integer, the smallest number in the array
*/
int findMin(int size, int intList[]) {
    int rtn = intList[0];
    if (size == 0)
        return rtn;

    for (int i = 0; i < size; i++)
        if (intList[i] < rtn)
            rtn = intList[i];

    return rtn;
}
/*
adjustList function - Takes two values, an upper and lower limit, and converts
                      any number that is less than or greater than the limit
                      to that respective number.

Parameters - three integers, size and the low/high limits

Return value - void
*/
void adjustList(int size, int theList[], int lowLimit, int highLimit) {
    for (int i = 0; i < size; i++) {
        if(theList[i] < lowLimit)
            theList[i] = lowLimit;
    
        else if (theList[i] > highLimit)
            theList[i] = highLimit;
    }
}
/*
calcAverage function - Iterates through the integer array and sums up all the values.
                       Then it returns the sum/size as a double.

Parameters - an integer, the size; an integer array.

Return value - a double, the average of the integers.
*/    
double calcAverage (int size, int intList[]){
    double rtn = 0;
    for (int i = 0; i < size; i++)
        rtn += intList[i];
        
    return (rtn/size);    
}
/*
mergeLists function - This creates a new array in memory the size of both input arrays and fills it
                      with their values consecutively.

Parameters - two integers, the sizes of the arrays; two integer arrays.

Return value - a pointer to an integer, the first value in the new merged array.
*/    
int* mergeLists (int size1, int list1[], int size2, int list2[]){
    int* rtnArr = new int[size1+size2];
    for (int i =  0; i < size1; i++)
        rtnArr[i] = list1[i];
    
    for (int i = 0; i < size2; i++)
        rtnArr[i+size1] = list2[i];
        
    return rtnArr;
}
/*
valuesWithinRange function - Uses two for loops, one to find the size of the value range array;
                             One to populate the array with the values within the range from
                             the input array.

Parameters - three integers, the array size and low/high limits; an integer array.

Return value - a pointer to an integer, the new array containing only the values within the range.
*/    
int* valuesWithinRange(int size, int theList[], int lowLimit, int highLimit){
    int newArrSize = 0, newArrIndex = 0;
    for (int i = 0; i < size; i++)
        if (theList[i] >= lowLimit && theList[i] <= highLimit)
            newArrSize++;
    
    int* rtnArr = new int[newArrIndex];
    for (int i = 0; i < size; i++)
        if (theList[i] >= lowLimit && theList[i] <= highLimit){
            rtnArr[newArrIndex] = theList[i];
            newArrIndex++;
        }
        
    return rtnArr;
}
/*
findInList function - Iterates through the interger array to find the value requested, return -1 if not found

Parameters - two integers, the size of the array and the value to find in the array; an integer array.

Return value - an integer, the index of the value requested.
*/    
int findInList(int size, int theList[], int valueToFind){
    for (int i = 0; i < size; i++)
        if (theList[i] == valueToFind)
            return i;
    
    return -1;        
}
/*
findInList function - Iterates through the integer array to find the value requested, overloaded to allow the user
                      to choose a starting index. Return -1 if not found.

Parameters - three integers, the size of the array,the value to find in the array, and a starting index in the array
             ; an integer array.

Return value - an integer, the index of the value requested.
*/
int findInList(int size, int theList[], int valueToFind, int startingIndex){
    for(int i = startingIndex; i < size; i++)
        if(theList[i] == valueToFind)
            return i;
    
    return -1;
}
/*
findInList function - Iterates through the string array to find the value requested, return -1 if not found.

Parameters - an integer and a string, the size of the array and the value to find; a string array.

Return value - an integer, the index of the value requested.
*/
int findInList(int size, std::string theList[], std::string valueToFind){
    for (int i = 0; i < size; i++)
        if (theList[i] == valueToFind)
            return i;
    
    return -1;
}
/*
findInList function - Iterates through the string array to find the value requested, overloaded to allow the user
                      to choose a starting index. Return -1 if not found.

Parameters - two integers and a string, the size of the array,the value to find in the array, and a starting index in the array
             ; an integer array.

Return value - an integer, the index of the value requested.
*/
int findInList(int size, std::string theList[], std::string valueToFind, int startingIndex){
    for(int i = startingIndex; i < size; i++)
        if(theList[i] == valueToFind)
            return i;
    
    return -1;
}
