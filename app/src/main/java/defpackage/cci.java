package defpackage;

/* renamed from: cci reason: default package */
/* compiled from: PG */
public final class cci {
    private final defpackage.bqg a;
    private final defpackage.crv b;
    private final defpackage.bwq c;
    private final defpackage.cpi d;
    private final defpackage.ccl e;

    public final java.util.concurrent.Future a(defpackage.bul bul, java.lang.String str, java.lang.String str2, int i, int i2) {
        return this.c.a((java.util.concurrent.Callable) new defpackage.cbp(this, bul, str, str2, i, i2));
    }

    public cci(android.content.Context context, defpackage.bxc bxc, defpackage.bqg bqg, defpackage.crv crv, defpackage.bwq bwq) {
        long j;
        this.a = bqg;
        this.b = crv;
        this.c = bwq;
        this.d = new defpackage.cpi(context, "chime_media_cache");
        defpackage.cpi cpi = this.d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (cpi.a().exists()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            cpi.a(cpi.a(), arrayList);
            if (!arrayList.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                long j2 = 0;
                java.util.ArrayList arrayList3 = arrayList;
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    java.lang.Object obj = arrayList3.get(i);
                    i++;
                    defpackage.cpj cpj = new defpackage.cpj((java.io.File) obj);
                    cpj.d = currentTimeMillis - cpj.b < 1800000;
                    j2 += cpj.c;
                    arrayList2.add(cpj);
                }
                long b2 = cpi.b();
                if (j2 > b2) {
                    java.util.Collections.sort(arrayList2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2 && j2 > b2) {
                        defpackage.cpj cpj2 = (defpackage.cpj) arrayList2.get(i2);
                        if (cpj2.a.delete()) {
                            j = j2 - cpj2.c;
                        } else {
                            j = j2;
                        }
                        i2++;
                        j2 = j;
                    }
                }
            }
        }
        this.e = new defpackage.ccl();
    }

    /* JADX INFO: finally extract failed */
    public final android.graphics.Bitmap b(defpackage.bul bul, java.lang.String str, java.lang.String str2, int i, int i2) {
        defpackage.bty.a("ChimeMediaManagerImpl-Basic", "Image url: %s, fife: %s, w: %d, h: %d", str, str2, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        defpackage.byr byr = new defpackage.byr();
        byr.c = bul;
        if (str == null) {
            throw new java.lang.NullPointerException("Null originalUrl");
        }
        byr.a = str;
        byr.b = str2;
        byr.d = java.lang.Integer.valueOf(i);
        byr.e = java.lang.Integer.valueOf(i2);
        java.lang.String str3 = "";
        if (byr.a == null) {
            str3 = java.lang.String.valueOf(str3).concat(" originalUrl");
        }
        if (!str3.isEmpty()) {
            java.lang.String str4 = "Missing required properties:";
            java.lang.String valueOf = java.lang.String.valueOf(str3);
            throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str4.concat(valueOf) : new java.lang.String(str4));
        }
        defpackage.byo byo = new defpackage.byo(byr.a, byr.b, byr.c, byr.d, byr.e);
        if (!this.e.a(byo)) {
            return null;
        }
        try {
            android.graphics.Bitmap a2 = a(byo);
            this.e.b(byo);
            return a2;
        } catch (Throwable th) {
            this.e.b(byo);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        if (r0 != false) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0140 A[Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01af A[Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.Bitmap a(defpackage.byq r10) {
        /*
            r9 = this;
            r1 = 0
            r3 = 1
            r2 = 0
            java.lang.String r4 = r10.f()
            cpi r5 = r9.d     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.io.File r0 = new java.io.File     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r4 = r5.a(r4)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            boolean r4 = r0.exists()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r4 == 0) goto L_0x00da
        L_0x0018:
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = r10.b()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = r10.b()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
        L_0x0028:
            java.lang.String r4 = "//"
            boolean r4 = r0.startsWith(r4)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = "https:"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            int r5 = r0.length()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r5 == 0) goto L_0x00e3
            java.lang.String r0 = r4.concat(r0)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
        L_0x0040:
            boolean r4 = defpackage.cpx.a(r0)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r4 == 0) goto L_0x0072
            r4 = 54
            java.lang.Integer r5 = r10.d()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            int r5 = r5.intValue()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r5 == 0) goto L_0x005e
            java.lang.Integer r5 = r10.e()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            int r5 = r5.intValue()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r5 == 0) goto L_0x005e
            r4 = 126(0x7e, float:1.77E-43)
        L_0x005e:
            java.lang.Integer r5 = r10.d()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            int r5 = r5.intValue()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.Integer r6 = r10.e()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            int r6 = r6.intValue()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r0 = defpackage.cpx.a(r0, r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
        L_0x0072:
            java.lang.String r4 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r5 = "Downloading image, URL: %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r7 = 0
            r6[r7] = r0     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            defpackage.bty.a(r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            bxe r4 = defpackage.bxd.e()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            bxe r4 = r4.a(r0)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.util.Map r5 = r9.b(r10)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r4.c = r5     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            bxd r4 = r4.a()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            bxf r4 = defpackage.bxc.a(r4)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            boolean r5 = r4.f()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r5 == 0) goto L_0x00f6
            java.lang.String r3 = "ChimeMediaManagerImpl-Basic"
            java.lang.Throwable r4 = r4.g()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r5 = "Error downloading Chime image from URL: %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r7 = 0
            r6[r7] = r0     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            defpackage.bty.b(r3, r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0 = r2
        L_0x00ad:
            if (r0 == 0) goto L_0x00f4
        L_0x00af:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r3 = 0
            r0.inScaled = r3     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0.inPreferredConfig = r3     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r3 = r10.f()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            cpi r4 = r9.d     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r4 = r4.a(r3)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r4, r0)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r0 != 0) goto L_0x01cc
            java.lang.String r0 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r4 = "Error loading Chime image from file: %s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r6 = 0
            r5[r6] = r3     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            defpackage.bty.e(r0, r4, r5)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0 = r1
        L_0x00d9:
            return r0
        L_0x00da:
            r0 = r1
            goto L_0x0018
        L_0x00dd:
            java.lang.String r0 = r10.a()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            goto L_0x0028
        L_0x00e3:
            java.lang.String r0 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            goto L_0x0040
        L_0x00ea:
            r0 = move-exception
            java.lang.String r3 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r4 = "Failed to allocate memory for Chime image."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            defpackage.bty.b(r3, r0, r4, r2)
        L_0x00f4:
            r0 = r1
            goto L_0x00d9
        L_0x00f6:
            java.lang.String r5 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r6 = "Image successfully downloaded from URL: %s"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r8 = 0
            r7[r8] = r0     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            defpackage.bty.a(r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.util.Map r0 = r4.d()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r5 = "Content-Type"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.util.List r0 = (java.util.List) r0     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r0 != 0) goto L_0x011d
            java.util.Map r0 = r4.d()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r5 = "content-type"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.util.List r0 = (java.util.List) r0     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
        L_0x011d:
            if (r0 == 0) goto L_0x0158
            java.util.Iterator r5 = r0.iterator()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
        L_0x0123:
            boolean r0 = r5.hasNext()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = r5.next()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r0 = r0.toLowerCase(r6)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r6 = "image/svg"
            boolean r0 = r0.startsWith(r6)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r0 == 0) goto L_0x0123
            r0 = r3
        L_0x013e:
            if (r0 == 0) goto L_0x01af
            r4.c()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            crv r0 = r9.b     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            boolean r0 = r0.a()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r0 != 0) goto L_0x015a
            java.lang.String r0 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r3 = "SVG parser not present."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            defpackage.bty.a(r0, r3, r4)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0 = r2
            goto L_0x00ad
        L_0x0158:
            r0 = r2
            goto L_0x013e
        L_0x015a:
            crv r0 = r9.b     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.Object r0 = r0.b()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            cbq r0 = (defpackage.cbq) r0     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.Integer r4 = r10.d()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r4.intValue()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.Integer r4 = r10.e()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r4.intValue()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            android.graphics.Bitmap r0 = r0.a()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            if (r0 != 0) goto L_0x0183
            java.lang.String r0 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r3 = "Failed to get the bitmap for svg file."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            defpackage.bty.e(r0, r3, r4)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0 = r2
            goto L_0x00ad
        L_0x0183:
            java.lang.String r4 = r10.f()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r7 = 100
            r0.compress(r6, r7, r5)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            cpi r6 = r9.d     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            byte[] r5 = r5.toByteArray()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r6.a(r4, r5)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0.recycle()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r0 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r5 = "Converted SVG Image saved into file: %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r7 = 0
            r6[r7] = r4     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            defpackage.bty.a(r0, r5, r6)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0 = r3
            goto L_0x00ad
        L_0x01af:
            java.lang.String r0 = r10.f()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            cpi r5 = r9.d     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            byte[] r4 = r4.c()     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r5.a(r0, r4)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            java.lang.String r4 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r5 = "Image saved into file: %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r7 = 0
            r6[r7] = r0     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            defpackage.bty.a(r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r0 = r3
            goto L_0x00ad
        L_0x01cc:
            java.lang.String r4 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r5 = "Image Loaded from file: %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            r7 = 0
            r6[r7] = r3     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            defpackage.bty.a(r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x00ea, Exception -> 0x01db }
            goto L_0x00d9
        L_0x01db:
            r0 = move-exception
            java.lang.String r3 = "ChimeMediaManagerImpl-Basic"
            java.lang.String r4 = "Error loading Chime image."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            defpackage.bty.b(r3, r0, r4, r2)
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cci.a(byq):android.graphics.Bitmap");
    }

    private final java.util.Map b(defpackage.byq byq) {
        defpackage.bul c2 = byq.c();
        java.lang.String b2 = byq.b();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (c2 != null && !android.text.TextUtils.isEmpty(b2) && defpackage.cpx.a(b2)) {
            try {
                java.lang.String str = "Authorization";
                java.lang.String str2 = "Bearer ";
                java.lang.String valueOf = java.lang.String.valueOf(this.a.a(c2.b(), "oauth2:https://www.googleapis.com/auth/photos.image.readonly"));
                hashMap.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
            } catch (java.lang.Exception e2) {
                defpackage.bty.b("ChimeMediaManagerImpl-Basic", "Error authenticating image request.", new java.lang.Object[0]);
            }
        }
        hashMap.put("Accept-Encoding", "gzip");
        return hashMap;
    }
}
