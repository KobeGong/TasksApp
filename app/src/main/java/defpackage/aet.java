package defpackage;

/* renamed from: aet reason: default package */
/* compiled from: PG */
public abstract class aet {
    public final defpackage.aeu d = new defpackage.aeu();
    public boolean e = false;

    public abstract int a();

    public abstract defpackage.afv a(android.view.ViewGroup viewGroup, int i);

    public abstract void a(defpackage.afv afv, int i);

    public final defpackage.afv b(android.view.ViewGroup viewGroup, int i) {
        try {
            defpackage.jd.c("RV CreateView");
            defpackage.afv a = a(viewGroup, i);
            if (a.a.getParent() != null) {
                throw new java.lang.IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            a.f = i;
            return a;
        } finally {
            defpackage.jd.b();
        }
    }

    public int b(int i) {
        return 0;
    }

    public final void c() {
        if (this.d.a()) {
            throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.e = true;
    }

    public long a(int i) {
        return -1;
    }

    public void a(defpackage.afv afv) {
    }

    public void b(defpackage.afv afv) {
    }

    public final void c(int i) {
        this.d.a(i, 1);
    }

    public final void d(int i) {
        this.d.b(i, 1);
    }

    public final void a(int i, int i2) {
        this.d.b(i, i2);
    }

    public final void e(int i) {
        this.d.c(i, 1);
    }

    public final void b(int i, int i2) {
        this.d.c(i, i2);
    }
}
