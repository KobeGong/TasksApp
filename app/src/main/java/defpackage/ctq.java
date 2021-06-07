package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ctq  reason: default package */
/* compiled from: PG */
public final class ctq implements cur {
    public Object[] a = new Object[8];
    public int b = 0;

    ctq() {
    }

    @Override // defpackage.cur
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cur
    public final cuc a(int i) {
        if (i < this.b) {
            return (cuc) this.a[i * 2];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.cur
    public final Object b(int i) {
        if (i < this.b) {
            return this.a[(i * 2) + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    /* access modifiers changed from: package-private */
    public final int a(cuc cuc) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i * 2].equals(cuc)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.cur
    public final Object b(cuc cuc) {
        int a2 = a(cuc);
        if (a2 != -1) {
            return cuc.a(this.a[(a2 * 2) + 1]);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '").append(a(i)).append("': ").append(b(i));
        }
        return sb.append(" }").toString();
    }
}
