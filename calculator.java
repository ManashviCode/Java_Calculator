import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class calculator {
    private JPanel calculator;
    private JTextField txtDisplay;
    private JButton ACButton;
    private JButton minusbutton;
    private JButton multiplybutton;
    private JButton equalbutton;
    private JButton plusbutton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a0Button;
    private JButton backButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a00Button;
    private JButton button13;
    private JButton a9Button;
    private JButton a6Button;
    private JButton dotbutton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton divisionbutton;
    double a,b,result;
    String op;

    public calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a00Button.getText());
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().contains(".")){
                    double pm=Double.parseDouble(txtDisplay.getText());
                    pm=pm*-1;
                    txtDisplay.setText(String.valueOf(pm));
                }else {
                    long PM=Long.parseLong(txtDisplay.getText());
                    PM=PM*-1;
                    txtDisplay.setText(String.valueOf(PM));
                }
            }
        });
        dotbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().contains(".")) {
                    txtDisplay.setText(txtDisplay.getText() + dotbutton.getText());
                }
            }
        });

        plusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               a=Double.parseDouble(txtDisplay.getText());
               op="+";
               txtDisplay.setText("");
            }
        });
        minusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="-";
                txtDisplay.setText("");
            }
        });
        multiplybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="*";
                txtDisplay.setText("");
            }
        });
        divisionbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="/";
                txtDisplay.setText("");
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  backspace=null;
                if (txtDisplay.getText().length()>0){
                    StringBuilder strB=new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length()-1);
                    backspace=String.valueOf(strB);
                    txtDisplay.setText(backspace);

                }
            }
        });
        equalbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b=Double.parseDouble(txtDisplay.getText());

                if (op=="+"){
                    result=a+b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op=="-") {
                    result=a-b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op=="*") {
                    result=a*b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op=="/") {
                    result=a/b;
                    txtDisplay.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
