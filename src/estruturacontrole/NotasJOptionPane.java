package estruturacontrole;

import javax.swing.JOptionPane;

public class NotasJOptionPane {
    public static void main (String args []) {
        int nota1 = JOptionPane.showInputDialog("Informe a Nota 1: ");
        int nota2 = JOptionPane.showInputDialog("Informe a Nota 2: ");
        int nota3 = JOptionPane.showInputDialog("Informe a Nota 3: ");       
        
        
        JOptionPane.showMessageDialog(null, palavra1+" "+palavra2+" "+palavra3);
    }
}
