package polimorfismoeje;

public class Animal {
    protected String tipo;
    protected String tamaño;
    protected String color;
    
    public Animal (String tipo, String tamaño, String color){
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.color =color;
    }
    
    public String mostrarDatos(){
        return "tipo"+tipo+"\n tamaño "+tamaño+"\n color"+color;
    }
    
    public String getTipo(){
        return tipo;
    }
    public String getTamaño(){
        return tamaño;
    }
    public String getColor(){
        return color;
    }
    
}
