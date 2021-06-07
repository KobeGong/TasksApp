package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aqm  reason: default package */
public final /* synthetic */ class aqm implements View.OnClickListener {
    private final aql a;
    private final Throwable b;

    aqm(aql aql, Throwable th) {
        this.a = aql;
        this.b = th;
    }

    public final void onClick(View view) {
        this.a.startActivityForResult(((avf) this.b).a(), 1001);
    }
}
