package defpackage;

/* renamed from: dix reason: default package */
/* compiled from: PG */
public class dix {
    public defpackage.dha a;
    public volatile defpackage.djo b;
    public volatile defpackage.dha c;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dix)) {
            return false;
        }
        defpackage.dix dix = (defpackage.dix) obj;
        defpackage.djo djo = this.b;
        defpackage.djo djo2 = dix.b;
        if (djo == null && djo2 == null) {
            return b().equals(dix.b());
        }
        if (djo != null && djo2 != null) {
            return djo.equals(djo2);
        }
        if (djo != null) {
            return djo.equals(dix.a(djo.i()));
        }
        return a(djo2.i()).equals(djo2);
    }

    public int hashCode() {
        return 1;
    }

    private final defpackage.djo a(defpackage.djo djo) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = djo;
                        this.c = defpackage.dha.a;
                    } catch (defpackage.dir e) {
                        this.b = djo;
                        this.c = defpackage.dha.a;
                    }
                }
            }
        }
        return this.b;
    }

    public final defpackage.dha b() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                defpackage.dha dha = this.c;
                return dha;
            }
            if (this.b == null) {
                this.c = defpackage.dha.a;
            } else {
                this.c = this.b.a();
            }
            defpackage.dha dha2 = this.c;
            return dha2;
        }
    }

    static {
        defpackage.dhw.a();
    }
}
