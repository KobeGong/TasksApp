package defpackage;

/* renamed from: aih reason: default package */
/* compiled from: PG */
final class aih extends defpackage.aig {
    aih() {
    }

    public final void a(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView, android.view.View view, float f, float f2, int i, boolean z) {
        float f3;
        if (z && view.getTag(2131755018) == null) {
            java.lang.Float valueOf = java.lang.Float.valueOf(ViewCompat.a.getElevation(view));
            int childCount = recyclerView.getChildCount();
            float f4 = 0.0f;
            int i2 = 0;
            while (i2 < childCount) {
                android.view.View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    f3 = ViewCompat.a.getElevation(childAt);
                    if (f3 > f4) {
                        i2++;
                        f4 = f3;
                    }
                }
                f3 = f4;
                i2++;
                f4 = f3;
            }
            ViewCompat.setElevation(view, 1.0f + f4);
            view.setTag(2131755018, valueOf);
        }
        super.a(canvas, recyclerView, view, f, f2, i, z);
    }

    public final void a(android.view.View view) {
        java.lang.Object tag = view.getTag(2131755018);
        if (tag != null && (tag instanceof java.lang.Float)) {
            ViewCompat.setElevation(view, ((java.lang.Float) tag).floatValue());
        }
        view.setTag(2131755018, null);
        super.a(view);
    }
}
