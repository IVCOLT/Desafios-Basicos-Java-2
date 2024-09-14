import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sexo, qtMulheres = 0, qtHomens = 0;
        float altura, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha o sexo da pessoa (1- Mulher, 2-Homem): ");
            sexo = input.nextInt();

            System.out.println("Digite a altura: ");
            altura = input.nextFloat();
            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            } else {
                System.out.println("Opção sexo inválido!");
            }
            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }

        }

        mediaHomens = somaH / qtHomens;
        System.out.println("A maior altura do grupo é de "+ maior);
        System.out.println("A média de altura dos homens é "+ mediaHomens);
        System.out.println("O número de mulheres é " +qtMulheres);

    }
}