package defpackage;

import java.io.Serializable;

/* renamed from: csw  reason: default package */
/* compiled from: PG */
final class csw implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;

    csw(Object[] objArr) {
        this.a = objArr;
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        return csv.a(this.a);
    }
}
