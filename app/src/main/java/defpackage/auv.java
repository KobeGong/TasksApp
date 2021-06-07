package defpackage;

import android.text.TextUtils;

/* renamed from: auv  reason: default package */
/* compiled from: PG */
final class auv extends alu {
    private final /* synthetic */ auj a;

    auv(auj auj) {
        this.a = auj;
    }

    @Override // defpackage.alu
    public final void a() {
        if (!TextUtils.isEmpty(this.a.X)) {
            this.a.a(this.a.X, this.a.Y, true);
        }
    }

    @Override // defpackage.alu
    public final void a(String str) {
        if (str != null && str.equals(this.a.X)) {
            this.a.a(this.a.X, this.a.Y, true);
        }
    }
}
