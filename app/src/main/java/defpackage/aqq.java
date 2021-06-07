package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.common.TaskApplication;

/* access modifiers changed from: package-private */
/* renamed from: aqq  reason: default package */
public final /* synthetic */ class aqq implements Runnable {
    private final aql a;
    private final czq b;

    aqq(aql aql, czq czq) {
        this.a = aql;
        this.b = czq;
    }

    public final void run() {
        czq czq;
        aql aql = this.a;
        czq czq2 = this.b;
        if (!aql.r()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            String valueOf = String.valueOf(Uri.encode(aql.getPackageName()));
            intent.setData(Uri.parse(valueOf.length() != 0 ? "market://details?id=".concat(valueOf) : new String("market://details?id=")));
            TaskApplication b2 = TaskApplication.b();
            if (czq2 == czq.FORCE) {
                czq = czq.FORCE;
            } else {
                czq = czq.NONE;
            }
            b2.b = czq;
            switch (czq2.ordinal()) {
                case 1:
                    aql.a(R.string.app_update_prompt, intent);
                    return;
                case 2:
                    aql.a(R.string.app_update_nag, intent);
                    return;
                case 3:
                    if (aql.r == null || !aql.r.isShowing()) {
                        xk xkVar = new xk(aql);
                        xkVar.a(R.string.update_required_header);
                        xkVar.b(R.string.update_required_body);
                        xkVar.a(R.string.update_required_button, new aqs(aql, intent));
                        xkVar.a(new aqt(aql));
                        aql.r = xkVar.a();
                        ajd.a(aql.r);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
