package me.mxcsyoues.fxbundle;

import java.util.*;

/**
 * This class store data passed to the controller in a {@link ResourceBundle} object
 * in a {key => value} mapping. You can either Build it via {@link Builder} class
 * or just passing a {@link Map} of String => Object to the constructor of this Class.
 */
@SuppressWarnings("WeakerAccess")
public class FXBundle extends ResourceBundle {

    private Map<String, Object> map;

    private FXBundle() {
        map = new HashMap<String, Object>();
    }

    public FXBundle(Map<String, Object> map) {
        this.map = map;
    }

    /**
     * Return the number of key value pair in the bundle.
     *
     * @return number of key value pair in the bundle .
     */
    public int size() {
        return map.size();
    }

    /**
     * Removes all of the key value pairs from this bundle.
     * The bundle will be empty after this call returns.
     */
    public void clear() {
        map.clear();
    }

    private void addParameter(String key, Object value) {
        map.put(key, value);
    }

    protected Object handleGetObject(String key) {
        return map.get(key);
    }

    /**
     * This function return object stored in this map with the key parameter.
     * @param key the key associated with the object in the map bundle.
     * @return object stored in this map with the key parameter.
     */
    public Object getObjectExtra(String key) {
        return handleGetObject(key);
    }

    /**
     * This function return boolean stored in this map with the key parameter.
     * @param key the key associated with the boolean in the map bundle.
     * @param defaultValue default value to return if the boolean request is not in the fx bundle.
     * @return boolean stored in this map with the key parameter.
     */
    public boolean getBooleanExtra(String key, boolean defaultValue) {
        if (!(map.get(key) instanceof Boolean) || map.get(key) == null)
            return defaultValue;
        return (Boolean) map.get(key);
    }

    /**
     * This function return byte stored in this map with the key parameter.
     * @param key the key associated with the byte in the map bundle.
     * @param defaultValue default value to return if the byte request is not in the fx bundle.
     * @return byte stored in this map with the key parameter.
     */
    public byte getByteExtra(String key, byte defaultValue) {
        if (!(map.get(key) instanceof Byte) || map.get(key) == null)
            return defaultValue;
        return (Byte) map.get(key);
    }

    /**
     * This function return char stored in this map with the key parameter.
     * @param key the key associated with the char in the map bundle.
     * @param defaultValue default value to return if the char request is not in the fx bundle.
     * @return char stored in this map with the key parameter.
     */
    public char getCharExtra(String key, char defaultValue) {
        if (!(map.get(key) instanceof Character) || map.get(key) == null)
            return defaultValue;
        return (Character) map.get(key);
    }

    /**
     * This function return String stored in this map with the key parameter.
     * @param key the key associated with the String in the map bundle.
     * @param defaultValue default value to return if the String request is not in the fx bundle.
     * @return String stored in this map with the key parameter.
     */
    public String getStringExtra(String key, String defaultValue) {
        if (!(map.get(key) instanceof String) || map.get(key) == null)
            return defaultValue;
        return (String) map.get(key);
    }

    /**
     * This function return Short stored in this map with the key parameter.
     * @param key the key associated with the Short in the map bundle.
     * @param defaultValue default value to return if the Short request is not in the fx bundle.
     * @return Short stored in this map with the key parameter.
     */
    public short getShortExtra(String key, short defaultValue) {
        if (!(map.get(key) instanceof Short) || map.get(key) == null)
            return defaultValue;
        return (Short) map.get(key);
    }

    /**
     * This function return long stored in this map with the key parameter.
     * @param key the key associated with the long in the map bundle.
     * @param defaultValue default value to return if the long request is not in the fx bundle.
     * @return long stored in this map with the key parameter.
     */
    public long getLongExtra(String key, long defaultValue) {
        if (!(map.get(key) instanceof Long) || map.get(key) == null)
            return defaultValue;
        return (Long) map.get(key);
    }

    /**
     * This function return int stored in this map with the key parameter.
     * @param key the key associated with the int in the map bundle.
     * @param defaultValue default value to return if the int request is not in the fx bundle.
     * @return int stored in this map with the key parameter.
     */
    public int getIntExtra(String key, int defaultValue) {
        if (!(map.get(key) instanceof Integer) || map.get(key) == null)
            return defaultValue;
        return (Integer) map.get(key);
    }

    /**
     * This function return double stored in this map with the key parameter.
     * @param key the key associated with the double in the map bundle.
     * @param defaultValue default value to return if the double request is not in the fx bundle.
     * @return double stored in this map with the key parameter.
     */
    public double getDoubleExtra(String key, double defaultValue) {
        if (!(map.get(key) instanceof Double) || map.get(key) == null)
            return defaultValue;
        return (Double) map.get(key);
    }

    /**
     * This function return float stored in this map with the key parameter.
     * @param key the key associated with the float in the map bundle.
     * @param defaultValue default value to return if the float request is not in the fx bundle.
     * @return float stored in this map with the key parameter.
     */
    public float getFloatExtra(String key, float defaultValue) {
        if (!(map.get(key) instanceof Float) || map.get(key) == null)
            return defaultValue;
        return (Float) map.get(key);
    }

    /**
     * This function return boolean stored in this map with the key parameter.
     * @param key the key associated with the boolean in the map bundle.
     * @return boolean stored in this map with the key parameter.
     */
    public boolean getBooleanExtra(String key) {
        return (Boolean) map.get(key);
    }

    /**
     * This function return byte stored in this map with the key parameter.
     * @param key the key associated with the byte in the map bundle.
     * @return byte stored in this map with the key parameter.
     */
    public byte getByteExtra(String key) {
        return (Byte) map.get(key);
    }

    /**
     * This function return char stored in this map with the key parameter.
     * @param key the key associated with the char in the map bundle.
     * @return char stored in this map with the key parameter.
     */
    public char getCharExtra(String key) {
        return (Character) map.get(key);
    }

    /**
     * This function return string stored in this map with the key parameter.
     * @param key the key associated with the string in the map bundle.
     * @return string stored in this map with the key parameter.
     */
    public String getStringExtra(String key) {
        return (String) map.get(key);
    }

    /**
     * This function return short stored in this map with the key parameter.
     * @param key the key associated with the short in the map bundle.
     * @return short stored in this map with the key parameter.
     */
    public short getShortExtra(String key) {
        return (Short) map.get(key);
    }

    /**
     * This function return long stored in this map with the key parameter.
     * @param key the key associated with the long in the map bundle.
     * @return long stored in this map with the key parameter.
     */
    public long getLongExtra(String key) {
        return (Long) map.get(key);
    }

    /**
     * This function return int stored in this map with the key parameter.
     * @param key the key associated with the int in the map bundle.
     * @return int stored in this map with the key parameter.
     */
    public int getIntExtra(String key) {
        return (Integer) map.get(key);
    }

    /**
     * This function return double stored in this map with the key parameter.
     * @param key the key associated with the double in the map bundle.
     * @return double stored in this map with the key parameter.
     */
    public double getDoubleExtra(String key) {
        return (Double) map.get(key);
    }

    /**
     * This function return float stored in this map with the key parameter.
     * @param key the key associated with the float in the map bundle.
     * @return float stored in this map with the key parameter.
     */
    public float getFloatExtra(String key) {
        return (Float) map.get(key);
    }

    /**
     * This function return the keys in this fx bundle in {@link Enumeration} type.
     * @return the keys in this fx bundle
     */
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
