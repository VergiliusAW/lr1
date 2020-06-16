import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel l1;
    private JButton Enter;
    private JTextField informPosl;
    private JLabel lk;
    private JLabel lm;
    private JLabel ln;
    private JTextField k_textField;
    private JTextField m_textField;
    private JTextField n_textField;
    private JButton kodir;
    private JLabel l2;
    private JTextField kodKomb;
    private JComboBox a_comboBox;
    private JLabel la;
    private JLabel l3;
    private JTextField in_kodKomb;
    private JButton dekodir;
    private JLabel lkontr;
    private JLabel lr;
    private JLabel lN;
    private JLabel lE;
    private JTextField kontrNum_textField;
    private JTextField r_textField;
    private JTextField N_textField;
    private JComboBox e_comboBox;
    private JTextField result_TF;
    private JButton exit;
    private JLabel lres;

    public App() {
        setContentPane(contentPane);
      //  setModal(true);


        //добавил ещё чуть-чуть комментариев



//
//        buttonCancel.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                onCancel();
//            }
//        });
//

        //трыц тыц телевизор

//        // call onCancel() when cross is clicked
//        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                onCancel();
//            }
//        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) { onExit(); }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onExit();
            }
        });
        Enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(informPosl.getText());
            }
        });
    }

    private void onExit() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {


        System.out.println("Привет, запускаю телевизор…");


        App dialog = new App();
        dialog.pack();
        dialog.setResizable(false); // Отключение возможности менять размер окна
        dialog.setVisible(true);
       // System.exit(0);
    }
}
