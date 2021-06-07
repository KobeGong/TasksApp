package defpackage;

import android.content.Context;
import android.view.Window;

/* access modifiers changed from: package-private */
/* renamed from: ws  reason: default package */
/* compiled from: PG */
public final class ws extends wx {
    ws(Context context, Window window, wn wnVar) {
        super(context, window, wnVar);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wx, defpackage.wp, defpackage.wu
    public final Window.Callback a(Window.Callback callback) {
        return new wt(this, callback);
    }
}
