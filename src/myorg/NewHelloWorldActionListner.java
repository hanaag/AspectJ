package myorg;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
/**
 *
 * @author Mar-Vel
 */
@ActionID (category = "Edit", id = "testplugin")
@ActionRegistration(displayName = "Hello World II")
@ActionReference(path = "Menu/File")
public class NewHelloWorldActionListner implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       JOptionPane.showMessageDialog(null, "Hello World II");
    }
    
}
