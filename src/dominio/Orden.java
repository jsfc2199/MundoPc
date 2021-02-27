package dominio;

public class Orden {
    
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    public static final int MAXCOMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAXCOMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras<Orden.MAXCOMPUTADORAS){
            this.computadoras[this.contadorComputadoras++]=computadora; //inicia en 0 < 10, la info la colocará en el indice 0 y así hasta la 9
        }else{
            System.out.println("Hay demasiadas computadoras, saque una y haga otro recibo");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("id Orden: " + this.idOrden);
        System.out.println("Computadoras de la orden: " + this.contadorComputadoras);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("Orden = " + this.computadoras[i]);
        }
    }
}
