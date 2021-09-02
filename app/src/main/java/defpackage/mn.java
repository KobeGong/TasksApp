package defpackage;

/* renamed from: mn reason: default package */
/* compiled from: PG */
final class mn implements java.lang.Runnable {
    private final /* synthetic */ Fragment a;
    private final /* synthetic */ Fragment b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ defpackage.qr d;
    private final /* synthetic */ android.view.View e;
    private final /* synthetic */ android.graphics.Rect f;

    mn(Fragment lcVar, Fragment lcVar2, boolean z, defpackage.qr qrVar, android.view.View view, android.graphics.Rect rect) {
        this.a = lcVar;
        this.b = lcVar2;
        this.c = z;
        this.d = qrVar;
        this.e = view;
        this.f = rect;
    }

    public final void run() {
        defpackage.mk.a(this.a, this.b, this.c);
        if (this.e != null) {
            defpackage.mv.a(this.e, this.f);
        }
    }
}
