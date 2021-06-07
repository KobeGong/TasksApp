package defpackage;

import android.graphics.Typeface;

/* access modifiers changed from: package-private */
/* renamed from: oq  reason: default package */
/* compiled from: PG */
public final class oq implements Runnable {
    private final /* synthetic */ Typeface a;
    private final /* synthetic */ op b;

    oq(op opVar, Typeface typeface) {
        this.b = opVar;
        this.a = typeface;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
