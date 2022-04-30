package herenciaplayers;

public class Personas {
    public String N[],Ap[],Am[];
    public int Ed[];
    
    public void set_N(String Nombre[]){
       for(int p=0;p<3;p++){
            N[p]=Nombre[p];
        }
    }   
    public String[] get_N(){
        return N;
    } 
    public void set_Ap(String ApellidoP[]){
          for(int p=0;p<3;p++){
            Ap[p]=ApellidoP[p];
        }    
    }
    public String[] get_Ap(){
        return Ap;
    }
    public void set_Am(String ApellidoM[]){
          for(int p=0;p<3;p++){
            Ap[p]=ApellidoM[p];
        }
        
    }
    public String[] get_Am(){
        return Am;
    }
    public void set_Ed(int Edad[]){
          for(int p=0;p<3;p++){
            Ed[p]=Edad[p];
        }
    }
    public int[] get_Ed(){
        return Ed;
    }
}   
       
 
    

