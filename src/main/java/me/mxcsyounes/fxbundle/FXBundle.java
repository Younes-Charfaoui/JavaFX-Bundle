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

    /**
     * Builder class for the purpose of creating an FxBundle Object
     * that hold some values.
     */
    public static class Builder {

        private FXBundle bundle;

        public Builder() {
            this.bundle = new FXBundle();
        }

        /**
         * Clear the current builder object from it's values.
         * @return current instance of the Builder object cleared.
         */
        public Builder clear() {
            bundle.clear();
            return this;
        }

        /**
         * Add more data to the builder in Object form.
         * @param name the key of the new extra.
         * @param value the Object value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, Object value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Add more data to the builder in Boolean form.
         * @param name the key of the new extra.
         * @param value the Boolean value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, boolean value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Add more data to the builder in Byte form.
         * @param name the key of the new extra.
         * @param value the Byte value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, byte value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Add more data to the builder in Character form.
         * @param name the key of the new extra.
         * @param value the Character value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, char value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Add more data to the builder in String form.
         * @param name the key of the new extra.
         * @param value the String value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, String value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Add more data to the builder in Short form.
         * @param name the key of the new extra.
         * @param value the Short value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, short value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Add more data to the builder in Long form.
         * @param name the key of the new extra.
         * @param value the Long value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, long value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Add more data to the builder in Integer form.
         * @param name the key of the new extra.
         * @param value the Integer value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, int value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Add more data to the builder in Double form.
         * @param name the key of the new extra.
         * @param value the Double value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, double value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Add more data to the builder in Float form.
         * @param name the key of the new extra.
         * @param value the Float value associated with the name as an extra.
         * @return current instance of the Builder object.
         */
        public Builder putExtra(String name, float value) {
            bundle.addParameter(name, value);
            return this;
        }

        /**
         * Build the current Builder to {@link FXBundle} object.
         * @return an {@link FXBundle} object with the values passed throughout the {@link Builder}.
         */
        public FXBundle build() {
            return this.bundle;
        }
    }
}
