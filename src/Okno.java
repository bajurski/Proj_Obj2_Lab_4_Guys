import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Okno implements ActionListener {

    private  final JFrame farme;
    private  final Container kontener;
    private final JTextField imie;
    private final JTextField lata;
    private final JLabel tytul;
    private final JLabel im;
    private final JLabel ileLat;
    private final JLabel wynik;
    private final JButton kalkulujButton;
    private final JButton resetButton;

    public Okno() {

        farme = new JFrame("Ile godzin");
        farme.setBounds(300, 90, 700, 350);
        farme.setDefaultCloseOperation(EXIT_ON_CLOSE);
        farme.setResizable(false);

        kontener = farme.getContentPane();
        kontener.setBackground(Color.gray);
        kontener.setLayout(null);

        imie = new JTextField();
        imie.setFont(new Font("Arial", Font.BOLD, 20));
        imie.setSize(130,30);
        imie.setLocation(250,100);
        kontener.add(imie);

        lata = new JTextField();
        lata.setFont(new Font("Arial", Font.BOLD, 20));
        lata.setSize(130,30);
        lata.setLocation(250,170);
        kontener.add(lata);

        tytul = new JLabel();
        tytul.setText("Program obliczajacy godziny zycia");
        tytul.setSize(420,20);
        tytul.setLocation(200,20);
        tytul.setFont(new Font("Arial", Font.BOLD, 14));
        kontener.add(tytul);

        im = new JLabel();
        im.setText("Imie");
        im.setSize(60,20);
        im.setLocation(250,80);
        kontener.add(im);

        ileLat = new JLabel();
        ileLat.setText("Ile lat");
        ileLat.setSize(60,20);
        ileLat.setLocation(250,150);
        kontener.add(ileLat);

        wynik = new JLabel();
        //wynik.setText("Ile lat");
        wynik.setFont(new Font("Arial", Font.BOLD, 20));
        wynik.setSize(400,20);
        wynik.setLocation(100,250);
        kontener.add(wynik);

        kalkulujButton = new JButton("Oblicz");
        kalkulujButton.setSize(100,40);
        kalkulujButton.setLocation(470,100);
        kalkulujButton.addActionListener(this);
        kontener.add(kalkulujButton);

        resetButton = new JButton("Reset");
        resetButton.setSize(100,40);
        resetButton.setLocation(470,170);
        resetButton.addActionListener(this);
        kontener.add(resetButton);


        farme.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
