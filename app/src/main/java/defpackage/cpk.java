package defpackage;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;

/* access modifiers changed from: package-private */
@TargetApi(18)
/* renamed from: cpk  reason: default package */
/* compiled from: PG */
public final class cpk implements cpl {
    cpk() {
    }

    @Override // defpackage.cpl
    public final long a() {
        return new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes();
    }

    @Override // defpackage.cpl
    public final long b() {
        return new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes();
    }
}
