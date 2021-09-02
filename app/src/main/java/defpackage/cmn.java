package defpackage;

/* renamed from: cmn reason: default package */
/* compiled from: PG */
public final class cmn {
    private volatile boolean a;

    public final boolean a(android.content.Context context, java.lang.String str, boolean z) {
        if (this.a) {
            return z;
        }
        try {
            return defpackage.bqb.a(context.getContentResolver(), str, z);
        } catch (java.lang.SecurityException e) {
            this.a = true;
            defpackage.cdm.b("GservicesWrapper", "Failed to read GServices.", e, new java.lang.Object[0]);
            return z;
        }
    }
}
