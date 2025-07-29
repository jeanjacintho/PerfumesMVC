package Controller;

import Model.TipoFragancia;

public class TipoFraganciaController {
    public void mostrarTiposFragancia() {
        for(TipoFragancia tipo : TipoFragancia.values()) {
            System.out.println(tipo.name());
        }

    }
}
