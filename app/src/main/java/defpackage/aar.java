package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aar  reason: default package */
/* compiled from: PG */
public final class aar implements Runnable {
    private aau a;
    private final /* synthetic */ aap b;

    public aar(aap aap, aau aau) {
        this.b = aap;
        this.a = aau;
    }

    public final void run() {
        if (this.b.c != null) {
            ze zeVar = this.b.c;
            if (zeVar.b != null) {
                zeVar.b.a(zeVar);
            }
        }
        View view = (View) this.b.e;
        if (!(view == null || view.getWindowToken() == null || !this.a.b())) {
            this.b.j = this.a;
        }
        this.b.l = null;
    }
}
