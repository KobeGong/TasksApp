package defpackage;

import android.content.Context;

/* renamed from: bxs  reason: default package */
/* compiled from: PG */
public final class bxs implements ecz {
    private final bxm a;

    public bxs(bxm bxm) {
        this.a = bxm;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        return (Context) dgv.a(this.a.a.a().getApplicationContext(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
