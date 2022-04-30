package videogamesher;

public class Accion_Videojuego extends GeneroVideojuego{
    public String Multijugador,Campaña, Accesibilidad;
    
    public void Iniciar_campaña(){
        System.out.println("Campaña iniciada");
    }
    public void Iniciar_Multijugador(){
        System.out.println("Multijugador iniciado");
    }
    public void Accesibilidad(){
        System.out.println("Accesibilidad Habilitada");
    }
    
    public void set_campaña(String C){
        Campaña =C;
    }
    public String get_campaña(){
        return Campaña;
    }
    public void set_Multijugador(String M){
        Multijugador = M;
    }
    public String get_Multijugador(){
        return Multijugador;
    }
        public void set_Accesibilidad(String A){
        Accesibilidad = A;
    }
    public String get_Accesibilidad(){
        return Accesibilidad;
    }
    
    
}
