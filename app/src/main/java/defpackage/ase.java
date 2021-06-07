package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: ase  reason: default package */
public final /* synthetic */ class ase implements Runnable {
    private final View a;

    ase(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.setVisibility(4);
    }
}
