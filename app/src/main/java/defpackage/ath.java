package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: ath  reason: default package */
public final /* synthetic */ class ath implements View.OnClickListener {
    private final SortableAdapter a;

    ath(SortableAdapter atg) {
        this.a = atg;
    }

    public final void onClick(View view) {
        this.a.e();
    }
}
