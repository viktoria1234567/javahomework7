// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. Вместо массива может прийти null (обработать)

// package program;

// public class task2 {
//     public static void main(String[] args) {
//         System.out.println(getArray(new int[]{4,5,6}, new int[]{1,2,3}));
// }
//     public static int[] getArray(int[] array1, int[] array2){
//         if (array1.length != array2.length){
//             throw new RuntimeException("Массивы не равны");
//         }
//         if(array1 == null  || array2 == null){
//             throw new NullPointerException("Элемент отсутствует");
//         }
//         int[] result = new int[array1.length];
//         for(int i=0; i < result.length; i++){
//             result[i] = array1[i] - array2[i];    
//         }
//         return result;
// }
// }