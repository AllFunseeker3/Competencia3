package videogamesher;

public class GeneroVideojuego extends Videojuego{
    public String clasificacion;
    public int ID;
       
    
    public void iniciar(){
        System.out.println("Iniciar juego");
    }
    public void cerrar(){
        System.out.println("El juego se esta cerrando");
    }
    
    public void set_clasificacion(String C){
        clasificacion =C;
    }
    public String get_clasificacion(){
        return clasificacion;
    }
    
    public void set_ID(int id){
        ID=id;
    }
    public int get_ID(){
        return ID;
    }
    
}

 
