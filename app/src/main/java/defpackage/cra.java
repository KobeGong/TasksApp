package defpackage;

/* renamed from: cra reason: default package */
/* compiled from: PG */
public final class cra {
    public final java.util.Map a = new java.util.HashMap();
    public boolean b;
    public boolean c = true;

    public final defpackage.cra a(int i) {
        a(i, defpackage.cqz.b);
        return this;
    }

    public final defpackage.cqz a() {
        if (!this.a.isEmpty()) {
            return new defpackage.cqz(defpackage.css.a(this.a), this.b);
        }
        if (this.b) {
            return defpackage.cqz.b;
        }
        return defpackage.cqz.a;
    }

    public final defpackage.cra a(int i, defpackage.cqz cqz) {
        boolean z;
        if (this.b) {
            if (cqz.c.isEmpty()) {
                cqz = cqz.d ? defpackage.cqz.a : defpackage.cqz.b;
            } else {
                defpackage.css css = cqz.c;
                if (!cqz.d) {
                    z = true;
                } else {
                    z = false;
                }
                cqz = new defpackage.cqz(css, z);
            }
        }
        if (!defpackage.cqz.a.equals(cqz)) {
            this.a.put(java.lang.Integer.valueOf(i), cqz);
        } else {
            this.a.remove(java.lang.Integer.valueOf(i));
        }
        this.c = false;
        return this;
    }
}
