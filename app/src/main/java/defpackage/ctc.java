package defpackage;

import java.util.AbstractMap;

/* renamed from: ctc  reason: default package */
/* compiled from: PG */
final class ctc extends csp {
    private final /* synthetic */ ctb a;

    ctc(ctb ctb) {
        this.a = ctb;
    }

    public final int size() {
        return this.a.b;
    }

    @Override // defpackage.csn
    public final boolean c() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        cld.a(i, this.a.b);
        return new AbstractMap.SimpleImmutableEntry(this.a.a[i * 2], this.a.a[(i * 2) + 1]);
    }
}
