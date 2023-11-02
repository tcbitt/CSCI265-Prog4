'''
Name: Travis Bittner 
Email: travis.bittner@und.edu

Python program to manipulate arrays using the given functions
'''

'''
findMax function - iterates through the list and returns the largest value

Parameters - an integer list

Return value - an integer, the largest value in the list
'''
def findMax(theList):
    if (len(theList) == 0):
        return -1
    
    rtn = theList[0]
    for x in theList:
        if x > rtn:
            rtn = x
    return rtn

'''
findMin function - Iterates through the list and returns the smallest value

Parameters - an integer list

Return value - an integer, the smallest value in the list
'''
def findMin(intList):
    if (len(intList) == 0):
        return -1
    rtn = intList[0]
    for x in intList:
        if x < rtn:
            rtn = x
    return rtn

'''
adjustList function - iterates through the list and changes the values to the low or high limit
                      depending if its less than or greater than, respectively.

Parameters - an integer list; two integers, a low and high limit

Return value - void, just modifies the list 
'''
def adjustList(theList, lowLimit, highLimit):
    for x in range(len(theList)):
        if theList[x] < lowLimit:
            theList[x] = lowLimit
        elif theList[x] > highLimit:
            theList[x] = highLimit

'''
calcAverage function - iterates through the list and accumulates the total, then returns
                       that value divided by the length of the list as a float.

Parameters - an integer list

Return value - a float, the average of the numbers in the list                
'''
def calcAverage(intList):
    total = 0
    for x in intList:
        total += x
    return total/len(intList)

'''
mergeList function - returns the two input lists added together

Parameters - two integer lists

Return value - an integer list consisting of all the values of both the input lists
'''
def mergeLists(list1, list2):
    return list1+list2

'''
valuesWithinRange function - Returns a list of the integers within the given range 
                             and input integer list.

Parameters - an integer list; two integers, a low and high limit

Return value - an integer list consisting of values between the low and high limit from
               the input list.
'''
def valuesWithinRange(theList, lowLimit, highLimit):
    rtnList = []
    for x in theList:
        if x >= lowLimit and x <= highLimit:
            rtnList.append(x)
    return rtnList

'''
findInList function - Returns an index of an input value in the list, has the option to choose 
                      a starting index as well. Returns -1 if not in the list.

Parameters - an integer list and a value to find; a starting index within the list is optional.

Return value - an integer, the index of the value within the list.
'''
def findInList(scoresList, valueToFind, startingIndex=0):
    rtn = -1
    for startingIndex in range(len(scoresList)):
        if scoresList[startingIndex] == valueToFind:
            return startingIndex
    return rtn

def main():
    strTestList = ["2" , "44", "5", "234", "-5", "3"]
    testList = [2,44,5,234,-5,3]
    testList2 = [2,44,5,234,-5,3]
    print(findMax(testList))
    print(findMin(testList))
    adjustList(testList2, 3, 5)
    print(testList2)    
    print(calcAverage(testList2))
    print(calcAverage(testList))
    testList3 = mergeLists(testList, testList2)
    print(testList3)
    testList4 = valuesWithinRange(testList, 3, 6)
    print(testList4)
    print(findInList(testList, 5))
    print(findInList(testList, -5))
    print(findInList(strTestList, "5"))
    print(findInList(strTestList, "-5"))

if __name__ == '__main__':    
    main()
