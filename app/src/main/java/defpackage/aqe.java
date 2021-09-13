package defpackage;

/* renamed from: aqe reason: default package */
final /* synthetic */ class aqe implements android.view.View.OnClickListener {
    private final WelcomeFragment a;

    aqe(WelcomeFragment aqa) {
        this.a = aqa;
    }

    public final void onClick(android.view.View view) {
        defpackage.aiw.getInstance(this.a.getContext()).a.edit()
                .putBoolean("onboarding_dismissed", true)
                .apply();
        FragmentActivity j = this.a.getActivity();
        if (j != null) {
            j.onBackPressed();
        }
    }
}
