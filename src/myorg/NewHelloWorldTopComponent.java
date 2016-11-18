package myorg;

import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.HelpCtx;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionReference;
import org.openide.util.*;
import org.openide.windows.TopComponent;

@TopComponent.Description(preferredID = "NewHelloWorldTopComponent")
@TopComponent.Registration(mode = "output", openAtStartup = true)
//We want to also add a menu option so we are adding some action listeners
@ActionID (category = "Edit", id = "myorg.NewHelloWorldActionListner")
@ActionReferences({
    @ActionReference(path = "Menu/Window"),
})
@TopComponent.OpenActionRegistration(displayName = "Hello World Window", preferredID = "NewHelloWorldTopComponent")

public class NewHelloWorldTopComponent extends TopComponent {

    public NewHelloWorldTopComponent() {
        setDisplayName("Hello World");
    }
    
    
}
