package com.crumbsandcoffee.scoop_basics_d3.di;

/**
 * For usage with less frequent android platform types such as services,
 * or other general purpose usage.
 *
 */
public interface ScoopComponentBuilderHost {
    /**
     * @param key         map lookup key, typically the injection target type of the component
     * @param builderType expected builder type to be returned
     * @param <T>         injection target type of component produced by returned builder
     * @param <B>         expected builder type for the given key
     * @return a new component builder associated with key type
     */
    <T, B extends ScoopComponentBuilder<T, ? extends ScoopComponent<T>>> B getComponentBuilder(Class<T> key, Class<B> builderType);
}
