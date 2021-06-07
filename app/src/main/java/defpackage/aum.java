package defpackage;

import android.view.View;
import com.google.android.apps.tasks.common.TaskApplication;

/* renamed from: aum  reason: default package */
final /* synthetic */ class aum implements View.OnClickListener {
    private final auj a;

    aum(auj auj) {
        this.a = auj;
    }

    public final void onClick(View view) {
        auj auj = this.a;
        auj.V.setEnabled(false);
        auj.a(true);
        any.a().c().f(auj.X);
        any.a().c().a(auj.X).a(new auq(auj), TaskApplication.b().a);
    }
}
