import javax.swing
import java.awt.event
public class ButtonClickExample
public static void main(String[] args) {
JFrame frame = new JFrame("click button");
  JButton button = new JButton("Click Me ");
}

button.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(frame, "Button clicked!");
    }

});
frame.add(button);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.pack();

frame.setVisible(true);

}

}

doClick(space)
