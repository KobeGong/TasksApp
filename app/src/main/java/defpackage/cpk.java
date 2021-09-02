package defpackage;

@android.annotation.TargetApi(18)
/* renamed from: cpk reason: default package */
/* compiled from: PG */
final class cpk implements defpackage.cpl {
    cpk() {
    }

    public final long a() {
        return new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getTotalBytes();
    }

    public final long b() {
        return new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getFreeBytes();
    }
}
