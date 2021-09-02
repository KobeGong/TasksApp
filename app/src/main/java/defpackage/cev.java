package defpackage;

/* renamed from: cev reason: default package */
/* compiled from: PG */
public final class cev implements android.view.View.OnAttachStateChangeListener {
    private final /* synthetic */ android.support.v7.widget.RecyclerView a;
    private final /* synthetic */ defpackage.ceo b;

    public cev(android.support.v7.widget.RecyclerView recyclerView, defpackage.ceo ceo) {
        this.a = recyclerView;
        this.b = ceo;
    }

    public final void onViewAttachedToWindow(android.view.View view) {
        defpackage.cdm.a(this.a, this.b);
    }

    public final void onViewDetachedFromWindow(android.view.View view) {
        defpackage.ceo ceo = this.b;
        ceo.a.b(ceo.f);
        this.a.setTag(2131755034, java.lang.Boolean.valueOf(false));
    }
}
