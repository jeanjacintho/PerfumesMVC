package Controller;

import Model.Fabricante;
import Model.Perfume;

import java.util.ArrayList;
import java.util.Scanner;

public class FabricanteController {
    public void cadastrarFabricante(ArrayList<Fabricante> fabricantes) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do frabricante?");
        String nome = scan.next();

        fabricantes.add(new Fabricante(nome));
    }

    public void mostrarFabricantes(ArrayList<Fabricante> fabricantes) {
        for (Fabricante fabricante : fabricantes) {
           fabricante.toString();
        }
    }

    public Fabricante getFabricanteById(ArrayList<Fabricante> fabricantes, int idFabricante) {
        for (Fabricante fabricante : fabricantes) {
            if(fabricante.getId() == idFabricante) {
                return fabricante;
            }
        }
        return null;
    }

    public void removerFabricante(ArrayList<Fabricante> fabricantes) {
        mostrarFabricantes(fabricantes);
        System.out.println("Qual o ID do fabricante que deseja remover?");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();

        String fabricanteRemovido = (fabricantes.removeIf(fabricante -> fabricante.getId() == id)) ? "Fabricante removido" : "Erro ao remover fabricante";
        System.out.println(fabricanteRemovido);
    }
}
