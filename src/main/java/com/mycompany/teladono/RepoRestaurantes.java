package com.mycompany.teladono;

import java.util.ArrayList;
import java.util.List;

public class RepoRestaurantes {
    private static List<ListaRestaurantes> listaRestaurantes = new ArrayList<>();

    public static void adicionarRestaurante(ListaRestaurantes restaurante) {
        listaRestaurantes.add(restaurante);
    }

    public static List<ListaRestaurantes> getListaRestaurantes() {
        return listaRestaurantes;
    }
}
