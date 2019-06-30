package me.mxcsyoues.fxbundle;

import java.util.*;

public class FXBundle extends ResourceBundle {

    private Map<String, Object> map;

    private FXBundle() {
        map = new HashMap<String, Object>();
    }

    public int size() {
        return map.size();
    }

    public void clear() {
        map.clear();
    }

    private void addParameter(String key, Object value) {
        map.put(key, value);
    }

    protected Object handleGetObject(String key) {
        return map.get(key);
    }

    public boolean getBooleanExtra(String key, boolean defaultValue) {
        if (!(map.get(key) instanceof Boolean) || map.get(key) == null)
            return defaultValue;
        return (Boolean) map.get(key);
    }

    public byte getByteExtra(String key, byte defaultValue) {
        if (!(map.get(key) instanceof Byte) || map.get(key) == null)
            return defaultValue;
        return (Byte) map.get(key);
    }

    public char getCharExtra(String key, char defaultValue) {
        if (!(map.get(key) instanceof Character) || map.get(key) == null)
            return defaultValue;
        return (Character) map.get(key);
    }

    public String getStringExtra(String key, String defaultValue) {
        if (!(map.get(key) instanceof String) || map.get(key) == null)
            return defaultValue;
        return (String) map.get(key);
    }

    public short getShortExtra(String key, short defaultValue) {
        if (!(map.get(key) instanceof Short) || map.get(key) == null)
            return defaultValue;
        return (Short) map.get(key);
    }

    public long getLongExtra(String key, long defaultValue) {
        if (!(map.get(key) instanceof Long) || map.get(key) == null)
            return defaultValue;
        return (Long) map.get(key);
    }

    public int getIntExtra(String key, int defaultValue) {
        if (!(map.get(key) instanceof Integer) || map.get(key) == null)
            return defaultValue;
        return (Integer) map.get(key);
    }

    public double getDoubleExtra(String key, double defaultValue) {
        if (!(map.get(key) instanceof Double) || map.get(key) == null)
            return defaultValue;
        return (Double) map.get(key);
    }

    public float getFloatExtra(String key, float defaultValue) {
        if (!(map.get(key) instanceof Float) || map.get(key) == null)
            return defaultValue;
        return (Float) map.get(key);
    }

    public Enumeration<String> getKeys() {
        return Collections.enumeration(map.keySet());
    }

    public static class Builder {

        private FXBundle bundle;

        public Builder() {
            this.bundle = new FXBundle();
        }

        public Builder clear() {
            bundle.clear();
            return this;
        }

        public Builder putExtra(String name, Object value) {
            bundle.addParameter(name, value);
            return this;
        }

        public Builder putExtra(String name, boolean value) {
            bundle.addParameter(name, value);
            return this;
        }

        public Builder putExtra(String name, byte value) {
            bundle.addParameter(name, value);
            return this;
        }

        public Builder putExtra(String name, char value) {
            bundle.addParameter(name, value);
            return this;
        }

        public Builder putExtra(String name, String value) {
            bundle.addParameter(name, value);
            return this;
        }

        public Builder putExtra(String name, short value) {
            bundle.addParameter(name, value);
            return this;
        }

        public Builder putExtra(String name, long value) {
            bundle.addParameter(name, value);
            return this;
        }

        public Builder putExtra(String name, int value) {
            bundle.addParameter(name, value);
            return this;
        }

        public Builder putExtra(String name, double value) {
            bundle.addParameter(name, value);
            return this;
        }

        public Builder putExtra(String name, float value) {
            bundle.addParameter(name, value);
            return this;
        }

        public FXBundle build() {
            return this.bundle;
        }
    }
}
