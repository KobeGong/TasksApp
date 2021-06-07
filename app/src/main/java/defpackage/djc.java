package defpackage;

import java.util.List;

/* renamed from: djc  reason: default package */
/* compiled from: PG */
final class djc extends dja {
    djc() {
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dja
    public final List a(Object obj, long j) {
        diq c = c(obj, j);
        if (c.a()) {
            return c;
        }
        int size = c.size();
        diq a = c.a(size == 0 ? 10 : size << 1);
        dlc.a(obj, j, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dja
    public final void b(Object obj, long j) {
        c(obj, j).b();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dja
    public final void a(Object obj, Object obj2, long j) {
        diq c = c(obj, j);
        diq c2 = c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.a()) {
                c = c.a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size <= 0) {
            c = c2;
        }
        dlc.a(obj, j, c);
    }

    private static diq c(Object obj, long j) {
        return (diq) dlc.f(obj, j);
    }
}
