import javax.swing.JOptionPane;

public class AuladJOPa {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog(
            "Digite sua senha");
        if (senha.equals("senha123")) {
            JOptionPane.showMessageDialog(null,
            "Login realizado com sucesso");
        }else {
            JOptionPane.showMessageDialog(null,
            "Acesso Negado!");
        }
    }
}
