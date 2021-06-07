package defpackage;

import android.os.Build;

/* renamed from: ug  reason: default package */
/* compiled from: PG */
public final class ug {
    public static final uj a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            a = new ui();
        } else if (Build.VERSION.SDK_INT >= 21) {
            a = new uh();
        } else {
            a = new uj();
        }
    }
}
