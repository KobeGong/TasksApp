package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: cci  reason: default package */
/* compiled from: PG */
public final class cci {
    private final bqg a;
    private final crv b;
    private final bwq c;
    private final cpi d;
    private final ccl e;

    public final Future a(bul bul, String str, String str2, int i, int i2) {
        return this.c.a(new cbp(this, bul, str, str2, i, i2));
    }

    public cci(Context context, bxc bxc, bqg bqg, crv crv, bwq bwq) {
        long j;
        this.a = bqg;
        this.b = crv;
        this.c = bwq;
        this.d = new cpi(context, "chime_media_cache");
        cpi cpi = this.d;
        long currentTimeMillis = System.currentTimeMillis();
        if (cpi.a().exists()) {
            ArrayList arrayList = new ArrayList();
            cpi.a(cpi.a(), arrayList);
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                long j2 = 0;
                ArrayList arrayList3 = arrayList;
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList3.get(i);
                    i++;
                    cpj cpj = new cpj((File) obj);
                    cpj.d = currentTimeMillis - cpj.b < 1800000;
                    j2 += cpj.c;
                    arrayList2.add(cpj);
                }
                long b2 = cpi.b();
                if (j2 > b2) {
                    Collections.sort(arrayList2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2 && j2 > b2) {
                        cpj cpj2 = (cpj) arrayList2.get(i2);
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
        this.e = new ccl();
    }

    public final Bitmap b(bul bul, String str, String str2, int i, int i2) {
        bty.a("ChimeMediaManagerImpl-Basic", "Image url: %s, fife: %s, w: %d, h: %d", str, str2, Integer.valueOf(i), Integer.valueOf(i2));
        byr byr = new byr();
        byr.c = bul;
        if (str == null) {
            throw new NullPointerException("Null originalUrl");
        }
        byr.a = str;
        byr.b = str2;
        byr.d = Integer.valueOf(i);
        byr.e = Integer.valueOf(i2);
        String str3 = "";
        if (byr.a == null) {
            str3 = String.valueOf(str3).concat(" originalUrl");
        }
        if (!str3.isEmpty()) {
            String valueOf = String.valueOf(str3);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        byo byo = new byo(byr.a, byr.b, byr.c, byr.d, byr.e);
        if (!this.e.a(byo)) {
            return null;
        }
        try {
            return a(byo);
        } finally {
            this.e.b(byo);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        if (r0 != false) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.Bitmap a(defpackage.byq r10) {
        /*
        // Method dump skipped, instructions count: 487
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cci.a(byq):android.graphics.Bitmap");
    }

    private final Map b(byq byq) {
        bul c2 = byq.c();
        String b2 = byq.b();
        HashMap hashMap = new HashMap();
        if (c2 != null && !TextUtils.isEmpty(b2) && cpx.a(b2)) {
            try {
                String valueOf = String.valueOf(this.a.a(c2.b(), "oauth2:https://www.googleapis.com/auth/photos.image.readonly"));
                hashMap.put("Authorization", valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
            } catch (Exception e2) {
                bty.b("ChimeMediaManagerImpl-Basic", "Error authenticating image request.", new Object[0]);
            }
        }
        hashMap.put("Accept-Encoding", "gzip");
        return hashMap;
    }
}
