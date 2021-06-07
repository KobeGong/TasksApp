package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.tasks.R;

/* renamed from: arv  reason: default package */
/* compiled from: PG */
public final class arv extends arb {
    public EditText a;
    public dcb b;

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.edit_list_fragment, (ViewGroup) null);
        this.a = (EditText) inflate.findViewById(R.id.edit_list_title);
        a(new arw(this));
        return inflate;
    }

    @Override // defpackage.lc
    public final void e() {
        super.e();
        b((View) this.a);
    }

    @Override // defpackage.lc
    public final void f() {
        bdk.a((View) this.a, false);
        super.f();
    }
}
