package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Visao extends JFrame{
    private static final long serialVersionUID = 1L;
    
    
    // -> BARRA DE MENU
    private JMenuBar barraDeMenu = new JMenuBar();
    private JMenu mniArquivo = new JMenu("Arquivo");
    private JMenuItem mniAbrir = new JMenuItem("Abrir");
    private JMenuItem mniSair = new JMenuItem("Sair");
    private JMenuItem mniNovo = new JMenuItem("Novo");
    private JMenu mniEditar = new JMenu("Editar");
    private JMenuItem mniCopiar = new JMenuItem("Copiar");
    private JMenuItem mniColar = new JMenuItem("Colar");
    
    
    // -> Botão
   private JButton btnGravar = new JButton ("Gravar"); //Criação o controle
   
   // -> caixa de texto
   private JLabel lblUsuario = new JLabel ("Usuário");
   private JTextField txtUsuario = new JTextField ();
   
   // -> Area de Texto
   private JLabel lblDescricao = new JLabel ("Descrição");
   private JTextArea txtDescricao = new JTextArea();
   private JScrollPane jspDescricao = new JScrollPane (txtDescricao);

   // -> caixa de opções
   private JLabel lblOpcao = new JLabel ("Opção");
   private JComboBox<String> cboOpcao = new JComboBox<String> ();
   
   
   // -> Caixa de Seleção
   private JCheckBox chkSalvarSenha = new JCheckBox ("Salvar Senha");
   
   // -> Opções alternativas de Sexo
   private JLabel lblSexo = new JLabel ("Sexo");
   private JRadioButton optMasculino = new JRadioButton ("Masculino");
   private JRadioButton optFeminino = new JRadioButton ("Feminino");
   private JRadioButton optNaoBinarie = new JRadioButton ("Não Binárie");
   private ButtonGroup btgSexo = new ButtonGroup();
   
   
   // -> Lista de Opções - BANCO DE DADOS
   private JLabel lblBancoDeDados = new JLabel ("Lista de Opções - Banco de Dados");
   private JList<String> lstBancoDeDados = new JList<String> ();
   private JScrollPane jspBancoDeDados = new JScrollPane (lstBancoDeDados);
   private  DefaultListModel<String> dlmBancoDeDados = new DefaultListModel<String>();
   
   
   
   	//Metodo Principal de Execução da Classe
    public static void main(String[] args) {
        new Visao().setVisible(true);
    }

    
    public Visao(){
        setTitle("Janela de Exemplificação de Uso de Controles");
        setSize(1024,768); //1024 tamanho da base, 768 tamanho da altura
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout (null);// se não fizer isso, o java controla a posição dos controles, então fazer isso pra voce mesmo congurar a posição como quiser
        
        //CONFIGURAÇÂO BARRA DE MENU
        setJMenuBar(barraDeMenu);
        barraDeMenu.add(mniArquivo);
        barraDeMenu.add(mniEditar);
        mniArquivo.add(mniAbrir);
        mniArquivo.add(mniNovo);
        mniArquivo.addSeparator();
        mniArquivo.add(mniSair);
        mniEditar.add(mniCopiar);
        mniEditar.add(mniColar);
        
        
        //Configuração das Ações
        mniSair.addActionListener(new ControladorSair());
        mniCopiar.addActionListener(new ControladorCopiar());
        
        
        
        
        //Configuração do Botão
        btnGravar.setBounds(462, 660, 100, 30); // (x, y, Largura, altura)
        add(btnGravar);
        
        
        
        
        //Configuração da caixa de texto
        lblUsuario.setBounds (20, 20, 200, 20); // (x, y, Largura, altura)
        add(lblUsuario);
        
        txtUsuario.setBounds (20, 40, 150, 20); // (x, y, Largura, altura)
        add(txtUsuario); // Caixa para o usuario escrever texto
        
        
        
        
        //Configuração da Area de Texto
        lblDescricao.setBounds(20, 70, 200, 20); // (x, y, Largura, altura)
        add(lblDescricao);
        
        jspDescricao.setBounds(20, 90, 970, 200); // (x, y, Largura, altura)
        add(jspDescricao);
        txtDescricao.setLineWrap(true); // para quando voce for escrevendo na caixa de texto e chegar no fim, ele quebra a linha automaticamente.
        
        
        
        //Configuração da caixa de opções
        lblOpcao.setBounds(20, 300, 200, 20);
        add (lblOpcao);
        
        
        cboOpcao.setBounds(20, 320, 200, 20);
        add (cboOpcao);
        
        cboOpcao.addItem("-- Selecione --");
        cboOpcao.addItem("Opção 1");
        cboOpcao.addItem("Opção 2");
        cboOpcao.addItem("Opção 3");
        cboOpcao.addItem("Opção 4");
        cboOpcao.addItem("Opção 5");
        
        
        
        
        //Configuração da Caixa de Seleção
        chkSalvarSenha.setBounds(20, 350, 200, 20);
        add(chkSalvarSenha);
        
        
        
        
        //Configuração  do conjunto de opcoes alternativas de sexo 
        lblSexo.setBounds(20, 380, 200, 20);
        add(lblSexo);
        
        
        optMasculino.setBounds(20, 400, 150, 20);
        add(optMasculino);
        
        optFeminino.setBounds(170, 400, 150, 20);
        add(optFeminino);
        
        optNaoBinarie.setBounds(320, 400, 150, 20);
        add(optNaoBinarie);
        
        btgSexo.add(optMasculino);
        btgSexo.add(optFeminino);
        btgSexo.add(optNaoBinarie);
        optMasculino.setSelected(true);
        		
        		
        		
        		
        // Configuração da Lista de opções - BANCO DE DADOS
        lblBancoDeDados.setBounds(20, 430, 200, 20);
        add (lblBancoDeDados);
        
        jspBancoDeDados.setBounds(20, 450, 970, 200);
        add (jspBancoDeDados);
        
        
        lstBancoDeDados.setModel(dlmBancoDeDados);
        dlmBancoDeDados.addElement("Registro 1");
        dlmBancoDeDados.addElement("Registro 2");
        dlmBancoDeDados.addElement("Registro 3");
        dlmBancoDeDados.addElement("Registro 4");
        dlmBancoDeDados.addElement("Registro 5");
        
    }
    
}