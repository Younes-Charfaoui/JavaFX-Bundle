package me.mxcsyoues.fxbundle;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * This class should be extended by other javafx controller instead
 * of implementing {@link Initializable} in order to get the
 * FxBundle object in the initialization of the controller so you can
 * get your stuff back after passing them.
 */
@SuppressWarnings({"unused"})
public abstract class FXBundleController implements Initializable {

    public final void initialize(URL location, ResourceBundle resources) {
        if (resources == null) {
            initializeController(location, null);
        } else {
            if (resources instanceof FXBundle)
                initializeController(location, (FXBundle) resources);
            else
                throw new IllegalStateException("resources was instance of " + resources.getClass().getName() + " and not instance of FXBundle");
        }
    }

    /**
     * Called by initialize of {@link Initializable} to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location The location used to resolve relative paths for the root object, or
     *                 <tt>null</tt> if the location is not known.
     * @param bundle   The bundle that contains your passed data to this controller.
     */
    public abstract void initializeController(URL location, FXBundle bundle);
}
