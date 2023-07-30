import java.util.Random;
import java.util.Scanner;

public class SortingSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = null;

        while (true) {
            System.out.println("\nSelamat Datang di Program Simulasi:");
            System.out.println("Menu");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");
            System.out.println("Masukkan Pilihan Anda ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan batas bawah: ");
                    int lowerBound = scanner.nextInt();
                    System.out.print("Masukkan batas atas: ");
                    int upperBound = scanner.nextInt();
                    data = generateRandomData(lowerBound, upperBound);
                    System.out.println("\nRandom Data: ");
                    printData(data);
                    break;

                case 2:
                    if (data != null) {
                        bubbleSortAscending(data.clone());
                    } else {
                        System.out.println("Data belum di-generate. Silakan pilih Menu 1 terlebih dahulu.");
                    }
                    break;

                case 3:
                    if (data != null) {
                        selectionSortAscending(data.clone());
                    } else {
                        System.out.println("Data belum di-generate. Silakan pilih Menu 1 terlebih dahulu.");
                    }
                    break;

                case 4:
                    if (data != null) {
                        bubbleSortDescending(data.clone());
                    } else {
                        System.out.println("Data belum di-generate. Silakan pilih Menu 1 terlebih dahulu.");
                    }
                    break;

                case 5:
                    if (data != null) {
                        selectionSortDescending(data.clone());
                    } else {
                        System.out.println("Data belum di-generate. Silakan pilih Menu 1 terlebih dahulu.");
                    }
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    public static int[] generateRandomData(int lowerBound, int upperBound) {
        Random random = new Random();
        int[] data = new int[5];
        for (int i = 0; i < 5; i++) {
            data[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
        return data;
    }

    public static void printData(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        System.out.println("\nSimulasi Bubble Sort - Ascending:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPass " + (i + 1));
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                printData(arr);
            }
        }
    }

    public static void selectionSortAscending(int[] arr) {
        int n = arr.length;
        System.out.println("\nSimulasi Selection Sort - Ascending:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPass " + (i + 1));
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            printData(arr);
        }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        System.out.println("\nSimulasi Bubble Sort - Descending:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPass " + (i + 1));
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                printData(arr);
            }
        }
    }

    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        System.out.println("\nSimulasi Selection Sort - Descending:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPass " + (i + 1));
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
            printData(arr);
        }
    }
}
