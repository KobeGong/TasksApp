package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: ajx  reason: default package */
/* compiled from: PG */
final class ajx implements coo {
    private final coo a = ((coo) this.b.a());
    private final /* synthetic */ coz b;

    ajx(coz coz) {
        this.b = coz;
    }

    @Override // defpackage.coo
    public final void a(Context context, con con) {
        if (con instanceof cou) {
            String str = aju.a;
            if (!TextUtils.isEmpty(str)) {
                ((cou) con).c = str;
            }
        }
        this.a.a(context, con);
    }
}
