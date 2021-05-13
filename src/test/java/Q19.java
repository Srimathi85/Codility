/*
* 19. What is stable algorithm? write an algorithm for quicksort. sort the following using quicksort.
* is quick sort is stable algorithm. if not give reason. 50 70 10 40 50
 */
public class Q19 {
    public static int[] quickSort(int[] inArr,int iStart,int iEnd){
if (inArr.length<=0 ||inArr==null)
    throw new IllegalArgumentException("The integer Array is invalid..");
else if(iStart<iEnd) {
    int iPartitionIndex = partition(inArr, iStart, iEnd);
    partition(inArr, iStart, iPartitionIndex - 1);
    partition(inArr, iPartitionIndex + 1, iEnd);
}
    return inArr;
}
public static int partition(int[] inArr,int iStartIndex,int iEndIndex ){
    int iPivot=inArr[iEndIndex];
    int iPartitionIndex=iStartIndex-1;
    for(int index=iStartIndex;index<=iEndIndex-1;index++) {
        if (inArr[index] < iPivot) {
            iPartitionIndex++;
            swap(inArr, iPartitionIndex, index);
        }
    }
        swap(inArr,iPartitionIndex+1,iEndIndex);
        return iPartitionIndex+1;
}
public static void swap(int[] inArr,int iIndex1,int iIndex2){
         int iTemp=inArr[iIndex1];
         inArr[iIndex1]=inArr[iIndex2];
         inArr[iIndex2]=iTemp;
}
    public static void main(String[] args) {
        int[] sortedArray=quickSort(new int[]{80 ,70 ,10, 40 ,50},0,4);
        System.out.println("After sorting :");
        for (int iArrEle:sortedArray) {
            System.out.print(" "+iArrEle);
        }
    }
}
