package me.mxcsyoues.fxbundle;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;


/**
 * Loads an object hierarchy from an XML document associated with bundle
 * to the controller via i
 * @since JavaFX 2.0
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FXMLBundleLoader {

    private URL location;
    private FXBundle.Builder bundleBuilder;

    public FXMLBundleLoader(URL location) {
        this.location = location;
        this.bundleBuilder = new FXBundle.Builder();
    }

    public FXMLBundleLoader addExtra(String key, Object value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }


    public FXBundle getBundle() {
        return bundleBuilder.build();
    }

    public FXMLBundleLoader addExtra(String key, boolean value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    public FXMLBundleLoader addExtra(String key, String value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    public FXMLBundleLoader addExtra(String key, byte value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    public FXMLBundleLoader addExtra(String key, char value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    public FXMLBundleLoader addExtra(String key, long value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    public FXMLBundleLoader addExtra(String key, int value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    public FXMLBundleLoader addExtra(String key, double value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    public FXMLBundleLoader addExtra(String key, float value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    public <T> T buildAndLoad() throws IOException {
        return FXMLLoader.load(location, bundleBuilder.build());
    }
}
