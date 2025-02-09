package BaizhanTest.SuanFa;

import java.util.Arrays;

public class TestBufferSort {
    public static void main(String[] args) {
        int[ ] values = { 3, 1, 6, 8, 9, 0, 7, 4, 5, 2 };
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }

    public static void bubbleSort(int[ ] values) {
        int temp;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
            System.out.println("第" + (i+1) + "次排序" + Arrays.toString(values));
        }
    }


}
