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


    //Новая ветка от br
    //Пытаюсь разобраться с ветками на GitHub

    public App() {
        setContentPane(contentPane);
      //  setModal(true);


        //добавил ещё чуть-чуть комментариев


//.......


        //добавил ещё комментариев

        //пук

        //добавил код и удалил код


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

        System.out.println("Привет, запускаю программму…");

        System.out.println("Привет, запускаю телевизор…");


        App dialog = new App();
        dialog.pack();
        dialog.setResizable(false); // Отключение возможности менять размер окна
        dialog.setVisible(true);
       // System.exit(0);
    }
}
