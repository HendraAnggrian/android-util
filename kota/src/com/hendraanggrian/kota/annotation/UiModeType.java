package com.hendraanggrian.kota.annotation;

import android.annotation.TargetApi;
import android.content.res.Configuration;
import android.support.annotation.IntDef;
import android.support.annotation.RequiresApi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RequiresApi(20)
@TargetApi(20)
@Retention(RetentionPolicy.SOURCE)
@IntDef({
        Configuration.UI_MODE_TYPE_UNDEFINED,
        Configuration.UI_MODE_TYPE_NORMAL,
        Configuration.UI_MODE_TYPE_DESK,
        Configuration.UI_MODE_TYPE_CAR,
        Configuration.UI_MODE_TYPE_TELEVISION,
        Configuration.UI_MODE_TYPE_APPLIANCE,
        Configuration.UI_MODE_TYPE_WATCH
})
public @interface UiModeType {
}