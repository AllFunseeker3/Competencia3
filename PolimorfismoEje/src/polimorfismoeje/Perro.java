package polimorfismoeje;
public class Perro extends Animal{
    String raza;
    
    public Perro(String raza,String tipo,String tamaño,String color){
        super(tipo,tamaño,color);
        this.raza = raza;
    }
    @Override
    public String mostrarDatos(){
        return "tipo"+tipo+"\n tamaño"+tamaño+"\n color"+color+"\n raza"+ raza;
    } 
    public  String getRaza(){
        return raza;
    }
    
}
