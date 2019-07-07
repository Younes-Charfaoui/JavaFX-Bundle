package me.mxcsyoues.fxbundle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class FXBundleTest {

    private FXBundle.Builder builder;
    private ArrayList<Integer> list;

    @Before
    public void setUp() {
        builder = new FXBundle.Builder();
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(10);
    }

    @Test
    public void mapConstructor() {
        Map<String, Object> map = new HashMap();
        map.put("string", "younes");
        map.put("int", -5);
        map.put("double", 2.0);

        FXBundle bundle = new FXBundle(map);
        Assert.assertEquals(bundle.getStringExtra("string"), "younes");
        Assert.assertEquals(bundle.getIntExtra("int"), -5);
        Assert.assertEquals(bundle.getDoubleExtra("double"), 2.0, 0.0);
    }

    @Test
    public void size() {
        FXBundle bundle = builder.putExtra("string", "hello honey")
                .putExtra("list", list)
                .putExtra("me", 1)
                .putExtra("you", 0.0)
                .putExtra("hi", 0L)
                .build();
        Assert.assertEquals(bundle.size(), 5);
        bundle = builder.clear().build();
        Assert.assertEquals(bundle.size(), 0);
    }

    @Test
    public void clear() {
        FXBundle bundle = builder.putExtra("string", "hello honey")
                .putExtra("list", list)
                .putExtra("me", 1)
                .putExtra("you", 0.0)
                .build();
        Assert.assertEquals(bundle.size(), 4);
        bundle = builder.clear().build();
        Assert.assertEquals(bundle.size(), 0);
    }

    @Test
    public void getKeys() {
        FXBundle bundle = builder.putExtra("string", "hello honey")
                .putExtra("list", list)
                .putExtra("me", 1)
                .putExtra("you", 0.0)
                .build();
        ArrayList<String> enumList = Collections.list(bundle.getKeys());
        Assert.assertEquals(enumList.size(), 4);
        Assert.assertTrue(enumList.contains("me"));
        Assert.assertTrue(enumList.contains("list"));
        Assert.assertTrue(enumList.contains("me"));
        Assert.assertTrue(enumList.contains("you"));
        Assert.assertFalse(enumList.contains("hello"));
    }

    @Test
    public void handleGetObject() {
        FXBundle bundle = builder.putExtra("string", "hello honey")
                .putExtra("list", list)
                .build();
        Assert.assertEquals(bundle.handleGetObject("string"), "hello honey");
        ArrayList<Integer> arrayList = (ArrayList<Integer>) bundle.handleGetObject("list");
        Assert.assertEquals(arrayList.size(), 5);
        Assert.assertEquals(arrayList.size(), 5);
        Assert.assertEquals((int) arrayList.get(3), 9);
    }

    @Test
    public void getObjectExtra() {
        FXBundle bundle = builder.putExtra("string", "hello honey")
                .putExtra("list", list)
                .build();
        Assert.assertEquals(bundle.getObjectExtra("string"), "hello honey");
        ArrayList<Integer> arrayList = (ArrayList<Integer>) bundle.getObjectExtra("list");
        Assert.assertEquals(arrayList.size(), 5);
        Assert.assertEquals(arrayList.size(), 5);
        Assert.assertEquals((int) arrayList.get(3), 9);
    }

    @Test
    public void getBooleanExtra() {
        FXBundle bundle = builder.putExtra("true", true).putExtra("false", false).build();
        Assert.assertTrue(bundle.getBooleanExtra("true", false));
        Assert.assertTrue(bundle.getBooleanExtra("true"));
        Assert.assertFalse(bundle.getBooleanExtra("false", true));
        Assert.assertFalse(bundle.getBooleanExtra("false"));
        Assert.assertFalse(bundle.getBooleanExtra("howareyou", false));
    }

    @Test
    public void getByteExtra() {
        byte one = 1;
        byte two = 2;
        FXBundle bundle = builder.putExtra("byte1", one).putExtra("byte2", two).build();
        Assert.assertEquals(bundle.getByteExtra("byte1", (byte) 2), (byte) 1);
        Assert.assertEquals(bundle.getByteExtra("byte1"), (byte) 1);
        Assert.assertEquals(bundle.getByteExtra("byte2", (byte) 1), (byte) 2);
        Assert.assertEquals(bundle.getByteExtra("byte2"), (byte) 2);
        Assert.assertEquals(bundle.getByteExtra("howareyou", (byte) 4), (byte) 4);
    }

    @Test
    public void getCharExtra() {
        FXBundle bundle = builder.putExtra("char1", 'a').putExtra("char2", 'b').build();
        Assert.assertEquals(bundle.getCharExtra("char1", 'b'), 'a');
        Assert.assertEquals(bundle.getCharExtra("char1"), 'a');
        Assert.assertEquals(bundle.getCharExtra("char2", 'a'), 'b');
        Assert.assertEquals(bundle.getCharExtra("char2"), 'b');
        Assert.assertEquals(bundle.getCharExtra("howareyou", 'c'), 'c');
        Assert.assertNotEquals(bundle.getCharExtra("char1", 'v'), 'v');
        Assert.assertNotEquals(bundle.getCharExtra("char1"), 'v');
    }

    @Test
    public void getStringExtra() {
        FXBundle bundle = builder.putExtra("FirstName", "Younes").putExtra("LastName", "Charfaoui").build();
        Assert.assertEquals(bundle.getStringExtra("FirstName", "Charfaoui"), "Younes");
        Assert.assertEquals(bundle.getStringExtra("FirstName"), "Younes");
        Assert.assertEquals(bundle.getStringExtra("LastName", "Younes"), "Charfaoui");
        Assert.assertEquals(bundle.getStringExtra("LastName"), "Charfaoui");
        Assert.assertEquals(bundle.getStringExtra("hiName", "mxcs"), "mxcs");
    }

    @Test
    public void getShortExtra() {
        short one = 1;
        short two = 2;
        FXBundle bundle = builder.putExtra("one", one).putExtra("two", two).build();
        Assert.assertEquals(bundle.getShortExtra("one", (short) 3), (short) 1);
        Assert.assertEquals(bundle.getShortExtra("one"), (short) 1);
        Assert.assertEquals(bundle.getShortExtra("two", (short) 4), (short) 2);
        Assert.assertEquals(bundle.getShortExtra("two"), (short) 2);
        Assert.assertEquals(bundle.getShortExtra("hiName", (short) 5), (short) 5);
    }

    @Test
    public void getLongExtra() {
        FXBundle bundle = builder.putExtra("FirstName", 2L).putExtra("LastName", 3L).build();
        Assert.assertEquals(bundle.getLongExtra("FirstName", 3L), 2L);
        Assert.assertEquals(bundle.getLongExtra("FirstName"), 2L);
        Assert.assertEquals(bundle.getLongExtra("LastName", 2L), 3L);
        Assert.assertEquals(bundle.getLongExtra("LastName"), 3L);
        Assert.assertEquals(bundle.getLongExtra("hiName", 5L), 5L);
    }

    @Test
    public void getIntExtra() {
        FXBundle bundle = builder.putExtra("FirstName", 2).putExtra("LastName", 3).build();
        Assert.assertEquals(bundle.getIntExtra("FirstName", 3), 2);
        Assert.assertEquals(bundle.getIntExtra("FirstName"), 2);
        Assert.assertEquals(bundle.getIntExtra("LastName", 2), 3);
        Assert.assertEquals(bundle.getIntExtra("LastName"), 3);
        Assert.assertEquals(bundle.getIntExtra("hiName", 5), 5);
    }

    @Test
    public void getDoubleExtra() {
        FXBundle bundle = builder.putExtra("FirstName", 2.0).putExtra("LastName", 3.0).build();
        Assert.assertEquals(bundle.getDoubleExtra("FirstName", 3.0), 2.0, 0.0);
        Assert.assertEquals(bundle.getDoubleExtra("FirstName"), 2.0, 0.0);
        Assert.assertEquals(bundle.getDoubleExtra("LastName", 2.0), 3.0, 0.0);
        Assert.assertEquals(bundle.getDoubleExtra("LastName"), 3.0, 0.0);
        Assert.assertEquals(bundle.getDoubleExtra("hiName", 5.0), 5.0, 0.0);
    }

    @Test
    public void getFloatExtra() {
        FXBundle bundle = builder.putExtra("FirstName", 2f).putExtra("LastName", 3f).build();
        Assert.assertEquals(bundle.getFloatExtra("FirstName", 3f), 2f, 0f);
        Assert.assertEquals(bundle.getFloatExtra("FirstName"), 2f, 0f);
        Assert.assertEquals(bundle.getFloatExtra("LastName", 2f), 3f, 0f);
        Assert.assertEquals(bundle.getFloatExtra("LastName"), 3f, 0f);
        Assert.assertEquals(bundle.getFloatExtra("hiName", 5f), 5f, 0f);
    }
}