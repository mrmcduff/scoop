package com.crumbsandcoffee.scoop_basics_d3.di;

/**
 * Base type to enable multi-binding via dagger2.
 */
public interface ScoopComponentBuilder<T, C extends ScoopComponent<T>> {
    C build();
}
