class Persona {
    String nombre;
    int edad;
    boolean vive;



    void saludar() {
        System.out.println("Hola mi nombre es" + nombre);

    }
    void incrementarEdad() {
        edad = + 1;
    }
    void morir() {
        vive = false;
    }

    }