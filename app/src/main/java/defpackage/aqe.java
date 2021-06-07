package defpackage;

import android.content.SharedPreferences;
import android.view.View;

/* renamed from: aqe  reason: default package */
final /* synthetic */ class aqe implements View.OnClickListener {
    private final aqa a;

    aqe(aqa aqa) {
        this.a = aqa;
    }

    public final void onClick(View view) {
        aqa aqa = this.a;
        SharedPreferences.Editor edit = aiw.b(aqa.i()).a.edit();
        edit.putBoolean("onboarding_dismissed", true);
        edit.apply();
        lg j = aqa.j();
        if (j != null) {
            j.onBackPressed();
        }
    }
}
