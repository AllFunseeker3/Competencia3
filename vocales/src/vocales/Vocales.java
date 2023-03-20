package vocales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Vocales implements ActionListener {
     private JButton Ing;
     private JButton Lim;
      private JTextField caja;
    public Vocales(){
        
        //Ventana
        JFrame ventana = new JFrame("Mi ventana");
        ventana.setSize(600, 600);
        ventana.setVisible(true);
        ventana.setLayout(null);
        //Labels
        JLabel m2 = new JLabel("Programar para encontrar vocales");
        m2.setBounds(195, 0, 250, 40);
        ventana.add(m2);
        
        JLabel m = new JLabel("Ingrese una palabra o frase");
        m.setBounds(5, 15, 250, 40);
        ventana.add(m);
        
        JLabel v = new JLabel("Vocales");
        v.setBounds(10, 65, 250, 40);
        ventana.add(v);
        
         JLabel A = new JLabel("A");
        A.setBounds(5, 100, 20, 20);
        ventana.add(A);
     
           
         JLabel E = new JLabel("E");
        E.setBounds(50, 100, 20, 20);
        ventana.add(E);
        
        JLabel I = new JLabel("I");
        I.setBounds(95, 100, 20, 20);
        ventana.add(I);
        
        JLabel O = new JLabel("O");
        O.setBounds(140, 100, 20, 20);
        ventana.add(O);
        
        JLabel U = new JLabel("U");
        U.setBounds(185, 100, 20, 20);
        ventana.add(U);
        
        //caja de texto
        JTextField caja = new JTextField();
        caja.setBounds(5, 45, 200, 20);
        ventana.add(caja);
        
        JTextField CA = new JTextField();
        CA.setBounds(25, 100, 20, 20);
        ventana.add(CA);
        
         JTextField CE = new JTextField();
        CE.setBounds(65, 100, 20, 20);
        ventana.add(CE);
        
        JTextField CI = new JTextField();
        CI.setBounds(105, 100, 20, 20);
        ventana.add(CI);
        
        JTextField CO = new JTextField();
        CO.setBounds(160, 100, 20, 20);
        ventana.add(CO);
        
        JTextField CU = new JTextField();
        CU.setBounds(205, 100, 20, 20);
        ventana.add(CU);
         
        //Botones
        Ing = new JButton("Ingresar");
        Ing.setBounds(5,130,85,30);
        ventana.add(Ing);
        Ing.addActionListener(this);
       
        
        Lim = new JButton("Limpiar");
        Lim.setBounds(100,130,85,30);
        ventana.add(Lim);
        Lim.addActionListener(this);
        
        //Programacion de botones(Funcionalidad)
        
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        

    
       
        
    }
    public static void main(String[] args) {
    new Vocales();
     
    }
    
      
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Ing) {
            System.out.println("Hola");
            String t = caja.getText();
        }
         if (e.getSource() == Lim) {
            System.out.println("");
            
        }
     }
   

}
