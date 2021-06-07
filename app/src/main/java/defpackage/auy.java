package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: auy  reason: default package */
/* compiled from: PG */
public final class auy extends afw {
    auy(RecyclerView recyclerView) {
        super(recyclerView);
    }

    @Override // defpackage.afw, defpackage.rn
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setItemCount(Math.max(0, accessibilityEvent.getItemCount() - 1));
    }
}
