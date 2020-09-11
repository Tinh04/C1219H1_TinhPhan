package B2_ArrayAndMethodInJava.Practices.FindingTheSmallestValue;

public class FindingTheSmallestValue {
    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int []arr = {6, 24, 7, 32, 4};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
