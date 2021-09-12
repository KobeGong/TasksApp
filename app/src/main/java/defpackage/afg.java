package defpackage;

/* renamed from: afg reason: default package */
/* compiled from: PG */
public final class afg {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
        } else {
            int i3 = this.d << 1;
            if (this.c == null) {
                this.c = new int[4];
                java.util.Arrays.fill(this.c, -1);
            } else if (i3 >= this.c.length) {
                int[] iArr = this.c;
                this.c = new int[(i3 << 1)];
                java.lang.System.arraycopy(iArr, 0, this.c, 0, iArr.length);
            }
            this.c[i3] = i;
            this.c[i3 + 1] = i2;
            this.d++;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.support.v7.widget.RecyclerView recyclerView, boolean z) {
        this.d = 0;
        if (this.c != null) {
            java.util.Arrays.fill(this.c, -1);
        }
        LayoutManager afd = recyclerView.mLayout;
        if (recyclerView.adapter != null && afd != null && afd.g) {
            if (z) {
                if (!recyclerView.f.d()) {
                    afd.a(recyclerView.adapter.getItemCount(), this);
                }
            } else if (!recyclerView.n()) {
                afd.a(this.a, this.b, recyclerView.D, this);
            }
            if (this.d > afd.h) {
                afd.h = this.d;
                afd.i = z;
                recyclerView.e.b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i) {
        if (this.c == null) {
            return false;
        }
        int i2 = this.d << 1;
        for (int i3 = 0; i3 < i2; i3 += 2) {
            if (this.c[i3] == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.c != null) {
            java.util.Arrays.fill(this.c, -1);
        }
        this.d = 0;
    }
}
