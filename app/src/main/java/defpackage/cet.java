package defpackage;

import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.os.UserHandle;
import android.view.View;

/* renamed from: cet  reason: default package */
public final /* synthetic */ class cet implements View.OnClickListener {
    private final Context a;
    private final CrossProfileApps b;
    private final UserHandle c;

    public cet(Context context, CrossProfileApps crossProfileApps, UserHandle userHandle) {
        this.a = context;
        this.b = crossProfileApps;
        this.c = userHandle;
    }

    public final void onClick(View view) {
        Context context = this.a;
        this.b.startMainActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent(), this.c);
    }
}
