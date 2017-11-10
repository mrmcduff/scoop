package com.rotoai.scoop_basics_d4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lyft.scoop.Scoop;

import javax.inject.Inject;
import javax.inject.Provider;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    private Scoop activityScoop;

    private MainActivityComponent mainActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainActivityComponent = DaggerMainActivityComponent.builder()
                .appComponent(getApp().getAppComponent())
                .build();
        mainActivityComponent.inject(this);
        setContentView(R.layout.activity_main);

//        getActivityScoop().inflate(R.layout.root, (ViewGroup) findViewById(R.id.root), true);


    }

    private App getApp() {
        return (App) getApplicationContext();
    }

//    private Scoop getActivityScoop() {
//        if (activityScoop == null) {
//            Timber.d("getActivityScoop");
//
//            DaggerInjector activityInjector = new DaggerInjector(scoopComponentBuilderMap);
//
//            activityScoop = new Scoop.Builder("activity_scoop")
//                    .service(DaggerInjector.SERVICE_NAME, activityInjector)
//                    .build();
//        }
//
//        return activityScoop;
//    }
}
