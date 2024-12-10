package com.mycompany.teladono;

import java.util.List;
import java.util.ArrayList;

public class RepoComidas {
    private static List<Comida> listaComidas = new ArrayList<>();

    public static List<Comida> getListaComidas() {
        return listaComidas;
    }

    public static void adicionarComida(Comida comida) {
        listaComidas.add(comida);
    }
}
