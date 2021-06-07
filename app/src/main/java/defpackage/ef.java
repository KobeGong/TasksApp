package defpackage;

import android.content.res.TypedArray;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: ef  reason: default package */
/* compiled from: PG */
public final class ef implements View.OnClickListener {
    private final /* synthetic */ ee a;

    ef(ee eeVar) {
        this.a = eeVar;
    }

    public final void onClick(View view) {
        if (this.a.a && this.a.isShowing()) {
            ee eeVar = this.a;
            if (!eeVar.c) {
                TypedArray obtainStyledAttributes = eeVar.getContext().obtainStyledAttributes(new int[]{16843611});
                eeVar.b = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                eeVar.c = true;
            }
            if (eeVar.b) {
                this.a.cancel();
            }
        }
    }
}
