package defpackage;

/* renamed from: bqf reason: default package */
/* compiled from: PG */
public final class bqf {
    private final android.content.Context a;
    private final java.lang.Object b = new java.lang.Object();
    private java.io.File c;

    public bqf(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    public final java.io.File a() {
        java.io.File file;
        synchronized (this.b) {
            if (this.c == null) {
                if (android.os.Build.VERSION.SDK_INT >= 24) {
                    this.c = this.a.getDataDir();
                } else {
                    this.c = this.a.getDatabasePath("dps-dummy").getParentFile().getParentFile();
                }
            }
            file = this.c;
        }
        return file;
    }
}
