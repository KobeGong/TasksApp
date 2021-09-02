package defpackage;

/* renamed from: bhy reason: default package */
/* compiled from: PG */
final class bhy implements java.lang.Runnable {
    private /* synthetic */ android.content.Intent a;
    private /* synthetic */ android.content.Intent b;
    private /* synthetic */ defpackage.bhx c;

    bhy(defpackage.bhx bhx, android.content.Intent intent, android.content.Intent intent2) {
        this.c = bhx;
        this.a = intent;
        this.b = intent2;
    }

    public final void run() {
        this.c.handleIntent(this.a);
        this.c.a(this.b);
    }
}
