package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.tasks.ui.components.snackbar.Snackbar;

/* renamed from: aqd  reason: default package */
final /* synthetic */ class aqd implements View.OnClickListener {
    private final aqa a;

    aqd(aqa aqa) {
        this.a = aqa;
    }

    public final void onClick(View view) {
        aqa aqa = this.a;
        axt axt = axt.a;
        int a2 = axv.a(aqa.i());
        if (a2 == 0) {
            aqa.c();
        } else if (axv.a(a2)) {
            axt.a((Activity) aqa.j(), a2).show();
        } else {
            Snackbar.a(aqa.J, axv.b(a2), 0).a();
        }
    }
}
