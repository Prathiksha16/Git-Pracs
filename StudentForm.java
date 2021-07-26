import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends Frame implements ActionListener
{
Label l1=new Label("Name : ");//OBJECT CREATE 
Label l2=new Label("Surname : ");//OBJECT CREATE
Label l3=new Label("Roll No :");//OBJECT CREATE
Label l4=new Label("Batch :");//OBJECT CREATE
Label l5=new Label("Semester :");//OBJECT CREATE
Label l6=new Label("Email :");//OBJECT CREATE
Label l7=new Label("Mobile No :");//OBJECT CREATE
Label l8=new Label("Address :");//OBJECT CREATE
Label l9=new Label(" ");//OBJECT CREATE
TextField t1=new TextField();//OBJECT CREATE
TextField t2=new TextField(); //OBJECT CREATE
TextField t3=new TextField(); //OBJECT CREATE
TextField t4=new TextField(); //OBJECT CREATE
TextField t5=new TextField(); //OBJECT CREATE
TextField t6=new TextField(); //OBJECT CREATE
TextField t7=new TextField(); //OBJECT CREATE
TextField t8=new TextField(); //OBJECT CREATE
Button b=new Button("Submit");//OBJECT CREATE
   
	public StudentForm()
	{
                                add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(l7);
		add(t7);
		add(l8);
		add(t8);
		add(b);
		add(l9);
		l1.setBounds(20,45,70,20);//set co-ordinates 
		t1.setBounds(180,45,200,20);
		l2.setBounds(20,95,70,20);
		t2.setBounds(180,95,200,20);
		l3.setBounds(20,145,70,20);
		t3.setBounds(180,145,200,20);
		l4.setBounds(20,195,70,20);
		t4.setBounds(180,195,200,20);
		l5.setBounds(20,245,70,20);
		t5.setBounds(180,245,200,20);
		l6.setBounds(20,295,70,20);
		t6.setBounds(180,295,200,20);
		l7.setBounds(20,345,70,20);
		t7.setBounds(180,345,200,20);
		l8.setBounds(20,395,70,20);
		t8.setBounds(180,395,200,20);
                                l9.setBounds(400,200,100,50);
                                b.setBounds(400,400,100,50);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{ 
		l9.setText("SUBMITTED "+t1.getText());
	}
	public static void main(String s[])
    {
		StudentForm l=new StudentForm();
		l.setSize(new Dimension(600,600));
		l.setTitle("Student Form");
		l.setVisible(true);
   }//end of main
}//end of class Studentform
 