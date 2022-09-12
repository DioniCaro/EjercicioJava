package ejerciciojava;

public class EjercicioJava {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarNumeroPuertas();
        miCoche.incrementarNumeroPuertas();
        miCoche.incrementarNumeroPuertas();
        System.out.println("El coche tiene" + miCoche.numeroPuertas + "puertas");
        System.out.println("La suma es: " +  suma(10, 15,20));
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
        
}
