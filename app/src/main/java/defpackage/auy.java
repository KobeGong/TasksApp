package defpackage;

/* renamed from: auy reason: default package */
/* compiled from: PG */
public final class auy extends defpackage.afw {
    auy(android.support.v7.widget.RecyclerView recyclerView) {
        super(recyclerView);
    }

    public final void a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setItemCount(java.lang.Math.max(0, accessibilityEvent.getItemCount() - 1));
    }
}
