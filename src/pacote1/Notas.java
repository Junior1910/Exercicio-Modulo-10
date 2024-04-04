package pacote1;
import java.util.Scanner;
public class Notas {
    public static Scanner s = new Scanner(System.in);

    public static void main(String args[]) {
        joao(); maria();
    }
    private static void maria() {
        int nota1, nota2, nota3, nota4, mediaFinal;
        System.out.println("***Nota da Maria***");
        System.out.print("Digite a primeira nota: ");
        nota1 = s.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2 = s.nextInt();
        System.out.print("Digite a terceira nota: ");
        nota3 = s.nextInt();
        System.out.print("Digite a quarta nota: ");
        nota4 = s.nextInt();
        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        if (mediaFinal >= 7) {
            System.out.println("Aprovado!!!");
        } else if (mediaFinal < 7 && mediaFinal >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
    private static void joao() {
        int nota1, nota2, nota3, nota4, mediaFinal;
        System.out.println("***Nota do João***");
        System.out.print("Digite a primeira nota: ");
        nota1 = s.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2 = s.nextInt();
        System.out.print("Digite a terceira nota: ");
        nota3 = s.nextInt();
        System.out.print("Digite a quarta nota: ");
        nota4 = s.nextInt();
        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        if (mediaFinal >= 7) {
            System.out.println("Aprovado!!!");
        } else if (mediaFinal < 7 && mediaFinal >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}



