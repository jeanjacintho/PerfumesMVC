import Controller.FabricanteController;
import Controller.PerfumeController;
import Model.Fabricante;
import Model.Perfume;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    static ArrayList<Perfume> perfumes = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        FabricanteController fabricanteController = new FabricanteController();
        PerfumeController perfumeController = new PerfumeController();

        menu(fabricanteController, perfumeController);

    }

    public static void menu(FabricanteController fabricanteController, PerfumeController perfumeController) {

        while(true) {
            System.out.println("1 - Cadastrar perfume");
            System.out.println("2 - Mostrar perfume");
            System.out.println("3 - Remover perfume");
            System.out.println("4 - Filtrar perfumes por:");
            System.out.println("5 - Cadastrar fabricante");
            System.out.println("6 - Mostrar fabricante");
            System.out.println("7 - Remover fabricante");
            System.out.println("0 - Sair");
            int op = scan.nextInt();
            if(op == 0) break;

            switch (op) {
                case 1:
                    perfumeController.cadastrarPerfume(perfumes, fabricanteController, fabricantes);
                    break;
                case 2:
                    perfumeController.mostrarPerfumes(perfumes);
                    break;
                case 3:
                    perfumeController.removerPerfume(perfumes);
                    break;
                case 4:
                    menuMostrarPor(perfumeController);
                    break;
                case 5:
                    fabricanteController.cadastrarFabricante(fabricantes);
                    break;
                case 6:
                    fabricanteController.mostrarFabricantes(fabricantes);
                    break;
                case 7:
                    fabricanteController.removerFabricante(fabricantes);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void menuMostrarPor(PerfumeController perfumeController) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("1 - Fabricante");
            System.out.println("2 - Notas");
            System.out.println("3 - Fragancia");
            System.out.println("4 - Preço");
            System.out.println("0 - Sair");
            int op = scan.nextInt();
            if(op == 0) break;

            switch (op) {
                case 1:
                    System.out.println("Qual o nome do fabricante");
                    String fabricante = scan.next();
                    perfumeController.filtrarProdutosPor(1, fabricante, perfumes, 0, 0);
                    break;
                case 2:
                    System.out.println("Qual o nome da nota");
                    String notas = scan.next();
                    perfumeController.filtrarProdutosPor(2, notas, perfumes, 0, 0);
                    break;
                case 3:
                    System.out.println("Qual o nome do fragancia");
                    String fragancia = scan.next();
                    perfumeController.filtrarProdutosPor(3, fragancia, perfumes, 0, 0);
                    break;
                case 4:
                    System.out.println("Valor minimo");
                    double valorMin = scan.nextDouble();
                    System.out.println("valor maximo");
                    double valorMax = scan.nextDouble();
                    perfumeController.filtrarProdutosPor(4, "", perfumes, valorMin, valorMax);
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }
    }
}