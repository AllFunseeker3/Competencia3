package videogamesher;
public class Videojuego {
    public String genero,plataforma;
    public float TamañoVi;
    private float precio;
    
    public void instalar(){
        System.out.println("El juego se esta instalando");
    }
    
    public void desistalar(){
        System.out.println("El juego se esta desistalando");
    }
    
    public void set_genero(String g){
        genero=g;
    }
    public String get_genero(){
        return genero;
    }
    
    public void set_plataforma(String Pla){
        plataforma=Pla;
    }
    public String get_plataforma(){
        return plataforma;
    }
    public void set_tamañoVi(float Ta){
        TamañoVi=Ta;
    }
    public float get_tamañoVi(){
        return TamañoVi;
    }
    public void set_precio(float P){
        precio = P;
    }
    public float get_precio(){
        return precio;
    }
        
    
}
