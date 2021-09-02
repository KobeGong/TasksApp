package defpackage;

/* renamed from: cpm reason: default package */
/* compiled from: PG */
final class cpm implements defpackage.cpl {
    cpm() {
    }

    public final long a() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    public final long b() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        return ((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize());
    }
}
