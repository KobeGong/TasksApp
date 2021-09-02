package defpackage;

/* renamed from: bvl reason: default package */
final /* synthetic */ class bvl implements java.lang.Runnable {
    private final defpackage.bvn a;
    private final android.content.Intent b;

    bvl(defpackage.bvn bvn, android.content.Intent intent) {
        this.a = bvn;
        this.b = intent;
    }

    public final void run() {
        this.a.a(this.b, defpackage.bvo.c());
    }
}
