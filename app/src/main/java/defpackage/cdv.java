package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;

/* renamed from: cdv  reason: default package */
/* compiled from: PG */
class cdv {
    private final cdf a;

    cdv(cdf cdf) {
        this.a = cdf;
    }

    static void a(View view) {
        view.getContext().startActivity(new Intent("android.settings.SYNC_SETTINGS").setFlags(268435456));
    }

    static void b(View view) {
        Context context = view.getContext();
        Intent flags = new Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456);
        if (Build.VERSION.SDK_INT >= 18) {
            flags.putExtra("account_types", new String[]{"com.google"});
        }
        context.startActivity(flags);
    }

    /* access modifiers changed from: package-private */
    public final void a(czk czk, cdu cdu, Activity activity) {
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", czk.d);
        String b = cdu.b();
        putExtra.putExtra("extra.accountName", (CharSequence) b);
        String.format("startSettingstActivity(). screenId: %s, accountName: %s", czk, b);
        activity.startActivityForResult(putExtra, 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(czk czk, cdu cdu, Activity activity, String str) {
        if (cdu != null) {
            a(czk, cdu, activity);
            return;
        }
        cq cqVar = new cq();
        cqVar.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", cqVar.b);
        cp cpVar = new cp(cqVar.a);
        Context applicationContext = activity.getApplicationContext();
        cpVar.a.setData(Uri.parse(str));
        ob.a(applicationContext, cpVar.a, null);
    }

    static {
        cdv.class.getSimpleName();
    }
}
