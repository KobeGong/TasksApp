package defpackage;

/* renamed from: bro reason: default package */
/* compiled from: PG */
public class bro implements defpackage.brc {
    private final defpackage.ayw a;
    private defpackage.brp b;

    public bro(defpackage.ayw ayw) {
        this.a = ayw;
    }

    public final defpackage.bre a() {
        if (this.b == null) {
            this.b = new defpackage.brp(this.a.b());
        }
        return this.b;
    }

    public bro(defpackage.ayw ayw, byte b2) {
        this(ayw);
    }

    public bro(defpackage.ayw ayw, char c) {
        this(ayw);
    }

    public bro(defpackage.blo blo) {
        this((defpackage.ayw) blo);
    }

    public bro(defpackage.blr blr) {
        this((defpackage.ayw) blr);
    }
}
