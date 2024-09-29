package src;	// Paquete donde se encuentra el archivo
// Clase abstracta base para los ordenadores
abstract class Ordenador {
    public abstract String getRAM();
    public abstract String getDiscoDuro();
    public abstract String getPantalla();

    public String getEspecificaciones() {
        return "RAM: " + getRAM() + ", Disco Duro: " + getDiscoDuro() + ", Pantalla: " + getPantalla();
    }
}

// Implementación del ordenador tipo A
class OrdenadorTipoA extends Ordenador {
    public String getRAM() {
        return "8GB DDR4";
    }

    public String getDiscoDuro() {
        return "SSD 256GB";
    }

    public String getPantalla() {
        return "15.6 pulgadas, Full HD";
    }
}

// Implementación del ordenador tipo B
class OrdenadorTipoB extends Ordenador {
    public String getRAM() {
        return "16GB DDR4";
    }

    public String getDiscoDuro() {
        return "SSD 512GB";
    }

    public String getPantalla() {
        return "17.3 pulgadas, Full HD";
    }
}

// Implementación del ordenador tipo C
class OrdenadorTipoC extends Ordenador {
    public String getRAM() {
        return "32GB DDR4";
    }

    public String getDiscoDuro() {
        return "HDD 1TB";
    }

    public String getPantalla() {
        return "17.3 pulgadas, 4K UHD";
    }
}

// Clase Factory para crear ordenadores
class OrdenadorFactory {
    public static Ordenador crearOrdenador(String tipo) {
        // Crear un ordenador según el tipo ingresado usando un switch
        switch (tipo.toUpperCase()) {
            case "A":
                return new OrdenadorTipoA();
            case "B":
                return new OrdenadorTipoB();
            case "C":
                return new OrdenadorTipoC();
            default:
                throw new IllegalArgumentException("Tipo de ordenador no válido, prueba con el A,B,C");
        }
    }
}