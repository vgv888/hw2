public class Main {
    public static void main(String[] args) {


        //Задание 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
        //         int[] array = new int[8];
//        array[0] = 0;
//        int value = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = value;
//            value += 3;
//            System.out.println(array[i]);


        //Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
        //умножить на 2;
//        int [] arr ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        int i = 6;
//        for(i = 0; i >= 6; i--){
//        arr[i] = arr[i] * 2;
//        System.out.println(arr[i]);


        //Задание 4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;


        int counter = 1;
        int[][] table = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = counter;
                if (i == j){
                    table[i][j]  = 1;
                }
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
}















