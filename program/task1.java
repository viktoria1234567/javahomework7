// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

// package program;
// public class task1{
//     public static void main(String[] args) {
//         String[] stringArray = {"first str", null, "third str"};
//         int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
//         divide(10, 0);
//         printValueIndex(array,12);
//         printStringArray(stringArray);

//     }
//     public static void divide(double firstNum, double secondNum){
//         if(secondNum ==  0) throw new ArithmeticException("На ноль делить нельзя");
//         double result = firstNum/secondNum;
//         System.out.println(result);
//     }
//     public static void printValueIndex(int[] array, int index){
//         if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
//         else System.out.println(array[index]);
//     }
//     public static void printStringArray(String[] stringArray){
//         for (String item: stringArray){
//             if(item == null) throw new NullPointerException("Элемент отсутствует");
//             System.out.println(item);
//         }
//     }
// }