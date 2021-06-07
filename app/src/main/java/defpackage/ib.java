package defpackage;

import android.os.Build;

/* renamed from: ib  reason: default package */
/* compiled from: PG */
final class ib {
    public static final AbstractC0000if a;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            a = new ie();
        } else {
            a = new ic();
        }
    }
}
