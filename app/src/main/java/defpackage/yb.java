package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.apps.tasks.R;

/* renamed from: yb  reason: default package */
/* compiled from: PG */
public final class yb {
    public Context a;

    public static yb a(Context context) {
        return new yb(context);
    }

    private yb(Context context) {
        this.a = context;
    }

    public final int a() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    public final boolean b() {
        return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
}
