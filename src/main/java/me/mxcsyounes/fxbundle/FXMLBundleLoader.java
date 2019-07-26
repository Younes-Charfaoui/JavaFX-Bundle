/*
  MIT License

  Copyright (c) 2019 Younes Charfaoui

  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:

  The above copyright notice and this permission notice shall be included in all
  copies or substantial portions of the Software.

  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
  SOFTWARE.
 */
package me.mxcsyounes.fxbundle;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;


/**
 * Loads an object hierarchy from an XML document associated with {@link FXBundle}
 * Object to the controller if this XML document, it will automatically
 * initialize the controller with the FXBundle built in this {@link FXMLBundleLoader}
 * object.
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FXMLBundleLoader {

    private URL location;
    private FXBundle.Builder bundleBuilder;

    /**
     * create an instance of the Loader with fresh new bundle
     * FXBundle ready to be filled.
     * @param location of the FXML file.
     */
    public FXMLBundleLoader(URL location) {
        this.location = location;
        this.bundleBuilder = new FXBundle.Builder();
    }

    /**
     * Store an Object value with the FXMLBundleLoader.
     * @param key key to save the Object value in the map.
     * @param value Object value which we want to pass.
     * @return the Current {@link FXMLBundleLoader} instance
     */
    public FXMLBundleLoader addExtra(String key, Object value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    /**
     * Get the bundle built in the loader after successive addExtra.
     * @return the {@link FXBundle} built in the loader.
     */
    public FXBundle getBundle() {
        return bundleBuilder.build();
    }

    /**
     * Store an Boolean value with the FXMLBundleLoader.
     * @param key key to save the Boolean value in the map.
     * @param value Boolean value which we want to pass.
     * @return the Current {@link FXMLBundleLoader} instance
     */
    public FXMLBundleLoader addExtra(String key, boolean value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    /**
     * Store an String value with the FXMLBundleLoader.
     * @param key key to save the String value in the map.
     * @param value String value which we want to pass.
     * @return the Current {@link FXMLBundleLoader} instance
     */
    public FXMLBundleLoader addExtra(String key, String value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }
    /**
     * Store an Byte value with the FXMLBundleLoader.
     * @param key key to save the Byte value in the map.
     * @param value Byte value which we want to pass.
     * @return the Current {@link FXMLBundleLoader} instance
     */
    public FXMLBundleLoader addExtra(String key, byte value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }
    /**
     * Store an Character value with the FXMLBundleLoader.
     * @param key key to save the Character value in the map.
     * @param value Character value which we want to pass.
     * @return the Current {@link FXMLBundleLoader} instance
     */
    public FXMLBundleLoader addExtra(String key, char value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }
    /**
     * Store an Long value with the FXMLBundleLoader.
     * @param key key to save the Long value in the map.
     * @param value Long value which we want to pass.
     * @return the Current {@link FXMLBundleLoader} instance
     */
    public FXMLBundleLoader addExtra(String key, long value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }
    /**
     * Store an Integer value with the FXMLBundleLoader.
     * @param key key to save the Integer value in the map.
     * @param value Integer value which we want to pass.
     * @return the Current {@link FXMLBundleLoader} instance
     */
    public FXMLBundleLoader addExtra(String key, int value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }
    /**
     * Store an Double value with the FXMLBundleLoader.
     * @param key key to save the Double value in the map.
     * @param value Double value which we want to pass.
     * @return the Current {@link FXMLBundleLoader} instance
     */
    public FXMLBundleLoader addExtra(String key, double value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }
    /**
     * Store an Float value with the FXMLBundleLoader.
     * @param key key to save the Float value in the map.
     * @param value Float value which we want to pass.
     * @return the Current {@link FXMLBundleLoader} instance
     */
    public FXMLBundleLoader addExtra(String key, float value) {
        bundleBuilder.putExtra(key, value);
        return this;
    }

    /**
     * Load the FXML file and get back the Top node within it.
     * @param <T> the Type of the Node we want to retrieve.
     * @return the Top Node of the FXML file.
     * @throws IOException if the location is malformed.
     */
    public <T> T buildAndLoad() throws IOException {
        return FXMLLoader.load(location, bundleBuilder.build());
    }
}
