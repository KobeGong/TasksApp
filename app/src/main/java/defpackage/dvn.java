package defpackage;

import java.nio.charset.Charset;

/* renamed from: dvn  reason: default package */
/* compiled from: PG */
public abstract class dvn extends dri {
    private static final dpa a = new dvo();
    public static final doy r = doh.a(":status", a);
    public dpw s;
    public dor t;
    public Charset u = crp.b;
    public boolean v;

    public dvn(int i, dzo dzo, dzt dzt) {
        super(i, dzo, dzt, (byte) 0);
    }

    public abstract void a(dpw dpw, boolean z, dor dor);

    public static dpw a(dor dor) {
        Integer num = (Integer) dor.a(r);
        if (num == null) {
            return dpw.h.a("Missing HTTP status code");
        }
        String str = (String) dor.a(dvc.g);
        if (dvc.a(str)) {
            return null;
        }
        dpw a2 = dvc.a(num.intValue());
        String valueOf = String.valueOf(str);
        return a2.b(valueOf.length() != 0 ? "invalid content-type: ".concat(valueOf) : new String("invalid content-type: "));
    }

    public static Charset b(dor dor) {
        String str = (String) dor.a(dvc.g);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception e) {
            }
        }
        return crp.b;
    }

    public static void c(dor dor) {
        dor.b(r);
        dor.b(doi.b);
        dor.b(doi.a);
    }
}
