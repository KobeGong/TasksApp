package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.tasks.R;

/* renamed from: aih  reason: default package */
/* compiled from: PG */
final class aih extends aig {
    aih() {
    }

    @Override // defpackage.aig
    public final void a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        float f3;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(sn.a.u(view));
            int childCount = recyclerView.getChildCount();
            float f4 = 0.0f;
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    f3 = sn.a.u(childAt);
                    if (f3 > f4) {
                        i2++;
                        f4 = f3;
                    }
                }
                f3 = f4;
                i2++;
                f4 = f3;
            }
            sn.a(view, 1.0f + f4);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        super.a(canvas, recyclerView, view, f, f2, i, z);
    }

    @Override // defpackage.aig
    public final void a(View view) {
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag != null && (tag instanceof Float)) {
            sn.a(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        super.a(view);
    }
}
