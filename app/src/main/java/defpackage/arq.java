package defpackage;

/* renamed from: arq reason: default package */
/* compiled from: PG */
public final class arq implements android.view.View.OnClickListener {
    private final /* synthetic */ android.view.View.OnClickListener a;
    private final /* synthetic */ com.google.android.apps.tasks.ui.components.snackbar.Snackbar b;

    public arq(com.google.android.apps.tasks.ui.components.snackbar.Snackbar snackbar, android.view.View.OnClickListener onClickListener) {
        this.b = snackbar;
        this.a = onClickListener;
    }

    public final void onClick(android.view.View view) {
        this.a.onClick(view);
        this.b.a(1);
    }
}
