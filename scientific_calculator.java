import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class swingex1
{
    JFrame frm;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b10,b11,b12;
    JButton sum,min,pro,div,clear;
    JLabel txt1;
    double s1=0,s2=0;
    String d1="",d2="";
    char op=' ';
    boolean dec1=false,dec2=false;
    swingex1()
    {
        frm=new JFrame("scientific calculator");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b10=new JButton("0");
        b11=new JButton(".");
        b12=new JButton("=");
        sum=new JButton("+");
        min=new JButton("-");
        pro=new JButton("*");
        div=new JButton("/");
        b1.setBounds(20,20,70,50);
        b2.setBounds(140,20,70,50);
        b3.setBounds(250,20,70,50);
        b4.setBounds(380,20,70,50);
        b5.setBounds(20,100,70,50);
        b6.setBounds(140,100,70,50);
        b7.setBounds(250,100,70,50);
        b8.setBounds(380,100,70,50);
        b9.setBounds(20,180,70,50);
        b10.setBounds(140,180,70,50);
        b11.setBounds(250,180,70,50);
        b12.setBounds(380,180,70,50);
        sum.setBounds(20,260,70,50);
        min.setBounds(140,260,70,50);
        pro.setBounds(250,260,70,50);
        div.setBounds(380,260,70,50);
        txt1=new JLabel("result");
        txt1.setBounds(20,500,430,50);
        sum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                op='+';
            }
        });
        min.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                op='-';
            }
        });
        pro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                op='*';
            }
        });
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                op='/';
            }
        });
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double result = 0;
                if (dec1) {
                    s1 = Double.parseDouble(String.format("%s.%s", (int)s1+"", d1));
                }
                if (dec2) {
                    s2 = Double.parseDouble(String.format("%s.%s", (int)s2+"", d2));
                }
                //System.out.println(s1+" "+s2+" "+d1+" "+d2);
                switch (op) {
                    case '+':
                        result = s1 + s2;
                        break;
                    case '-':
                        result = s1 - s2;
                        break;
                    case '*':
                        result = s1 * s2;
                        break;
                    case '/':
                        if (s2 != 0) {
                            result = s1 / s2;
                        } else {
                            txt1.setText("Error: Division by zero");
                            return;
                        }
                        break;
                }
                txt1.setText(String.valueOf(result));
            }
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1&& op==' ')
                d1+="1";
                else if(dec2&& op!=' ')
                d2+="1";
                else if(op==' ')
                s1=s1*10+1;
                else
                s2=s2*10+1;
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1&& op==' ')
                d1+="2";
                else if(dec2&& op!=' ')
                d2+="2";
                else if(op==' ')
                s1=s1*10+2;
                else
                s2=s2*10+2;
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1&& op==' ')
                d1+="3";
                else if(dec2&& op!=' ')
                d2+="3";
                else if(op==' ')
                s1=s1*10+3;
                else
                s2=s2*10+3;
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1&& op==' ')
                d1+="4";
                else if(dec2&& op!=' ')
                d2+="4";
                else if(op==' ')
                s1=s1*10+4;
                else
                s2=s2*10+4;
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1&& op==' ')
                d1+="5";
                else if(dec2&& op!=' ')
                d2+="5";
                else if(op==' ')
                s1=s1*10+5;
                else
                s2=s2*10+5;
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1 && op==' ')
                d1+="6";
                else if(dec2 && op!=' ')
                d2+="6";
                else if(op==' ')
                s1=s1*10+6;
                else
                s2=s2*10+6;
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1 && op==' ')
                d1+="7";
                else if(dec2&& op!=' ')
                d2+="7";
                else if(op==' ')
                s1=s1*10+7;
                else
                s2=s2*10+7;
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1&& op==' ')
                d1+="8";
                else if(dec2&& op!=' ')
                d2+="8";
                else if(op==' ')
                s1=s1*10+8;
                else
                s2=s2*10+8;
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1&& op==' ')
                d1+="9";
                else if(dec2&& op!=' ')
                d2+="9";
                else if(op==' ')
                s1=s1*10+9;
                else
                s2=s2*10+9;
            }
        });
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(dec1&& op==' ')
                d1=d1+"0";
                else if(dec2&& op!=' ')
                d2=d2+"0";
                else if(op==' ')
                s1=s1*10;
                else
                s2=s2*10;
            }
        });
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               if(!dec1)
               {
                  dec1=true;
               }
               else if(!dec2)
               {
                   dec2=true;
               }
            }
        });
        frm.add(b1);
        frm.add(b2);
        frm.add(b3);
        frm.add(b4);
        frm.add(b5);
        frm.add(b6);
        frm.add(b7);
        frm.add(b8);
        frm.add(b9);
        frm.add(b10);
        frm.add(b11);
        frm.add(b12);
        frm.add(sum);
        frm.add(min);
        frm.add(pro);
        frm.add(div);
        frm.add(txt1);
        frm.setLayout(null);
        
        // Setting frame size and visibility
        frm.setSize(1000, 1000);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new swingex1();
    }
}