package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.*;

import co.edu.uptc.model.ModelImplement;
import co.edu.uptc.view.ConsoleView;

public class Runner {
    static PresenterInterface presenter; 
    static ModelInterface model; 
    static ViewInterface view; 

    private static void makeMVP(){
        presenter = new MainPresenter(); 
        model = new ModelImplement(); 
        view = new ConsoleView(); 

        presenter.setView(view);
        presenter.setModel(model);
        view.setPresenter(presenter);

    }
    public void start() {
        makeMVP(); 
        view.start(); 
    }
}
