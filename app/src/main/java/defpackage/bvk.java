package defpackage;

/* renamed from: bvk reason: default package */
/* compiled from: PG */
public abstract class bvk extends android.content.BroadcastReceiver {
    public abstract defpackage.bvn a(android.content.Context context);

    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            defpackage.bxk.a(context).a();
            new defpackage.bws();
            defpackage.bvn a = a(context);
            if (a.a(intent)) {
                defpackage.bwq bwq = (defpackage.bwq) defpackage.bxk.a(context).b.a();
                if (!defpackage.bwj.a(context)) {
                    bwq.b(new defpackage.bvl(a, intent));
                } else {
                    bwq.a(goAsync(), new defpackage.bvm(a, intent));
                }
            }
        } catch (java.lang.IllegalStateException e) {
            defpackage.bty.a("ChimeBroadcastReceiver", e, "BroadcastReceiver stopped", new java.lang.Object[0]);
        }
    }
}
