package defpackage;

/* renamed from: byb reason: default package */
/* compiled from: PG */
public final class byb {
    public java.lang.String a = null;
    public java.util.List b = null;
    private final defpackage.bya c;
    private final defpackage.ddr d;
    private final defpackage.ddi e;
    private final defpackage.buc f;
    private final defpackage.bzc g;
    private final defpackage.bzb h;
    private java.lang.String i = null;

    public final defpackage.byb a(defpackage.bul bul) {
        if (bul != null) {
            this.i = bul.b();
            this.a = bul.c();
        }
        return this;
    }

    public final defpackage.byb a(defpackage.buv buv) {
        this.b = java.util.Arrays.asList(new defpackage.buv[]{buv});
        return this;
    }

    public final defpackage.byb a(defpackage.dfy dfy) {
        if (dfy != null && !android.text.TextUtils.isEmpty(dfy.d)) {
            this.b = java.util.Arrays.asList(new defpackage.buv[]{defpackage.buv.a(dfy)});
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:288:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r12 = this;
            bya r7 = r12.c
            java.lang.String r8 = r12.i
            dcw r0 = defpackage.dcw.e
            int r1 = defpackage.bg.ao
            java.lang.Object r0 = r0.a(r1)
            dii r0 = (defpackage.dii) r0
            dcu r1 = defpackage.dcu.g
            int r2 = defpackage.bg.ao
            java.lang.Object r1 = r1.a(r2)
            dii r1 = (defpackage.dii) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r2 = r12.b
            if (r2 == 0) goto L_0x00a2
            java.util.List r2 = r12.b
            java.util.Iterator r6 = r2.iterator()
        L_0x0027:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r6.next()
            buv r2 = (defpackage.buv) r2
            dcv r3 = defpackage.dcv.d
            int r4 = defpackage.bg.ao
            java.lang.Object r3 = r3.a(r4)
            dii r3 = (defpackage.dii) r3
            java.lang.String r9 = r2.a()
            r3.b()
            dih r4 = r3.a
            dcv r4 = (defpackage.dcv) r4
            if (r9 != 0) goto L_0x0050
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0050:
            int r10 = r4.a
            r10 = r10 | 1
            r4.a = r10
            r4.b = r9
            java.lang.Long r2 = r2.f()
            long r10 = r2.longValue()
            r3.b()
            dih r2 = r3.a
            dcv r2 = (defpackage.dcv) r2
            int r4 = r2.a
            r4 = r4 | 2
            r2.a = r4
            r2.c = r10
            boolean r2 = r3.b
            if (r2 == 0) goto L_0x0089
            dih r2 = r3.a
        L_0x0075:
            dih r2 = (defpackage.dih) r2
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = r3.booleanValue()
            boolean r3 = defpackage.dih.a(r2, r3)
            if (r3 != 0) goto L_0x009a
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x0089:
            dih r2 = r3.a
            djz r4 = defpackage.djz.a
            dkh r4 = r4.a(r2)
            r4.c(r2)
            r2 = 1
            r3.b = r2
            dih r2 = r3.a
            goto L_0x0075
        L_0x009a:
            dih r2 = (defpackage.dih) r2
            dcv r2 = (defpackage.dcv) r2
            r5.add(r2)
            goto L_0x0027
        L_0x00a2:
            r1.b()
            dih r2 = r1.a
            dcu r2 = (defpackage.dcu) r2
            diq r3 = r2.b
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x00c1
            diq r4 = r2.b
            int r3 = r4.size()
            if (r3 != 0) goto L_0x0116
            r3 = 10
        L_0x00bb:
            diq r3 = r4.a(r3)
            r2.b = r3
        L_0x00c1:
            diq r3 = r2.b
            defpackage.dim.a(r5)
            boolean r2 = r5 instanceof defpackage.diz
            if (r2 == 0) goto L_0x012f
            r2 = r5
            diz r2 = (defpackage.diz) r2
            java.util.List r4 = r2.d()
            r2 = r3
            diz r2 = (defpackage.diz) r2
            int r5 = r3.size()
            java.util.Iterator r4 = r4.iterator()
        L_0x00dc:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0138
            java.lang.Object r3 = r4.next()
            if (r3 != 0) goto L_0x011f
            int r0 = r2.size()
            int r0 = r0 - r5
            r1 = 37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Element at index "
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " is null."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            int r0 = r2.size()
            int r0 = r0 + -1
        L_0x010e:
            if (r0 < r5) goto L_0x0119
            r2.remove(r0)
            int r0 = r0 + -1
            goto L_0x010e
        L_0x0116:
            int r3 = r3 << 1
            goto L_0x00bb
        L_0x0119:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x011f:
            boolean r6 = r3 instanceof defpackage.dha
            if (r6 == 0) goto L_0x0129
            dha r3 = (defpackage.dha) r3
            r2.a(r3)
            goto L_0x00dc
        L_0x0129:
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L_0x00dc
        L_0x012f:
            boolean r2 = r5 instanceof defpackage.djy
            if (r2 == 0) goto L_0x014d
            java.util.Collection r5 = (java.util.Collection) r5
            r3.addAll(r5)
        L_0x0138:
            buc r2 = r12.f
            java.lang.String r3 = r2.a()
            r1.b()
            dih r2 = r1.a
            dcu r2 = (defpackage.dcu) r2
            if (r3 != 0) goto L_0x01b0
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x014d:
            boolean r2 = r3 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x0163
            r2 = r3
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r3.size()
            r4 = r5
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            int r4 = r4 + r6
            r2.ensureCapacity(r4)
        L_0x0163:
            int r4 = r3.size()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            r2 = 0
        L_0x016e:
            if (r2 >= r6) goto L_0x0138
            java.lang.Object r9 = r5.get(r2)
            int r2 = r2 + 1
            if (r9 != 0) goto L_0x01ac
            int r0 = r3.size()
            int r0 = r0 - r4
            r1 = 37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Element at index "
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " is null."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            int r0 = r3.size()
            int r0 = r0 + -1
        L_0x019e:
            if (r0 < r4) goto L_0x01a6
            r3.remove(r0)
            int r0 = r0 + -1
            goto L_0x019e
        L_0x01a6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x01ac:
            r3.add(r9)
            goto L_0x016e
        L_0x01b0:
            int r4 = r2.a
            r4 = r4 | 1
            r2.a = r4
            r2.c = r3
            bzc r4 = r12.g
            ddp r2 = defpackage.ddp.f
            int r3 = defpackage.bg.ao
            java.lang.Object r2 = r2.a(r3)
            dii r2 = (defpackage.dii) r2
            android.content.Context r3 = r4.a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r5 = r3.getPackageName()
            r2.b()
            dih r3 = r2.a
            ddp r3 = (defpackage.ddp) r3
            if (r5 != 0) goto L_0x01dd
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x01dd:
            int r6 = r3.a
            r6 = r6 | 4
            r3.a = r6
            r3.d = r5
            ddo r5 = r4.c()
            r2.b()
            dih r3 = r2.a
            ddp r3 = (defpackage.ddp) r3
            if (r5 != 0) goto L_0x01f8
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x01f8:
            r3.c = r5
            r5 = 1
            r3.b = r5
            buc r3 = r4.b
            java.util.List r3 = r3.b()
            if (r3 == 0) goto L_0x02ad
            buc r3 = r4.b
            java.util.List r3 = r3.b()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x02ad
            buc r3 = r4.b
            java.util.List r4 = r3.b()
            r2.b()
            dih r3 = r2.a
            ddp r3 = (defpackage.ddp) r3
            diq r5 = r3.e
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x0236
            diq r6 = r3.e
            int r5 = r6.size()
            if (r5 != 0) goto L_0x028b
            r5 = 10
        L_0x0230:
            diq r5 = r6.a(r5)
            r3.e = r5
        L_0x0236:
            diq r5 = r3.e
            defpackage.dim.a(r4)
            boolean r3 = r4 instanceof defpackage.diz
            if (r3 == 0) goto L_0x02a4
            r3 = r4
            diz r3 = (defpackage.diz) r3
            java.util.List r4 = r3.d()
            r3 = r5
            diz r3 = (defpackage.diz) r3
            int r5 = r5.size()
            java.util.Iterator r6 = r4.iterator()
        L_0x0251:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x02ad
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x0294
            int r0 = r3.size()
            int r0 = r0 - r5
            r1 = 37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Element at index "
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " is null."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            int r0 = r3.size()
            int r0 = r0 + -1
        L_0x0283:
            if (r0 < r5) goto L_0x028e
            r3.remove(r0)
            int r0 = r0 + -1
            goto L_0x0283
        L_0x028b:
            int r5 = r5 << 1
            goto L_0x0230
        L_0x028e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0294:
            boolean r9 = r4 instanceof defpackage.dha
            if (r9 == 0) goto L_0x029e
            dha r4 = (defpackage.dha) r4
            r3.a(r4)
            goto L_0x0251
        L_0x029e:
            java.lang.String r4 = (java.lang.String) r4
            r3.add(r4)
            goto L_0x0251
        L_0x02a4:
            boolean r3 = r4 instanceof defpackage.djy
            if (r3 == 0) goto L_0x02c7
            java.util.Collection r4 = (java.util.Collection) r4
            r5.addAll(r4)
        L_0x02ad:
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x032d
            dih r2 = r2.a
        L_0x02b3:
            dih r2 = (defpackage.dih) r2
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = r3.booleanValue()
            boolean r3 = defpackage.dih.a(r2, r3)
            if (r3 != 0) goto L_0x033f
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x02c7:
            boolean r3 = r5 instanceof java.util.ArrayList
            if (r3 == 0) goto L_0x02e1
            boolean r3 = r4 instanceof java.util.Collection
            if (r3 == 0) goto L_0x02e1
            r3 = r5
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r9 = r5.size()
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            int r6 = r6 + r9
            r3.ensureCapacity(r6)
        L_0x02e1:
            int r3 = r5.size()
            java.util.Iterator r4 = r4.iterator()
        L_0x02e9:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02ad
            java.lang.Object r6 = r4.next()
            if (r6 != 0) goto L_0x0329
            int r0 = r5.size()
            int r0 = r0 - r3
            r1 = 37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Element at index "
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " is null."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            int r0 = r5.size()
            int r0 = r0 + -1
        L_0x031b:
            if (r0 < r3) goto L_0x0323
            r5.remove(r0)
            int r0 = r0 + -1
            goto L_0x031b
        L_0x0323:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0329:
            r5.add(r6)
            goto L_0x02e9
        L_0x032d:
            dih r3 = r2.a
            djz r4 = defpackage.djz.a
            dkh r4 = r4.a(r3)
            r4.c(r3)
            r3 = 1
            r2.b = r3
            dih r2 = r2.a
            goto L_0x02b3
        L_0x033f:
            dih r2 = (defpackage.dih) r2
            ddp r2 = (defpackage.ddp) r2
            r1.b()
            dih r3 = r1.a
            dcu r3 = (defpackage.dcu) r3
            if (r2 != 0) goto L_0x0352
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0352:
            r3.f = r2
            int r2 = r3.a
            r2 = r2 | 8
            r3.a = r2
            bzb r6 = r12.h
            ddl r2 = defpackage.ddl.l
            int r3 = defpackage.bg.ao
            java.lang.Object r2 = r2.a(r3)
            dii r2 = (defpackage.dii) r2
            android.content.Context r3 = r6.a
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r4 = r3.density
            r2.b()
            dih r3 = r2.a
            ddl r3 = (defpackage.ddl) r3
            int r5 = r3.a
            r5 = r5 | 1
            r3.a = r5
            r3.b = r4
            android.content.Context r3 = r6.a
            java.lang.String r4 = defpackage.bzb.b(r3)
            r2.b()
            dih r3 = r2.a
            ddl r3 = (defpackage.ddl) r3
            if (r4 != 0) goto L_0x0396
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0396:
            int r5 = r3.a
            r5 = r5 | 8
            r3.a = r5
            r3.e = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r2.b()
            dih r3 = r2.a
            ddl r3 = (defpackage.ddl) r3
            int r5 = r3.a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r3.a = r5
            r3.i = r4
            dcr r4 = defpackage.dcr.CHIME
            r2.b()
            dih r3 = r2.a
            ddl r3 = (defpackage.ddl) r3
            if (r4 != 0) goto L_0x03c0
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x03c0:
            int r5 = r3.a
            r5 = r5 | 2
            r3.a = r5
            int r4 = r4.c
            r3.c = r4
            java.lang.String r4 = "193513518"
            r2.b()
            dih r3 = r2.a
            ddl r3 = (defpackage.ddl) r3
            int r5 = r3.a
            r5 = r5 | 4
            r3.a = r5
            r3.d = r4
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x03fc
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r2.b()
            dih r3 = r2.a
            ddl r3 = (defpackage.ddl) r3
            if (r4 != 0) goto L_0x03f4
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x03f4:
            int r5 = r3.a
            r5 = r5 | 16
            r3.a = r5
            r3.f = r4
        L_0x03fc:
            java.lang.String r3 = android.os.Build.ID
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x041d
            java.lang.String r4 = android.os.Build.ID
            r2.b()
            dih r3 = r2.a
            ddl r3 = (defpackage.ddl) r3
            if (r4 != 0) goto L_0x0415
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0415:
            int r5 = r3.a
            r5 = r5 | 32
            r3.a = r5
            r3.g = r4
        L_0x041d:
            java.lang.String r3 = android.os.Build.MODEL
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x043e
            java.lang.String r4 = android.os.Build.MODEL
            r2.b()
            dih r3 = r2.a
            ddl r3 = (defpackage.ddl) r3
            if (r4 != 0) goto L_0x0436
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0436:
            int r5 = r3.a
            r5 = r5 | 64
            r3.a = r5
            r3.h = r4
        L_0x043e:
            java.lang.String r3 = android.os.Build.MANUFACTURER
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x045f
            java.lang.String r4 = android.os.Build.MANUFACTURER
            r2.b()
            dih r3 = r2.a
            ddl r3 = (defpackage.ddl) r3
            if (r4 != 0) goto L_0x0457
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0457:
            int r5 = r3.a
            r5 = r5 | 256(0x100, float:3.59E-43)
            r3.a = r5
            r3.j = r4
        L_0x045f:
            cbj r3 = r6.d
            java.util.Set r3 = r3.a()
            java.util.Iterator r9 = r3.iterator()
        L_0x0469:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x04f6
            java.lang.Object r3 = r9.next()
            java.lang.String r3 = (java.lang.String) r3
            ddm r4 = defpackage.ddm.c
            int r5 = defpackage.bg.ao
            java.lang.Object r4 = r4.a(r5)
            dii r4 = (defpackage.dii) r4
            r4.b()
            dih r5 = r4.a
            ddm r5 = (defpackage.ddm) r5
            if (r3 != 0) goto L_0x048e
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x048e:
            int r10 = r5.a
            r10 = r10 | 1
            r5.a = r10
            r5.b = r3
            boolean r3 = r4.b
            if (r3 == 0) goto L_0x04b0
            dih r3 = r4.a
        L_0x049c:
            dih r3 = (defpackage.dih) r3
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = r4.booleanValue()
            boolean r4 = defpackage.dih.a(r3, r4)
            if (r4 != 0) goto L_0x04c1
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x04b0:
            dih r3 = r4.a
            djz r5 = defpackage.djz.a
            dkh r5 = r5.a(r3)
            r5.c(r3)
            r3 = 1
            r4.b = r3
            dih r3 = r4.a
            goto L_0x049c
        L_0x04c1:
            dih r3 = (defpackage.dih) r3
            ddm r3 = (defpackage.ddm) r3
            r2.b()
            dih r4 = r2.a
            ddl r4 = (defpackage.ddl) r4
            if (r3 != 0) goto L_0x04d4
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x04d4:
            diq r5 = r4.k
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x04ec
            diq r10 = r4.k
            int r5 = r10.size()
            if (r5 != 0) goto L_0x04f3
            r5 = 10
        L_0x04e6:
            diq r5 = r10.a(r5)
            r4.k = r5
        L_0x04ec:
            diq r4 = r4.k
            r4.add(r3)
            goto L_0x0469
        L_0x04f3:
            int r5 = r5 << 1
            goto L_0x04e6
        L_0x04f6:
            ddk r3 = defpackage.ddk.f
            int r4 = defpackage.bg.ao
            java.lang.Object r3 = r3.a(r4)
            dii r3 = (defpackage.dii) r3
            android.content.Context r4 = r6.a
            java.lang.String r5 = defpackage.bzb.a(r4)
            r3.b()
            dih r4 = r3.a
            ddk r4 = (defpackage.ddk) r4
            if (r5 != 0) goto L_0x0515
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0515:
            int r6 = r4.a
            r6 = r6 | 1
            r4.a = r6
            r4.d = r5
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            java.lang.String r5 = r4.getID()
            r3.b()
            dih r4 = r3.a
            ddk r4 = (defpackage.ddk) r4
            if (r5 != 0) goto L_0x0534
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0534:
            r6 = 4
            r4.b = r6
            r4.c = r5
            boolean r4 = r2.b
            if (r4 == 0) goto L_0x0553
            dih r2 = r2.a
        L_0x053f:
            dih r2 = (defpackage.dih) r2
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = r4.booleanValue()
            boolean r4 = defpackage.dih.a(r2, r4)
            if (r4 != 0) goto L_0x0564
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x0553:
            dih r4 = r2.a
            djz r5 = defpackage.djz.a
            dkh r5 = r5.a(r4)
            r5.c(r4)
            r4 = 1
            r2.b = r4
            dih r2 = r2.a
            goto L_0x053f
        L_0x0564:
            dih r2 = (defpackage.dih) r2
            ddl r2 = (defpackage.ddl) r2
            r3.b()
            dih r4 = r3.a
            ddk r4 = (defpackage.ddk) r4
            if (r2 != 0) goto L_0x0577
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0577:
            r4.e = r2
            int r2 = r4.a
            r2 = r2 | 8
            r4.a = r2
            boolean r2 = r3.b
            if (r2 == 0) goto L_0x0599
            dih r2 = r3.a
        L_0x0585:
            dih r2 = (defpackage.dih) r2
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = r3.booleanValue()
            boolean r3 = defpackage.dih.a(r2, r3)
            if (r3 != 0) goto L_0x05aa
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x0599:
            dih r2 = r3.a
            djz r4 = defpackage.djz.a
            dkh r4 = r4.a(r2)
            r4.c(r2)
            r2 = 1
            r3.b = r2
            dih r2 = r3.a
            goto L_0x0585
        L_0x05aa:
            dih r2 = (defpackage.dih) r2
            ddk r2 = (defpackage.ddk) r2
            r1.b()
            dih r3 = r1.a
            dcu r3 = (defpackage.dcu) r3
            if (r2 != 0) goto L_0x05bd
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x05bd:
            r3.e = r2
            int r2 = r3.a
            r2 = r2 | 4
            r3.a = r2
            java.lang.String r2 = r12.a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x05e6
            java.lang.String r3 = r12.a
            r1.b()
            dih r2 = r1.a
            dcu r2 = (defpackage.dcu) r2
            if (r3 != 0) goto L_0x05de
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x05de:
            int r4 = r2.a
            r4 = r4 | 2
            r2.a = r4
            r2.d = r3
        L_0x05e6:
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x0600
            dih r1 = r1.a
        L_0x05ec:
            dih r1 = (defpackage.dih) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = r2.booleanValue()
            boolean r2 = defpackage.dih.a(r1, r2)
            if (r2 != 0) goto L_0x0611
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x0600:
            dih r2 = r1.a
            djz r3 = defpackage.djz.a
            dkh r3 = r3.a(r2)
            r3.c(r2)
            r2 = 1
            r1.b = r2
            dih r1 = r1.a
            goto L_0x05ec
        L_0x0611:
            dih r1 = (defpackage.dih) r1
            dcu r1 = (defpackage.dcu) r1
            r0.b()
            dih r2 = r0.a
            dcw r2 = (defpackage.dcw) r2
            if (r1 != 0) goto L_0x0624
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0624:
            r2.d = r1
            int r1 = r2.a
            r1 = r1 | 1
            r2.a = r1
            ddr r1 = r12.d
            if (r1 == 0) goto L_0x06bc
            ddq r1 = defpackage.ddq.c
            int r2 = defpackage.bg.ao
            java.lang.Object r1 = r1.a(r2)
            dii r1 = (defpackage.dii) r1
            ddr r3 = r12.d
            r1.b()
            dih r2 = r1.a
            ddq r2 = (defpackage.ddq) r2
            if (r3 != 0) goto L_0x064b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x064b:
            int r4 = r2.a
            r4 = r4 | 1
            r2.a = r4
            int r3 = r3.f
            r2.b = r3
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x066f
            dih r1 = r1.a
        L_0x065b:
            dih r1 = (defpackage.dih) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = r2.booleanValue()
            boolean r2 = defpackage.dih.a(r1, r2)
            if (r2 != 0) goto L_0x0680
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x066f:
            dih r2 = r1.a
            djz r3 = defpackage.djz.a
            dkh r3 = r3.a(r2)
            r3.c(r2)
            r2 = 1
            r1.b = r2
            dih r1 = r1.a
            goto L_0x065b
        L_0x0680:
            dih r1 = (defpackage.dih) r1
            ddq r1 = (defpackage.ddq) r1
            r0.b()
            dih r2 = r0.a
            dcw r2 = (defpackage.dcw) r2
            if (r1 != 0) goto L_0x0693
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0693:
            r2.c = r1
            r1 = 2
            r2.b = r1
        L_0x0698:
            dcx r1 = defpackage.dcx.d
            int r2 = defpackage.bg.ao
            java.lang.Object r1 = r1.a(r2)
            dii r1 = (defpackage.dii) r1
            boolean r2 = r0.b
            if (r2 == 0) goto L_0x074b
            dih r0 = r0.a
        L_0x06a8:
            dih r0 = (defpackage.dih) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = r2.booleanValue()
            boolean r2 = defpackage.dih.a(r0, r2)
            if (r2 != 0) goto L_0x075d
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x06bc:
            ddi r1 = r12.e
            if (r1 == 0) goto L_0x072a
            ddh r1 = defpackage.ddh.c
            int r2 = defpackage.bg.ao
            java.lang.Object r1 = r1.a(r2)
            dii r1 = (defpackage.dii) r1
            ddi r3 = r12.e
            r1.b()
            dih r2 = r1.a
            ddh r2 = (defpackage.ddh) r2
            if (r3 != 0) goto L_0x06db
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x06db:
            int r4 = r2.a
            r4 = r4 | 1
            r2.a = r4
            int r3 = r3.j
            r2.b = r3
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x06ff
            dih r1 = r1.a
        L_0x06eb:
            dih r1 = (defpackage.dih) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = r2.booleanValue()
            boolean r2 = defpackage.dih.a(r1, r2)
            if (r2 != 0) goto L_0x0710
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x06ff:
            dih r2 = r1.a
            djz r3 = defpackage.djz.a
            dkh r3 = r3.a(r2)
            r3.c(r2)
            r2 = 1
            r1.b = r2
            dih r1 = r1.a
            goto L_0x06eb
        L_0x0710:
            dih r1 = (defpackage.dih) r1
            ddh r1 = (defpackage.ddh) r1
            r0.b()
            dih r2 = r0.a
            dcw r2 = (defpackage.dcw) r2
            if (r1 != 0) goto L_0x0723
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0723:
            r2.c = r1
            r1 = 3
            r2.b = r1
            goto L_0x0698
        L_0x072a:
            java.lang.String r0 = "ChimeLogEventImpl"
            java.lang.String r1 = "Failed to create clearcut event, both interaction and failure is null"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            defpackage.bty.e(r0, r1, r2)
            r0 = 0
        L_0x0735:
            if (r0 == 0) goto L_0x074a
            android.content.Context r1 = r7.a
            java.lang.String r2 = "CHIME"
            bqm r1 = defpackage.bqn.a(r1, r2, r8)
            byte[] r0 = r0.b()
            bql r0 = r1.a(r0)
            r0.b()
        L_0x074a:
            return
        L_0x074b:
            dih r2 = r0.a
            djz r3 = defpackage.djz.a
            dkh r3 = r3.a(r2)
            r3.c(r2)
            r2 = 1
            r0.b = r2
            dih r0 = r0.a
            goto L_0x06a8
        L_0x075d:
            dih r0 = (defpackage.dih) r0
            dcw r0 = (defpackage.dcw) r0
            r1.b()
            dih r2 = r1.a
            dcx r2 = (defpackage.dcx) r2
            if (r0 != 0) goto L_0x0770
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0770:
            r2.b = r0
            int r0 = r2.a
            r0 = r0 | 2
            r2.a = r0
            buc r0 = r12.f
            bue r0 = r0.e()
            bue r2 = defpackage.bue.PRODUCTION
            if (r0 != r2) goto L_0x0794
            dcy r0 = defpackage.dcy.PRODUCTION
            r2 = r0
        L_0x0785:
            r1.b()
            dih r0 = r1.a
            dcx r0 = (defpackage.dcx) r0
            if (r2 != 0) goto L_0x0798
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0794:
            dcy r0 = defpackage.dcy.AUTOPUSH
            r2 = r0
            goto L_0x0785
        L_0x0798:
            int r3 = r0.a
            r3 = r3 | 4
            r0.a = r3
            int r2 = r2.d
            r0.c = r2
            boolean r0 = r1.b
            if (r0 == 0) goto L_0x07bc
            dih r0 = r1.a
        L_0x07a8:
            dih r0 = (defpackage.dih) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r1.booleanValue()
            boolean r1 = defpackage.dih.a(r0, r1)
            if (r1 != 0) goto L_0x07cd
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x07bc:
            dih r0 = r1.a
            djz r2 = defpackage.djz.a
            dkh r2 = r2.a(r0)
            r2.c(r0)
            r0 = 1
            r1.b = r0
            dih r0 = r1.a
            goto L_0x07a8
        L_0x07cd:
            dih r0 = (defpackage.dih) r0
            dcx r0 = (defpackage.dcx) r0
            goto L_0x0735
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.a():void");
    }

    public byb(defpackage.bya bya, defpackage.ddr ddr, defpackage.ddi ddi, defpackage.buc buc, defpackage.bzc bzc, defpackage.bzb bzb) {
        this.c = bya;
        this.d = ddr;
        this.e = ddi;
        this.f = buc;
        this.g = bzc;
        this.h = bzb;
    }
}
