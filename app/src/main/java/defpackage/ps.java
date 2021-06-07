package defpackage;

import android.util.Base64;
import java.util.List;

/* renamed from: ps  reason: default package */
/* compiled from: PG */
public final class ps {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e = (this.a + "-" + this.b + "-" + this.c);

    public ps(String str, String str2, String str3, List list) {
        this.a = (String) jd.a((Object) str);
        this.b = (String) jd.a((Object) str2);
        this.c = (String) jd.a((Object) str3);
        this.d = (List) jd.a(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List list = (List) this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + 0);
        return sb.toString();
    }
}
