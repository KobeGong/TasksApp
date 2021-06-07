package defpackage;

import android.os.IBinder;

/* access modifiers changed from: package-private */
/* renamed from: kn  reason: default package */
/* compiled from: PG */
public final class kn {
    private final IBinder a;

    kn(IBinder iBinder) {
        this.a = iBinder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kn) && ((kn) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
