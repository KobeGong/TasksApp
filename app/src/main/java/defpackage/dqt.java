package defpackage;

/* renamed from: dqt reason: default package */
/* compiled from: PG */
public final class dqt {
    public final /* synthetic */ defpackage.dqk a;

    public final void a(byte[] bArr) {
        java.lang.String str;
        boolean z;
        this.a.g.run();
        defpackage.dql dql = new defpackage.dql(this.a);
        java.lang.String str2 = this.a.b;
        if (bArr != null) {
            java.lang.String valueOf = java.lang.String.valueOf(str2);
            java.lang.String a2 = defpackage.cwe.a.a(bArr, bArr.length);
            str = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(a2).length()).append(valueOf).append("?").append(a2).toString();
        } else {
            str = str2;
        }
        defpackage.dqj dqj = this.a.n;
        defpackage.ehq a3 = ((defpackage.ehy) dqj.a).a(str, dql, this.a.d);
        if (bArr != null) {
            a3.a("GET");
        } else if (this.a.h) {
            a3.a("PUT");
        }
        if (this.a.j) {
            a3.a();
        }
        if (this.a.k != null) {
            a3.a(this.a.k);
        }
        if (this.a.l != null) {
            for (java.lang.Object a4 : this.a.l) {
                a3.a(a4);
            }
        }
        defpackage.dqk dqk = this.a;
        a3.a(defpackage.dvc.i.a, dqk.c);
        a3.a(defpackage.dvc.g.a, "application/grpc");
        a3.a("te", "trailers");
        byte[][] a5 = defpackage.dzs.a(dqk.e);
        for (int i = 0; i < a5.length; i += 2) {
            java.lang.String str3 = new java.lang.String(a5[i], java.nio.charset.Charset.forName("UTF-8"));
            if (defpackage.dvc.g.a.equalsIgnoreCase(str3) || defpackage.dvc.i.a.equalsIgnoreCase(str3) || defpackage.dvc.h.a.equalsIgnoreCase(str3)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                a3.a(str3, new java.lang.String(a5[i + 1], java.nio.charset.Charset.forName("UTF-8")));
            }
        }
        this.a.i = a3.b();
        this.a.i.a();
    }

    public dqt(defpackage.dqk dqk) {
        this.a = dqk;
    }
}
