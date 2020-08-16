import javax.swing.*;

public class HelloWorld {

    public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Ingresa tu nombre: ");
    JOptionPane.showMessageDialog(null,"Dices que tu nombre es: " + name);
    }
}
