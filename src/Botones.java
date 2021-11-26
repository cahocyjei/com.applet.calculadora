import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JMenuBar {
    private JButton suma;
    private JButton resta;
    private JButton multiplica;
    private JButton divide;
    private JButton raizde1;
    private JButton raizde2;
    private JButton mayor;
    private JButton limpia;
    private JTextField pantallla;
    private double resultado;

    public Botones(){
        setLayout(null);
        Font fuente= new Font("Arial",Font.BOLD,15);
        suma= new JButton("SUMA");
        suma.setFont(fuente);
        suma.setBounds(5,50,80,25);
        add(suma);
        suma.addActionListener(new EventBoton());
        //
        resta= new JButton("RESTA");
        resta.setFont(fuente);
        resta.setBounds(95,50,85,25);
        add(resta);
        resta.addActionListener(new EventBoton());
        //
        multiplica= new JButton("MULTIPLICA");
        multiplica.setFont(fuente);
        multiplica.setBounds(190,50,150,25);
        add(multiplica);
        multiplica.addActionListener(new EventBoton());
        //
        divide= new JButton("DIVIDE");
        divide.setFont(fuente);
        divide.setBounds(50,100,90,25);
        add(divide);
        divide.addActionListener(new EventBoton());
        //
        raizde1= new JButton("Raiz de 1");//
        raizde1.setFont(fuente);
        raizde1.setBounds(150,100,100,25);
        add(raizde1);
        raizde1.addActionListener(new EventBoton());
        //
        raizde2= new JButton("Raiz de 2");
        raizde2.setFont(fuente);
        raizde2.setBounds(5,145,100,25);
        add(raizde2);
        raizde2.addActionListener(new EventBoton());
        //
        mayor= new JButton("MAYOR");
        mayor.setFont(fuente);
        mayor.setBounds(150,145,100,25);
        add(mayor);
        mayor.addActionListener(new EventBoton());
        //
        limpia= new JButton("Limpia");
        limpia.setFont(fuente);
        limpia.setBounds(255,100,90,70);
        add(limpia);
        limpia.addActionListener(new EventBoton());
        //
        Font fuenteP= new Font("Arial",Font.BOLD,90);
        pantallla=new JTextField();
        pantallla.setBounds(5,185,490,100);
        pantallla.setFont(fuenteP);
        pantallla.setForeground(Color.GREEN);
        pantallla.setBackground(Color.DARK_GRAY);
        pantallla.setText(String.format("%.1f",resultado));
        add(pantallla);


    }
    private class EventBoton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Object boton= e.getSource();

            if (boton== suma){
                resultado= Integer.parseInt(Numeros.ntext1.getText())+Integer.parseInt(Numeros.ntext2.getText());
                pantallla.setText(String.valueOf(resultado));
            }if (boton== limpia){
                Numeros.ntext1.setText("");
                Numeros.ntext2.setText("");
                Font fuenteP= new Font("Arial",Font.BOLD,90);
                pantallla.setFont(fuenteP);
                resultado= 0;
                pantallla.setText(String.format("%.1f",resultado));;
            }if (boton== resta) {
                resultado= Integer.parseInt(Numeros.ntext1.getText())-Integer.parseInt(Numeros.ntext2.getText());
                pantallla.setText(String.valueOf(resultado));
            }if (boton== multiplica){
                resultado= Integer.parseInt(Numeros.ntext1.getText())* Integer.parseInt(Numeros.ntext2.getText());
                pantallla.setText(String.valueOf(resultado));
            }if (boton== divide){
                resultado= Double.parseDouble(Numeros.ntext1.getText()) / Integer.parseInt(Numeros.ntext2.getText());
                pantallla.setText(String.format("%.1f",resultado));
            }if (boton== raizde1){
                double raiz= Math.sqrt(Double.parseDouble(Numeros.ntext1.getText()));
                pantallla.setText(String.format("%.3f",raiz));
            }if (boton== raizde2){
                double raiz= Math.sqrt(Double.parseDouble(Numeros.ntext2.getText()));
                pantallla.setText(String.format("%.3f",raiz));
            }else if (boton== mayor){
                Font fuentePa= new Font("Arial",Font.ITALIC,20);
                if (Integer.parseInt(Numeros.ntext1.getText())>Integer.parseInt(Numeros.ntext2.getText())){
                    pantallla.setFont(fuentePa);
                    pantallla.setText("Número 1 es mayor a Número 2");
                }else if(Integer.parseInt(Numeros.ntext2.getText())>Integer.parseInt(Numeros.ntext1.getText())){
                    pantallla.setFont(fuentePa);
                    pantallla.setText("Número 2 es mayor a Número 1");
                }else{
                    pantallla.setFont(fuentePa);
                    pantallla.setText("SON IGUALES, JA,JA,JA,JA...********");
                }
            }

        }
    }
}
