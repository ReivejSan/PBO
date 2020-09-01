/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbideal;
import java.awt.*;
import java.awt.event.*;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Jevier's FX504GD
 */
public class BBideal extends Frame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    TextField tnim, tnama, tberat, ttinggi;
    Button bhitung;
    
    BBideal() {       
        
        Label lnim, lnama, lberat, ltinggi;
        
        lnim = new Label("NIM");
        lnim.setBounds(30, 80, 100, 20);
        tnim = new TextField();
        tnim.setBounds(30, 100, 150, 40);
        
        lnama = new Label("Nama");
        lnama.setBounds(30, 160, 100, 20);
        tnama = new TextField();
        tnama.setBounds(30, 180, 150, 40);
        
        lberat = new Label("Berat Badan (Kg)");
        lberat.setBounds(30, 240, 100, 20);
        tberat = new TextField();
        tberat.setBounds(30, 260, 150, 40);
        
        ltinggi = new Label("Tinggi Badan (Cm)");
        ltinggi.setBounds(30, 320, 100, 20);
        ttinggi = new TextField();
        ttinggi.setBounds(30, 340, 150, 40);
        
        bhitung = new Button("Hitung");
        bhitung.setBounds(40, 400, 100, 50);
        bhitung.addActionListener(this);
        
        add(lnim);
        add(tnim);
        add(lnama);
        add(tnama);
        add(lberat);
        add(tberat);
        add(ltinggi);
        add(ttinggi);
        add(bhitung);
        
       setSize(800, 800);
       setLayout(null);
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String nim = tnim.getText();
        String nama = tnama.getText();
        String berat = tberat.getText();
        String tinggi = ttinggi.getText();
        
        int getBB = Integer.parseInt(berat);
        int getTB = Integer.parseInt(tinggi);
        float Hasil;
        int tinggibadan = getTB * getTB;
        Hasil = getBB/tinggibadan;
        
        if(Hasil <18.5) {
            JOptionPane.showMessageDialog(null, "Kurus");
        }
        else if (Hasil >=18.5 && Hasil <= 24.9) {
            JOptionPane.showMessageDialog(null, "Normal");
        }
        else if (Hasil >=25 && Hasil <=29.9) {
            JOptionPane.showMessageDialog(null, "Overweight");
        }
        else {
            JOptionPane.showMessageDialog(null, "Obesitas");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new BBideal();
    }
}
