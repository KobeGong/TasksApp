package defpackage;

/* renamed from: ql reason: default package */
/* compiled from: PG */
public final class ql {
    private final defpackage.qp a;
    private final boolean b;

    public final boolean a(java.lang.CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new java.lang.IllegalArgumentException();
        } else if (this.a == null) {
            return this.b;
        } else {
            switch (this.a.a(charSequence, 0, i)) {
                case 0:
                    return true;
                case 1:
                    return false;
                default:
                    return this.b;
            }
        }
    }

    private ql(defpackage.qp qpVar) {
        this.a = qpVar;
    }

    ql(defpackage.qp qpVar, boolean z) {
        this(qpVar);
        this.b = z;
    }
}
