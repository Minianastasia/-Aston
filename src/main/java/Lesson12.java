public class Lesson12 {


    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message); // Передача сообщения в конструктор родительского класса Exception
        }
    }


    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message); // Передача сообщения в конструктор родительского класса Exception
        }
    }

    // Метод для обработки массива
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверяем размер массива
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4!");
        }

        int sum = 0;
        // Проходим по массиву и пытаемся преобразовать строки в числа
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке: [" + i + "][" + j + "] – не число");
                }
            }
        }

        return sum;
    }

    // Главный метод программы
    public static void main(String[] args) {
        // Пример массива с ошибкой в данных
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "тут"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}  // Здесь ошибка
        };

        try {
            int result = processArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
