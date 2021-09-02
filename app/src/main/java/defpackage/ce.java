package defpackage;

/* renamed from: ce reason: default package */
/* compiled from: PG */
final class ce {
    public final java.lang.Object[] a = new java.lang.Object[256];
    public int b;

    public final java.lang.Object a() {
        if (this.b <= 0) {
            return null;
        }
        int i = this.b - 1;
        java.lang.Object obj = this.a[i];
        this.a[i] = null;
        this.b--;
        return obj;
    }

    public final boolean a(java.lang.Object obj) {
        if (this.b >= this.a.length) {
            return false;
        }
        this.a[this.b] = obj;
        this.b++;
        return true;
    }

    ce() {
    }
}
