package defpackage;

import android.content.Intent;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aqr  reason: default package */
public final /* synthetic */ class aqr implements View.OnClickListener {
    private final aql a;
    private final Intent b;

    aqr(aql aql, Intent intent) {
        this.a = aql;
        this.b = intent;
    }

    public final void onClick(View view) {
        this.a.startActivity(this.b);
    }
}
