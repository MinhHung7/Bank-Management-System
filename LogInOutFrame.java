import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInOutFrame extends JFrame implements ActionListener{

    JButton clearButton;
    JButton signInButton;
    JButton signUpButton;
    JTextField pin_text;
    JTextField card_no_text;

    String right_card_no;
    String right_pin;

    Card card;
    Account account;

    LogInOutFrame(Card card,Account account){
        this.account = account;
        this.card = card;
        right_card_no = card.getCardNo();
        right_pin = card.getPin();

        ImageIcon logo = new ImageIcon("debit-card.png");
        ImageIcon logoTitle = new ImageIcon("bank_fixed.png");

        JLabel titleLabel = new JLabel();
        titleLabel.setIcon(logoTitle);
        titleLabel.setText("    WELCOME TO ATM");
        titleLabel.setFont(new Font("",Font.BOLD,30));
        titleLabel.setVerticalAlignment(JLabel.BOTTOM);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel card_no_label = new JLabel();
        card_no_label.setText("Card No:");
        card_no_label.setFont(new Font("",Font.BOLD,25));
        card_no_label.setBounds(50,60,150,30);

        JLabel pinlabel = new JLabel();
        pinlabel.setText("Pin:");
        pinlabel.setFont(new Font("",Font.BOLD,25));
        pinlabel.setBounds(50,110,150,30);

        card_no_text = new JTextField();
        card_no_text.setBounds(230,60,250,30);
        card_no_text.setCaretColor(Color.black);
        card_no_text.setFont(new Font("Arial",Font.PLAIN,23));

        pin_text = new JTextField();
        pin_text.setBounds(230,110,250,30);
        pin_text.setCaretColor(Color.black);
        pin_text.setFont(new Font("Arial",Font.PLAIN,23));

        signInButton = new JButton("SIGN IN");
        signInButton.setBackground(Color.black);
        signInButton.setForeground(Color.white);
        signInButton.setBounds(230,180,110,30);
        signInButton.setFocusable(false);
        signInButton.addActionListener(this);

        clearButton = new JButton("CLEAR");
        clearButton.setBackground(Color.black);
        clearButton.setForeground(Color.white);
        clearButton.setBounds(370,180,110,30);
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);

        signUpButton = new JButton("SIGN UP");
        signUpButton.setBackground(Color.black);
        signUpButton.setForeground(Color.white);
        signUpButton.setBounds(230,230,250,30);
        signUpButton.setFocusable(false);
        signUpButton.addActionListener(this);

        JPanel registerPanel = new JPanel();
        registerPanel.setLayout(null);
        registerPanel.add(card_no_label);
        registerPanel.add(pinlabel);
        registerPanel.add(card_no_text);
        registerPanel.add(pin_text);
        registerPanel.add(signInButton);
        registerPanel.add(signUpButton);
        registerPanel.add(clearButton);
        registerPanel.setBackground(Color.white);
        registerPanel.setOpaque(true);

        JPanel westPanel = new JPanel();
        westPanel.setPreferredSize(new Dimension(150,0));
        westPanel.setBackground(Color.white);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,500);
        this.setIconImage(logo.getImage());
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.white);
        this.add(titleLabel,BorderLayout.NORTH);
        this.add(westPanel,BorderLayout.WEST);
        this.add(new JPanel(),BorderLayout.EAST);
        this.add(registerPanel,BorderLayout.CENTER);
        this.setTitle("Embank");
        this.setResizable(false);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clearButton){
            card_no_text.setText(null);
            pin_text.setText(null);
        }
        else if(e.getSource()==signInButton){
            if(card_no_text.getText().equals(right_card_no)==false){
                card_no_text.setText("Wrong Card No!");
            }
            if(pin_text.getText().equals(right_pin) ==false){
                pin_text.setText("Wrong Pin!");
            }
            if(card_no_text.getText().equals(right_card_no)==true && pin_text.getText().equals(right_pin) ==true){
                this.dispose();
                new ATMFrame(card, account);
            }
        }
        else if(e.getSource()==signUpButton){
            this.dispose();
            new Page01(card,account);
        }
    }

}
