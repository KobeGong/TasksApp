package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: eki  reason: default package */
/* compiled from: PG */
public final class eki extends ehy {
    public eki(ejv ejv) {
        super((byte) 0);
        int a = ejv.a(9);
        String str = ejv.e;
        Executors.newCachedThreadPool(new ekj(a));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ehy
    public final ehp a(String str, ehr ehr, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3) {
        throw new UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    @Override // defpackage.ehy
    public final ehq a(String str, ehr ehr, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    @Override // defpackage.ehy
    public final void a(ejc ejc) {
    }

    @Override // defpackage.ehy
    public final void b(ejc ejc) {
    }
}
