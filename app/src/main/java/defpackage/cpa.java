package defpackage;

/* renamed from: cpa reason: default package */
/* compiled from: PG */
public final class cpa {
    public final defpackage.cph a;
    private final defpackage.cpd b;

    public final void a(android.view.View view) {
        defpackage.cph cph = this.a;
        defpackage.cpd cpd = this.b;
        defpackage.cpc a2 = defpackage.cky.a(view);
        if (a2 == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "View does not have a VE attached: %s with id: %d", new java.lang.Object[]{view.getClass().getCanonicalName(), java.lang.Integer.valueOf(view.getId())}));
        }
        int hashCode = a2.hashCode();
        if (!cph.a.contains(java.lang.Integer.valueOf(hashCode))) {
            cpd.a(-1, view);
            cph.a.add(java.lang.Integer.valueOf(hashCode));
        }
    }

    public cpa(android.content.Context context, android.os.Bundle bundle, defpackage.cpd cpd) {
        this.b = cpd;
        this.a = new defpackage.cph(context);
        defpackage.cph cph = this.a;
        if (bundle != null && bundle.containsKey("impression_tracker_impressed_elements")) {
            if (cph.b.compareTo((android.content.res.Configuration) bundle.getParcelable("impression_tracker_previous_config")) != 0) {
                cph.a.addAll(bundle.getIntegerArrayList("impression_tracker_impressed_elements"));
            }
        }
    }
}
