package defpackage;

import android.os.Environment;
import android.os.StatFs;

/* access modifiers changed from: package-private */
/* renamed from: cpm  reason: default package */
/* compiled from: PG */
public final class cpm implements cpl {
    cpm() {
    }

    @Override // defpackage.cpl
    public final long a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    @Override // defpackage.cpl
    public final long b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize());
    }
}
