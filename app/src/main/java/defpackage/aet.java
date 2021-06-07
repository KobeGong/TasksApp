package defpackage;

import android.view.ViewGroup;

/* renamed from: aet  reason: default package */
/* compiled from: PG */
public abstract class aet {
    public final aeu d = new aeu();
    public boolean e = false;

    public abstract int a();

    public abstract afv a(ViewGroup viewGroup, int i);

    public abstract void a(afv afv, int i);

    public final afv b(ViewGroup viewGroup, int i) {
        try {
            jd.c("RV CreateView");
            afv a = a(viewGroup, i);
            if (a.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            a.f = i;
            return a;
        } finally {
            jd.b();
        }
    }

    public int b(int i) {
        return 0;
    }

    public final void c() {
        if (this.d.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.e = true;
    }

    public long a(int i) {
        return -1;
    }

    public void a(afv afv) {
    }

    public void b(afv afv) {
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
