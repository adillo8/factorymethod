package src;    // Paquete donde se encuentra el archivo
// Clase principal para probar el patrón Factory
public class Main {
    public static void main(String[] args) {
        // Crear un ordenador según el tipo ingresado por el usuario
        String tipo = "A";  // el usuario ingresa el tipo A
        Ordenador ordenador = OrdenadorFactory.crearOrdenador(tipo);

        // Imprimir las especificaciones del ordenador
        System.out.println("Especificaciones del Ordenador Tipo " + tipo + "que has creado :");
        System.out.println(ordenador.getEspecificaciones());
    }
}
