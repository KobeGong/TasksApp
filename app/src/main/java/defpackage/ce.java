package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ce  reason: default package */
/* compiled from: PG */
public final class ce {
    public final Object[] a = new Object[256];
    public int b;

    public final Object a() {
        if (this.b <= 0) {
            return null;
        }
        int i = this.b - 1;
        Object obj = this.a[i];
        this.a[i] = null;
        this.b--;
        return obj;
    }

    public final boolean a(Object obj) {
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
