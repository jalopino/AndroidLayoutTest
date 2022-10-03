package com.demo.trial1;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class TrialApp extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }
}
