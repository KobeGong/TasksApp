package defpackage;

/* renamed from: dkf reason: default package */
/* compiled from: PG */
final class dkf implements java.util.Iterator {
    private final java.util.Stack a = new java.util.Stack();
    private defpackage.dhg b;

    dkf(defpackage.dha dha) {
        this.b = a(dha);
    }

    private final defpackage.dhg a(defpackage.dha dha) {
        defpackage.dha dha2 = dha;
        while (dha2 instanceof defpackage.dkd) {
            defpackage.dkd dkd = (defpackage.dkd) dha2;
            this.a.push(dkd);
            dha2 = dkd.d;
        }
        return (defpackage.dhg) dha2;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final /* synthetic */ java.lang.Object next() {
        defpackage.dhg dhg;
        boolean z;
        if (this.b == null) {
            throw new java.util.NoSuchElementException();
        }
        defpackage.dhg dhg2 = this.b;
        while (true) {
            if (!this.a.isEmpty()) {
                dhg = a(((defpackage.dkd) this.a.pop()).e);
                if (dhg.a() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    break;
                }
            } else {
                dhg = null;
                break;
            }
        }
        this.b = dhg;
        return dhg2;
    }
}
