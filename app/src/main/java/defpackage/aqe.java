package defpackage;

/* renamed from: aqe reason: default package */
final /* synthetic */ class aqe implements android.view.View.OnClickListener {
    private final WelcomeFragment a;

    aqe(WelcomeFragment aqa) {
        this.a = aqa;
    }

    public final void onClick(android.view.View view) {
        WelcomeFragment aqa = this.a;
        android.content.SharedPreferences.Editor edit = defpackage.aiw.b(aqa.getContext()).a.edit();
        edit.putBoolean("onboarding_dismissed", true);
        edit.apply();
        FragmentActivity j = aqa.getActivity();
        if (j != null) {
            j.onBackPressed();
        }
    }
}
