package defpackage;

/* renamed from: eix reason: default package */
/* compiled from: PG */
final class eix implements java.lang.Runnable {
    private final /* synthetic */ android.content.Intent a;
    private final /* synthetic */ defpackage.eiw b;

    eix(defpackage.eiw eiw, android.content.Intent intent) {
        this.b = eiw;
        this.a = intent;
    }

    public final void run() {
        this.b.a.a(this.b, defpackage.eiw.a(this.a));
    }
}
