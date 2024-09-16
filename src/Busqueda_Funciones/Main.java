package Busqueda_Funciones;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Sala> salas = new ArrayList<>();
        salas.add(new Sala(1, "Cinepolis", "Barbie"));
        salas.add(new Sala(2, "Multicinema", "Resplandor"));
        salas.add(new Sala(3, "Cinemark", "La Monja"));
        salas.add(new Sala(4, "Cuevana", "Titanic"));

        SwingUtilities.invokeLater(() -> {
            BusquedaFuncionesGUI busquedaFuncionesGUI = new BusquedaFuncionesGUI(salas);
            busquedaFuncionesGUI.setVisible(true);
        });
    }
}
