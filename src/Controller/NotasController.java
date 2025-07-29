package Controller;

import Model.Notas;

public class NotasController {
    public void mostrarNotas() {
        for(Notas notas : Notas.values()) {
            System.out.println(notas.name());
        }

    }
}
