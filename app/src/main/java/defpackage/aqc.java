package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: aqc reason: default package */
final /* synthetic */ class aqc implements View.OnClickListener {
    private final WelcomeFragment a;

    aqc(WelcomeFragment aqa) {
        this.a = aqa;
    }

    public final void onClick(View view) {
        Intent flags = new Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456);
        flags.putExtra("account_types", new String[]{"com.google"});
        if (this.a.u == null) {
            throw new IllegalStateException("Fragment " + this.a + " not attached to Activity");
        }
        this.a.u.a(this.a, flags, -1);
    }
}
