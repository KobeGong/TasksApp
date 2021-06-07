package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aun  reason: default package */
public final /* synthetic */ class aun implements Runnable {
    private final View a;

    aun(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.setVisibility(8);
    }
}
