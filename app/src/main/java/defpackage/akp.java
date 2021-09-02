package defpackage;

/* renamed from: akp reason: default package */
/* compiled from: PG */
public final class akp {
    public static boolean a(android.content.Context context, java.lang.String str) {
        boolean z = false;
        try {
            return defpackage.bqb.a(context.getContentResolver(), str, false);
        } catch (java.lang.SecurityException e) {
            return z;
        }
    }
}
