import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMFrame extends JFrame implements ActionListener{

    JButton deposit, fastcash,pinchange,cashwithdraw,ministatement,balance,exit;
    Card card;
    Account account;
    
    ATMFrame(Card card,Account account){
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

        JLabel title = new JLabel("Please Select Your Transaction");
        title.setForeground(Color.green);
        title.setFont(new Font("Arial",Font.BOLD,15));
        title.setBounds(27,10,250,30);

        deposit = new JButton("DEPOSIT");
        deposit.setFont(new Font("Arial",Font.BOLD,10));
        deposit.setForeground(Color.black);
        deposit.setBackground(Color.white);
        deposit.setBounds(10,52,120,25);
        deposit.setFocusable(false);
        deposit.addActionListener(this);

        fastcash = new JButton("FAST CASH");
        fastcash.setFont(new Font("Arial",Font.BOLD,10));
        fastcash.setForeground(Color.black);
        fastcash.setBackground(Color.white);
        fastcash.setBounds(10,90,120,25);
        fastcash.setFocusable(false);
        fastcash.addActionListener(this);

        pinchange = new JButton("PIN CHANGE");
        pinchange.setFont(new Font("Arial",Font.BOLD,10));
        pinchange.setForeground(Color.black);
        pinchange.setBackground(Color.white);
        pinchange.setBounds(10,128,120,25);
        pinchange.setFocusable(false);
        pinchange.addActionListener(this);

        cashwithdraw = new JButton("CASH WITH DRAW");
        cashwithdraw.setFont(new Font("Arial",Font.BOLD,10));
        cashwithdraw.setForeground(Color.black);
        cashwithdraw.setBackground(Color.white);
        cashwithdraw.setBounds(155,52,120,25);
        cashwithdraw.setFocusable(false);
        cashwithdraw.addActionListener(this);

        ministatement = new JButton("MINI STATEMENT");
        ministatement.setFont(new Font("Arial",Font.BOLD,10));
        ministatement.setForeground(Color.black);
        ministatement.setBackground(Color.white);
        ministatement.setBounds(155,90,120,25);
        ministatement.setFocusable(false);
        ministatement.addActionListener(this);

        balance = new JButton("BALANCE");
        balance.setFont(new Font("Arial",Font.BOLD,10));
        balance.setForeground(Color.black);
        balance.setBackground(Color.white);
        balance.setBounds(155,128,120,25);
        balance.setFocusable(false);
        balance.addActionListener(this);

        exit = new JButton("EXIT");
        exit.setFont(new Font("Arial",Font.BOLD,10));
        exit.setForeground(Color.black);
        exit.setBackground(Color.white);
        exit.setBounds(155,166,120,25);
        exit.setFocusable(false);
        exit.addActionListener(this);
        exit.setBackground(Color.red);

        menu.add(title);
        menu.add(deposit);
        menu.add(fastcash);
        menu.add(pinchange);
        menu.add(cashwithdraw);
        menu.add(ministatement);
        menu.add(balance);
        menu.add(exit);

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
        if(e.getSource()==exit){
            this.dispose();
        }
        else if(e.getSource()==cashwithdraw){
            this.dispose();
            new CashWithDraw(card,account);
        }
        else if(e.getSource()==pinchange){
            this.dispose();
            new PinChangeFrame(card,account);
        }
        else if(e.getSource()==balance){
            JOptionPane.showConfirmDialog(null,"Your account has: "+String.valueOf(card.getMoney()),"Embank",JOptionPane.CLOSED_OPTION);
        }
        else if(e.getSource()==fastcash){
            this.dispose();
            new FastCash(card, account);
        }
        else if(e.getSource()==ministatement){
            JOptionPane.showConfirmDialog(null,"Mini statement is: 0","Embank",JOptionPane.CLOSED_OPTION);
        }
        else if(e.getSource()==deposit){
            this.dispose();
            new DepositFrame(card,account);
        }
    }
}
