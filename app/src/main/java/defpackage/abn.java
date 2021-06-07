package defpackage;

import android.graphics.PorterDuff;

/* access modifiers changed from: package-private */
/* renamed from: abn  reason: default package */
/* compiled from: PG */
public final class abn extends qy {
    public abn() {
        super(6);
    }

    static int a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
