package defpackage;

/* renamed from: ecc reason: default package */
/* compiled from: PG */
public abstract class ecc {
    private static final java.util.Set a = java.util.Collections.unmodifiableSet(java.util.EnumSet.noneOf(defpackage.ecd.class));
    public final defpackage.ecf b;

    protected ecc(defpackage.ecf ecf) {
        this.b = (defpackage.ecf) defpackage.cld.a((java.lang.Object) ecf, (java.lang.Object) "context");
        byte b2 = ecf.b.b;
        defpackage.cld.a(true, (java.lang.Object) "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    public abstract void a();

    @java.lang.Deprecated
    public void a(defpackage.ebz ebz) {
        defpackage.eby eby;
        defpackage.ebx ebt;
        defpackage.cld.a((java.lang.Object) ebz);
        if (ebz instanceof defpackage.ebx) {
            ebt = (defpackage.ebx) ebz;
        } else {
            defpackage.ebz ebz2 = ebz;
            if (ebz2.b() == defpackage.ecb.RECV) {
                eby = defpackage.eby.RECEIVED;
            } else {
                eby = defpackage.eby.SENT;
            }
            long c = ebz2.c();
            defpackage.ejx ejx = new defpackage.ejx(0);
            defpackage.eby eby2 = (defpackage.eby) defpackage.cld.a((java.lang.Object) eby, (java.lang.Object) "type");
            if (eby2 == null) {
                throw new java.lang.NullPointerException("Null type");
            }
            ejx.a = eby2;
            ejx.b = java.lang.Long.valueOf(c);
            defpackage.ejx b2 = ejx.a(0).b(0).a(ebz2.d()).b(ebz2.e());
            java.lang.String str = "";
            if (b2.a == null) {
                str = java.lang.String.valueOf(str).concat(" type");
            }
            if (b2.b == null) {
                str = java.lang.String.valueOf(str).concat(" messageId");
            }
            if (b2.c == null) {
                str = java.lang.String.valueOf(str).concat(" uncompressedMessageSize");
            }
            if (b2.d == null) {
                str = java.lang.String.valueOf(str).concat(" compressedMessageSize");
            }
            if (!str.isEmpty()) {
                java.lang.String str2 = "Missing required properties:";
                java.lang.String valueOf = java.lang.String.valueOf(str);
                throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
            }
            ebt = new defpackage.ebt(b2.a, b2.b.longValue(), b2.c.longValue(), b2.d.longValue());
        }
        a(ebt);
    }

    public void a(defpackage.ebx ebx) {
        defpackage.ecb ecb;
        defpackage.ebz a2;
        defpackage.cld.a((java.lang.Object) ebx);
        if (ebx instanceof defpackage.ebz) {
            a2 = (defpackage.ebz) ebx;
        } else {
            defpackage.ebx ebx2 = ebx;
            if (ebx2.a() == defpackage.eby.RECEIVED) {
                ecb = defpackage.ecb.RECV;
            } else {
                ecb = defpackage.ecb.SENT;
            }
            a2 = defpackage.ebz.a(ecb, ebx2.b()).a(ebx2.c()).b(ebx2.d()).a();
        }
        a(a2);
    }

    static {
        java.util.Collections.emptyMap();
    }
}
