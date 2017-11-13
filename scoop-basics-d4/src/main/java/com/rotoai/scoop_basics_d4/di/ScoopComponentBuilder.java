package com.rotoai.scoop_basics_d4.di;

public interface ScoopComponentBuilder<M extends ScoopModule, C extends ScoopComponent> {
    ScoopComponentBuilder<M, C> scoopModule(M scoopModule);
    C build();
}
