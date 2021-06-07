package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cbp  reason: default package */
public final /* synthetic */ class cbp implements Callable {
    private final cci a;
    private final bul b;
    private final String c;
    private final String d;
    private final int e;
    private final int f;

    public cbp(cci cci, bul bul, String str, String str2, int i, int i2) {
        this.a = cci;
        this.b = bul;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b, this.c, this.d, this.e, this.f);
    }
}
