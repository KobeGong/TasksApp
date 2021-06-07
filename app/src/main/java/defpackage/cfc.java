package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;

/* renamed from: cfc  reason: default package */
/* compiled from: PG */
public abstract class cfc extends xh {
    public cdj U;
    public cff V;
    private final cdm W = new cfd(this);

    /* access modifiers changed from: protected */
    public abstract cff N();

    @Override // defpackage.xh, defpackage.lb
    public final Dialog c() {
        cky.b(this.U != null, "initialize must be called before opening the dialog");
        return new cey(i());
    }

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.V = N();
        this.V.setId(R.id.og_dialog_fragment_account_menu);
        this.V.a(this.U);
        return this.V;
    }

    @Override // defpackage.lc
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.V.setSaveFromParentEnabled(true);
    }

    @Override // defpackage.lc
    public final void s() {
        super.s();
        this.V.b();
        this.U.a().a(this.W);
    }

    @Override // defpackage.lc
    public final void t() {
        super.t();
        this.U.a().b(this.W);
    }

    @Override // defpackage.lc
    public void u() {
        this.V = null;
        super.u();
    }

    protected static void O() {
    }
}
