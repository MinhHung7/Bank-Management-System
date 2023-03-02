import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;

public class Page02 extends JFrame implements ActionListener{
    Card card;
    Account account;

    JRadioButton savingAcc;
    JRadioButton currentAcc;
    JRadioButton fixedDepAcc;
    JRadioButton recurDepAcc;
    JLabel accountTypeLabel;
    JPanel accountTypePanel;
    JPanel pagePanel;
    JLabel card_no_label;
    JLabel card_no_Text;
    JLabel pinlabel;
    JLabel pinText;
    JLabel servicelabel;
    JRadioButton atmCard, mobileBanking, chequeBook, internetBanking, emailAlerts, estatement;
    JRadioButton agreePolicy;
    JButton submit, cancel;
    ImageIcon logoTitle;

    public String makeCardNumber(){
        String cardNumber="";
        Random random = new Random();
        int num = random.nextInt(8999)+1000;
        cardNumber+=num+"-";
        num = random.nextInt(8999)+1000;
        cardNumber+=num+"-";
        num = random.nextInt(8999)+1000;
        cardNumber+=num+"-";
        num = random.nextInt(8999)+1000;
        cardNumber+=num+"";
        return cardNumber;
    }

    public String makePin(){
        String Pin="";
        Random random = new Random();
        int num = random.nextInt(899999)+1000;
        Pin+=num+"";
        return Pin;
    }

    Page02(Card card, Account account){
        this.card = card;
        this.account = account;
        ImageIcon logo = new ImageIcon("debit-card.png");
        logoTitle = new ImageIcon("bank_fixed.png");

        JLabel titleLabel = new JLabel();
        titleLabel.setIcon(logoTitle);
        titleLabel.setText("  Page 2: Account Details");
        titleLabel.setFont(new Font("",Font.BOLD,30));
        titleLabel.setVerticalAlignment(JLabel.BOTTOM);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        pagePanel = new JPanel();
        pagePanel.setLayout(null);
        pagePanel.setBackground(Color.white);

        accountTypeLabel = new JLabel("Account Type:");
        accountTypeLabel.setFont(new Font("Arial",Font.BOLD,18));
        accountTypeLabel.setBounds(0,30,150,30);

        savingAcc = new JRadioButton("  Saving Account");
        savingAcc.setBackground(Color.white);
        savingAcc.setFocusable(false);
        savingAcc.setFont(new Font("Arial",Font.BOLD,15));

        fixedDepAcc = new JRadioButton("  Fixed Deposit Account");
        fixedDepAcc.setBackground(Color.white);
        fixedDepAcc.setFocusable(false);
        fixedDepAcc.setFont(new Font("Arial",Font.BOLD,15)); 

        currentAcc = new JRadioButton("  Current Account");
        currentAcc.setBackground(Color.white);
        currentAcc.setFocusable(false);
        currentAcc.setFont(new Font("Arial",Font.BOLD,15));

        recurDepAcc = new JRadioButton("  Recurring Deposit Account");
        recurDepAcc.setBackground(Color.white);
        recurDepAcc.setFocusable(false);
        recurDepAcc.setFont(new Font("Arial",Font.BOLD,15));

        accountTypePanel = new JPanel();
        accountTypePanel.setLayout(new FlowLayout(FlowLayout.LEFT,80,5));
        accountTypePanel.setBounds(0,70,550,70);
        accountTypePanel.setBackground(Color.white);
        accountTypePanel.add(savingAcc);
        accountTypePanel.add(fixedDepAcc);
        accountTypePanel.add(currentAcc);
        accountTypePanel.add(recurDepAcc);

        card_no_label = new JLabel("Card Number:");
        card_no_label.setFont(new Font("Arial",Font.BOLD,18));
        card_no_label.setBounds(0,140,150,30);

        card_no_Text = new JLabel(makeCardNumber());
        card_no_Text.setFont(new Font("Arial",Font.BOLD,18));
        card_no_Text.setBounds(200,140,200,30);

        pinlabel = new JLabel("PIN: ");
        pinlabel.setFont(new Font("Arial",Font.BOLD,18));
        pinlabel.setBounds(0,200,150,30);

        pinText = new JLabel(makePin());
        pinText.setFont(new Font("Arial",Font.BOLD,18));
        pinText.setBounds(200,200,200,30);

        servicelabel = new JLabel("Services Required: ");
        servicelabel.setFont(new Font("Arial",Font.BOLD,18));
        servicelabel.setBounds(0,260,200,30);

        atmCard = new JRadioButton("ATM CARD");
        atmCard.setBackground(Color.white);
        atmCard.setFocusable(false);
        atmCard.setFont(new Font("Arial",Font.BOLD,18));

        mobileBanking = new JRadioButton("Mobile Banking");
        mobileBanking.setBackground(Color.white);
        mobileBanking.setFocusable(false);
        mobileBanking.setFont(new Font("Arial",Font.BOLD,18));

        chequeBook = new JRadioButton("Cheque Book");
        chequeBook.setBackground(Color.white);
        chequeBook.setFocusable(false);
        chequeBook.setFont(new Font("Arial",Font.BOLD,18));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
        panel1.add(atmCard);
        panel1.add(mobileBanking);
        panel1.add(chequeBook);
        panel1.setBounds(0,290,200,170);
        panel1.setBackground(Color.white);

        internetBanking = new JRadioButton("Internet Banking");
        internetBanking.setBackground(Color.white);
        internetBanking.setFocusable(false);
        internetBanking.setFont(new Font("Arial",Font.BOLD,18));

        emailAlerts = new JRadioButton("EMAIL Alerts");
        emailAlerts.setBackground(Color.white);
        emailAlerts.setFocusable(false);
        emailAlerts.setFont(new Font("Arial",Font.BOLD,18));

        estatement = new JRadioButton("E-Statement");
        estatement.setBackground(Color.white);
        estatement.setFocusable(false);
        estatement.setFont(new Font("Arial",Font.BOLD,18));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
        panel2.add(internetBanking);
        panel2.add(emailAlerts);
        panel2.add(estatement);
        panel2.setBounds(240,290,200,170);
        panel2.setBackground(Color.white);

        agreePolicy = new JRadioButton("I hereby declares that the above entered details correct to the best of my knowledge.");
        agreePolicy.setBackground(Color.white);
        agreePolicy.setFocusable(false);
        agreePolicy.setFont(new Font("Arial",Font.BOLD,12));
        agreePolicy.setBounds(0,450,550,30);

        submit = new JButton();
        submit.setText("Submit");
        submit.setForeground(Color.white);
        submit.setBackground(Color.black);
        submit.addActionListener(this);
        submit.setFocusable(false);
        submit.setFont(new Font("Arial",Font.BOLD,16));
        submit.setBounds(100,520,120,35);

        cancel = new JButton();
        cancel.setText("Cancel");
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.black);
        cancel.addActionListener(this);
        cancel.setFocusable(false);
        cancel.setFont(new Font("Arial",Font.BOLD,16));
        cancel.setBounds(320,520,120,35);

