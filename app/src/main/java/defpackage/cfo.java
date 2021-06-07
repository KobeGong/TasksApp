package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.List;

/* renamed from: cfo  reason: default package */
/* compiled from: PG */
final class cfo extends cdm {
    public final /* synthetic */ cfm a;

    cfo(cfm cfm) {
        this.a = cfm;
    }

    @Override // defpackage.cdm
    public final void a(List list, List list2) {
        a(new cfp(this));
    }

    @Override // defpackage.cdm
    public final void a(Object obj, Object obj2, Object obj3) {
        a(new cfq(this));
    }

    private final void a(Runnable runnable) {
        Context context = this.a.getContext();
        if (context != null) {
            new Handler(context.getMainLooper()).post(runnable);
        }
    }
}
