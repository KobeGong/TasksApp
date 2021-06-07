package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: jv  reason: default package */
/* compiled from: PG */
final class jv {
    public static final jy a;

    static void a(ViewGroup viewGroup, boolean z) {
        a.a(viewGroup, z);
    }

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            a = new jx();
        } else {
            a = new jy();
        }
    }
}
