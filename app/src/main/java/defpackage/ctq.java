package defpackage;

/* renamed from: ctq reason: default package */
/* compiled from: PG */
final class ctq implements defpackage.cur {
    public java.lang.Object[] a = new java.lang.Object[8];
    public int b = 0;

    ctq() {
    }

    public final int a() {
        return this.b;
    }

    public final defpackage.cuc a(int i) {
        if (i < this.b) {
            return (defpackage.cuc) this.a[i * 2];
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public final java.lang.Object b(int i) {
        if (i < this.b) {
            return this.a[(i * 2) + 1];
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    /* access modifiers changed from: 0000 */
    public final int a(defpackage.cuc cuc) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i * 2].equals(cuc)) {
                return i;
            }
        }
        return -1;
    }

    public final java.lang.Object b(defpackage.cuc cuc) {
        int a2 = a(cuc);
        if (a2 != -1) {
            return cuc.a(this.a[(a2 * 2) + 1]);
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '").append(a(i)).append("': ").append(b(i));
        }
        return sb.append(" }").toString();
    }
}
