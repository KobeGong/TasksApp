package defpackage;

import java.util.ArrayList;

/* renamed from: jm  reason: default package */
/* compiled from: PG */
final class jm extends jj {
    private final /* synthetic */ qr a;
    private final /* synthetic */ jl b;

    jm(jl jlVar, qr qrVar) {
        this.b = jlVar;
        this.a = qrVar;
    }

    @Override // defpackage.jj, defpackage.ji
    public final void a(je jeVar) {
        ((ArrayList) this.a.get(this.b.a)).remove(jeVar);
    }
}
