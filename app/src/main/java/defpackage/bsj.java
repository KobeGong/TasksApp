package defpackage;

import java.util.Iterator;

/* renamed from: bsj  reason: default package */
/* compiled from: PG */
public final class bsj implements bsk {
    private final bcr a;

    private bsj(bcr bcr) {
        if (bcr == null) {
            throw new IllegalArgumentException("null dataBuffer");
        }
        this.a = bcr;
    }

    @Override // defpackage.bsk
    public final void a() {
        this.a.a();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.bsk
    public final int b() {
        return this.a.b();
    }

    public bsj(bcr bcr, byte b) {
        this(bcr);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bsl(this);
    }

    @Override // defpackage.bsk
    public final /* synthetic */ Object a(int i) {
        return new bsn((bnr) this.a.a(i));
    }
}
