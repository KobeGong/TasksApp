package defpackage;

/* renamed from: bbx reason: default package */
/* compiled from: PG */
public final class bbx {
    public final defpackage.qr a = new defpackage.qr();
    public final defpackage.bpw b = new defpackage.bpw();
    private final defpackage.qr c = new defpackage.qr();
    private int d;
    private boolean e = false;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Iterable, code=java.lang.Iterable<ayn>, for r5v0, types: [java.lang.Iterable<ayn>, java.lang.Iterable] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bbx(java.lang.Iterable<defpackage.ayn> r5) {
        /*
            r4 = this;
            r4.<init>()
            qr r0 = new qr
            r0.<init>()
            r4.c = r0
            bpw r0 = new bpw
            r0.<init>()
            r4.b = r0
            r0 = 0
            r4.e = r0
            qr r0 = new qr
            r0.<init>()
            r4.a = r0
            java.util.Iterator r1 = r5.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()
            ayn r0 = (defpackage.ayn) r0
            qr r2 = r4.a
            bbu r0 = r0.c
            r3 = 0
            r2.put(r0, r3)
            goto L_0x001f
        L_0x0034:
            qr r0 = r4.a
            java.util.Set r0 = r0.keySet()
            int r0 = r0.size()
            r4.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbx.<init>(java.lang.Iterable):void");
    }

    public final void a(defpackage.bbu bbu, defpackage.axq axq, java.lang.String str) {
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
            this.b.a(new defpackage.aym(this.a));
            return;
        }
        this.b.a();
    }
}
