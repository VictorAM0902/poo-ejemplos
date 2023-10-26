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

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.edad = 25;
        persona.nombre = "Rogelio";
        persona.vive = true; 

        persona.saludar();
        System.out.println("La edad de la persona es" + persona.edad);
        System.out.println("la persona vive?" + persona.vive);

        persona.incrementarEdad();
        System.out.println("La edad de la persona es" + persona.edad);
        System.out.println("la persona vive?" + persona.vive);

        persona.morir();
        
        System.out.println("La edad de la persona es" + persona.edad);
        System.out.println("la persona vive?" + persona.vive);

    }
}