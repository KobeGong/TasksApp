package defpackage;

import android.os.Build;

/* renamed from: ut  reason: default package */
/* compiled from: PG */
public final class ut {
    public static final uu a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new uv();
        } else {
            a = new uu();
        }
    }
}
