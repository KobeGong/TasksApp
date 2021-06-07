package defpackage;

import android.view.View;
import com.google.android.apps.tasks.ui.components.snackbar.Snackbar;

/* renamed from: arq  reason: default package */
/* compiled from: PG */
public final class arq implements View.OnClickListener {
    private final /* synthetic */ View.OnClickListener a;
    private final /* synthetic */ Snackbar b;

    public arq(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.b = snackbar;
        this.a = onClickListener;
    }

    public final void onClick(View view) {
        this.a.onClick(view);
        this.b.a(1);
    }
}
