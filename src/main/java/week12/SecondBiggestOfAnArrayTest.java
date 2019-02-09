package week12;

public class SecondBiggestOfAnArrayTest {

    public int getSecondBiggest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[1];
    }

    public static void main(String[] args) {
        SecondBiggestOfAnArrayTest secondBiggestOfAnArrayTest = new SecondBiggestOfAnArrayTest();
        int[] array = {2, 16, 15, 4, 12, 65};
        int result = secondBiggestOfAnArrayTest.getSecondBiggest(array);
        System.out.println(result);
    }
}
