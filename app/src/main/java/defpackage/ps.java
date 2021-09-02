package defpackage;

/* renamed from: ps reason: default package */
/* compiled from: PG */
public final class ps {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.List d;
    public final java.lang.String e = new java.lang.StringBuilder(this.a).append("-").append(this.b).append("-").append(this.c).toString();

    public ps(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        this.a = (java.lang.String) defpackage.jd.a((java.lang.Object) str);
        this.b = (java.lang.String) defpackage.jd.a((java.lang.Object) str2);
        this.c = (java.lang.String) defpackage.jd.a((java.lang.Object) str3);
        this.d = (java.util.List) defpackage.jd.a((java.lang.Object) list);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            java.util.List list = (java.util.List) this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(android.util.Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + 0);
        return sb.toString();
    }
}
