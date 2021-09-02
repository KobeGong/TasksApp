package defpackage;

/* renamed from: aqc reason: default package */
final /* synthetic */ class aqc implements android.view.View.OnClickListener {
    private final WelcomeFragment a;

    aqc(WelcomeFragment aqa) {
        this.a = aqa;
    }

    public final void onClick(android.view.View view) {
        WelcomeFragment aqa = this.a;
        android.content.Intent flags = new android.content.Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456);
        flags.putExtra("account_types", new java.lang.String[]{"com.google"});
        if (aqa.u == null) {
            throw new java.lang.IllegalStateException("Fragment " + aqa + " not attached to Activity");
        }
        aqa.u.a((Fragment) aqa, flags, -1);
    }
}
