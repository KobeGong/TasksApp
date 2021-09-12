package defpackage;

/* renamed from: cdv reason: default package */
/* compiled from: PG */
class cdv {
    private final defpackage.cdf a;

    cdv(defpackage.cdf cdf) {
        this.a = cdf;
    }

    static void a(android.view.View view) {
        view.getContext().startActivity(new android.content.Intent("android.settings.SYNC_SETTINGS").setFlags(268435456));
    }

    static void b(android.view.View view) {
        android.content.Context context = view.getContext();
        android.content.Intent flags = new android.content.Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456);
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            flags.putExtra("account_types", new java.lang.String[]{"com.google"});
        }
        context.startActivity(flags);
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.czk czk, AbsDeviceOwner cdu, android.app.Activity activity) {
        android.content.Intent putExtra = new android.content.Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", czk.d);
        java.lang.String b = cdu.accountName();
        putExtra.putExtra("extra.accountName", b);
        java.lang.String.format("startSettingstActivity(). screenId: %s, accountName: %s", new java.lang.Object[]{czk, b});
        activity.startActivityForResult(putExtra, 0);
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.czk czk, AbsDeviceOwner cdu, android.app.Activity activity, java.lang.String str) {
        if (cdu != null) {
            a(czk, cdu, activity);
            return;
        }
        defpackage.cq cqVar = new defpackage.cq();
        cqVar.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", cqVar.b);
        defpackage.cp cpVar = new defpackage.cp(cqVar.a);
        android.content.Context applicationContext = activity.getApplicationContext();
        cpVar.a.setData(android.net.Uri.parse(str));
        defpackage.ob.a(applicationContext, cpVar.a, null);
    }

    static {
        defpackage.cdv.class.getSimpleName();
    }
}
