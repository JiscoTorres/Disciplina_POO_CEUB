package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Produto;
import negocio.Tipo;

public class ControladorGravar implements ActionListener {
     private JTextField txtNome = null;
    private JTextField txtPreco = null;
    private JComboBox<String> cboTipo= null;
    private JCheckBox chkPerecivel = null;
    private JTextArea txtDetalhamento = null;

    public ControladorGravar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboTipo, JCheckBox chkPerecivel, JTextArea txtDetalhamento) {
        this.txtNome = txtNome;
        this.txtPreco = txtPreco;
        this.cboTipo = cboTipo;
        this.chkPerecivel = chkPerecivel;
        this.txtDetalhamento = txtDetalhamento;
    } 

    public void actionPerformed(ActionEvent e){
        if (txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo de preço obrigatório!");
            return;
        }
        try {
            Double.parseDouble(txtPreco.getText());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Campo de preço deve ser numérico");
            return;
        }
        if (cboTipo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Campo tipo obrigatório!");
            return;
        }
        //composiçao do objeto
        Produto objProduto = new Produto();
        objProduto.setNome(txtNome.getText());
        objProduto.setPreco(Double.parseDouble(txtPreco.getText()));
        objProduto.setObjTipo(new Tipo(cboTipo.getSelectedItem().toString()));
        objProduto.setPerecivel(chkPerecivel.isSelected());
        objProduto.setDetalhamento(txtDetalhamento.getText());
    }
}




