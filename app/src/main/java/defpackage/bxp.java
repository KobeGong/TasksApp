package defpackage;

import android.content.Context;

/* renamed from: bxp  reason: default package */
/* compiled from: PG */
public final class bxp implements ecz {
    private final bxm a;

    public bxp(bxm bxm) {
        this.a = bxm;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        return (Context) dgv.a(this.a.a.a().getApplicationContext(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
