package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.security.NetworkSecurityPolicy;

/* renamed from: ehl  reason: default package */
/* compiled from: PG */
public final class ehl {
    @TargetApi(23)
    public static boolean a() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    static {
        new ehl();
    }
}
