/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myorg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Refactoring",
        id = "myorg.Review"
)
@ActionRegistration(
        iconBase = "myorg/2016-09-20_19-40-41.png",
        displayName = "#CTL_Review"
)
@ActionReference(path = "Toolbars/Build", position = 500)
@Messages("CTL_Review=Quick Check")
public final class Review implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        //String msg = "Hello Netbeans World!";
        //int msgType = NotifyDescriptor.INFORMATION_MESSAGE;
        //NotifyDescriptor d = new NotifyDescriptor.Message(msg, msgType);
        //DialogDisplayer.getDefault().notify(d);
        
        NotifyDescriptor.InputLine question;
    question = new NotifyDescriptor.InputLine("Name:",
        "What's your name?",
        NotifyDescriptor.OK_CANCEL_OPTION,
        NotifyDescriptor.QUESTION_MESSAGE);
 
    if (DialogDisplayer.getDefault().notify(question) == NotifyDescriptor.OK_OPTION) {
         String msg = "Hello "+question.getInputText()+"!";
         int msgType = NotifyDescriptor.INFORMATION_MESSAGE;
         NotifyDescriptor d;
            d = new NotifyDescriptor.Message(msg, msgType);
         DialogDisplayer.getDefault().notify(d);
     }
    }
    
   
}

