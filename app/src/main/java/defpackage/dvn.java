package defpackage;

/* renamed from: dvn reason: default package */
/* compiled from: PG */
public abstract class dvn extends defpackage.dri {
    private static final defpackage.dpa a = new defpackage.dvo();
    public static final defpackage.doy r = defpackage.doh.a(":status", a);
    public defpackage.dpw s;
    public defpackage.dor t;
    public java.nio.charset.Charset u = defpackage.crp.b;
    public boolean v;

    public dvn(int i, defpackage.dzo dzo, defpackage.dzt dzt) {
        super(i, dzo, dzt, 0);
    }

    public abstract void a(defpackage.dpw dpw, boolean z, defpackage.dor dor);

    public static defpackage.dpw a(defpackage.dor dor) {
        java.lang.Integer num = (java.lang.Integer) dor.a(r);
        if (num == null) {
            return defpackage.dpw.h.a("Missing HTTP status code");
        }
        java.lang.String str = (java.lang.String) dor.a(defpackage.dvc.g);
        if (defpackage.dvc.a(str)) {
            return null;
        }
        defpackage.dpw a2 = defpackage.dvc.a(num.intValue());
        java.lang.String str2 = "invalid content-type: ";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        return a2.b(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    public static java.nio.charset.Charset b(defpackage.dor dor) {
        java.lang.String str = (java.lang.String) dor.a(defpackage.dvc.g);
        if (str != null) {
            java.lang.String[] split = str.split("charset=", 2);
            try {
                return java.nio.charset.Charset.forName(split[split.length - 1].trim());
            } catch (java.lang.Exception e) {
            }
        }
        return defpackage.crp.b;
    }

    public static void c(defpackage.dor dor) {
        dor.b(r);
        dor.b(defpackage.doi.b);
        dor.b(defpackage.doi.a);
    }
}
