package videogamesher;

public class VideoGamesHer {

    
    public static void main(String[] args) {
        
        Accion_Videojuego AV = new Accion_Videojuego();
        
        AV.set_genero("Accion");
        AV.set_clasificacion("T");
        AV.set_plataforma("Pc");
        
        System.out.println("Genero "+AV.get_genero());
        System.out.println("Clasificacion "+AV.get_clasificacion());
        System.out.println("Plataforma "+AV.get_plataforma());
        
        AV.instalar();
        AV.iniciar();
        AV.Iniciar_campaña();
        
        
    }
    
}
