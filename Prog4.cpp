
#include <iostream>

int findMax(int, int[]);
int findMin(int, int[]);
void adjustList(int, int[], int, int);
double calcAverage(int, int[]);
int* mergeLists(int, int[], int, int[]);
int* valuesWithinRange(int, int[], int, int);

int main()
{
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
        std::cout << *(mregePtr+i) << " ";
    
    //Test to check list range
    int* rangePtr = valuesWithinRange(10, arr1, 0, 4);
    for(int i = 0; i < 10)
        
    delete ptr;
    return 0;
}

int findMax(int size, int intList[]) {
    int rtn = -1;
    for (int i = 0; i < size; i++)
        if (intList[i] > rtn)
            rtn = intList[i];

    return rtn;
}

int findMin(int size, int intList[]) {
    int rtn = intList[0];
    for (int i = 0; i < size; i++)
        if (intList[i] < rtn)
            rtn = intList[i];

    return rtn;
}

void adjustList(int size, int theList[], int lowLimit, int highLimit) {
    for (int i = 0; i < size; i++) {
        if(theList[i] < lowLimit)
            theList[i] = lowLimit;
    
        else if (theList[i] > highLimit)
            theList[i] = highLimit;
    }
}

double calcAverage (int size, int intList[]){
    double rtn = 0;
    for (int i = 0; i < size; i++)
        rtn += intList[i];
        
    return (rtn/size);    
}

int* mergeLists (int size1, int list1[], int size2, int list2[]){
    int* rtnArr = new int[size1+size2];
    for (int i =  0; i < size1; i++)
        rtnArr[i] = list1[i];
    
    for (int i = 0; i < size2; i++)
        rtnArr[i+size1] = list2[i];
        
    return rtnArr;
}

int* valuesWithinRange(int size, int theList[], int lowLimit, int highLimit){
    int newArrSize = 0, newArrIndex = 0;
    for (int i = 0; i < size; i++)
        if (theList[i] > lowLimit && theList[i] < highLimit)
            newArrSize++;
    
    int* rtnArr = new int[count];
    for (int i = 0; i < size; i++)
        if (theList[i] > lowLimit && theList[i] < highLimit){
            rtnArr[newArrIndex] = theList[i];
            newArrIndex++;
        }
        
    return rtnArr;
}


int findInList(int size, int theList[], int valueToFind){
    
}

int findInList(int size, int theList[], int valueToFind, int startingIndex){
    
}
