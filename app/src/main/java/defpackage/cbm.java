package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: cbm  reason: default package */
/* compiled from: PG */
public final class cbm {
    private static final long[] e = {0};
    public final Context a;
    public final buc b;
    public final ccu c;
    public final cbj d;
    private final byp f;
    private final dml g;
    private final crv h;
    private final bya i;

    public cbm(Context context, buc buc, byp byp, ccu ccu, dml dml, cbj cbj, crv crv, bya bya) {
        this.a = context;
        this.b = buc;
        this.f = byp;
        this.c = ccu;
        this.g = dml;
        this.d = cbj;
        this.h = crv;
        this.i = bya;
    }

    public final ni a(String str, bul bul, buv buv, boolean z, bvo bvo) {
        boolean z2;
        String string;
        int i2;
        dfr dfr;
        List<buq> list;
        dfr dfr2;
        Bitmap b2;
        dft dft;
        dft dft2;
        dft dft3;
        String str2;
        dgm dgm;
        dgu dgu;
        String str3;
        dfr dfr3;
        dfr dfr4;
        dga dga;
        dga dga2;
        dga dga3;
        if (buv == null) {
            bty.c("NotificationBuilderHelper", "Failed validation: Thread is null.", new Object[0]);
            this.i.a(ddi.BAD_PAYLOAD).a(bul).a(buv).a();
            z2 = false;
        } else if (TextUtils.isEmpty(buv.g().b)) {
            bty.c("NotificationBuilderHelper", "Failed validation: Thread [%s] is missing content title.", buv.a());
            this.i.a(ddi.INSUFFICIENT_DATA_NO_TITLE).a(bul).a(buv).a();
            z2 = false;
        } else if (TextUtils.isEmpty(buv.g().c)) {
            bty.c("NotificationBuilderHelper", "Failed validation: Thread [%s] is missing content text.", buv.a());
            this.i.a(ddi.INSUFFICIENT_DATA_NO_TEXT).a(bul).a(buv).a();
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            bty.e("NotificationBuilderHelper", "Payload contain insufficient data to display the notification.", new Object[0]);
            return null;
        }
        buf f2 = this.b.f();
        dfn g2 = buv.g();
        ArrayList arrayList = new ArrayList();
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
        if (g2.d.size() > 0) {
            for (dga dga4 : g2.d) {
                if (!TextUtils.isEmpty(dga4.b)) {
                    arrayList.add(((cci) this.g.a()).a(bul, dga4.b, dga4.c, dimensionPixelSize, dimensionPixelSize));
                    if (arrayList.size() >= 4) {
                        break;
                    }
                }
            }
        }
        if (arrayList.isEmpty() && (g2.a & 4) == 4) {
            if (g2.e == null) {
                dga = dga.d;
            } else {
                dga = g2.e;
            }
            if (!TextUtils.isEmpty(dga.b)) {
                cci cci = (cci) this.g.a();
                if (g2.e == null) {
                    dga2 = dga.d;
                } else {
                    dga2 = g2.e;
                }
                String str4 = dga2.b;
                if (g2.e == null) {
                    dga3 = dga.d;
                } else {
                    dga3 = g2.e;
                }
                arrayList.add(cci.a(bul, str4, dga3.c, dimensionPixelSize, dimensionPixelSize));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if ((g2.a & 32) == 32) {
            if (g2.h == null) {
                dfr4 = dfr.f;
            } else {
                dfr4 = g2.h;
            }
            if (dfr4.d.size() > 0) {
                Iterator it = dfr4.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    dga dga5 = (dga) it.next();
                    if (!TextUtils.isEmpty(dga5.b)) {
                        Resources resources = this.a.getResources();
                        arrayList2.add(((cci) this.g.a()).a(bul, dga5.b, dga5.c, (int) resources.getDimension(R.dimen.notifications_bigpicture_width), (int) resources.getDimension(R.dimen.notifications_bigpicture_height)));
                        break;
                    }
                }
            }
        }
        bvo f3 = bvo.f();
        List<Bitmap> a2 = a(arrayList, f3);
        List a3 = a(arrayList2, f3);
        if (!(a2.size() == arrayList.size() && a3.size() == arrayList2.size())) {
            this.i.a(ddi.FAILED_TO_DOWNLOAD_IMAGE).a(buv).a(bul).a();
        }
        ni b3 = new ni(this.a, (byte) 0).a(f2.a().intValue()).a(g2.b).b(g2.c);
        if (bul != null) {
            string = bul.b();
        } else {
            string = this.a.getString(f2.b().intValue());
        }
        ni c2 = b3.c(string);
        dfo a4 = dfo.a(g2.k);
        if (a4 == null) {
            a4 = dfo.PRIORITY_DEFAULT;
        }
        switch (a4.ordinal()) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = -1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = -2;
                break;
            default:
                i2 = 0;
                break;
        }
        c2.h = i2;
        c2.b(8);
        if (!TextUtils.isEmpty(g2.o)) {
            c2.d(g2.o);
        }
        a(c2, f2, g2, z);
        if (bwj.c()) {
            this.d.a(c2, buv);
        }
        if (z) {
            c2.t = 1;
        }
        if ((g2.a & 8192) == 8192) {
            c2.p = g2.p;
        } else if (f2.c() != null) {
            c2.p = this.a.getResources().getColor(f2.c().intValue());
        }
        if (g2.f > 0) {
            c2.a(g2.f / 1000);
        }
        if ((g2.a & 32) == 32) {
            if (g2.h == null) {
                dfr3 = dfr.f;
            } else {
                dfr3 = g2.h;
            }
            if (!TextUtils.isEmpty(dfr3.b) && !TextUtils.isEmpty(dfr3.c)) {
                nh nhVar = new nh();
                nhVar.b = ni.e(dfr3.b);
                c2.a(nhVar.a(dfr3.c));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (g2.h == null) {
            dfr = dfr.f;
        } else {
            dfr = g2.h;
        }
        for (dfl dfl : dfr.e) {
            cld.a(dfl);
            bur a5 = new bur().a().a(dgm.f);
            a5.e = dgu.b;
            bur a6 = a5.a();
            String str5 = dfl.b;
            if (str5 == null) {
                throw new NullPointerException("Null text");
            }
            a6.c = str5;
            String str6 = dfl.d;
            if (str6 == null) {
                throw new NullPointerException("Null actionId");
            }
            a6.a = str6;
            if (dfl.e == null) {
                dgm = dgm.f;
            } else {
                dgm = dfl.e;
            }
            bur a7 = a6.a(dgm);
            if (dfl.f == null) {
                dgu = dgu.b;
            } else {
                dgu = dfl.f;
            }
            a7.e = dgu;
            String str7 = "";
            if (a7.a == null) {
                str7 = String.valueOf(str7).concat(" actionId");
            }
            if (a7.b == null) {
                str7 = String.valueOf(str7).concat(" iconResourceId");
            }
            if (a7.c == null) {
                str7 = String.valueOf(str7).concat(" text");
            }
            if (a7.d == null) {
                str7 = String.valueOf(str7).concat(" threadStateUpdate");
            }
            if (!str7.isEmpty()) {
                String valueOf = String.valueOf(str7);
                if (valueOf.length() != 0) {
                    str3 = "Missing required properties:".concat(valueOf);
                } else {
                    str3 = new String("Missing required properties:");
                }
                throw new IllegalStateException(str3);
            }
            arrayList3.add(new bui(a7.a, a7.b.intValue(), a7.c, a7.d, a7.e));
        }
        if (this.h.a()) {
            list = ((cbt) this.h.b()).b();
        } else {
            list = arrayList3;
        }
        for (buq buq : list) {
            if (!TextUtils.isEmpty(buq.a())) {
                ccu ccu = this.c;
                String valueOf2 = String.valueOf("com.google.android.libraries.notifications.ACTION_ID:");
                String valueOf3 = String.valueOf(buq.a());
                if (valueOf3.length() != 0) {
                    str2 = valueOf2.concat(valueOf3);
                } else {
                    str2 = new String(valueOf2);
                }
                c2.b.add(new nf(buq.b(), buq.c(), PendingIntent.getActivity(ccu.a, ccu.a(str, str2), ccu.a(str2, ccu.b.f().i(), bul, Arrays.asList(buv), bzd.a(buq.d())), 134217728)));
            }
        }
        if ((g2.a & 512) == 512) {
            if (g2.l == null) {
                dft = dft.e;
            } else {
                dft = g2.l;
            }
            if (dft.b) {
                c2.q = 1;
            } else {
                if (g2.l == null) {
                    dft2 = dft.e;
                } else {
                    dft2 = g2.l;
                }
                String str8 = dft2.c;
                if (TextUtils.isEmpty(str8)) {
                    str8 = this.a.getString(f2.b().intValue());
                }
                if (g2.l == null) {
                    dft3 = dft.e;
                } else {
                    dft3 = g2.l;
                }
                String str9 = dft3.d;
                if (TextUtils.isEmpty(str9)) {
                    str9 = this.a.getResources().getQuantityString(R.plurals.public_notification_text, 1);
                }
                ni a8 = new ni(this.a, (byte) 0).a(str8).b(str9).a(f2.a().intValue());
                if (bul != null) {
                    a8.c(bul.b());
                }
                if (f2.c() != null) {
                    a8.p = this.a.getResources().getColor(f2.c().intValue());
                }
                c2.r = a8.b();
            }
        }
        if (bwj.e() && !TextUtils.isEmpty(g2.i)) {
            c2.n = g2.i;
        }
        if (!a2.isEmpty()) {
            int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
            if (bwj.e()) {
                b2 = this.f.a(dimensionPixelSize2, a2);
            } else {
                b2 = this.f.b(dimensionPixelSize2, a2);
            }
            for (Bitmap bitmap : a2) {
                bitmap.recycle();
            }
            c2.g = b2;
        }
        Bitmap bitmap2 = a3.isEmpty() ? null : (Bitmap) a3.get(0);
        if (bitmap2 != null && (g2.a & 32) == 32) {
            if (g2.h == null) {
                dfr2 = dfr.f;
            } else {
                dfr2 = g2.h;
            }
            ng ngVar = new ng();
            ngVar.a = bitmap2;
            if (!TextUtils.isEmpty(dfr2.b)) {
                ngVar.b = ni.e(dfr2.b);
            }
            c2.a(ngVar);
        }
        c2.f = this.c.a(str, bul, Arrays.asList(buv));
        c2.a(this.c.b(str, bul, Arrays.asList(buv)));
        return c2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.ni r6, defpackage.buf r7, defpackage.dfn r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbm.a(ni, buf, dfn, boolean):void");
    }

    public final void a(ni niVar, buf buf, bul bul, int i2) {
        String string = this.a.getString(buf.b().intValue());
        ni a2 = new ni(this.a, (byte) 0).a(string).b(this.a.getResources().getQuantityString(R.plurals.public_notification_text, i2, Integer.valueOf(i2))).a(buf.a().intValue());
        if (bul != null) {
            a2.c(bul.b());
        }
        if (buf.c() != null) {
            a2.p = this.a.getResources().getColor(buf.c().intValue());
        }
        niVar.r = a2.b();
    }

    private static List a(List list, bvo bvo) {
        ArrayList arrayList = new ArrayList();
        if (bvo.d()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Bitmap bitmap = (Bitmap) ((Future) it.next()).get();
                    if (bitmap != null) {
                        arrayList.add(bitmap);
                    }
                } catch (InterruptedException e2) {
                    bty.b("NotificationBuilderHelper", e2, "Failed to download image", new Object[0]);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException e3) {
                    bty.b("NotificationBuilderHelper", e3, "Failed to download image.", new Object[0]);
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    Bitmap bitmap2 = (Bitmap) ((Future) it2.next()).get(bvo.e(), TimeUnit.MILLISECONDS);
                    if (bitmap2 != null) {
                        arrayList.add(bitmap2);
                    }
                } catch (InterruptedException e4) {
                    bty.b("NotificationBuilderHelper", e4, "Failed to download image, remaining time: %d ms.", Long.valueOf(bvo.e()));
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e5) {
                    bty.b("NotificationBuilderHelper", e5, "Failed to download image, remaining time: %d ms.", Long.valueOf(bvo.e()));
                }
            }
        }
        return arrayList;
    }
}
