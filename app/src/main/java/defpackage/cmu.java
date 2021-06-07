package defpackage;

/* renamed from: cmu  reason: default package */
/* compiled from: PG */
public final class cmu extends cmx {
    public cmu(int i, cmv cmv) {
        super(i);
    }

    @Override // defpackage.cmx
    public final int a(cnc cnc) {
        return cnc.a.getInt(this.h + cnc.b + 4);
    }

    @Override // defpackage.cmx
    public final int a(cnc cnc, int i) {
        cky.a(i, a(cnc));
        return cnc.d(this.h + cnc.b + 4 + 4 + cnc.b + (cnc.b * i));
    }

    @Override // defpackage.cmx
    public final String b(cnc cnc, int i) {
        cky.a(i, a(cnc));
        return new StringBuilder(13).append("[").append(i).append("]").toString();
    }

    @Override // defpackage.cmx
    public final String c(cnc cnc, int i) {
        return new StringBuilder(31).append("Object[").append(i).append("/").append(a(cnc)).append("]").toString();
    }
}
