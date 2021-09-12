package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: cfc reason: default package */
/* compiled from: PG */
public abstract class cfc extends defpackage.xh {
    public defpackage.cdj U;
    public defpackage.cff V;
    private final defpackage.cdm W = new defpackage.cfd(this);

    /* access modifiers changed from: protected */
    public abstract defpackage.cff N();

    public final android.app.Dialog c() {
        defpackage.cky.b(this.U != null, "initialize must be called before opening the dialog");
        return new defpackage.cey(getContext());
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.V = N();
        this.V.setId(R.id.og_dialog_fragment_account_menu);
        this.V.a(this.U);
        return this.V;
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.V.setSaveFromParentEnabled(true);
    }

    public final void onResume() {
        super.onResume();
        this.V.b();
        this.U.a().a(this.W);
    }

    public final void onPause() {
        super.onPause();
        this.U.a().b(this.W);
    }

    public void onDestroy() {
        this.V = null;
        super.onDestroy();
    }

    protected static void O() {
    }
}
