package defpackage;

import android.graphics.Rect;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: mn  reason: default package */
/* compiled from: PG */
public final class mn implements Runnable {
    private final /* synthetic */ lc a;
    private final /* synthetic */ lc b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ qr d;
    private final /* synthetic */ View e;
    private final /* synthetic */ Rect f;

    mn(lc lcVar, lc lcVar2, boolean z, qr qrVar, View view, Rect rect) {
        this.a = lcVar;
        this.b = lcVar2;
        this.c = z;
        this.d = qrVar;
        this.e = view;
        this.f = rect;
    }

    public final void run() {
        lc lcVar = this.a;
        lc lcVar2 = this.b;
        boolean z = this.c;
        qr qrVar = this.d;
        mk.a(lcVar, lcVar2, z);
        if (this.e != null) {
            mv.a(this.e, this.f);
        }
    }
}
