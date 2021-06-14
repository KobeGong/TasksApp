package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: atz  reason: default package */
public final /* synthetic */ class atz implements View.OnClickListener {
    private final atx a;

    atz(atx atx) {
        this.a = atx;
    }

    public final void onClick(View view) {
        String str;
        atx atx = this.a;
        if (atx.y == daq.GMAIL_THREAD) {
            String b = any.get().c().b();
            Activity activity = (Activity) atx.s.getContext();
            String str2 = atx.x;
            if (Build.VERSION.SDK_INT >= 21) {
                Intent intent = new Intent("com.google.android.gm.intent.VIEW_MESSAGE_DEEPLINK");
                intent.putExtra("messageStorageId", str2);
                intent.setPackage("com.google.android.gm");
                bhq a2 = bhq.a(b);
                azb.b(activity, "Context must not be null.");
                azb.b(intent, "Intent must not be null.");
                azb.b(a2, "Account data must not be null.");
                ComponentName component = intent.getComponent();
                if (component != null) {
                    str = component.getPackageName();
                } else {
                    str = intent.getPackage();
                }
                if (str != null) {
                    azb.b(activity, "Context must not be null.");
                    azb.a(str, (Object) "Package name must not be empty.");
                    if (aya.a(activity).a(str)) {
                        Parcel obtain = Parcel.obtain();
                        a2.writeToParcel(obtain, 0);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        intent.putExtra("com.google.android.gms.accounts.ACCOUNT_DATA", marshall);
                    }
                }
                if (!(!activity.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) || !ajd.c(activity, "com.google.android.gm")) {
                    azb.b("Installed version of Gmail is too old", new Object[0]);
                    Toast.makeText(activity, (int) R.string.task_link_view_error, 1).show();
                    return;
                }
                activity.startActivityForResult(intent, 0);
                return;
            }
            azb.b("Unsupported OS for Gmail deeplinking", new Object[0]);
            Toast.makeText(activity, (int) R.string.task_link_view_os_error, 1).show();
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(atx.w));
        if (atx.s.getContext().getPackageManager().resolveActivity(intent2, 65536) != null) {
            atx.s.getContext().startActivity(intent2);
        } else {
            Toast.makeText(atx.s.getContext(), (int) R.string.task_link_view_error, 0).show();
        }
    }
}
