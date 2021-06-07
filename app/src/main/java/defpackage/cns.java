package defpackage;

/* renamed from: cns  reason: default package */
/* compiled from: PG */
public final class cns {
    public final String a;
    public final int b;
    public final /* synthetic */ cnr c;

    public cns(cnr cnr) {
        this.c = cnr;
        this.a = "";
        this.b = 0;
    }

    cns(cnr cnr, cns cns, String str) {
        this.c = cnr;
        if (cns.b != 0) {
            String str2 = cns.a;
            str = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length()).append(str2).append('/').append(str).toString();
        }
        this.a = str;
        this.b = cns.b + 1;
    }
}
