package com.crumbsandcoffee.scoop_basics_d3.di;

/**
 * This interface is intended to be extended by components with a 1:1 relationship to
 * their injection target types. Inspired by Trevor Jones's
 * https://github.com/trevjonez/Inject-Android
 *
 * @param <T> Class that is to be injected by this component
 */
public interface ScoopComponent<T> {
    void inject(T injectTarget);
}
