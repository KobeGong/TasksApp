package defpackage;

import android.os.Build;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: cfg  reason: default package */
public final /* synthetic */ class cfg implements uy {
    private final cff a;
    private final float b;

    cfg(cff cff, float f) {
        this.a = cff;
        this.b = f;
    }

    @Override // defpackage.uy
    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        int color;
        int i3 = 0;
        cff cff = this.a;
        float f = this.b;
        boolean z = ((float) i) >= f;
        View a2 = cff.a();
        if (Build.VERSION.SDK_INT >= 21) {
            if (z) {
                color = cff.getResources().getColor(R.color.google_white);
            } else {
                color = cff.getResources().getColor(R.color.google_transparent);
            }
            a2.setBackgroundColor(color);
            sn.a(a2, z ? f : 0.0f);
            return;
        }
        View findViewById = cff.findViewById(R.id.selected_account_header_shadow);
        if (findViewById != null) {
            if (!z) {
                i3 = 8;
            }
            findViewById.setVisibility(i3);
        }
    }
}
