package myorg;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;

@ActionID (category = "Edit", id = "testpluginI")
@ActionRegistration(iconBase = "myorg/batmand.png",displayName = "Hello World I")
@ActionReferences({
    @ActionReference(path = "Toolbars/File"),
    @ActionReference(path = "Menu/View")
})

public class ToolBarListenerII implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
       JOptionPane.showMessageDialog(null, "Hello World I");
    }
}
