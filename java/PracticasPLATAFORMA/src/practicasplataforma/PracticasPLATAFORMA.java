/*
Practices PLATAFORMA
Name: Kyb3r Cipher
School: CBTIS 89 - 3A TM
*/
package practicasplataforma;

import javax.swing.JOptionPane;

public class PracticasPLATAFORMA {
    
    public static void main(String[] args) {
        int practice;

        do {
            practice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of practice <1-13>:"));
        } while (practice < 1 || practice > 13);

        switch (practice) {
            case 1:
                Exercise01 ex1 = new Exercise01();
                ex1.setVisible(true);
                break;
            case 2:
                Exercise02 ex2 = new Exercise02();
                ex2.setVisible(true);
                break;
            case 3:
                Exercise03 ex3 = new Exercise03();
                ex3.setVisible(true);
                break;
            case 4:
                char version = JOptionPane.showInputDialog(null, "Type the version <A-B>: ").charAt(0);
                if (version == 'A' || version == 'a') {
                    Exercise04 ex4 = new Exercise04();
                    ex4.setVisible(true);
                } else if (version == 'B' || version == 'b') {
                    Exercise04B ex4 = new Exercise04B();
                    ex4.setVisible(true);
                }
                break;
            case 10:
                Exercise10 ex10 = new Exercise10();
                ex10.setVisible(true);
                break;
            case 13:
                Exercise13 ex13 = new Exercise13();
                ex13.setVisible(true);
                break;
        }
    }
}
