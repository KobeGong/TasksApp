package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: pu  reason: default package */
/* compiled from: PG */
public final class pu implements Callable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ ps b;
    private final /* synthetic */ int c;
    private final /* synthetic */ String d;

    pu(Context context, ps psVar, int i, String str) {
        this.a = context;
        this.b = psVar;
        this.c = i;
        this.d = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        qa a2 = pt.a(this.a, this.b, this.c);
        if (a2.a != null) {
            pt.a.a(this.d, a2.a);
        }
        return a2;
    }
}
