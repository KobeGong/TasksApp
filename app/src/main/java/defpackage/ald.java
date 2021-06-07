package defpackage;

import android.view.View;

/* renamed from: ald  reason: default package */
final /* synthetic */ class ald implements Runnable {
    private final ala a;
    private final cyi b;

    ald(ala ala, cyi cyi) {
        this.a = ala;
        this.b = cyi;
    }

    public final void run() {
        ala ala = this.a;
        cyi cyi = this.b;
        View view = ala.J;
        if (view != null) {
            view.post(new alf(ala, cyi));
        }
    }
}
