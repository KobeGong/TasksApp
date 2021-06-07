package defpackage;

import android.view.View;

/* renamed from: ls  reason: default package */
/* compiled from: PG */
final class ls implements Runnable {
    private final /* synthetic */ lr a;

    ls(lr lrVar) {
        this.a = lrVar;
    }

    public final void run() {
        if (this.a.a.I() != null) {
            this.a.a.a((View) null);
            this.a.b.a(this.a.a, this.a.a.K(), 0, 0, false);
        }
    }
}
