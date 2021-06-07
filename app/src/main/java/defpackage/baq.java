package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: baq  reason: default package */
/* compiled from: PG */
public final class baq extends azh {
    private final ayn b;

    public baq(ayn ayn) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.b = ayn;
    }

    @Override // defpackage.ayp
    public final bca a(bca bca) {
        return this.b.a(0, bca);
    }

    @Override // defpackage.ayp
    public final bca b(bca bca) {
        return this.b.a(1, bca);
    }

    @Override // defpackage.ayp
    public final Looper c() {
        return this.b.d;
    }

    @Override // defpackage.ayp
    public final Context b() {
        return this.b.a;
    }
}
