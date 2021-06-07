package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* renamed from: bcv  reason: default package */
/* compiled from: PG */
public class bcv {
    public final DataHolder a;
    public int b;
    public int c;

    public bcv(DataHolder dataHolder, int i) {
        boolean z = true;
        int i2 = 0;
        this.a = (DataHolder) azb.b(dataHolder);
        azb.a(i >= 0 && i < this.a.e);
        this.b = i;
        DataHolder dataHolder2 = this.a;
        int i3 = this.b;
        azb.a((i3 < 0 || i3 >= dataHolder2.e) ? false : z);
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
        this.c = i2 == dataHolder2.d.length ? i2 - 1 : i2;
    }

    public boolean a() {
        return !this.a.a();
    }

    public final String a(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.c[i2].getString(i, dataHolder.b.getInt(str));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bcv)) {
            return false;
        }
        bcv bcv = (bcv) obj;
        if (!azb.a(Integer.valueOf(bcv.b), Integer.valueOf(this.b)) || !azb.a(Integer.valueOf(bcv.c), Integer.valueOf(this.c)) || bcv.a != this.a) {
            return false;
        }
        return true;
    }
}
