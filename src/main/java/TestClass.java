import java.lang.reflect.Array;

public class TestClass {

    Array array;
    static int j = 0, k = 0, tmp, tmpArraySize = 0, z = 0;

    public static void main(String[] arg) {
//        int temp= new int[];
        int[] data = {1, 2, 5, 1, 2, 10, 123, 124, 7, 3};

        String s = "Given Input";
        System.out.println(s);

        shortArray(data);

      /*  for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                tmpArraySize++;
            }
        }
        dataEvenNumber = new int[tmpArraySize];
        dataPosition = new int[tmpArraySize];

        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                dataEvenNumber[j++] = data[i];
                dataPosition[k++] = i;
            }
        }
        System.out.println("Before Shorting Array : ");

        for (int i = 0; i < dataEvenNumber.length; i++) {
            System.out.print(dataEvenNumber[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < dataEvenNumber.length; i++) {
            for (int l = i + 1; l < dataEvenNumber.length; l++) {
                if (dataEvenNumber[i] > dataEvenNumber[l]) {
                    tmp = dataEvenNumber[i];
                    dataEvenNumber[i] = dataEvenNumber[l];
                    dataEvenNumber[l] = tmp;
                }
            }
        }
        System.out.println("Shorted Array : ");

        for (int i = 0; i < dataEvenNumber.length; i++) {
            System.out.print(dataEvenNumber[i] + ",");
        }
        System.out.println("Position Array");
        for (int i = 0; i < dataPosition.length; i++) {
            System.out.print(dataPosition[i] + ",");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            if (i == dataPosition[z]) {
                data[i] = dataEvenNumber[z];
                z++;
                if(z==dataPosition.length)
                    break;
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }*/
    }

    private static void shortArray(int[] data) {
        int[] dataEvenNumber, dataPosition;
        int i = 0, j = 0, k = 0, tmp, tmpArraySize = 0, z = 0;

        for (i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                tmpArraySize++;
            }
        }
        dataEvenNumber = new int[tmpArraySize];
        dataPosition = new int[tmpArraySize];

        for (i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                dataEvenNumber[j++] = data[i];
                dataPosition[k++] = i;
            }
        }

        for (i = 0; i < dataEvenNumber.length; i++) {
            for (int l = i + 1; l < dataEvenNumber.length; l++) {
                if (dataEvenNumber[i] > dataEvenNumber[l]) {
                    tmp = dataEvenNumber[i];
                    dataEvenNumber[i] = dataEvenNumber[l];
                    dataEvenNumber[l] = tmp;
                }
            }
        }
        for (i = 0; i < data.length; i++) {
            if (i == dataPosition[z]) {
                data[i] = dataEvenNumber[z];
                z++;
                if (z == dataPosition.length)
                    break;
            }
        }

    }
}
