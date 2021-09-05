package defpackage;

/* renamed from: yj reason: default package */
/* compiled from: PG */
public final class SupportMenuInflater extends android.view.MenuInflater {
    public static final java.lang.Class[] a;
    private static final java.lang.Class[] e;
    public final java.lang.Object[] b;
    public android.content.Context c;
    public java.lang.Object d;
    private final java.lang.Object[] f = this.b;

    public SupportMenuInflater(android.content.Context context) {
        super(context);
        this.c = context;
        this.b = new java.lang.Object[]{context};
    }

    public final void inflate(int i, android.view.Menu menu) {
        if (!(menu instanceof defpackage.po)) {
            super.inflate(i, menu);
            return;
        }
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.c.getResources().getLayout(i);
            a(xmlResourceParser, android.util.Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            throw new android.view.InflateException("Error inflating menu XML", e2);
        } catch (java.io.IOException e3) {
            throw new android.view.InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
            r10 = this;
            yl r4 = new yl
            r4.<init>(r10, r13)
            int r0 = r11.getEventType()
            r3 = 0
            r2 = 0
        L_0x000b:
            r1 = 2
            if (r0 != r1) goto L_0x0046
            java.lang.String r0 = r11.getName()
            java.lang.String r1 = "menu"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0031
            int r0 = r11.next()
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 != 0) goto L_0x0284
            switch(r0) {
                case 1: goto L_0x027c;
                case 2: goto L_0x004e;
                case 3: goto L_0x0213;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = r1
            r1 = r2
            r2 = r3
        L_0x0027:
            int r3 = r11.next()
            r9 = r0
            r0 = r3
            r3 = r2
            r2 = r1
            r1 = r9
            goto L_0x001f
        L_0x0031:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expecting menu, got "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0046:
            int r0 = r11.next()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            goto L_0x001e
        L_0x004e:
            if (r3 != 0) goto L_0x0024
            java.lang.String r0 = r11.getName()
            java.lang.String r5 = "group"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x00a3
            yj r0 = r4.F
            android.content.Context r0 = r0.c
            int[] r5 = defpackage.xu.aY
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r12, r5)
            int r5 = defpackage.xu.bb
            r6 = 0
            int r5 = r0.getResourceId(r5, r6)
            r4.b = r5
            int r5 = defpackage.xu.bc
            r6 = 0
            int r5 = r0.getInt(r5, r6)
            r4.c = r5
            int r5 = defpackage.xu.bd
            r6 = 0
            int r5 = r0.getInt(r5, r6)
            r4.d = r5
            int r5 = defpackage.xu.aZ
            r6 = 0
            int r5 = r0.getInt(r5, r6)
            r4.e = r5
            int r5 = defpackage.xu.be
            r6 = 1
            boolean r5 = r0.getBoolean(r5, r6)
            r4.f = r5
            int r5 = defpackage.xu.ba
            r6 = 1
            boolean r5 = r0.getBoolean(r5, r6)
            r4.g = r5
            r0.recycle()
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0027
        L_0x00a3:
            java.lang.String r5 = "item"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x01f9
            yj r0 = r4.F
            android.content.Context r0 = r0.c
            int[] r5 = defpackage.xu.bf
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r12, r5)
            int r0 = defpackage.xu.bp
            r6 = 0
            int r0 = r5.getResourceId(r0, r6)
            r4.i = r0
            int r0 = defpackage.xu.bq
            int r6 = r4.c
            int r0 = r5.getInt(r0, r6)
            int r6 = defpackage.xu.bt
            int r7 = r4.d
            int r6 = r5.getInt(r6, r7)
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r7
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r0 = r0 | r6
            r4.j = r0
            int r0 = defpackage.xu.bu
            java.lang.CharSequence r0 = r5.getText(r0)
            r4.k = r0
            int r0 = defpackage.xu.bv
            java.lang.CharSequence r0 = r5.getText(r0)
            r4.l = r0
            int r0 = defpackage.xu.bo
            r6 = 0
            int r0 = r5.getResourceId(r0, r6)
            r4.m = r0
            int r0 = defpackage.xu.bk
            java.lang.String r0 = r5.getString(r0)
            char r0 = defpackage.yl.a(r0)
            r4.n = r0
            int r0 = defpackage.xu.bj
            r6 = 4096(0x1000, float:5.74E-42)
            int r0 = r5.getInt(r0, r6)
            r4.o = r0
            int r0 = defpackage.xu.br
            java.lang.String r0 = r5.getString(r0)
            char r0 = defpackage.yl.a(r0)
            r4.p = r0
            int r0 = defpackage.xu.bA
            r6 = 4096(0x1000, float:5.74E-42)
            int r0 = r5.getInt(r0, r6)
            r4.q = r0
            int r0 = defpackage.xu.bl
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x01dc
            int r0 = defpackage.xu.bl
            r6 = 0
            boolean r0 = r5.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x01d9
            r0 = 1
        L_0x012f:
            r4.r = r0
        L_0x0131:
            int r0 = defpackage.xu.bm
            r6 = 0
            boolean r0 = r5.getBoolean(r0, r6)
            r4.s = r0
            int r0 = defpackage.xu.bw
            boolean r6 = r4.f
            boolean r0 = r5.getBoolean(r0, r6)
            r4.t = r0
            int r0 = defpackage.xu.bn
            boolean r6 = r4.g
            boolean r0 = r5.getBoolean(r0, r6)
            r4.u = r0
            int r0 = defpackage.xu.bB
            r6 = -1
            int r0 = r5.getInt(r0, r6)
            r4.v = r0
            int r0 = defpackage.xu.bs
            java.lang.String r0 = r5.getString(r0)
            r4.z = r0
            int r0 = defpackage.xu.bg
            r6 = 0
            int r0 = r5.getResourceId(r0, r6)
            r4.w = r0
            int r0 = defpackage.xu.bi
            java.lang.String r0 = r5.getString(r0)
            r4.x = r0
            int r0 = defpackage.xu.bh
            java.lang.String r0 = r5.getString(r0)
            r4.y = r0
            java.lang.String r0 = r4.y
            if (r0 == 0) goto L_0x01e2
            r0 = 1
        L_0x017d:
            if (r0 == 0) goto L_0x01e4
            int r6 = r4.w
            if (r6 != 0) goto L_0x01e4
            java.lang.String r6 = r4.x
            if (r6 != 0) goto L_0x01e4
            java.lang.String r0 = r4.y
            java.lang.Class[] r6 = e
            yj r7 = r4.F
            java.lang.Object[] r7 = r7.f
            java.lang.Object r0 = r4.a(r0, r6, r7)
            rs r0 = (defpackage.rs) r0
            r4.A = r0
        L_0x0197:
            int r0 = defpackage.xu.bx
            java.lang.CharSequence r0 = r5.getText(r0)
            r4.B = r0
            int r0 = defpackage.xu.bC
            java.lang.CharSequence r0 = r5.getText(r0)
            r4.C = r0
            int r0 = defpackage.xu.bz
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x01f1
            int r0 = defpackage.xu.bz
            r6 = -1
            int r0 = r5.getInt(r0, r6)
            android.graphics.PorterDuff$Mode r6 = r4.E
            android.graphics.PorterDuff$Mode r0 = defpackage.add.a(r0, r6)
            r4.E = r0
        L_0x01be:
            int r0 = defpackage.xu.by
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x01f5
            int r0 = defpackage.xu.by
            android.content.res.ColorStateList r0 = r5.getColorStateList(r0)
            r4.D = r0
        L_0x01ce:
            r5.recycle()
            r0 = 0
            r4.h = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0027
        L_0x01d9:
            r0 = 0
            goto L_0x012f
        L_0x01dc:
            int r0 = r4.e
            r4.r = r0
            goto L_0x0131
        L_0x01e2:
            r0 = 0
            goto L_0x017d
        L_0x01e4:
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = "SupportMenuInflater"
            java.lang.String r6 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r0, r6)
        L_0x01ed:
            r0 = 0
            r4.A = r0
            goto L_0x0197
        L_0x01f1:
            r0 = 0
            r4.E = r0
            goto L_0x01be
        L_0x01f5:
            r0 = 0
            r4.D = r0
            goto L_0x01ce
        L_0x01f9:
            java.lang.String r5 = "menu"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x020d
            android.view.SubMenu r0 = r4.b()
            r10.a(r11, r12, r0)
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0027
        L_0x020d:
            r2 = 1
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0027
        L_0x0213:
            java.lang.String r0 = r11.getName()
            if (r3 == 0) goto L_0x0226
            boolean r5 = r0.equals(r2)
            if (r5 == 0) goto L_0x0226
            r2 = 0
            r0 = 0
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0027
        L_0x0226:
            java.lang.String r5 = "group"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0236
            r4.a()
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0027
        L_0x0236:
            java.lang.String r5 = "item"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x026f
            boolean r0 = r4.h
            if (r0 != 0) goto L_0x0024
            rs r0 = r4.A
            if (r0 == 0) goto L_0x0256
            rs r0 = r4.A
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0256
            r4.b()
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0027
        L_0x0256:
            r0 = 1
            r4.h = r0
            android.view.Menu r0 = r4.a
            int r5 = r4.b
            int r6 = r4.i
            int r7 = r4.j
            java.lang.CharSequence r8 = r4.k
            android.view.MenuItem r0 = r0.add(r5, r6, r7, r8)
            r4.a(r0)
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0027
        L_0x026f:
            java.lang.String r5 = "menu"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0024
            r0 = 1
            r1 = r2
            r2 = r3
            goto L_0x0027
        L_0x027c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected end of document"
            r0.<init>(r1)
            throw r0
        L_0x0284:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        a = clsArr;
        e = clsArr;
    }
}
