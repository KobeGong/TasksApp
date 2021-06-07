package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import java.util.Locale;

/* renamed from: cpa  reason: default package */
/* compiled from: PG */
public final class cpa {
    public final cph a;
    private final cpd b;

    public final void a(View view) {
        cph cph = this.a;
        cpd cpd = this.b;
        cpc a2 = cky.a(view);
        if (a2 == null) {
            throw new IllegalArgumentException(String.format(Locale.US, "View does not have a VE attached: %s with id: %d", view.getClass().getCanonicalName(), Integer.valueOf(view.getId())));
        }
        int hashCode = a2.hashCode();
        if (!cph.a.contains(Integer.valueOf(hashCode))) {
            cpd.a(-1, view);
            cph.a.add(Integer.valueOf(hashCode));
        }
    }

    public cpa(Context context, Bundle bundle, cpd cpd) {
        this.b = cpd;
        this.a = new cph(context);
        cph cph = this.a;
        if (bundle != null && bundle.containsKey("impression_tracker_impressed_elements")) {
            if (cph.b.compareTo((Configuration) bundle.getParcelable("impression_tracker_previous_config")) != 0) {
                cph.a.addAll(bundle.getIntegerArrayList("impression_tracker_impressed_elements"));
            }
        }
    }
}