        pagePanel.add(accountTypeLabel);
        pagePanel.add(accountTypePanel);
        pagePanel.add(card_no_label);
        pagePanel.add(card_no_Text);
        pagePanel.add(pinlabel);
        pagePanel.add(pinText);
        pagePanel.add(servicelabel);
        pagePanel.add(panel1);
        pagePanel.add(panel2);
        pagePanel.add(agreePolicy);
        pagePanel.add(submit);
        pagePanel.add(cancel);

        JPanel westPanel = new JPanel();
        westPanel.setPreferredSize(new Dimension(120,0));
        westPanel.setBackground(Color.white);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setIconImage(logo.getImage());
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.white);
        this.add(titleLabel,BorderLayout.NORTH);
        this.add(westPanel,BorderLayout.WEST);
        // this.add(new JPanel(),BorderLayout.EAST);
        this.add(pagePanel,BorderLayout.CENTER);
        this.setTitle("Embank");
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cancel){
            this.dispose();
            new Page02(card,account);
        }
        else if(e.getSource()==submit){
            boolean ok=true;
            int countChoose=0;
            if(savingAcc.isSelected()) ++countChoose;
            if(fixedDepAcc.isSelected()) ++countChoose;
            if(currentAcc.isSelected()) ++countChoose;
            if(recurDepAcc.isSelected()) ++countChoose;
            if(countChoose!=1){
                ok=false;
                accountTypeLabel.setForeground(Color.red);
            }
            else{
                accountTypeLabel.setForeground(Color.black);
            }
            int countService=0;
            if(atmCard.isSelected()) ++countService;
            if(internetBanking.isSelected()) ++countService;
            if(mobileBanking.isSelected()) ++countService;
            if(chequeBook.isSelected()) ++countService;
            if(emailAlerts.isSelected()) ++countService;
            if(estatement.isSelected()) ++countService;
            if(countService==0){
                ok=false;
                servicelabel.setForeground(Color.red);
            }
            else servicelabel.setForeground(Color.black);

            if(agreePolicy.isSelected()==false){    
                ok=false;
                agreePolicy.setForeground(Color.red);
            }
            else agreePolicy.setForeground(Color.black);

            if(ok==true){
                if(savingAcc.isSelected()) account.setType(savingAcc.getText());
                if(fixedDepAcc.isSelected()) account.setType(fixedDepAcc.getText());
                if(currentAcc.isSelected()) account.setType(currentAcc.getText());
                if(recurDepAcc.isSelected()) account.setType(recurDepAcc.getText());

                String cardNumber="";
                for(int i=0;i<card_no_Text.getText().length();++i){
                    if(card_no_Text.getText().charAt(i)=='-'){
                        continue;
                    }
                    else cardNumber+=card_no_Text.getText().charAt(i);
                }
                card.setCardNo(cardNumber);
                card.setPin(pinText.getText());

                if(atmCard.isSelected()) account.services.add("ATM CARD");
                if(internetBanking.isSelected()) account.services.add("Internet Banking");
                if(mobileBanking.isSelected()) account.services.add("Mobile Banking");
                if(chequeBook.isSelected()) account.services.add("Cheque Book");
                if(emailAlerts.isSelected()) account.services.add("EMAIL Alerts");
                if(estatement.isSelected()) account.services.add("E-Statement");

                JOptionPane.showConfirmDialog(null,"Card Number: "+cardNumber+"\nPin: "+pinText.getText(),"Message",JOptionPane.CLOSED_OPTION);
                this.dispose();
                new LogInOutFrame(card,account);
            }
        }
    }
}