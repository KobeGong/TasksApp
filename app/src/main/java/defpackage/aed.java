package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aed  reason: default package */
/* compiled from: PG */
public final class aed implements Runnable {
    private final /* synthetic */ aec a;

    aed(aec aec) {
        this.a = aec;
    }

    public final void run() {
        View view = this.a.l;
        if (view != null && view.getWindowToken() != null) {
            this.a.d();
        }
    }
}
