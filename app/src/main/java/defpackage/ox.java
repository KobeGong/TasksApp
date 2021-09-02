package defpackage;

/* renamed from: ox reason: default package */
/* compiled from: PG */
class ox extends defpackage.pb {
    ox() {
    }

    private static java.io.File a(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        try {
            java.lang.String readlink = android.system.Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (android.system.OsConstants.S_ISREG(android.system.Os.stat(readlink).st_mode)) {
                return new java.io.File(readlink);
            }
            return null;
        } catch (android.system.ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        if (r2 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0052, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        defpackage.cza.a(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0057, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0058, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0069, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x006a, code lost:
        defpackage.cza.a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x006e, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0057 A[Catch:{ all -> 0x0057, all -> 0x0044 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0016] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r7, defpackage.pz[] r8, int r9) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r8.length
            if (r1 > 0) goto L_0x0005
        L_0x0004:
            return r0
        L_0x0005:
            pz r1 = defpackage.pb.a(r8, r9)
            android.content.ContentResolver r2 = r7.getContentResolver()
            android.net.Uri r1 = r1.a     // Catch:{ IOException -> 0x0050 }
            java.lang.String r3 = "r"
            r4 = 0
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r1, r3, r4)     // Catch:{ IOException -> 0x0050 }
            java.io.File r1 = a(r3)     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
            if (r1 == 0) goto L_0x0022
            boolean r2 = r1.canRead()     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
            if (r2 != 0) goto L_0x005e
        L_0x0022:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
            java.io.FileDescriptor r1 = r3.getFileDescriptor()     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
            r4.<init>(r1)     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
            android.graphics.Typeface r1 = defpackage.pb.a(r7, r4)     // Catch:{ Throwable -> 0x0039, all -> 0x0072 }
            r4.close()     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
            if (r3 == 0) goto L_0x0037
            r3.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0037:
            r0 = r1
            goto L_0x0004
        L_0x0039:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
        L_0x003c:
            if (r2 == 0) goto L_0x005a
            r4.close()     // Catch:{ Throwable -> 0x0052, all -> 0x0057 }
        L_0x0041:
            throw r1     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0048:
            if (r3 == 0) goto L_0x004f
            if (r2 == 0) goto L_0x006e
            r3.close()     // Catch:{ Throwable -> 0x0069 }
        L_0x004f:
            throw r1     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            goto L_0x0004
        L_0x0052:
            r4 = move-exception
            defpackage.cza.a(r2, r4)     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
            goto L_0x0041
        L_0x0057:
            r1 = move-exception
            r2 = r0
            goto L_0x0048
        L_0x005a:
            r4.close()     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
            goto L_0x0041
        L_0x005e:
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromFile(r1)     // Catch:{ Throwable -> 0x0042, all -> 0x0057 }
            if (r3 == 0) goto L_0x0067
            r3.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0067:
            r0 = r1
            goto L_0x0004
        L_0x0069:
            r3 = move-exception
            defpackage.cza.a(r2, r3)     // Catch:{ IOException -> 0x0050 }
            goto L_0x004f
        L_0x006e:
            r3.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x004f
        L_0x0072:
            r1 = move-exception
            r2 = r0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox.a(android.content.Context, pz[], int):android.graphics.Typeface");
    }
}
