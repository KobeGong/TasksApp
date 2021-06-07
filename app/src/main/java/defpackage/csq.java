package defpackage;

import java.io.Serializable;

/* renamed from: csq  reason: default package */
/* compiled from: PG */
final class csq implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;

    csq(Object[] objArr) {
        this.a = objArr;
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        return csp.a(this.a);
    }
}
