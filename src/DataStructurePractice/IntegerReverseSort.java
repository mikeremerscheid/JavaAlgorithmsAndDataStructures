package DataStructurePractice;

public class IntegerReverseSort {

    public static void main(String[] args) {

        int[] nums = {333,400,200,55,3,17,19,103,3,2,1};
        intReverseSorter(nums);
    }

    public static void intReverseSorter(int[] intArr){

        int temp = 0;
        for (int i = 0; i < intArr.length-1; i++) {
            if(intArr[i] < intArr[i+1]){
                temp = intArr[i+1];
                intArr[i+1] = intArr[i];
                intArr[i] = temp;
                i=0;
            }
        }
        for (int i: intArr){
            System.out.println(i);
        }
    }
}
