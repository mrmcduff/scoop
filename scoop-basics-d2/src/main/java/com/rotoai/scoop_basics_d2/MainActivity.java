package com.rotoai.scoop_basics_d2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.lyft.scoop.Scoop;
import com.rotoai.scoop_basics_d2.di.ScoopComponent;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    private Scoop activityScoop;

    private MainActivityComponent mainActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActivityScoop().inflate(R.layout.root, (ViewGroup) findViewById(R.id.root), true);

        mainActivityComponent = DaggerMainActivityComponent.builder()
                .appComponent(getApp().getAppComponent())
                .build();
        mainActivityComponent.inject(this);
    }


    private App getApp() {
        return (App) getApplicationContext();
    }

    private Scoop getActivityScoop() {
        if (activityScoop == null) {
            Timber.d("getActivityScoop");

            ScoopComponent activityInjector = new ScoopComponent(mainActivityComponent);

            activityScoop = new Scoop.Builder("activity_scoop")
                    .service(ScoopComponent.SERVICE_NAME, activityInjector)
                    .build();
        }

        return activityScoop;
    }
}
