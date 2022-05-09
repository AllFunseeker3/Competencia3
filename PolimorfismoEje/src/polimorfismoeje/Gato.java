package polimorfismoeje;
public class Gato extends Animal{
    int vidas;
    public Gato (int vidas, String tipo, String tamaño, String color){
        super(tipo, tamaño, color);
        this.vidas= vidas;
    }
    @Override
    public String mostrarDatos(){
        return "tipo"+tipo+"\n tamaño"+tamaño+"\n color"+color+"\n return vidas";
    }
    public int getVidas(){
        return vidas;
    }
}
