package test;

import dominio.*;

public class Pc {
    public static void main(String[] args) {
        Raton raton1 = new Raton("USB", "SnapDragon");
        Teclado teclado1 = new Teclado("USB", "Power group");
        Monitor monitor1 = new Monitor("AOC", 24);
        
        Computadora computadora1 = new Computadora("Gamer", monitor1, teclado1, raton1);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
    }
  
}
