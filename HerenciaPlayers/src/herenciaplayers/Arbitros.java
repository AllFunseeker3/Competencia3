package herenciaplayers;

public class Arbitros extends Personas{
    String F[];
    
    public void set_F(String Funcion[]){
        for(int p=100;p<130;p++){
            if(Funcion[p]==""){
                p++;
            }
            F[p]=Funcion[p];
        }
    }
    public String[] get_F(){
        return F;
    }
    public void mostrar_Arbitros(){
        for(int p=100;p<129;p++){
            System.out.println("Nombre"+N[p]
                                + "Apellido paterno" +Ap[p]
                                + "Apellido materno" +Am[p]
                                + "Edad" +Ed[p]
                                + "Función"+F[p]);
        }
    }
}
