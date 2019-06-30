package me.mxcsyoues.fxbundle;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;

public class FXMLBundleLoader {

    private URL location;
    private FXBundle.Builder bundleBuilder;

    public FXMLBundleLoader(URL location) {
        this.location = location;
        this.bundleBuilder = new FXBundle.Builder();
    }

    private FXMLBundleLoader addExtra(String key, Object value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    private FXMLBundleLoader addExtra(String key, boolean value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    private FXMLBundleLoader addExtra(String key, String value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    private FXMLBundleLoader addExtra(String key, byte value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    private FXMLBundleLoader addExtra(String key, char value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    private FXMLBundleLoader addExtra(String key, long value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    private FXMLBundleLoader addExtra(String key, int value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    private FXMLBundleLoader addExtra(String key, double value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    private FXMLBundleLoader addExtra(String key, float value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    public <T> T buildAndLoad() throws IOException {
        return FXMLLoader.load(location, bundleBuilder.build());
    }
}
