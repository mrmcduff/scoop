package com.rotoai.scoop_basics_d4.di;

/**
 * Created by mrmcduff on 11/9/17.
 */

public interface HasScoopSubcomponentBuilder {
    ScoopComponentBuilder getScoopComponentBuilder(Class<? extends Object> scoopObjectClass);
}
