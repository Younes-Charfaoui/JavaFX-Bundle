package me.mxcsyoues.fxbundle;

import javafx.scene.Parent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class FXMLBundleLoaderTest {

    @Test
    public void addExtra() throws IOException {
        FXMLBundleLoader loader = new FXMLBundleLoader(getClass().getResource(""));
        loader.getBundle();
        Assert.assertEquals(loader.getBundle().size(), 0);
        loader.addExtra("String", "String")
                .addExtra("int", 1)
                .addExtra("double", 2.0)
                .addExtra("Object", new StringBuilder())
                .addExtra("long", 2L);
        Assert.assertEquals(loader.getBundle().size(), 5);
        Assert.assertEquals(loader.getBundle().getStringExtra("String", ""), "String");
    }
}