package defpackage;

/* renamed from: oq reason: default package */
/* compiled from: PG */
final class oq implements java.lang.Runnable {
    private final /* synthetic */ android.graphics.Typeface a;
    private final /* synthetic */ defpackage.op b;

    oq(defpackage.op opVar, android.graphics.Typeface typeface) {
        this.b = opVar;
        this.a = typeface;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
