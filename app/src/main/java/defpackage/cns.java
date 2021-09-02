package defpackage;

/* renamed from: cns reason: default package */
/* compiled from: PG */
public final class cns {
    public final java.lang.String a;
    public final int b;
    public final /* synthetic */ defpackage.cnr c;

    public cns(defpackage.cnr cnr) {
        this.c = cnr;
        this.a = "";
        this.b = 0;
    }

    cns(defpackage.cnr cnr, defpackage.cns cns, java.lang.String str) {
        this.c = cnr;
        if (cns.b != 0) {
            java.lang.String str2 = cns.a;
            str = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length()).append(str2).append('/').append(str).toString();
        }
        this.a = str;
        this.b = cns.b + 1;
    }
}
