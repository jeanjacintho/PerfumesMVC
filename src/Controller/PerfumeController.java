package Controller;

import Model.Fabricante;
import Model.Notas;
import Model.Perfume;
import Model.TipoFragancia;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfumeController {
    public void cadastrarPerfume(ArrayList<Perfume> perfumes, FabricanteController fabricanteController, ArrayList<Fabricante> fabricantes) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do perfume");
        String nomePerfume = scan.nextLine();

        System.out.println("Digite o preço do perfume");
        double precoPerfume = scan.nextDouble();

        System.out.println("O perfume é masculino, feminino? (F/M)");
        String sexoPerfume = scan.next();

        System.out.println("Qual o ID fabricante do perfume?");
        int fabricanteID = scan.nextInt();
        Fabricante fabricante = fabricanteController.getFabricanteById(fabricantes, fabricanteID);

        TipoFraganciaController tipoFraganciaController = new TipoFraganciaController();
        tipoFraganciaController.mostrarTiposFragancia();
        System.out.println("Qual o tipo da fragancia?");
        String tipoFragancia = scan.next();
        for(TipoFragancia tipoFraganciaEnum : TipoFragancia.values()) {
            if(tipoFraganciaEnum.equals(tipoFragancia)) {
                tipoFragancia = tipoFraganciaEnum.name();
            }
        }

        NotasController notasController = new NotasController();
        notasController.mostrarNotas();
        System.out.println("Qual o tipo da nota?");
        String notaFragancia = scan.next();
        for (Notas notasEnum : Notas.values()) {
            if(notasEnum.equals(notaFragancia)) {
                notaFragancia = notasEnum.name();
            }
        }

        perfumes.add(new Perfume(nomePerfume, precoPerfume, sexoPerfume, fabricante, tipoFragancia, notaFragancia));



    }

    public void filtrarProdutosPor(int numero, String filtro, ArrayList<Perfume> perfumes, double valorMin, double valorMax) {
        switch (numero) {
            case 1:
                for(Perfume perfume : perfumes) {
                    if(perfume.getFabricante().getNome().equalsIgnoreCase(filtro)) {
                        System.out.println(perfume.toString());
                    }
                }
                break;
            case 2:
                for(Perfume perfume : perfumes) {
                    if(perfume.getNotas().equalsIgnoreCase(filtro)) {
                        System.out.println(perfume.toString());
                    }
                }
                break;
            case 3:
                for(Perfume perfume : perfumes) {
                    if(perfume.getTipo_fragancia().equalsIgnoreCase(filtro)) {
                        System.out.println(perfume.toString());
                    }
                }
                break;
            case 4:
                for (Perfume perfume : perfumes) {
                    if(perfume.getPreco() >= valorMin && perfume.getPreco() <= valorMax) {
                        System.out.println(perfume.toString());
                    }
                }
            default:
                break;
        }
    }

    public void mostrarPerfumes(ArrayList<Perfume> perfumes) {
        for (Perfume perfume : perfumes) {
            perfume.toString();
        }
    }

    public void removerPerfume(ArrayList<Perfume> perfumes) {
        mostrarPerfumes(perfumes);
        System.out.println("Qual o ID do perfume que deseja remover?");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();

        String perfumeRemovido = (perfumes.removeIf(perfume -> perfume.getId() == id)) ? "Perfume removido" : "Erro ao remover perfume";
        System.out.println(perfumeRemovido);
    }
}
