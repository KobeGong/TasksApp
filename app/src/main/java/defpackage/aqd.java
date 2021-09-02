package defpackage;

/* renamed from: aqd reason: default package */
final /* synthetic */ class aqd implements android.view.View.OnClickListener {
    private final WelcomeFragment a;

    aqd(WelcomeFragment aqa) {
        this.a = aqa;
    }

    public final void onClick(android.view.View view) {
        WelcomeFragment aqa = this.a;
        defpackage.axt axt = defpackage.axt.a;
        int a2 = defpackage.axv.a(aqa.getContext());
        if (a2 == 0) {
            aqa.c();
        } else if (defpackage.axv.a(a2)) {
            axt.a((android.app.Activity) aqa.getActivity(), a2).show();
        } else {
            com.google.android.apps.tasks.ui.components.snackbar.Snackbar.a(aqa.J, (java.lang.CharSequence) defpackage.axv.b(a2), 0).a();
        }
    }
}
