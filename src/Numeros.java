import javax.swing.*;
import java.awt.*;

public class Numeros extends JMenuBar {
    protected static JTextField ntext1;
    protected static JTextField ntext2;


    public Numeros(){
        setLayout(null);
        Font fuente= new Font("Arial",Font.BOLD,20);
        JLabel nlabel1= new JLabel("Número 1");
        nlabel1.setBounds(5,25,100,30);
        nlabel1.setFont(fuente);
        ntext1= new JTextField();
        ntext1.setBounds(100,25,70,30);
        ntext1.setFont(fuente);
        ntext1.setForeground(Color.blue);
        add(nlabel1);
        add(ntext1);
        //
        JLabel nlabel2= new JLabel("Número 2");
        nlabel2.setBounds(200,25,100,30);
        nlabel2.setFont(fuente);
        ntext2= new JTextField();
        ntext2.setBounds(300,25,70,30);
        ntext2.setFont(fuente);
        ntext2.setForeground(Color.red);
        add(nlabel2);
        add(ntext2);

    }
}
