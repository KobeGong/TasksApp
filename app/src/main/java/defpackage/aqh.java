package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aqh  reason: default package */
public final /* synthetic */ class aqh implements Runnable {
    private final View a;

    aqh(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.setVisibility(8);
    }
}
