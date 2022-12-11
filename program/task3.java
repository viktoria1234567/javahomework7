// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. 
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше


package program;

public class task3{
    public static void main(String[] args) {
        System.out.println(getArray(new int[]{4,5,6}, new int[]{1,2,3}));
}
    public static double[] getArray(int[] array1, int[] array2){
        if (array1.length != array2.length){
            throw new RuntimeException("Массивы не равны");
        }
        if(array1 == null  || array2 == null){
            throw new RuntimeException("Элемент отсутствует");
        }
        double[] result = new double[array1.length];
        for(int i=0; i < result.length; i++){
            volid(array2[i]);
            result[i] = array1[i]/array2[i];    
        }
        return result;
}
    private static void volid(int number){
        if (number == 0){
            throw new RuntimeException("На ноль делить нельзя");
        }
}
}