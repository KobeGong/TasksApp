package defpackage;

import android.os.Build;

/* renamed from: sy  reason: default package */
/* compiled from: PG */
public final class sy {
    public static final ta a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new sz();
        } else if (Build.VERSION.SDK_INT >= 18) {
            a = new ta((byte) 0);
        } else {
            a = new ta();
        }
    }
}
