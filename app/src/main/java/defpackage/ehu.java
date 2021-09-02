package defpackage;

/* renamed from: ehu reason: default package */
/* compiled from: PG */
public class ehu {
    public final defpackage.eie a;

    public ehu(android.content.Context context) {
        java.util.List<defpackage.ehx> a2 = defpackage.ehx.a(context);
        if (a2.size() == 0) {
            throw new java.lang.RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }
        for (defpackage.ehx d : a2) {
            d.d();
        }
        if (a2.size() == 0) {
            throw new java.lang.RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
        }
        java.util.Collections.sort(a2, new defpackage.ehv());
        this(((defpackage.ehx) a2.get(0)).a().a);
    }

    public ehu(defpackage.eie eie) {
        this.a = eie;
    }

    public defpackage.eht a() {
        return this.a.a();
    }

    static int a(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            throw new java.lang.IllegalArgumentException("The input values cannot be null");
        }
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length) {
            try {
                int parseInt = java.lang.Integer.parseInt(split[i]);
                int parseInt2 = java.lang.Integer.parseInt(split2[i]);
                if (parseInt != parseInt2) {
                    return java.lang.Integer.signum(parseInt - parseInt2);
                }
                i++;
            } catch (java.lang.NumberFormatException e) {
                throw new java.lang.IllegalArgumentException("Unable to convert version segments into integers: " + split[i] + " & " + split2[i], e);
            }
        }
        return java.lang.Integer.signum(split.length - split2.length);
    }
}
