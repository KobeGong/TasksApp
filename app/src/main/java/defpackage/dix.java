package defpackage;

/* renamed from: dix  reason: default package */
/* compiled from: PG */
public class dix {
    public dha a;
    public volatile djo b;
    public volatile dha c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dix)) {
            return false;
        }
        dix dix = (dix) obj;
        djo djo = this.b;
        djo djo2 = dix.b;
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

    private final djo a(djo djo) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = djo;
                        this.c = dha.a;
                    } catch (dir e) {
                        this.b = djo;
                        this.c = dha.a;
                    }
                }
            }
        }
        return this.b;
    }

    public final dha b() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            if (this.b == null) {
                this.c = dha.a;
            } else {
                this.c = this.b.a();
            }
            return this.c;
        }
    }

    static {
        dhw.a();
    }
}
