package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bvk  reason: default package */
/* compiled from: PG */
public abstract class bvk extends BroadcastReceiver {
    public abstract bvn a(Context context);

    public final void onReceive(Context context, Intent intent) {
        try {
            bxk.a(context).a();
            new bws();
            bvn a = a(context);
            if (a.a(intent)) {
                bwq bwq = (bwq) bxk.a(context).b.a();
                if (!bwj.a(context)) {
                    bwq.b(new bvl(a, intent));
                } else {
                    bwq.a(goAsync(), new bvm(a, intent));
                }
            }
        } catch (IllegalStateException e) {
            bty.a("ChimeBroadcastReceiver", e, "BroadcastReceiver stopped", new Object[0]);
        }
    }
}
