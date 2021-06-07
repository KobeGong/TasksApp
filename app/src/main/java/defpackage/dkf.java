package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* renamed from: dkf  reason: default package */
/* compiled from: PG */
final class dkf implements Iterator {
    private final Stack a = new Stack();
    private dhg b;

    dkf(dha dha) {
        this.b = a(dha);
    }

    private final dhg a(dha dha) {
        dha dha2 = dha;
        while (dha2 instanceof dkd) {
            dkd dkd = (dkd) dha2;
            this.a.push(dkd);
            dha2 = dkd.d;
        }
        return (dhg) dha2;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        dhg dhg;
        boolean z;
        if (this.b == null) {
            throw new NoSuchElementException();
        }
        dhg dhg2 = this.b;
        while (true) {
            if (!this.a.isEmpty()) {
                dhg = a(((dkd) this.a.pop()).e);
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
