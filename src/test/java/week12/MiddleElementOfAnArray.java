package week12;

public class MiddleElementOfAnArray {

    public String getMiddleElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (arr.length % 2 == 1) {
            return "" + arr[arr.length / 2];
        } else {
            return arr[(arr.length / 2) - 1] + "," + arr[arr.length / 2];
        }
    }

    public static void main(String[] args) {
        MiddleElementOfAnArray middleElementOfAnArray=new MiddleElementOfAnArray();

    }
}
