package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/* renamed from: csh  reason: default package */
/* compiled from: PG */
public final class csh extends cth {
    private int a;
    private Object b;
    private int c;
    private final csb d;
    private final /* synthetic */ cwl e;

    public csh() {
        this.a = bg.ad;
    }

    public final boolean hasNext() {
        int b2;
        Integer valueOf;
        cld.b(this.a != bg.af);
        switch (this.a - 1) {
            case 0:
                return true;
            case 1:
            default:
                this.a = bg.af;
                cwl cwl = this.e;
                int i = this.c;
                this.d.a(TimeUnit.MILLISECONDS);
                if (!cwl.a(i)) {
                    b2 = -1;
                } else {
                    b2 = cwl.b(i);
                }
                if (b2 < 0) {
                    this.a = bg.ae;
                    valueOf = null;
                } else {
                    this.c++;
                    valueOf = Integer.valueOf(b2);
                }
                this.b = valueOf;
                if (this.a == bg.ae) {
                    return false;
                }
                this.a = bg.ac;
                return true;
            case 2:
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = bg.ad;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public csh(cwl cwl) {
        this();
        this.e = cwl;
        this.c = 0;
        this.d = new csb(csf.a).a();
    }
}
