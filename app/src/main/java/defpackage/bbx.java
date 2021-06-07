package defpackage;

import java.util.Iterator;

/* renamed from: bbx  reason: default package */
/* compiled from: PG */
public final class bbx {
    public final qr a = new qr();
    public final bpw b = new bpw();
    private final qr c = new qr();
    private int d;
    private boolean e = false;

    public bbx(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((ayn) it.next()).c, null);
        }
        this.d = this.a.keySet().size();
    }

    public final void a(bbu bbu, axq axq, String str) {
        this.a.put(bbu, axq);
        this.c.put(bbu, str);
        this.d--;
        if (!axq.b()) {
            this.e = true;
        }
        if (this.d != 0) {
            return;
        }
        if (this.e) {
            this.b.a(new aym(this.a));
            return;
        }
        this.b.a();
    }
}
