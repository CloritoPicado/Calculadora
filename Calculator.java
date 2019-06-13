import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Calculator implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,beq,bclr,bbin,bdec,bmod;

    static int a=0,b=0,result=0;
    static int operator=0;
    static boolean isDec = true;

    Calculator()
    {
        Image icon = Toolkit.getDefaultToolkit().getImage("icon\\deathstar.png");
        f=new JFrame("Calculator");
        f.getContentPane().setBackground(Color.BLACK);
        t=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bmod = new JButton("%");
        beq=new JButton("=");
        bclr=new JButton("Clear");
        bbin=new JButton("Binary");
        bdec = new JButton("Decimal");

        t.setBounds(30,40,280,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);

        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);

        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);

        b0.setBounds(40,310,50,40);
        beq.setBounds(110,310,50,40);
        badd.setBounds(250,310,50,40);
        bmod.setBounds(180,310,50,40);

        bclr.setBounds(30,380,70,40);
        bbin.setBounds(130,380,70,40);
        bdec.setBounds(220, 380, 90, 40);

        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bmod);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bclr);
        f.add(bbin);
        f.add(bdec);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setIconImage(icon);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bmod.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);
        bbin.addActionListener(this);
        bdec.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));

        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));

        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));

        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));

        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));

        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));

        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));

        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));

        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));

        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));

        if(e.getSource()==badd)
        {
            a=Integer.parseInt(t.getText());
            operator=1;
            t.setText("");
        }

        if(e.getSource()==bsub)
        {
            a=Integer.parseInt(t.getText());
            operator=2;
            t.setText("");
        }

        if(e.getSource()==bmul)
        {
            a=Integer.parseInt(t.getText());
            operator=3;
            t.setText("");
        }

        if(e.getSource()==bdiv)
        {
            a=Integer.parseInt(t.getText());
            operator=4;
            t.setText("");
        }

        if(e.getSource()==bmod)
        {
            a=Integer.parseInt(t.getText());
            operator=5;
            t.setText("");
        }

        if(e.getSource()==beq)
        {
            b=Integer.parseInt(t.getText());

            switch(operator)
            {
                case 1:
                    if (isDec){
                        result=a+b;
                    } else {
                        //result = insertar operacion suma binaria
                    }
                    break;

                case 2:
                    if (isDec){
                        result=a-b;
                    } else {
                        //result = insertar operacion resta binaria
                    }
                    break;

                case 3:
                    if (isDec){
                        result=a*b;
                    } else {
                        //result = insertar operacion mult binaria
                    }
                    break;

                case 4:
                    if (isDec){
                        result=a/b;
                    } else {
                        //result = insertar operacion div binaria
                    }
                    break;
                case 5:
                    if (isDec){
                        result=(a%b);
                    } else {
                        //result = insertar operacion modulo binaria
                    }
                    break;
                default:
                    result=0;
            }

            t.setText(""+result);
        }

        if(e.getSource()==bclr)
            t.setText("");



        if(e.getSource()==bbin)
        {
            isDec = false;
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }

        if(e.getSource()==bdec)
        {
            isDec = true;
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            }
        }

    public static void main(String...s)
    {
        new Calculator();
    }
}