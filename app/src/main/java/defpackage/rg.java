package defpackage;

/* renamed from: rg  reason: default package */
/* compiled from: PG */
public class rg {
    private final Object[] a;
    private int b;

    public Object a() {
        if (this.b <= 0) {
            return null;
        }
        int i = this.b - 1;
        Object obj = this.a[i];
        this.a[i] = null;
        this.b--;
        return obj;
    }

    public boolean a(Object obj) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.b) {
                z = false;
                break;
            } else if (this.a[i] == obj) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        } else if (this.b >= this.a.length) {
            return false;
        } else {
            this.a[this.b] = obj;
            this.b++;
            return true;
        }
    }

    public rg(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }
}
