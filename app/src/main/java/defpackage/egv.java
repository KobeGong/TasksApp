package defpackage;

/* renamed from: egv reason: default package */
/* compiled from: PG */
public final class egv implements java.util.Iterator {
    private int a;
    private int b;
    private boolean c;
    private final /* synthetic */ defpackage.egu d;

    egv(defpackage.egu egu) {
        this.d = egu;
        egu.b++;
        this.a = egu.a.size();
    }

    public final boolean hasNext() {
        int i = this.b;
        while (i < this.a && this.d.a.get(i) == null) {
            i++;
        }
        if (i < this.a) {
            return true;
        }
        a();
        return false;
    }

    public final java.lang.Object next() {
        while (this.b < this.a) {
            defpackage.egu egu = this.d;
            if (egu.a.get(this.b) != null) {
                break;
            }
            this.b++;
        }
        if (this.b < this.a) {
            defpackage.egu egu2 = this.d;
            int i = this.b;
            this.b = i + 1;
            return egu2.a.get(i);
        }
        a();
        throw new java.util.NoSuchElementException();
    }

    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    private final void a() {
        if (!this.c) {
            this.c = true;
            defpackage.egu egu = this.d;
            egu.b--;
            if (egu.b <= 0 && egu.d) {
                egu.d = false;
                for (int size = egu.a.size() - 1; size >= 0; size--) {
                    if (egu.a.get(size) == null) {
                        egu.a.remove(size);
                    }
                }
            }
        }
    }
}
