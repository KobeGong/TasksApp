package defpackage;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* renamed from: ox  reason: default package */
/* compiled from: PG */
class ox extends pb {
    ox() {
    }

    private static File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        r2 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r2 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0057, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0058, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0069, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006a, code lost:
        defpackage.cza.a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006e, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0072, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0073, code lost:
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0057 A[ExcHandler: all (th java.lang.Throwable)] */
    @Override // defpackage.pb, defpackage.ow
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r7, defpackage.pz[] r8, int r9) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox.a(android.content.Context, pz[], int):android.graphics.Typeface");
    }
}
