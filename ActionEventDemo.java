import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class ActionEventDemo extends JFrame implements ActionListener
{
JButton click;
JPanel panel;
JLabel message;
public ActionEventDemo()
{
super("action event demo");
click=new JButton("click");
panel=new JPanel();
message=new JLabel();
add(panel);
panel.add(click);
panel.add(message);
}public void actionperformed(ActionEvent e)
{
message.setText("welcome to event handling in java");
}
public static void main(String[]args)
{
ActionEventDemo obj=new ActionEventDemo();
}
}
