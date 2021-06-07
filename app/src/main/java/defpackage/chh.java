package defpackage;

import java.util.concurrent.Callable;

/* renamed from: chh  reason: default package */
final /* synthetic */ class chh implements Callable {
    private final che a;
    private final int b;
    private final String c = null;
    private final boolean d = true;

    chh(che che, int i, String str, boolean z) {
        this.a = che;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b, this.c, this.d);
    }
}
