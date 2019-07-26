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
