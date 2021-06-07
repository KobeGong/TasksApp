package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: aqc  reason: default package */
final /* synthetic */ class aqc implements View.OnClickListener {
    private final aqa a;

    aqc(aqa aqa) {
        this.a = aqa;
    }

    public final void onClick(View view) {
        aqa aqa = this.a;
        Intent flags = new Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456);
        flags.putExtra("account_types", new String[]{"com.google"});
        if (aqa.u == null) {
            throw new IllegalStateException("Fragment " + aqa + " not attached to Activity");
        }
        aqa.u.a(aqa, flags, -1);
    }
}
