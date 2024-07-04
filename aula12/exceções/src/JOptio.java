import java.text.ParseException;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class JOptio {
    public static void main(String[] args){

        JTextField campoCEP = new JTextField(8);
        JTextField campoCPF = new JTextField(11); 
        JTextField campoTelefone = new JTextField(16); 

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(new JLabel("CEP:"));
        painel.add(campoCEP);
        painel.add(new JLabel("CPF:"));
        painel.add(campoCPF);
        painel.add(new JLabel("Telefone:"));
        painel.add(campoTelefone);

         int opcao = JOptionPane.showConfirmDialog(null, painel, "Preencha os dados", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

         if (opcao == JOptionPane.OK_OPTION) {
            String cepFormatado = formataCEP(campoCEP.getText());
            String cpfFormatado = formataCPF(campoCPF.getText());
            String telefoneFormatado = formataTelefone(campoTelefone.getText());

            String mensagem = "Dados inseridos:\n"
                    + "CEP: " + cepFormatado + "\n"
                    + "CPF: " + cpfFormatado + "\n"
                    + "Telefone: " + telefoneFormatado;

            JOptionPane.showMessageDialog(null, mensagem, "Dados inseridos", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static String formataCEP(String cep) {
        try {
            MaskFormatter mascara = new MaskFormatter("#####-###");
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(cep);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static String formataCPF(String cpf) {
        try {
            MaskFormatter mascara = new MaskFormatter("###.###.###-##");
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(cpf);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static String formataTelefone(String telefone) {
        try {
            MaskFormatter mascara = new MaskFormatter("(##) # ####-####");
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(telefone);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
