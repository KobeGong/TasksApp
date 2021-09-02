package defpackage;

/* renamed from: cmu reason: default package */
/* compiled from: PG */
public final class cmu extends defpackage.cmx {
    public cmu(int i, defpackage.cmv cmv) {
        super(i);
    }

    public final int a(defpackage.cnc cnc) {
        return cnc.a.getInt(this.h + cnc.b + 4);
    }

    public final int a(defpackage.cnc cnc, int i) {
        defpackage.cky.a(i, a(cnc));
        return cnc.d(this.h + cnc.b + 4 + 4 + cnc.b + (cnc.b * i));
    }

    public final java.lang.String b(defpackage.cnc cnc, int i) {
        defpackage.cky.a(i, a(cnc));
        return "[" + i + "]";
    }

    public final java.lang.String c(defpackage.cnc cnc, int i) {
        return "Object[" + i + "/" + a(cnc) + "]";
    }
}
