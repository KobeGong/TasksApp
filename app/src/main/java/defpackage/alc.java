package defpackage;

import com.google.android.apps.tasks.common.TaskApplication;

/* access modifiers changed from: package-private */
/* renamed from: alc  reason: default package */
public final /* synthetic */ class alc implements Runnable {
    private final ala a;

    alc(ala ala) {
        this.a = ala;
    }

    public final void run() {
        ala ala = this.a;
        ala.V.a(true);
        cyi a2 = TaskApplication.b().a.a(new ale(ala, ala.i(), ala.a));
        a2.a(new ald(ala, a2), TaskApplication.b().a);
    }
}
