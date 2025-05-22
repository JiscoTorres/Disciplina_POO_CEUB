package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Pessoa;

public class ControladorGravar implements ActionListener {

    private JTextField txtNome = null;
    private JTextField txtEndereco = null;
    private JTextField txtTelefone = null;
    
    public ControladorGravar (JTextField txtNome, JTextField txtEndereco, JTextField txtTelefone){
        super();
        this.txtNome = txtNome;
        this.txtEndereco = txtEndereco;
        this.txtTelefone = txtTelefone;
    }

    //Métodos implementados da interface

    public void actionPerformed(ActionEvent e ) {
        Pessoa objPessoa = new Pessoa();
        objPessoa.setNome(txtNome.getText());
        objPessoa.setEndereco(txtEndereco.getText());
        objPessoa.setTelefone(txtTelefone.getText());

        try {
            objPessoa.persistir();
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
        } catch (Exception erro) {
            JOptionPane .showMessageDialog(null,erro);
        }
    }

}
