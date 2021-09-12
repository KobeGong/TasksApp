package defpackage;

import com.google.android.apps.tasks.ui.components.snackbar.Snackbar;

/* renamed from: aqd reason: default package */
final /* synthetic */ class aqd implements android.view.View.OnClickListener {
    private final WelcomeFragment a;

    aqd(WelcomeFragment aqa) {
        this.a = aqa;
    }

    public final void onClick(android.view.View view) {
        int a2 = defpackage.axv.a(this.a.getContext());
        if (a2 == 0) {
            this.a.onRetryClick();
        } else if (defpackage.axv.a(a2)) {
            defpackage.axt.a.a(this.a.getActivity(), a2).show();
        } else
            Snackbar.a(this.a.mView, axv.b(a2), 0).a();
    }
}
