package defpackage;

/* renamed from: bjg reason: default package */
/* compiled from: PG */
public final class bjg {
    public static defpackage.bjg a = new defpackage.bjg();
    private defpackage.bjf b = null;

    public final synchronized defpackage.bjf a(android.content.Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new defpackage.bjf(context);
        }
        return this.b;
    }
}
