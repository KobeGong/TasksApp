package defpackage;

/* renamed from: alc reason: default package */
final /* synthetic */ class alc implements java.lang.Runnable {
    private final defpackage.ala a;

    alc(defpackage.ala ala) {
        this.a = ala;
    }

    public final void run() {
        defpackage.ala ala = this.a;
        ala.V.a(true);
        defpackage.cyi a2 = com.google.android.apps.tasks.common.TaskApplication.getApplication().executor.a((java.util.concurrent.Callable) new defpackage.ale(ala, ala.getContext(), ala.a));
        a2.a(new defpackage.ald(ala, a2), com.google.android.apps.tasks.common.TaskApplication.getApplication().executor);
    }
}
