package co.edu.uptc.view; 
/*Author: Paula Andrea Betancourt Matamoros
 * Date: 
 * Description: 
 */
import javax.swing.JOptionPane;

import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;

public class ConsoleView implements ViewInterface{
    private PresenterInterface presenter;

    @Override
    public void setPresenter(PresenterInterface presenter) {
        this.presenter = presenter; 
    }

    @Override
    public void start() {
    } 
    
}
