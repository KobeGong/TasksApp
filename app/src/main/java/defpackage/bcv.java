package defpackage;

/* renamed from: bcv reason: default package */
/* compiled from: PG */
public class bcv {
    public final com.google.android.gms.common.data.DataHolder a;
    public int b;
    public int c;

    public bcv(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        boolean z = true;
        int i2 = 0;
        this.a = (com.google.android.gms.common.data.DataHolder) defpackage.azb.b((java.lang.Object) dataHolder);
        defpackage.azb.a(i >= 0 && i < this.a.e);
        this.b = i;
        com.google.android.gms.common.data.DataHolder dataHolder2 = this.a;
        int i3 = this.b;
        if (i3 < 0 || i3 >= dataHolder2.e) {
            z = false;
        }
        defpackage.azb.a(z);
        while (true) {
            if (i2 >= dataHolder2.d.length) {
                break;
            } else if (i3 < dataHolder2.d[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        if (i2 == dataHolder2.d.length) {
            i2--;
        }
        this.c = i2;
    }

    public boolean a() {
        return !this.a.a();
    }

    public final java.lang.String a(java.lang.String str) {
        com.google.android.gms.common.data.DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.c[i2].getString(i, dataHolder.b.getInt(str));
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), this.a});
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bcv)) {
            return false;
        }
        defpackage.bcv bcv = (defpackage.bcv) obj;
        if (!defpackage.azb.a((java.lang.Object) java.lang.Integer.valueOf(bcv.b), (java.lang.Object) java.lang.Integer.valueOf(this.b)) || !defpackage.azb.a((java.lang.Object) java.lang.Integer.valueOf(bcv.c), (java.lang.Object) java.lang.Integer.valueOf(this.c)) || bcv.a != this.a) {
            return false;
        }
        return true;
    }
}
