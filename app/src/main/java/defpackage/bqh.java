package defpackage;

/* renamed from: bqh reason: default package */
/* compiled from: PG */
final class bqh implements defpackage.bqg {
    private final android.content.Context a;

    private bqh(android.content.Context context) {
        this.a = context;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        try {
            return defpackage.avb.a(this.a, str, str2);
        } catch (defpackage.ave e) {
            java.lang.String message = e.getMessage();
            e.a();
            throw new defpackage.ayl(message, e, 0);
        } catch (defpackage.avf e2) {
            java.lang.String message2 = e2.getMessage();
            e2.a();
            throw new defpackage.ayl(message2, 0);
        } catch (defpackage.ava e3) {
            throw new defpackage.ayl((java.lang.Throwable) e3);
        }
    }

    public final java.lang.String a(java.lang.String str) {
        try {
            return defpackage.avb.b(this.a, str);
        } catch (defpackage.avf e) {
            java.lang.String message = e.getMessage();
            e.a();
            throw new defpackage.ayl(message, (java.lang.Exception) e);
        } catch (defpackage.ava e2) {
            throw new defpackage.ayl((java.lang.Throwable) e2);
        }
    }

    static {
        java.util.concurrent.TimeUnit.SECONDS.toMillis(2);
    }

    public bqh(android.content.Context context, byte b) {
        this(context);
    }
}
