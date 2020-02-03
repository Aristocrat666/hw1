    public class Main {

        public static void main(String[] args) {

            String[][] arr = new String[][]{
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "ц"}};
            try {
                try {
                    int result = method(arr);
                    System.out.println(result);
                } catch (MyArraySizeException e) {
                    System.out.println("Размер привышен");
                }
            }
            catch (MyArrayDataException e) {
                 System.out.println("Некорректное значение");
                System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
            }
        }

        public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
            int count = 0;
            if (arr.length != 4) {
                throw new MyArraySizeException("Warning");
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException("Warning, массив имеет некорректный формат, нужно 4х4");
                }
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        count = count + Integer.parseInt(arr[i][j]);
                    }
                    catch (NumberFormatException e) {
                        e.printStackTrace();
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            return count;
        }

    }

