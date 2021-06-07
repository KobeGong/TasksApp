package defpackage;

/* renamed from: ead  reason: default package */
/* compiled from: PG */
public final class ead {
    public final dnc a;
    public final dna b;

    private ead(dnc dnc) {
        this(dnc, dna.a);
    }

    private ead(dnc dnc, dna dna) {
        this.a = (dnc) cld.a(dnc, "channel");
        this.b = (dna) cld.a(dna, "callOptions");
    }

    public static /* synthetic */ ead a(dnc dnc, dna dna) {
        return new ead(dnc, dna, (byte) 0);
    }

    public ead(dnc dnc, byte b2) {
        this(dnc);
    }

    private ead(dnc dnc, dna dna, byte b2) {
        this(dnc, dna);
    }
}
