package defpackage;

/* renamed from: ql  reason: default package */
/* compiled from: PG */
public final class ql {
    private final qp a;
    private final boolean b;

    public final boolean a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
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

    private ql(qp qpVar) {
        this.a = qpVar;
    }

    ql(qp qpVar, boolean z) {
        this(qpVar);
        this.b = z;
    }
}
