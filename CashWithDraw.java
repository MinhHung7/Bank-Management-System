import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashWithDraw extends JFrame implements ActionListener{

    JButton oneHundred,twoHundred, fiveHundred,oneMillion,twoMillion,fiveMillion,back,other;
    Card card;
    Account account;
    
    CashWithDraw(Card card,Account account){
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

        JLabel title = new JLabel("ENTER AMOUNT TO WITHDRAW");
        title.setForeground(Color.green);
        title.setFont(new Font("Arial",Font.BOLD,14));
        title.setBounds(27,10,250,30);

        oneHundred = new JButton("100.000");
        oneHundred.setFont(new Font("Arial",Font.BOLD,13));
        oneHundred.setForeground(Color.black);
        oneHundred.setBackground(Color.white);
        oneHundred.setBounds(10,52,120,25);
        oneHundred.setFocusable(false);
        oneHundred.addActionListener(this);

        twoHundred = new JButton("200.000");
        twoHundred.setFont(new Font("Arial",Font.BOLD,13));
        twoHundred.setForeground(Color.black);
        twoHundred.setBackground(Color.white);
        twoHundred.setBounds(155,52,120,25);
        twoHundred.setFocusable(false);
        twoHundred.addActionListener(this);

        oneMillion = new JButton("1.000.000");
        oneMillion.setFont(new Font("Arial",Font.BOLD,13));
        oneMillion.setForeground(Color.black);
        oneMillion.setBackground(Color.white);
        oneMillion.setBounds(155,90,120,25);
        oneMillion.setFocusable(false);
        oneMillion.addActionListener(this);

        fiveHundred = new JButton("500.000");
        fiveHundred.setFont(new Font("Arial",Font.BOLD,13));
        fiveHundred.setForeground(Color.black);
        fiveHundred.setBackground(Color.white);
        fiveHundred.setBounds(10,90,120,25);
        fiveHundred.setFocusable(false);
        fiveHundred.addActionListener(this);

        twoMillion = new JButton("2.000.000");
        twoMillion.setFont(new Font("Arial",Font.BOLD,13));
        twoMillion.setForeground(Color.black);
        twoMillion.setBackground(Color.white);
        twoMillion.setBounds(10,128,120,25);
        twoMillion.setFocusable(false);
        twoMillion.addActionListener(this);

        fiveMillion = new JButton("5.000.000");
        fiveMillion.setFont(new Font("Arial",Font.BOLD,13));
        fiveMillion.setForeground(Color.black);
        fiveMillion.setBackground(Color.white);
        fiveMillion.setBounds(155,128,120,25);
        fiveMillion.setFocusable(false);
        fiveMillion.addActionListener(this);

        back = new JButton("BACK");
        back.setFont(new Font("Arial",Font.BOLD,13));
        back.setForeground(Color.black);
        back.setBackground(Color.yellow);
        back.setBounds(155,166,120,25);
        back.setFocusable(false);
        back.addActionListener(this);

        other = new JButton("OTHER");
        other.setFont(new Font("Arial",Font.BOLD,13));
        other.setForeground(Color.black);
        other.setBackground(Color.green);
        other.setBounds(10,166,120,25);
        other.setFocusable(false);
        other.addActionListener(this);

        menu.add(title);
        menu.add(oneHundred);
        menu.add(twoHundred);
        menu.add(fiveHundred);
        menu.add(oneMillion);
        menu.add(twoMillion);
        menu.add(fiveMillion);
        menu.add(back);
        menu.add(other);

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
        else if(e.getSource()==other){
            this.dispose();
            new OtherMoneyFrame(card,account);
        }
        else if(e.getSource()==oneHundred){
            if(card.getMoney()>=100000){
                card.setMoney(card.getMoney()-100000);
                JOptionPane.showConfirmDialog(null,"WithDraw 100.000 Successfully"+"\nYour account has: "+String.valueOf(card.getMoney()),"Embank",JOptionPane.CLOSED_OPTION);
            }
            else{
                JOptionPane.showConfirmDialog(null,"Your account not enough 100.000","Embank",JOptionPane.CLOSED_OPTION);
            }
        }
        else if(e.getSource()==twoHundred){
            if(card.getMoney()>=200000){
                card.setMoney(card.getMoney()-200000);
                JOptionPane.showConfirmDialog(null,"WithDraw 200.000 Successfully"+"\nYour account has: "+String.valueOf(card.getMoney()),"Embank",JOptionPane.CLOSED_OPTION);
            }
            else{
                JOptionPane.showConfirmDialog(null,"Your account not enough 200.000","Embank",JOptionPane.CLOSED_OPTION);
            }
        }
        else if(e.getSource()==fiveHundred){
            if(card.getMoney()>=500000){
                card.setMoney(card.getMoney()-500000);
                JOptionPane.showConfirmDialog(null,"WithDraw 500.000 Successfully"+"\nYour account has: "+String.valueOf(card.getMoney()),"Embank",JOptionPane.CLOSED_OPTION);
            }
            else{
                JOptionPane.showConfirmDialog(null,"Your account not enough 500.000","Embank",JOptionPane.CLOSED_OPTION);
            }
        }
        else if(e.getSource()==oneMillion){
            if(card.getMoney()>=1000000){
                card.setMoney(card.getMoney()-1000000);
                JOptionPane.showConfirmDialog(null,"WithDraw 1.000.000 Successfully"+"\nYour account has: "+String.valueOf(card.getMoney()),"Embank",JOptionPane.CLOSED_OPTION);
            }
            else{
                JOptionPane.showConfirmDialog(null,"Your account not enough 1.000.000","Embank",JOptionPane.CLOSED_OPTION);
            }
        }
        else if(e.getSource()==twoMillion){
            if(card.getMoney()>=2000000){
                card.setMoney(card.getMoney()-2000000);
                JOptionPane.showConfirmDialog(null,"WithDraw 2.000.000 Successfully"+"\nYour account has: "+String.valueOf(card.getMoney()),"Embank",JOptionPane.CLOSED_OPTION);
            }
            else{
                JOptionPane.showConfirmDialog(null,"Your account not enough 2.000.000","Embank",JOptionPane.CLOSED_OPTION);
            }
        }
        else if(e.getSource()==fiveMillion){
            if(card.getMoney()>=5000000){
                card.setMoney(card.getMoney()-5000000);
                JOptionPane.showConfirmDialog(null,"WithDraw 5.000.000 Successfully"+"\nYour account has: "+String.valueOf(card.getMoney()),"Embank",JOptionPane.CLOSED_OPTION);
            }
            else{
                JOptionPane.showConfirmDialog(null,"Your account not enough 5.000.000","Embank",JOptionPane.CLOSED_OPTION);
            }
        }
    }
}

