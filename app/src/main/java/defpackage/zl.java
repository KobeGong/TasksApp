package defpackage;

/* renamed from: zl reason: default package */
/* compiled from: PG */
final class zl extends android.widget.FrameLayout implements defpackage.ye {
    public final android.view.CollapsibleActionView a;

    zl(android.view.View view) {
        super(view.getContext());
        this.a = (android.view.CollapsibleActionView) view;
        addView(view);
    }

    public final void a() {
        this.a.onActionViewExpanded();
    }

    public final void b() {
        this.a.onActionViewCollapsed();
    }
}
