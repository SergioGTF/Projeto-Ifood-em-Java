package com.mycompany.teladono;

import java.util.List;
import java.util.ArrayList;

public class RepoBebidas {
    private static List<Bebida> listaBebidas = new ArrayList<>();

    public static List<Bebida> getListaBebidas() {
        return listaBebidas;
    }

    public static void adicionarBebida(Bebida bebida) {
        listaBebidas.add(bebida);
    }
}
