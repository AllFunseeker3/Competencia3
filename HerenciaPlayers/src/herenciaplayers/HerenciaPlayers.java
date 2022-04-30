package herenciaplayers;
import java.util.*;
public class HerenciaPlayers {

    public static void main(String[] args) {
        
        Personas P =new Personas();
        Jugadores J = new Jugadores();
        Entrenadores E = new Entrenadores();
        Arbitros A = new Arbitros();
        
        
        Scanner ingresar = new Scanner(System.in);
        String N[]= new String[149], Ap[]=new String[149], Am[]=new String[149], Pos[]= new String[99], R[]=new String[99], Eq[]= new String [99],F[]=new String[29],EqE[]= new String [19];
       
        int Ed[] = new int[149], a,b,s,q;
        
                for(a=0;a<150;a++){
                    System.out.println("Registro No. "+a);
                    
                    System.out.println("Ingrese los datos de la persona");
                    
                    System.out.println("Ingrese el nombre de la persona");
                    N[a]=ingresar.nextLine();
                    
                    ingresar.nextLine();
                    
                    System.out.println("Ingrese la edad de la persona");
                    Ed[a]=ingresar.nextInt();
                    
                    System.out.println("Ingrese el apellido paterno de la persona");
                    Ap[a]=ingresar.nextLine();
                    
                    
                    ingresar.nextLine();
                    
                    System.out.println("Ingrese el apellido materno de la persona");
                    Am[a]=ingresar.nextLine();
                    
                    }
                    
                    System.out.println("Ingrese los datos de los jugadores");
                    
                    for(b=0;b<100;b++){
                       
                       
                        
                        System.out.println("Ingrese la posicion del jugador");
                        Pos[a]=ingresar.nextLine();
                            
                        System.out.println("Ingrese el rol del jugador");
                        R[a]=ingresar.nextLine();
                            
                        System.out.println("Equipo del jugador");
                        Eq[a]=ingresar.nextLine(); 
                    }
                    
                    System.out.println("Ingrese los datos de los arbitros");
                    for(s=0;s<30;s++){
                        
                        System.out.println("Ingrese el rol del arbitro");
                        R[s]= ingresar.nextLine();
                        
                    }
                    System.out.println("Ingrese los datos de entrenadores");
                    for(q=0;q<20;q++){
                        
                        System.out.println("Ingrese el equipo del entrenador");
                        EqE[q]=ingresar.nextLine();
                        
                    }
                   
                    J.mostrar_Jg();
                    E.mostrar_E();
                    A.mostrar_Arbitros();
                       
                }
}
