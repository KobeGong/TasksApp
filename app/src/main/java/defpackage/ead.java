package defpackage;

/* renamed from: ead reason: default package */
/* compiled from: PG */
public final class ead {
    public final defpackage.dnc a;
    public final defpackage.dna b;

    private ead(defpackage.dnc dnc) {
        this(dnc, defpackage.dna.a);
    }

    private ead(defpackage.dnc dnc, defpackage.dna dna) {
        this.a = (defpackage.dnc) defpackage.cld.a((java.lang.Object) dnc, (java.lang.Object) "channel");
        this.b = (defpackage.dna) defpackage.cld.a((java.lang.Object) dna, (java.lang.Object) "callOptions");
    }

    public static /* synthetic */ defpackage.ead a(defpackage.dnc dnc, defpackage.dna dna) {
        return new defpackage.ead(dnc, dna, 0);
    }

    public ead(defpackage.dnc dnc, byte b2) {
        this(dnc);
    }

    private ead(defpackage.dnc dnc, defpackage.dna dna, byte b2) {
        this(dnc, dna);
    }
}
