package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: bnp  reason: default package */
/* compiled from: PG */
public final class bnp extends bcv implements bnr {
    public bnp(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // defpackage.bnr
    public final String b() {
        return a("account_name");
    }

    @Override // defpackage.bnr
    public final String c() {
        if (!TextUtils.isEmpty(a("display_name"))) {
            return a("display_name");
        }
        return a("account_name");
    }

    @Override // defpackage.bnr
    public final int d() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a("is_dasher", i);
        return dataHolder.c[i2].getInt(i, dataHolder.b.getInt("is_dasher"));
    }

    @Override // defpackage.bcs, defpackage.bcv
    public final boolean a() {
        return !this.a.a();
    }
}
