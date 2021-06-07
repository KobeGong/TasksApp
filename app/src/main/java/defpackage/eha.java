package defpackage;

import android.os.Build;

/* renamed from: eha  reason: default package */
/* compiled from: PG */
public final class eha {
    public static final ehd a;

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            a = new ehc();
        } else {
            a = new ehb();
        }
    }
}
