package defpackage;

import java.nio.charset.Charset;

/* renamed from: dqt  reason: default package */
/* compiled from: PG */
public final class dqt {
    public final /* synthetic */ dqk a;

    public final void a(byte[] bArr) {
        String str;
        this.a.g.run();
        dql dql = new dql(this.a);
        String str2 = this.a.b;
        if (bArr != null) {
            String valueOf = String.valueOf(str2);
            String a2 = cwe.a.a(bArr, bArr.length);
            str = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(a2).length()).append(valueOf).append("?").append(a2).toString();
        } else {
            str = str2;
        }
        ehq a3 = ((ehy) this.a.n.a).a(str, dql, this.a.d);
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
            for (Object obj : this.a.l) {
                a3.a(obj);
            }
        }
        dqk dqk = this.a;
        a3.a(dvc.i.a, dqk.c);
        a3.a(dvc.g.a, "application/grpc");
        a3.a("te", "trailers");
        byte[][] a4 = dzs.a(dqk.e);
        for (int i = 0; i < a4.length; i += 2) {
            String str3 = new String(a4[i], Charset.forName("UTF-8"));
            if (!dvc.g.a.equalsIgnoreCase(str3) && !dvc.i.a.equalsIgnoreCase(str3) && !dvc.h.a.equalsIgnoreCase(str3)) {
                a3.a(str3, new String(a4[i + 1], Charset.forName("UTF-8")));
            }
        }
        this.a.i = a3.b();
        this.a.i.a();
    }

    public dqt(dqk dqk) {
        this.a = dqk;
    }
}
