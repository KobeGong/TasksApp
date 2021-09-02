package defpackage;

/* renamed from: cet reason: default package */
public final /* synthetic */ class cet implements android.view.View.OnClickListener {
    private final android.content.Context a;
    private final android.content.pm.CrossProfileApps b;
    private final android.os.UserHandle c;

    public cet(android.content.Context context, android.content.pm.CrossProfileApps crossProfileApps, android.os.UserHandle userHandle) {
        this.a = context;
        this.b = crossProfileApps;
        this.c = userHandle;
    }

    public final void onClick(android.view.View view) {
        android.content.Context context = this.a;
        this.b.startMainActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent(), this.c);
    }
}
