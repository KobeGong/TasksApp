package defpackage;

import android.os.Looper;

/* renamed from: bba  reason: default package */
/* compiled from: PG */
public final class bba {
    public final bbb a;
    public volatile Object b;

    bba(Looper looper, Object obj, String str) {
        this.a = new bbb(this, looper);
        this.b = azb.b(obj, "Listener must not be null");
        new bbc(obj, azb.b(str));
    }
}
