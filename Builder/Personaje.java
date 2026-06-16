// Personaje.java - Producto
public class Personaje {
    private final String nombre;
    private final String clase;
    private final int salud;
    private final int mana;
    private final String arma;
    private final String armadura;
    private final String habilidadEspecial;

    private Personaje(Builder builder) {
        this.nombre = builder.nombre;
        this.clase = builder.clase;
        this.salud = builder.salud;
        this.mana = builder.mana;
        this.arma = builder.arma;
        this.armadura = builder.armadura;
        this.habilidadEspecial = builder.habilidadEspecial;
    }

    public void mostrarStats() {
        System.out.println("=== PERSONAJE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Clase: " + clase);
        System.out.println("Salud: " + salud);
        System.out.println("Mana: " + mana);
        System.out.println("Arma: " + arma);
        System.out.println("Armadura: " + armadura);
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }

    // Builder estatico interno
    public static class Builder {
        // Atributos obligatorios
        private final String nombre;
        private final String clase;
        // Atributos opcionales con valores por defecto
        private int salud = 100;
        private int mana = 50;
        private String arma = "Puños";
        private String armadura = "Ropa";
        private String habilidadEspecial = "Ninguna";

        public Builder(String nombre, String clase) {
            this.nombre = nombre;
            this.clase = clase;
        }

        public Builder salud(int salud) {
            this.salud = salud;
            return this;
        }

        public Builder mana(int mana) {
            this.mana = mana;
            return this;
        }

        public Builder arma(String arma) {
            this.arma = arma;
            return this;
        }

        public Builder armadura(String armadura) {
            this.armadura = armadura;
            return this;
        }

        public Builder habilidadEspecial(String habilidad) {
            this.habilidadEspecial = habilidad;
            return this;
        }

        public Personaje build() {
            return new Personaje(this);
        }
    }
}