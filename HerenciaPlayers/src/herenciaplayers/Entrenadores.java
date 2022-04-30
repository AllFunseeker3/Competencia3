package herenciaplayers;

public class Entrenadores extends Personas{
    public String EqE[];
    
    public void set_EqE(String Equipo[]){
        for(int p=130;p<150;p++){
            EqE[p]=Equipo[p];
        }
    }
    public String[] get_EqE(){
        return EqE;
    }
    
    public void mostrar_E(){
        for(int p=130;p<150;p++){
            System.out.println("Nombre"+N[p]
                                + "Apellido paterno" +Ap[p]
                                + "Apellido materno" +Am[p]
                                + "Edad" +Ed[p]);
                                for(int c=0;c<30;c++){
                                    System.out.println("Equipo" +EqE[p]); 
                                }
                              
        }
    }
}