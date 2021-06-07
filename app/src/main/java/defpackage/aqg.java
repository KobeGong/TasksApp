package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aqg  reason: default package */
public final /* synthetic */ class aqg implements Runnable {
    private final aqa a;
    private final View b;

    aqg(aqa aqa, View view) {
        this.a = aqa;
        this.b = view;
    }

    public final void run() {
        aqa aqa = this.a;
        aqa.b.removeView(this.b);
    }
}
