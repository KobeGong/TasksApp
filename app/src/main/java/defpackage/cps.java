package defpackage;

import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import com.google.android.libraries.social.licenses.LicenseActivity;

/* renamed from: cps  reason: default package */
/* compiled from: PG */
public final class cps implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ ScrollView b;
    private final /* synthetic */ LicenseActivity c;

    public cps(LicenseActivity licenseActivity, int i, ScrollView scrollView) {
        this.c = licenseActivity;
        this.a = i;
        this.b = scrollView;
    }

    public final void run() {
        TextView textView = (TextView) this.c.findViewById(R.id.license_activity_textview);
        this.b.scrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(this.a)));
    }
}
