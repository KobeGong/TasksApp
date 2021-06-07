package defpackage;

import android.view.ViewParent;

/* access modifiers changed from: package-private */
/* renamed from: adp  reason: default package */
/* compiled from: PG */
public final class adp implements Runnable {
    private final /* synthetic */ ado a;

    adp(ado ado) {
        this.a = ado;
    }

    public final void run() {
        ViewParent parent = this.a.a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
