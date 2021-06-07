package defpackage;

import java.nio.charset.Charset;

/* renamed from: cni  reason: default package */
/* compiled from: PG */
public final class cni {
    public final cnj a = new cnj();

    public final Object a(String str, Object obj) {
        int i = 0;
        cky.a(str.length() > 0);
        cky.a(obj);
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        cnj cnj = this.a;
        int length = bytes.length;
        cnj cnj2 = cnj;
        while (i < length) {
            byte b = bytes[i];
            if (cnj2.b == null) {
                cnj2.b = new rj();
            }
            cnj cnj3 = (cnj) cnj2.b.a(b);
            if (cnj3 == null) {
                cnj3 = new cnj();
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
