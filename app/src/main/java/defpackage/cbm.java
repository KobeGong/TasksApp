package defpackage;

/* renamed from: cbm reason: default package */
/* compiled from: PG */
public final class cbm {
    private static final long[] e = {0};
    public final android.content.Context a;
    public final defpackage.buc b;
    public final defpackage.ccu c;
    public final defpackage.cbj d;
    private final defpackage.byp f;
    private final defpackage.dml g;
    private final defpackage.crv h;
    private final defpackage.bya i;

    public cbm(android.content.Context context, defpackage.buc buc, defpackage.byp byp, defpackage.ccu ccu, defpackage.dml dml, defpackage.cbj cbj, defpackage.crv crv, defpackage.bya bya) {
        this.a = context;
        this.b = buc;
        this.f = byp;
        this.c = ccu;
        this.g = dml;
        this.d = cbj;
        this.h = crv;
        this.i = bya;
    }

    public final defpackage.ni a(java.lang.String str, defpackage.bul bul, defpackage.buv buv, boolean z, defpackage.bvo bvo) {
        boolean z2;
        java.lang.String string;
        int i2;
        defpackage.dfr dfr;
        java.util.List<defpackage.buq> list;
        defpackage.dfr dfr2;
        android.graphics.Bitmap b2;
        defpackage.dft dft;
        defpackage.dft dft2;
        defpackage.dft dft3;
        java.lang.String str2;
        defpackage.dgm dgm;
        defpackage.dgu dgu;
        java.lang.String str3;
        defpackage.dfr dfr3;
        defpackage.dfr dfr4;
        defpackage.dga dga;
        defpackage.dga dga2;
        defpackage.dga dga3;
        if (buv == null) {
            defpackage.bty.c("NotificationBuilderHelper", "Failed validation: Thread is null.", new java.lang.Object[0]);
            this.i.a(defpackage.ddi.BAD_PAYLOAD).a(bul).a(buv).a();
            z2 = false;
        } else if (android.text.TextUtils.isEmpty(buv.g().b)) {
            defpackage.bty.c("NotificationBuilderHelper", "Failed validation: Thread [%s] is missing content title.", buv.a());
            this.i.a(defpackage.ddi.INSUFFICIENT_DATA_NO_TITLE).a(bul).a(buv).a();
            z2 = false;
        } else if (android.text.TextUtils.isEmpty(buv.g().c)) {
            defpackage.bty.c("NotificationBuilderHelper", "Failed validation: Thread [%s] is missing content text.", buv.a());
            this.i.a(defpackage.ddi.INSUFFICIENT_DATA_NO_TEXT).a(bul).a(buv).a();
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            defpackage.bty.e("NotificationBuilderHelper", "Payload contain insufficient data to display the notification.", new java.lang.Object[0]);
            return null;
        }
        defpackage.buf f2 = this.b.f();
        defpackage.dfn g2 = buv.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(2131689841);
        if (g2.d.size() > 0) {
            for (defpackage.dga dga4 : g2.d) {
                if (!android.text.TextUtils.isEmpty(dga4.b)) {
                    arrayList.add(((defpackage.cci) this.g.a()).a(bul, dga4.b, dga4.c, dimensionPixelSize, dimensionPixelSize));
                    if (arrayList.size() >= 4) {
                        break;
                    }
                }
            }
        }
        if (arrayList.isEmpty() && (g2.a & 4) == 4) {
            if (g2.e == null) {
                dga = defpackage.dga.d;
            } else {
                dga = g2.e;
            }
            if (!android.text.TextUtils.isEmpty(dga.b)) {
                defpackage.cci cci = (defpackage.cci) this.g.a();
                if (g2.e == null) {
                    dga2 = defpackage.dga.d;
                } else {
                    dga2 = g2.e;
                }
                java.lang.String str4 = dga2.b;
                if (g2.e == null) {
                    dga3 = defpackage.dga.d;
                } else {
                    dga3 = g2.e;
                }
                arrayList.add(cci.a(bul, str4, dga3.c, dimensionPixelSize, dimensionPixelSize));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if ((g2.a & 32) == 32) {
            if (g2.h == null) {
                dfr4 = defpackage.dfr.f;
            } else {
                dfr4 = g2.h;
            }
            if (dfr4.d.size() > 0) {
                java.util.Iterator it = dfr4.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    defpackage.dga dga5 = (defpackage.dga) it.next();
                    if (!android.text.TextUtils.isEmpty(dga5.b)) {
                        android.content.res.Resources resources = this.a.getResources();
                        arrayList2.add(((defpackage.cci) this.g.a()).a(bul, dga5.b, dga5.c, (int) resources.getDimension(2131689840), (int) resources.getDimension(2131689839)));
                        break;
                    }
                }
            }
        }
        defpackage.bvo f3 = bvo.f();
        java.util.List<android.graphics.Bitmap> a2 = a(arrayList, f3);
        java.util.List a3 = a(arrayList2, f3);
        if (!(a2.size() == arrayList.size() && a3.size() == arrayList2.size())) {
            this.i.a(defpackage.ddi.FAILED_TO_DOWNLOAD_IMAGE).a(buv).a(bul).a();
        }
        defpackage.ni b3 = new defpackage.ni(this.a, 0).a(f2.a().intValue()).a((java.lang.CharSequence) g2.b).b((java.lang.CharSequence) g2.c);
        if (bul != null) {
            string = bul.b();
        } else {
            string = this.a.getString(f2.b().intValue());
        }
        defpackage.ni c2 = b3.c(string);
        defpackage.dfo a4 = defpackage.dfo.a(g2.k);
        if (a4 == null) {
            a4 = defpackage.dfo.PRIORITY_DEFAULT;
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
        if (!android.text.TextUtils.isEmpty(g2.o)) {
            c2.d(g2.o);
        }
        a(c2, f2, g2, z);
        if (defpackage.bwj.c()) {
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
                dfr3 = defpackage.dfr.f;
            } else {
                dfr3 = g2.h;
            }
            if (!android.text.TextUtils.isEmpty(dfr3.b) && !android.text.TextUtils.isEmpty(dfr3.c)) {
                defpackage.nh nhVar = new defpackage.nh();
                nhVar.b = defpackage.ni.e(dfr3.b);
                c2.a((defpackage.nk) nhVar.a((java.lang.CharSequence) dfr3.c));
            }
        }
        java.util.List arrayList3 = new java.util.ArrayList();
        if (g2.h == null) {
            dfr = defpackage.dfr.f;
        } else {
            dfr = g2.h;
        }
        for (defpackage.dfl dfl : dfr.e) {
            defpackage.cld.a((java.lang.Object) dfl);
            defpackage.bur a5 = new defpackage.bur().a().a(defpackage.dgm.f);
            a5.e = defpackage.dgu.b;
            defpackage.bur a6 = a5.a();
            java.lang.String str5 = dfl.b;
            if (str5 == null) {
                throw new java.lang.NullPointerException("Null text");
            }
            a6.c = str5;
            java.lang.String str6 = dfl.d;
            if (str6 == null) {
                throw new java.lang.NullPointerException("Null actionId");
            }
            a6.a = str6;
            if (dfl.e == null) {
                dgm = defpackage.dgm.f;
            } else {
                dgm = dfl.e;
            }
            defpackage.bur a7 = a6.a(dgm);
            if (dfl.f == null) {
                dgu = defpackage.dgu.b;
            } else {
                dgu = dfl.f;
            }
            a7.e = dgu;
            java.lang.String str7 = "";
            if (a7.a == null) {
                str7 = java.lang.String.valueOf(str7).concat(" actionId");
            }
            if (a7.b == null) {
                str7 = java.lang.String.valueOf(str7).concat(" iconResourceId");
            }
            if (a7.c == null) {
                str7 = java.lang.String.valueOf(str7).concat(" text");
            }
            if (a7.d == null) {
                str7 = java.lang.String.valueOf(str7).concat(" threadStateUpdate");
            }
            if (!str7.isEmpty()) {
                java.lang.String str8 = "Missing required properties:";
                java.lang.String valueOf = java.lang.String.valueOf(str7);
                if (valueOf.length() != 0) {
                    str3 = str8.concat(valueOf);
                } else {
                    str3 = new java.lang.String(str8);
                }
                throw new java.lang.IllegalStateException(str3);
            }
            arrayList3.add(new defpackage.bui(a7.a, a7.b.intValue(), a7.c, a7.d, a7.e));
        }
        if (this.h.a()) {
            list = ((defpackage.cbt) this.h.b()).b();
        } else {
            list = arrayList3;
        }
        for (defpackage.buq buq : list) {
            if (!android.text.TextUtils.isEmpty(buq.a())) {
                defpackage.ccu ccu = this.c;
                java.lang.String valueOf2 = java.lang.String.valueOf("com.google.android.libraries.notifications.ACTION_ID:");
                java.lang.String valueOf3 = java.lang.String.valueOf(buq.a());
                if (valueOf3.length() != 0) {
                    str2 = valueOf2.concat(valueOf3);
                } else {
                    str2 = new java.lang.String(valueOf2);
                }
                c2.b.add(new defpackage.nf(buq.b(), buq.c(), android.app.PendingIntent.getActivity(ccu.a, defpackage.ccu.a(str, str2), ccu.a(str2, ccu.b.f().i(), bul, java.util.Arrays.asList(new defpackage.buv[]{buv}), defpackage.bzd.a(buq.d())), 134217728)));
            }
        }
        if ((g2.a & 512) == 512) {
            if (g2.l == null) {
                dft = defpackage.dft.e;
            } else {
                dft = g2.l;
            }
            if (dft.b) {
                c2.q = 1;
            } else {
                if (g2.l == null) {
                    dft2 = defpackage.dft.e;
                } else {
                    dft2 = g2.l;
                }
                java.lang.String str9 = dft2.c;
                if (android.text.TextUtils.isEmpty(str9)) {
                    str9 = this.a.getString(f2.b().intValue());
                }
                if (g2.l == null) {
                    dft3 = defpackage.dft.e;
                } else {
                    dft3 = g2.l;
                }
                java.lang.String str10 = dft3.d;
                if (android.text.TextUtils.isEmpty(str10)) {
                    str10 = this.a.getResources().getQuantityString(2131886085, 1);
                }
                defpackage.ni a8 = new defpackage.ni(this.a, 0).a((java.lang.CharSequence) str9).b((java.lang.CharSequence) str10).a(f2.a().intValue());
                if (bul != null) {
                    a8.c(bul.b());
                }
                if (f2.c() != null) {
                    a8.p = this.a.getResources().getColor(f2.c().intValue());
                }
                c2.r = a8.b();
            }
        }
        if (defpackage.bwj.e() && !android.text.TextUtils.isEmpty(g2.i)) {
            c2.n = g2.i;
        }
        if (!a2.isEmpty()) {
            int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(2131689841);
            if (defpackage.bwj.e()) {
                b2 = this.f.a(dimensionPixelSize2, (java.util.List) a2);
            } else {
                b2 = this.f.b(dimensionPixelSize2, a2);
            }
            for (android.graphics.Bitmap recycle : a2) {
                recycle.recycle();
            }
            c2.g = b2;
        }
        android.graphics.Bitmap bitmap = a3.isEmpty() ? null : (android.graphics.Bitmap) a3.get(0);
        if (bitmap != null && (g2.a & 32) == 32) {
            if (g2.h == null) {
                dfr2 = defpackage.dfr.f;
            } else {
                dfr2 = g2.h;
            }
            defpackage.ng ngVar = new defpackage.ng();
            ngVar.a = bitmap;
            if (!android.text.TextUtils.isEmpty(dfr2.b)) {
                ngVar.b = defpackage.ni.e(dfr2.b);
            }
            c2.a((defpackage.nk) ngVar);
        }
        c2.f = this.c.a(str, bul, java.util.Arrays.asList(new defpackage.buv[]{buv}));
        c2.a(this.c.b(str, bul, java.util.Arrays.asList(new defpackage.buv[]{buv})));
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
            r1 = 1
            r2 = 0
            if (r9 != 0) goto L_0x008a
            boolean r0 = r7.f()
            if (r0 == 0) goto L_0x008a
            dfs r0 = r8.j
            if (r0 != 0) goto L_0x0087
            dfs r0 = defpackage.dfs.d
        L_0x0010:
            boolean r0 = r0.b
            if (r0 != 0) goto L_0x008a
            r3 = 2
        L_0x0015:
            if (r9 != 0) goto L_0x0034
            boolean r0 = r7.d()
            if (r0 == 0) goto L_0x0034
            dfs r0 = r8.j
            if (r0 != 0) goto L_0x0092
            dfs r0 = defpackage.dfs.d
        L_0x0023:
            boolean r0 = r0.c
            if (r0 != 0) goto L_0x0034
            android.net.Uri r0 = r7.e()
            if (r0 == 0) goto L_0x0095
            android.net.Uri r0 = r7.e()
            r6.a(r0)
        L_0x0034:
            if (r9 != 0) goto L_0x009f
            boolean r0 = r7.g()
            if (r0 == 0) goto L_0x009f
            java.lang.Integer r0 = r7.h()
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r0 = r7.h()
            int r0 = r0.intValue()
            android.app.Notification r4 = r6.u
            r4.ledARGB = r0
            android.app.Notification r0 = r6.u
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.ledOnMS = r4
            android.app.Notification r0 = r6.u
            r4 = 9000(0x2328, float:1.2612E-41)
            r0.ledOffMS = r4
            android.app.Notification r0 = r6.u
            int r0 = r0.ledOnMS
            if (r0 == 0) goto L_0x0098
            android.app.Notification r0 = r6.u
            int r0 = r0.ledOffMS
            if (r0 == 0) goto L_0x0098
            r0 = r1
        L_0x0067:
            android.app.Notification r4 = r6.u
            android.app.Notification r5 = r6.u
            int r5 = r5.flags
            r5 = r5 & -2
            if (r0 == 0) goto L_0x009a
        L_0x0071:
            r0 = r5 | r1
            r4.flags = r0
            r0 = r3
        L_0x0076:
            android.app.Notification r1 = r6.u
            r1.defaults = r0
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0086
            android.app.Notification r0 = r6.u
            int r1 = r0.flags
            r1 = r1 | 1
            r0.flags = r1
        L_0x0086:
            return
        L_0x0087:
            dfs r0 = r8.j
            goto L_0x0010
        L_0x008a:
            long[] r0 = e
            android.app.Notification r3 = r6.u
            r3.vibrate = r0
            r3 = r2
            goto L_0x0015
        L_0x0092:
            dfs r0 = r8.j
            goto L_0x0023
        L_0x0095:
            r3 = r3 | 1
            goto L_0x0034
        L_0x0098:
            r0 = r2
            goto L_0x0067
        L_0x009a:
            r1 = r2
            goto L_0x0071
        L_0x009c:
            r0 = r3 | 4
            goto L_0x0076
        L_0x009f:
            r0 = r3
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbm.a(ni, buf, dfn, boolean):void");
    }

    public final void a(defpackage.ni niVar, defpackage.buf buf, defpackage.bul bul, int i2) {
        java.lang.String string = this.a.getString(buf.b().intValue());
        defpackage.ni a2 = new defpackage.ni(this.a, 0).a((java.lang.CharSequence) string).b((java.lang.CharSequence) this.a.getResources().getQuantityString(2131886085, i2, new java.lang.Object[]{java.lang.Integer.valueOf(i2)})).a(buf.a().intValue());
        if (bul != null) {
            a2.c(bul.b());
        }
        if (buf.c() != null) {
            a2.p = this.a.getResources().getColor(buf.c().intValue());
        }
        niVar.r = a2.b();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.util.concurrent.Future>, for r10v0, types: [java.util.List, java.util.List<java.util.concurrent.Future>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List a(java.util.List<java.util.concurrent.Future> r10, defpackage.bvo r11) {
        /*
            r9 = 1
            r8 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r0 = r11.d()
            if (r0 == 0) goto L_0x0046
            java.util.Iterator r2 = r10.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r2.next()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0029, CancellationException -> 0x009e, ExecutionException -> 0x003b }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ InterruptedException -> 0x0029, CancellationException -> 0x009e, ExecutionException -> 0x003b }
            if (r0 == 0) goto L_0x0011
            r1.add(r0)     // Catch:{ InterruptedException -> 0x0029, CancellationException -> 0x009e, ExecutionException -> 0x003b }
            goto L_0x0011
        L_0x0029:
            r0 = move-exception
            java.lang.String r3 = "NotificationBuilderHelper"
            java.lang.String r4 = "Failed to download image"
            java.lang.Object[] r5 = new java.lang.Object[r8]
            defpackage.bty.b(r3, r0, r4, r5)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0011
        L_0x003b:
            r0 = move-exception
        L_0x003c:
            java.lang.String r3 = "NotificationBuilderHelper"
            java.lang.String r4 = "Failed to download image."
            java.lang.Object[] r5 = new java.lang.Object[r8]
            defpackage.bty.b(r3, r0, r4, r5)
            goto L_0x0011
        L_0x0046:
            java.util.Iterator r2 = r10.iterator()
        L_0x004a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r2.next()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            long r4 = r11.e()     // Catch:{ InterruptedException -> 0x0068, CancellationException -> 0x009a, ExecutionException -> 0x0084, TimeoutException -> 0x009c }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0068, CancellationException -> 0x009a, ExecutionException -> 0x0084, TimeoutException -> 0x009c }
            java.lang.Object r0 = r0.get(r4, r3)     // Catch:{ InterruptedException -> 0x0068, CancellationException -> 0x009a, ExecutionException -> 0x0084, TimeoutException -> 0x009c }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ InterruptedException -> 0x0068, CancellationException -> 0x009a, ExecutionException -> 0x0084, TimeoutException -> 0x009c }
            if (r0 == 0) goto L_0x004a
            r1.add(r0)     // Catch:{ InterruptedException -> 0x0068, CancellationException -> 0x009a, ExecutionException -> 0x0084, TimeoutException -> 0x009c }
            goto L_0x004a
        L_0x0068:
            r0 = move-exception
            java.lang.String r3 = "NotificationBuilderHelper"
            java.lang.String r4 = "Failed to download image, remaining time: %d ms."
            java.lang.Object[] r5 = new java.lang.Object[r9]
            long r6 = r11.e()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5[r8] = r6
            defpackage.bty.b(r3, r0, r4, r5)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x004a
        L_0x0084:
            r0 = move-exception
        L_0x0085:
            java.lang.String r3 = "NotificationBuilderHelper"
            java.lang.String r4 = "Failed to download image, remaining time: %d ms."
            java.lang.Object[] r5 = new java.lang.Object[r9]
            long r6 = r11.e()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5[r8] = r6
            defpackage.bty.b(r3, r0, r4, r5)
            goto L_0x004a
        L_0x0099:
            return r1
        L_0x009a:
            r0 = move-exception
            goto L_0x0085
        L_0x009c:
            r0 = move-exception
            goto L_0x0085
        L_0x009e:
            r0 = move-exception
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbm.a(java.util.List, bvo):java.util.List");
    }
}
