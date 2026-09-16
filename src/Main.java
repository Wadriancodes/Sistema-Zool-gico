//Aluno: Wadrian Macario Lopes | Matricula: 04199656

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Qual tipo de animal deseja cadastrar?
                1 — Mamífero
                2 — Ave
                3 — Réptil
                """);

        int escolha = sc.nextInt();
        sc.nextLine();

        Animal a;

        switch (escolha) {
            case 1 -> a = new Mamifero();
            case 2 -> a = new Ave();
            case 3 -> a = new Reptil();
            default -> {
                System.out.println("Opção inválida.");
                return;
            }
        }

        a.cadastrar();

        a.triagem();
    }
}
