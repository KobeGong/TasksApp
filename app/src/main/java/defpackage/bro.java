package defpackage;

/* renamed from: bro  reason: default package */
/* compiled from: PG */
public class bro implements brc {
    private final ayw a;
    private brp b;

    public bro(ayw ayw) {
        this.a = ayw;
    }

    @Override // defpackage.brc
    public final bre a() {
        if (this.b == null) {
            this.b = new brp(this.a.b());
        }
        return this.b;
    }

    public bro(ayw ayw, byte b2) {
        this(ayw);
    }

    public bro(ayw ayw, char c) {
        this(ayw);
    }

    public bro(blo blo) {
        this((ayw) blo);
    }

    public bro(blr blr) {
        this((ayw) blr);
    }
}
