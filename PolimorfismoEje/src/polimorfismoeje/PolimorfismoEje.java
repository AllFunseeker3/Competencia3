package polimorfismoeje;
public class PolimorfismoEje {
    public static void main(String[] args) {
        Animal animalito = new Animal("Equino","Grande","Cafe");
        Animal animalito2 = new Perro("Bull dog","canino","Pequeño","negro");
        Animal animalito3 = new Gato(5,"felino","pequeño","blanco");
        
        System.out.println(animalito.mostrarDatos());
        System.out.println(animalito2.mostrarDatos());
        System.out.println(animalito3.mostrarDatos());
        
    }
    
}
