package defpackage;

/* renamed from: hy reason: default package */
/* compiled from: PG */
public final class hy implements java.io.FileFilter {
    private final /* synthetic */ java.lang.String a;

    public hy(java.lang.String str) {
        this.a = str;
    }

    public final boolean accept(java.io.File file) {
        java.lang.String name = file.getName();
        return !name.startsWith(this.a) && !name.equals("MultiDex.lock");
    }
}
