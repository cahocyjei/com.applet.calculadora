import javax.swing.*;
import java.applet.Applet;
import java.awt.*;


public class AppletBotones extends Applet {

    public void init(){
        setLayout(null);
        Font fuente= new Font("Bauhaus 93",Font.ITALIC,30);
        JLabel label= new JLabel("Calculadora");
        label.setFont(fuente);
        label.setForeground(Color.DARK_GRAY);
        label.setBounds(300,30,300,100);
        add(label);
        setSize(800,500);
        Numeros numeros= new Numeros();
        numeros.setBounds(190,100,500,75);
        add(numeros);
        Botones botones= new Botones();
        botones.setBounds(190,175,500,300);
        add(botones);

    }
    
}
