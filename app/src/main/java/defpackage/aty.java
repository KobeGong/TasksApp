package defpackage;

import android.view.View;
import com.google.android.apps.tasks.ui.components.FancyCheckboxView;

/* access modifiers changed from: package-private */
/* renamed from: aty  reason: default package */
public final /* synthetic */ class aty implements View.OnClickListener {
    private final atx a;

    aty(atx atx) {
        this.a = atx;
    }

    public final void onClick(View view) {
        boolean z = true;
        float f = 1.0f;
        atx atx = this.a;
        boolean z2 = atx.z == 1.0f;
        FancyCheckboxView fancyCheckboxView = atx.t;
        if (z2) {
            f = 0.0f;
        }
        fancyCheckboxView.a(f);
        if (atx.v != null) {
            aug aug = atx.v;
            int d = atx.d();
            if (z2) {
                z = false;
            }
            aug.adapter.a(d, z);
        }
    }
}
