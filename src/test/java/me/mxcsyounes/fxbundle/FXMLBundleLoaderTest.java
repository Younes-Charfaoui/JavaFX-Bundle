package me.mxcsyounes.fxbundle;

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
                .addExtra("bool", false)
                .addExtra("double", 2.0)
                .addExtra("char", 'c')
                .addExtra("byte", (byte) 2)
                .addExtra("Object", new StringBuilder("hi"))
                .addExtra("long", 2L)
                .addExtra("float", 2.1f);
        Assert.assertEquals(loader.getBundle().getStringExtra("String"), "String");
        Assert.assertEquals(loader.getBundle().getDoubleExtra("double"), 2.0, 0.0);
        Assert.assertEquals(loader.getBundle().getIntExtra("int"), 1);
        Assert.assertEquals(loader.getBundle().getCharExtra("char"), 'c');
        Assert.assertEquals(loader.getBundle().getByteExtra("byte"), (byte) 2);
        Assert.assertEquals(loader.getBundle().getFloatExtra("float"), 2.1f, 0.0);
        Assert.assertFalse(loader.getBundle().getBooleanExtra("bool"));
        Assert.assertEquals(loader.getBundle().size(), 9);
        StringBuilder builder = (StringBuilder) loader.getBundle().handleGetObject("Object");
        Assert.assertEquals(builder.toString(), "hi");
    }
}