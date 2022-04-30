package herenciaplayers;

public class Jugadores extends Personas {
    public String Pos[],R[],Eq[];
    
    public void set_Pos(String Posicion[]){
       for(int p=0;p<100;p++){
            Pos[p]=Posicion[p];
        }
    }
    public String[] get_Pos(){
        return Pos;
    }
    
    public void set_R(String Rol[]){
        for(int p=0;p<100;p++){
            R[p]=Rol[p];
        }
    }
    public String[] get_R(){
        return R;
    }
    public void set_Eq(String Equipo[]){
        for(int p=0;p<100;p++){
            Eq[p]=Equipo[p];
        }
    }
    public String[] set_Eq(){
        return Eq;
    }
    
    public void mostrar_Jg(){
        for(int p=0;p<100;p++){
            System.out.println("Nombre"+N[p]
                                + "Apellido paterno" +Ap[p]
                                + "Apellido materno" +Am[p]
                                + "Edad" +Ed[p]
                                + "Posicion" +Pos[p]
                                + "Rol" +R[p]
                                + "Equipo" +Eq[p] );
        }

    }
            
    
}
