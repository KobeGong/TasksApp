package defpackage;

/* renamed from: atz reason: default package */
final /* synthetic */ class atz implements android.view.View.OnClickListener {
    private final defpackage.atx a;

    atz(defpackage.atx atx) {
        this.a = atx;
    }

    public final void onClick(android.view.View view) {
        java.lang.String str;
        defpackage.atx atx = this.a;
        if (atx.y == defpackage.daq.GMAIL_THREAD) {
            java.lang.String b = defpackage.any.a().c().b();
            android.app.Activity activity = (android.app.Activity) atx.s.getContext();
            java.lang.String str2 = atx.x;
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                android.content.Intent intent = new android.content.Intent("com.google.android.gm.intent.VIEW_MESSAGE_DEEPLINK");
                intent.putExtra("messageStorageId", str2);
                intent.setPackage("com.google.android.gm");
                defpackage.bhq a2 = defpackage.bhq.a(b);
                defpackage.azb.b((java.lang.Object) activity, (java.lang.Object) "Context must not be null.");
                defpackage.azb.b((java.lang.Object) intent, (java.lang.Object) "Intent must not be null.");
                defpackage.azb.b((java.lang.Object) a2, (java.lang.Object) "Account data must not be null.");
                android.content.ComponentName component = intent.getComponent();
                if (component != null) {
                    str = component.getPackageName();
                } else {
                    str = intent.getPackage();
                }
                if (str != null) {
                    defpackage.azb.b((java.lang.Object) activity, (java.lang.Object) "Context must not be null.");
                    defpackage.azb.a(str, (java.lang.Object) "Package name must not be empty.");
                    if (defpackage.aya.a((android.content.Context) activity).a(str)) {
                        android.os.Parcel obtain = android.os.Parcel.obtain();
                        a2.writeToParcel(obtain, 0);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        intent.putExtra("com.google.android.gms.accounts.ACCOUNT_DATA", marshall);
                    }
                }
                if (!(!activity.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) || !defpackage.ajd.c(activity, "com.google.android.gm")) {
                    defpackage.azb.b("Installed version of Gmail is too old", new java.lang.Object[0]);
                    android.widget.Toast.makeText(activity, 2131951824, 1).show();
                    return;
                }
                activity.startActivityForResult(intent, 0);
                return;
            }
            defpackage.azb.b("Unsupported OS for Gmail deeplinking", new java.lang.Object[0]);
            android.widget.Toast.makeText(activity, 2131951825, 1).show();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(atx.w));
        if (atx.s.getContext().getPackageManager().resolveActivity(intent2, 65536) != null) {
            atx.s.getContext().startActivity(intent2);
        } else {
            android.widget.Toast.makeText(atx.s.getContext(), 2131951824, 0).show();
        }
    }
}
