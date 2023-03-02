import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Page01 extends JFrame implements ActionListener{

    JButton nextButton = new JButton();

    JLabel titleLabel;
    JLabel nameLabel;
    JLabel fatherNameLabel;
    JLabel dobLabel;
    JLabel genderLabel;
    JLabel emailLabel;
    JLabel marriedLabel;
    JLabel addressLabel;
    JLabel cityLabel;
    JLabel pinLabel;
    JLabel stateLabel;
    JLabel religionLabel;
    JComboBox religionBox;

    JTextField nameText;
    JTextField fatherNameText;
    JTextField dobText;
    JTextField emailText;
    JTextField addressText;
    JTextField cityText;
    JTextField pinText;
    JTextField stateText;
    JRadioButton maleButton;
    JRadioButton femaleButton;
    JRadioButton marriedButton;
    JRadioButton unmarriedButton;
    JRadioButton otherButton;

    Card card;
    Account account;

    Page01(Card card,Account account){
        
        this.card = card;
        this.account = account;
        ImageIcon logo = new ImageIcon("debit-card.png");
        ImageIcon logoTitle = new ImageIcon("bank_fixed.png");

        titleLabel = new JLabel();
        titleLabel.setIcon(logoTitle);
        titleLabel.setText("  APPLICATION FORM NO.2004");
        titleLabel.setFont(new Font("",Font.BOLD,30));
        titleLabel.setVerticalAlignment(JLabel.BOTTOM);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel titlePage = new JLabel();
        titlePage.setText("Page 1: Personal Details");
        titlePage.setFont(new Font("",Font.BOLD,20));
        titlePage.setBounds(180,0,250,50);

        nameLabel = new JLabel();
        nameLabel.setText("Name: ");
        nameLabel.setFont(new Font("",Font.BOLD,20));
        nameLabel.setBounds(0,60,150,30);

        nameText = new JTextField();
        nameText.setBounds(180,65,400,25);
        nameText.setCaretColor(Color.black);
        nameText.setFont(new Font("Arial",Font.PLAIN,23));

        fatherNameLabel = new JLabel();
        fatherNameLabel.setText("Father's Name: ");
        fatherNameLabel.setFont(new Font("",Font.BOLD,20));
        fatherNameLabel.setBounds(0,100,150,30);

        fatherNameText = new JTextField();
        fatherNameText.setBounds(180,105,400,25);
        fatherNameText.setCaretColor(Color.black);
        fatherNameText.setFont(new Font("Arial",Font.PLAIN,23));

        dobLabel = new JLabel();
        dobLabel.setText("Date of Birth: ");
        dobLabel.setFont(new Font("",Font.BOLD,20));
        dobLabel.setBounds(0,140,150,30);

        dobText = new JTextField();
        dobText.setBounds(180,147,400,25);
        dobText.setCaretColor(Color.black);
        dobText.setText("dd/mm/yy");
        dobText.setFont(new Font("Arial",Font.PLAIN,23));

        genderLabel = new JLabel();
        genderLabel.setText("Gender: ");
        genderLabel.setFont(new Font("",Font.BOLD,20));
        genderLabel.setBounds(0,180,150,30);

        maleButton = new JRadioButton("  Male");
        maleButton.setBackground(Color.white);
        maleButton.setFocusable(false);
        maleButton.setFont(new Font("Arial",Font.BOLD,17));
        maleButton.setBounds(180,187,200,25);

        femaleButton = new JRadioButton("  Female");
        femaleButton.setBackground(Color.white);
        femaleButton.setFocusable(false);
        femaleButton.setFont(new Font("Arial",Font.BOLD,17));
        femaleButton.setBounds(380,187,200,25);

        emailLabel = new JLabel();
        emailLabel.setText("Email Address: ");
        emailLabel.setFont(new Font("",Font.BOLD,20));
        emailLabel.setBounds(0,222,150,30);

        emailText = new JTextField();
        emailText.setBounds(180,227,400,25);
        emailText.setText("@gmail.com");
        emailText.setCaretColor(Color.black);
        emailText.setFont(new Font("Arial",Font.PLAIN,23));

        marriedLabel = new JLabel();
        marriedLabel.setText("Marital Status: ");
        marriedLabel.setFont(new Font("",Font.BOLD,20));
        marriedLabel.setBounds(0,262,150,30);

        marriedButton = new JRadioButton(" Married");
        marriedButton.setBackground(Color.white);
        marriedButton.setFocusable(false);
        marriedButton.setFont(new Font("Arial",Font.BOLD,17));
        marriedButton.setBounds(180,267,100,25);

        unmarriedButton = new JRadioButton(" Unmarried");
        unmarriedButton.setBackground(Color.white);
        unmarriedButton.setFocusable(false);
        unmarriedButton.setFont(new Font("Arial",Font.BOLD,17));
        unmarriedButton.setBounds(330,267,120,25);

        otherButton = new JRadioButton(" Other");
        otherButton.setBackground(Color.white);
        otherButton.setFocusable(false);
        otherButton.setFont(new Font("Arial",Font.BOLD,17));
        otherButton.setBounds(500,267,100,25);

        addressLabel = new JLabel();
        addressLabel.setText("Address: ");
        addressLabel.setFont(new Font("",Font.BOLD,20));
        addressLabel.setBounds(0,305,150,30);

        addressText = new JTextField();
        addressText.setBounds(180,310,400,25);
        addressText.setCaretColor(Color.black);
        addressText.setFont(new Font("Arial",Font.PLAIN,23));

        cityLabel = new JLabel();
        cityLabel.setText("City: ");
        cityLabel.setFont(new Font("",Font.BOLD,20));
        cityLabel.setBounds(0,345,150,30);

        cityText = new JTextField();
        cityText.setBounds(180,350,400,25);
        cityText.setCaretColor(Color.black);
        cityText.setFont(new Font("Arial",Font.PLAIN,23));

        pinLabel = new JLabel();
        pinLabel.setText("Pin Code: ");
        pinLabel.setFont(new Font("",Font.BOLD,20));
        pinLabel.setBounds(0,385,150,30);

        pinText = new JTextField();
        pinText.setBounds(180,390,400,25);
        pinText.setCaretColor(Color.black);
        pinText.setFont(new Font("Arial",Font.PLAIN,23));

        stateLabel = new JLabel();
        stateLabel.setText("State: ");
        stateLabel.setFont(new Font("",Font.BOLD,20));
        stateLabel.setBounds(0,425,150,30);

        stateText = new JTextField();
        stateText.setBounds(180,430,400,25);
        stateText.setCaretColor(Color.black);
        stateText.setFont(new Font("Arial",Font.PLAIN,23));

        nextButton.setText("Next");
        nextButton.setBackground(Color.black);
        nextButton.setBounds(450,520,130,35);
        nextButton.setForeground(Color.white);
        nextButton.setFocusable(false);
        nextButton.setFont(new Font("Arial",Font.PLAIN,23));
        nextButton.addActionListener(this);

        religionLabel = new JLabel();
        religionLabel.setText("Religion: ");
        religionLabel.setFont(new Font("",Font.BOLD,20));
        religionLabel.setBounds(0,469,150,30);

        String[] religions={"None","Buddhism","Hindu","Catholic"};

        religionBox = new JComboBox(religions);
        religionBox.setBounds(180,470,130,35);
        religionBox.setForeground(Color.black);
        religionBox.setFocusable(false);
        religionBox.setFont(new Font("Arial",Font.PLAIN,23));
        religionBox.addActionListener(this);

        JPanel pagePanel = new JPanel();
        pagePanel.setLayout(null);
        pagePanel.add(titlePage);
        pagePanel.add(nameLabel);
        pagePanel.add(emailLabel);
        pagePanel.add(fatherNameLabel);
        pagePanel.add(dobLabel);
        pagePanel.add(genderLabel);
        pagePanel.add(nameText);
        pagePanel.add(fatherNameText);
        pagePanel.add(emailText);
        pagePanel.add(dobText);
        pagePanel.add(maleButton);
        pagePanel.add(femaleButton);
        pagePanel.add(marriedLabel);
        pagePanel.add(marriedButton);
        pagePanel.add(unmarriedButton);
        pagePanel.add(otherButton);
        pagePanel.add(addressLabel);
        pagePanel.add(addressText);
        pagePanel.add(cityLabel);
        pagePanel.add(cityText);
        pagePanel.add(pinLabel);
        pagePanel.add(pinText);
        pagePanel.add(stateLabel);
        pagePanel.add(stateText);
        pagePanel.add(nextButton);
        pagePanel.add(religionLabel);
        pagePanel.add(religionBox);
        pagePanel.setBackground(Color.white);
        pagePanel.setOpaque(true);

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
        this.add(new JPanel(),BorderLayout.EAST);
        this.add(pagePanel,BorderLayout.CENTER);
        this.setTitle("Embank");
        this.setResizable(false);
        this.setVisible(true);
    }

    public static boolean checkDob(String dob){
        if(dob.length()!=10){
            return false;
        }
        for(int i=0;i<dob.length();++i){
            if(i==2 || i==5){
                if(dob.charAt(i)!='/' || dob.charAt(i)!='/'){
                    return false;
                }
            }
            else{
                if(dob.charAt(i)<'0' || dob.charAt(i)>'9'){
                    return false;
                }
            }
        }
        return  true;
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==religionBox){
            card.setReligion(religionBox.getSelectedItem().toString());
        }
        if(e.getSource()==nextButton){
            boolean ok = true;
            if(nameText.getText().equals("")==true || nameText.getText().equals("Please enter name!")==true){
                ok=false;
                nameText.setText("Please enter name!");
                nameLabel.setForeground(Color.red);
            }
            else nameLabel.setForeground(Color.black);

            if(fatherNameText.getText().equals("")==true || fatherNameText.getText().equals("Please enter name!")==true){
                ok=false;
                fatherNameText.setText("Please enter name!");
                fatherNameLabel.setForeground(Color.red);
            }
            else fatherNameLabel.setForeground(Color.black);

            if(dobText.getText().equals("")==true || dobText.getText().equals("Please enter Day of birth (dd/mm/yy)!")==true || checkDob(dobText.getText())==false){
                ok=false;
                dobText.setText("Please enter Day of birth (dd/mm/yy)!");
                dobLabel.setForeground(Color.red);
            }
            else dobLabel.setForeground(Color.black);

            if(maleButton.isSelected()==femaleButton.isSelected()){
                ok=false;
                genderLabel.setForeground(Color.red);
            }
            else genderLabel.setForeground(Color.black);

            if(emailText.getText().length()==10 || emailText.getText().indexOf("@gmail.com")!=emailText.getText().length()-10){
                ok=false;
                emailLabel.setForeground(Color.red);
            }
            else emailLabel.setForeground(Color.black);

            int countChoose=0;
            if(marriedButton.isSelected()==true){
                ++countChoose;
            }
            if(unmarriedButton.isSelected()==true){
                ++countChoose;
            }
            if(otherButton.isSelected()==true){
                ++countChoose;
            }
            if(countChoose!=1){
                ok=false;
                marriedLabel.setForeground(Color.red);
            } 
            else marriedLabel.setForeground(Color.black);

            if(addressText.getText().equals("")==true || addressText.getText().equals("Please enter address!")==true){
                ok=false;
                addressText.setText("Please enter address!");
                addressLabel.setForeground(Color.red);
            }
            else addressLabel.setForeground(Color.black);

            if(cityText.getText().equals("")==true || cityText.getText().equals("Please enter city!")==true){
                ok=false;
                cityText.setText("Please enter city!");
                cityLabel.setForeground(Color.red);
            }
            else cityLabel.setForeground(Color.black);

            if(pinText.getText().equals("")==true || pinText.getText().equals("Please enter pin code!")==true){
                ok=false;
                pinText.setText("Please enter pin code!");
                pinLabel.setForeground(Color.red);
            }
            else pinLabel.setForeground(Color.black);

            if(stateText.getText().equals("")==true || stateText.getText().equals("Please enter state!")==true){
                ok=false;
                stateText.setText("Please enter state!");
                stateLabel.setForeground(Color.red);
            }
            else stateLabel.setForeground(Color.black);

            if(ok==true){
                card.setName(nameText.getText());
                card.setFatherName(fatherNameText.getText());
                card.setDob(dobText.getText());
                if(maleButton.isSelected()==true) card.setGender(0);
                else card.setGender(1);
                card.setEmail(emailText.getText());
                if(marriedButton.isSelected()==true) card.setMarriedStaus(0);
                else if(unmarriedButton.isSelected()==true) card.setMarriedStaus(1);
                else card.setMarriedStaus(2);
                card.setAddress(addressText.getText());
                card.setCity(cityText.getText());
                card.setState(stateText.getText());
                card.setReligion(religionBox.getSelectedItem().toString());
                card.setPinCode(pinText.getText());
                this.dispose();
                new Page02(card,account);
            }
        }
    }
}
