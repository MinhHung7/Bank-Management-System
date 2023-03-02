import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositFrame extends JFrame implements ActionListener{

    JButton cancel,ok,back;
    Card card;
    Account account;
    JTextField deposit;
    
    DepositFrame(Card card,Account account){
        this.card =card;
        this.account = account;
        ImageIcon logo = new ImageIcon("atm_screen.png");
        ImageIcon logoTitle = new ImageIcon("debit-card.png");

        JLabel image = new JLabel();
        image.setIcon(logo);
        JPanel imagePanel = new JPanel();
        imagePanel.add(image);
        imagePanel.setBounds(0,0,900,900);

        JPanel menu = new JPanel();
        menu.setLayout(null);
        menu.setBackground(Color.black);
        menu.setBounds(170,248,285,237);

        JLabel title = new JLabel("ENTER AMOUNT TO DEPOSIT");
        title.setForeground(Color.green);
        title.setFont(new Font("Arial",Font.BOLD,14));
        title.setBounds(27,10,250,30);

        deposit = new JTextField();
        deposit.setFont(new Font("Arial",Font.BOLD,14));
        deposit.setForeground(Color.black);
        deposit.setBackground(Color.white);
        deposit.setBounds(10,52,265,25);

        cancel = new JButton("CANCEL");
        cancel.setFont(new Font("Arial",Font.BOLD,13));
        cancel.setForeground(Color.black);
        cancel.setBackground(Color.gray);
        cancel.setBounds(155,128,120,25);
        cancel.setFocusable(false);
        cancel.addActionListener(this);

        back = new JButton("BACK");
        back.setFont(new Font("Arial",Font.BOLD,13));
        back.setForeground(Color.black);
        back.setBackground(Color.yellow);
        back.setBounds(155,166,120,25);
        back.setFocusable(false);
        back.addActionListener(this);

        ok = new JButton("OK");
        ok.setFont(new Font("Arial",Font.BOLD,13));
        ok.setForeground(Color.black);
        ok.setBackground(Color.green);
        ok.setBounds(10,166,120,25);
        ok.setFocusable(false);
        ok.addActionListener(this);

        menu.add(title);
        menu.add(deposit);
        menu.add(back);
        menu.add(ok);
        menu.add(cancel);

        JLayeredPane atmPanel = new JLayeredPane();
        atmPanel.setBounds(0,0,900,900);
        atmPanel.add(menu);
        atmPanel.add(imagePanel);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,900);
        this.setIconImage(logoTitle.getImage());
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.add(atmPanel);
        this.setTitle("Embank");
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            this.dispose();
            new ATMFrame(card,account);
        }
        else if(e.getSource()==cancel){
            deposit.setText("");
        }
        else if(e.getSource()==ok){
            if(card.getMoney()<Long.parseLong(deposit.getText())){
                JOptionPane.showConfirmDialog(null,"Your account is not enough money","Embank",JOptionPane.CLOSED_OPTION);
            }
            else{
                card.setMoney(card.getMoney()-Long.parseLong(deposit.getText()));
                JOptionPane.showConfirmDialog(null,"Deposit successfully"+"\nYour account has: "+card.getMoney(),"Embank",JOptionPane.CLOSED_OPTION);
            }
        }
    }
}