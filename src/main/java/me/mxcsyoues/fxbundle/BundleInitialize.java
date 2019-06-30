package me.mxcsyoues.fxbundle;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class BundleInitialize implements Initializable {

    public final void initialize(URL location, ResourceBundle resources) {
        if (resources instanceof FXBundle)
            initializeBundle(location, (FXBundle) resources);
        else
            throw new IllegalStateException("resources was " + resources.getClass().getName() + " and not instance of FXBundle");
    }

    public abstract void initializeBundle(URL location, FXBundle resources);
}
