package defpackage;

/* renamed from: bnp reason: default package */
/* compiled from: PG */
public final class bnp extends defpackage.bcv implements defpackage.bnr {
    public bnp(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final java.lang.String b() {
        return a("account_name");
    }

    public final java.lang.String c() {
        if (!android.text.TextUtils.isEmpty(a("display_name"))) {
            return a("display_name");
        }
        return a("account_name");
    }

    public final int d() {
        java.lang.String str = "is_dasher";
        com.google.android.gms.common.data.DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.c[i2].getInt(i, dataHolder.b.getInt(str));
    }

    public final boolean a() {
        return !this.a.a();
    }
}
