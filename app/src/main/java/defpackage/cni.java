package defpackage;

/* renamed from: cni reason: default package */
/* compiled from: PG */
public final class cni {
    public final defpackage.cnj a = new defpackage.cnj();

    public final java.lang.Object a(java.lang.String str, java.lang.Object obj) {
        int i = 0;
        defpackage.cky.a(str.length() > 0);
        defpackage.cky.a(obj);
        byte[] bytes = str.getBytes(java.nio.charset.Charset.defaultCharset());
        defpackage.cnj cnj = this.a;
        int length = bytes.length;
        defpackage.cnj cnj2 = cnj;
        while (i < length) {
            byte b = bytes[i];
            if (cnj2.b == null) {
                cnj2.b = new defpackage.rj();
            }
            defpackage.cnj cnj3 = (defpackage.cnj) cnj2.b.a(b);
            if (cnj3 == null) {
                cnj3 = new defpackage.cnj();
                cnj2.b.a(b, cnj3);
            }
            i++;
            cnj2 = cnj3;
        }
        if (cnj2.a != null) {
            return cnj2.a;
        }
        cnj2.a = obj;
        return null;
    }
}
