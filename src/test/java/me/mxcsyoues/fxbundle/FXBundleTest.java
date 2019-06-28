package me.mxcsyoues.fxbundle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class FXBundleTest {

    private FXBundle.Builder builder;
    ArrayList<Integer> list;

    @Before
    public void setUp() throws Exception {
        builder = new FXBundle.Builder();
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(10);
    }

    @Test
    public void handleGetObject() {
        FXBundle bundle = builder
                .putExtra("button", "bb")
                .putExtra("list", list)
                .build();
        String btn = (String) bundle.handleGetObject("button");
        Assert.assertEquals(btn, "bb");
        ArrayList<Integer> arrayList = (ArrayList<Integer>) bundle.handleGetObject("list");

        Assert.assertEquals(arrayList.size(), 5);
        Assert.assertEquals(arrayList.size(), 5);
        Assert.assertEquals((int) arrayList.get(3), 9);
    }

    @Test
    public void getBooleanExtra() {
        FXBundle bundle = builder.putExtra("true", true)
                .putExtra("false", false).build();

        Assert.assertTrue(bundle.getBooleanExtra("true", false));
        Assert.assertFalse(bundle.getBooleanExtra("false", true));
        Assert.assertFalse(bundle.getBooleanExtra("howareyou", false));
    }

    @Test
    public void getByteExtra() {
        byte one = 1;
        byte two = 2;
        FXBundle bundle = builder.putExtra("byte1", one)
                .putExtra("byte2", two).build();

        Assert.assertEquals(bundle.getByteExtra("byte1", (byte) 2), (byte) 1);
        Assert.assertEquals(bundle.getByteExtra("byte2", (byte) 1), (byte) 2);
        Assert.assertEquals(bundle.getByteExtra("howareyou", (byte) 4), (byte) 4);
    }

    @Test
    public void getCharExtra() {
        FXBundle bundle = builder.putExtra("char1", 'a')
                .putExtra("char2", 'b').build();

        Assert.assertEquals(bundle.getCharExtra("char1", 'b'), 'a');
        Assert.assertEquals(bundle.getCharExtra("char2", 'a'), 'b');
        Assert.assertEquals(bundle.getCharExtra("howareyou", 'c'), 'c');
        Assert.assertNotEquals(bundle.getCharExtra("char1", 'v'), 'v');
    }

    @Test
    public void getStringExtra() {
        FXBundle bundle = builder.putExtra("FirstName", "Younes")
                .putExtra("LastName", "Charfaoui").build();
        Assert.assertEquals(bundle.getStringExtra("FirstName", "Charfaoui"), "Younes");
        Assert.assertEquals(bundle.getStringExtra("LastName", "Younes"), "Charfaoui");
        Assert.assertEquals(bundle.getStringExtra("hiName", "mxcs"), "mxcs");
    }

    @Test
    public void getShortExtra() {
    }

    @Test
    public void getLongExtra() {
    }

    @Test
    public void getIntExtra() {
    }

    @Test
    public void getDoubleExtra() {
    }

    @Test
    public void getFloatExtra() {
    }
}