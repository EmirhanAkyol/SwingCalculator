//Bize lazım olan kütüphanelerimi çağırıyoruz.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Calculator {
    private JTextField textField1;
    private JPanel Calculator;
    private JButton additionButton;
    private JButton subtractionButton;
    private JButton divisionButton;
    private JButton multiplicationButton;
    private JTextField textField2;

    public Calculator() {
        //bölme işlemini yapıldığı kısım
        divisionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String textFieldValue = textField1.getText();
                String textFieldValue2 = textField2.getText();
                String str=textFieldValue;
                String str1=textFieldValue2;
                //try-catch ile girilen verinin double tipinde olmasını kontrol ederek, kullanıcıdan hatalı
                //tip girdiğini gören program uyarı mesajı veriyor

                try
                {//stringi double a çevirdiğimiz yer burası
                    double var =Double.parseDouble(str);
                    System.out.println(var);

                    double var1 =Double.parseDouble(str1);
                    System.out.println(var1);
//messagebox ile ekrana sonucu yansıtıyor
                    JOptionPane.showMessageDialog(null, "RESULT="+Division(var,var1));
                }
                catch(Exception ex) {

                    JOptionPane.showMessageDialog(null,"Input must be Double!");

                }
            }
        });
        additionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textFieldValue = textField1.getText();
                String textFieldValue2 = textField2.getText();
                String str=textFieldValue;
                String str1=textFieldValue2;
                try
                {
                    double var =Double.parseDouble(str);
                    System.out.println(var);

                    double var1 =Double.parseDouble(str1);
                    System.out.println(var1);

                    JOptionPane.showMessageDialog(null, "RESULT="+Addition(var,var1));
                }
                catch(Exception ex) {

                    JOptionPane.showMessageDialog(null,"Input must be Double!");

                }
            }
        });
        subtractionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                String textFieldValue = textField1.getText();
                String textFieldValue2 = textField2.getText();
                String str=textFieldValue;
                String str1=textFieldValue2;
                try
                {
                    double var =Double.parseDouble(str);
                    System.out.println(var);

                    double var1 =Double.parseDouble(str1);
                    System.out.println(var1);

                    JOptionPane.showMessageDialog(null, "RESULT="+Subtraction(var,var1));
                }
                catch(Exception ex) {

                    JOptionPane.showMessageDialog(null,"Input must be Double!");

                }
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textFieldValue = textField1.getText();
                String textFieldValue2 = textField2.getText();
                String str=textFieldValue;
                String str1=textFieldValue2;
                try
                {
                    double var =Double.parseDouble(str);
                    System.out.println(var);

                    double var1 =Double.parseDouble(str1);
                    System.out.println(var1);

                    JOptionPane.showMessageDialog(null, "RESULT="+Multiplication(var,var1));
                }
                catch(Exception ex) {

                    JOptionPane.showMessageDialog(null,"Input must be Double!");

                }
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");

        frame.setContentPane(new Calculator().Calculator);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setVisible(true);

    }
    //metodlar burada
    public  double Addition(double number1,double number2){return number1+number2; }
    public  double Subtraction(double number1,double number2) { return number1-number2; }
    public  double Division(double number1,double number2) { return number1/number2; }
    public  double Multiplication(double number1,double number2) { return number1*number2; }
}
