package com.rotoai.scoop_basics_d4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.lyft.scoop.Scoop;
import com.rotoai.scoop_basics_d4.di.DaggerInjector;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.scoop.AppRouter;
import com.rotoai.scoop_basics_d4.scoop.DialogRouter;
import com.rotoai.scoop_basics_d4.scoop.DialogUiContainer;
import com.rotoai.scoop_basics_d4.scoop.MainUiContainer;
import com.rotoai.scoop_basics_d4.ui.DemoScreen;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.screen_container)
    MainUiContainer mainUiContainer;

    @BindView(R.id.dialog_container)
    DialogUiContainer dialogContainer;

    private Scoop activityScoop;

    private MainActivityComponent mainActivityComponent;

    @Inject
    AppRouter appRouter;

    @Inject
    DialogRouter dialogRouter;

    @Inject
    Map<Class<?>, ScoopComponentBuilder> scoopComponentBuilderMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        mainActivityComponent = DaggerMainActivityComponent.builder()
                .appComponent(getApp().getAppComponent())
                .build();
        mainActivityComponent.inject(this);
        getActivityScoop().inflate(R.layout.root, (ViewGroup) findViewById(R.id.root), true);
        ButterKnife.bind(this);


    }

    @Override
    protected void onResume() {
        super.onResume();
        Timber.d("onResume");

        if (!appRouter.hasActiveScreen()) {
            appRouter.goTo(new DemoScreen());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Timber.d("onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        Timber.d("onDestroy");
//        subscriptions.clear();
        getActivityScoop().destroy();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onBackPressed() {

        if (dialogContainer.onBack()) {
            return;
        }

        if (mainUiContainer.onBack()) {
            return;
        }

        if (dialogRouter.dismiss()) {
            return;
        }

        if (appRouter.goBack()) {
            return;
        }

        super.onBackPressed();
    }

    private App getApp() {
        return (App) getApplicationContext();
    }

    private Scoop getActivityScoop() {
        if (activityScoop == null) {
            Timber.d("getActivityScoop");

            DaggerInjector activityInjector = new DaggerInjector(scoopComponentBuilderMap);

            activityScoop = new Scoop.Builder("activity_scoop")
                    .service(DaggerInjector.SERVICE_NAME, activityInjector)
                    .build();
        }

        return activityScoop;
    }
}
