package com.danthought.sunset;

import android.support.v4.app.Fragment;

/**
 * Created by danjiang on 16/5/3.
 */
public class SunsetActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return SunsetFragment.newInstance();
    }
}
