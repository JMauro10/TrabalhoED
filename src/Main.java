import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public static void main (String[]args) throws FileNotFoundException {

            File file = new File("/Users/josem/Desktop/Dic/Portuguese (Brazilian).dic"); // Aponta onde esta o arquivo TXT
            Scanner ler = new Scanner(file); // Lê o arquivo TXT

            String[] vetor = new String[Integer.valueOf(ler.nextLine())]; // Cria um vetor de acordo com primeira linha do arquivo TXT

            // Coloca todas as palavras que contém depois da primeira linha dentro do vetor
            int idx = 0;
            while (ler.hasNextLine()) {
                vetor[idx] = ler.nextLine();
                idx += 1;
            }
            // Mostra na tela as palavras do dicionário
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }



                // Cria o vetor
                int[] vet = new int[10];
                vet[0] = 8;
                vet[1] = 12;
                vet[2] = 0;
                vet[3] = 10;
                vet[4] = 2;
                vet[5] = 9;
                vet[6] = 2;
                vet[7] = 84;
                vet[8] = 99;
                vet[9] = 3;

            // Ordenando um vetor inteiro chamando a função insertionSort
            insertionSort(vet);
            System.out.println(Arrays.toString(vet));

            // Ordenando um vetor inteiro chamando a função bubbleSort
            bubbleSort(vet);
            System.out.println(Arrays.toString(vet));

            // Ordenando um vetor inteiro chamando a função mergeSort
         /*   mergeSort();
            System.out.println(Arrays.toString(mergeSort()));
*/
            long temp = System.nanoTime(); // Recebe o tempo de máquina em nanosegundos
            long tempo = System.currentTimeMillis(); // Recebe o tempo de máquina em milissegundos
            System.out.println("O progama levou " + temp + " nanosegundos para realizar a ordenação.");
            System.out.println("O progama levou " + tempo + " milissegundos para realizar a ordenação.");

        }
        public static void buscaBinaria(){

        }
        public static void buscaSequencial(){

        }
    public static void bubbleSort(int[] values){
        for(int i = 0; i < values.length - 1; i++) {
            for(int j = 0; j < values.length - 1 - i; j++) {
        /* Se o valor da posição atual do vetor for maior que o proximo valor,
          então troca os valores de lugar no vetor. */
                if(values[j] > values[j + 1]) {
                    int aux = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = aux;
                }
            }
        }
    }
    public static void insertionSort(int[] values){


        for (int i = 1; i < values.length; i++) {

            int j = i;

            while (j > 0 && values[j] < values[j-1]) {
                int aux = values[j];
                values[j] = values[j - 1];
                values[j - 1] = aux;
                j -= 1;
            }

        }
    }
    public static void mergeSort(int[] values, int left, int right){
        if (left >= right)
            return;

        else {

            int middle = (left + right) / 2;
            mergeSort(values, left, middle);
            mergeSort(values, middle + 1, right);

            merge(values, left, middle, right);
        }
    }

    private static void merge(int[] values, int left, int middle, int right) {
    }

 /*   public static void quickSort(int[] values, int left, int right){
        if (left < right) {
            int index_pivot = partition(values, left, right);
            quickSort(values, left, index_pivot - 1);
            quickSort(values, index_pivot + 1, right);
        }
    }
    public static int partition(int[] values, int left, int right) {

        int pivot = values[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (values[j] <= pivot) {
                i+=1;
                swap(values, i, j);
            }
        }

        // troca pivot (values[left]) com i.
        swap(values, left, i);

        return i;
    }
*/

}


