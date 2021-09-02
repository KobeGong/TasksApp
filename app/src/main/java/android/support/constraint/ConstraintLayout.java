package android.support.constraint;

/* compiled from: PG */
public class ConstraintLayout extends android.view.ViewGroup {
    private android.util.SparseArray a = new android.util.SparseArray();
    private final java.util.ArrayList b = new java.util.ArrayList(100);
    private defpackage.ci c = new defpackage.ci();
    private int d = 0;
    private int e = 0;
    private int f = Integer.MAX_VALUE;
    private int g = Integer.MAX_VALUE;
    private boolean h = true;
    private int i = 2;
    private defpackage.bv j = null;

    public ConstraintLayout(android.content.Context context) {
        super(context);
        a((android.util.AttributeSet) null);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public void setId(int i2) {
        this.a.remove(getId());
        super.setId(i2);
        this.a.put(getId(), this);
    }

    private final void a(android.util.AttributeSet attributeSet) {
        this.c.I = this;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.by.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == defpackage.by.e) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == defpackage.by.d) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == defpackage.by.c) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == defpackage.by.b) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == defpackage.by.U) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == defpackage.by.g) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    this.j = new defpackage.bv();
                    defpackage.bv bvVar = this.j;
                    android.content.Context context = getContext();
                    android.content.res.XmlResourceParser xml = context.getResources().getXml(resourceId);
                    try {
                        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                            switch (eventType) {
                                case 0:
                                    xml.getName();
                                    break;
                                case 2:
                                    java.lang.String name = xml.getName();
                                    android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
                                    defpackage.bw bwVar = new defpackage.bw();
                                    android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, defpackage.by.V);
                                    defpackage.bv.a(bwVar, obtainStyledAttributes2);
                                    obtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        bwVar.a = true;
                                    }
                                    bvVar.a.put(java.lang.Integer.valueOf(bwVar.d), bwVar);
                                    break;
                            }
                        }
                    } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException e2) {
                        defpackage.cza.a.a(e2);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.ac = this.i;
    }

    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        defpackage.ch a2 = a(view);
        if ((view instanceof defpackage.bx) && !(a2 instanceof defpackage.cj)) {
            defpackage.bu buVar = (defpackage.bu) view.getLayoutParams();
            buVar.X = new defpackage.cj();
            buVar.P = true;
            ((defpackage.cj) buVar.X).h(buVar.L);
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.a(a(view));
        this.h = true;
    }

    private final defpackage.ch a(int i2) {
        if (i2 == 0) {
            return this.c;
        }
        android.view.View view = (android.view.View) this.a.get(i2);
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return ((defpackage.bu) view.getLayoutParams()).X;
    }

    private final defpackage.ch a(android.view.View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return ((defpackage.bu) view.getLayoutParams()).X;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0508  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            int r13 = r17.getPaddingLeft()
            int r14 = r17.getPaddingTop()
            r0 = r17
            ci r1 = r0.c
            r1.t = r13
            r0 = r17
            ci r1 = r0.c
            r1.u = r14
            int r7 = android.view.View.MeasureSpec.getMode(r18)
            int r4 = android.view.View.MeasureSpec.getSize(r18)
            int r8 = android.view.View.MeasureSpec.getMode(r19)
            int r1 = android.view.View.MeasureSpec.getSize(r19)
            int r2 = r17.getPaddingTop()
            int r3 = r17.getPaddingBottom()
            int r9 = r2 + r3
            int r2 = r17.getPaddingLeft()
            int r3 = r17.getPaddingRight()
            int r10 = r2 + r3
            int r6 = defpackage.bg.w
            int r3 = defpackage.bg.w
            r5 = 0
            r2 = 0
            r17.getLayoutParams()
            switch(r7) {
                case -2147483648: goto L_0x016d;
                case 0: goto L_0x0171;
                case 1073741824: goto L_0x017a;
                default: goto L_0x0044;
            }
        L_0x0044:
            r4 = r5
            r5 = r6
        L_0x0046:
            switch(r8) {
                case -2147483648: goto L_0x0186;
                case 0: goto L_0x018a;
                case 1073741824: goto L_0x0193;
                default: goto L_0x0049;
            }
        L_0x0049:
            r1 = r2
            r2 = r3
        L_0x004b:
            r0 = r17
            ci r3 = r0.c
            r6 = 0
            r3.c(r6)
            r0 = r17
            ci r3 = r0.c
            r6 = 0
            r3.d(r6)
            r0 = r17
            ci r3 = r0.c
            r3.f(r5)
            r0 = r17
            ci r3 = r0.c
            r3.a(r4)
            r0 = r17
            ci r3 = r0.c
            r3.g(r2)
            r0 = r17
            ci r2 = r0.c
            r2.b(r1)
            r0 = r17
            ci r1 = r0.c
            r0 = r17
            int r2 = r0.d
            int r3 = r17.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r17.getPaddingRight()
            int r2 = r2 - r3
            r1.c(r2)
            r0 = r17
            ci r1 = r0.c
            r0 = r17
            int r2 = r0.e
            int r3 = r17.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r17.getPaddingBottom()
            int r2 = r2 - r3
            r1.d(r2)
            r0 = r17
            boolean r1 = r0.h
            if (r1 == 0) goto L_0x05aa
            r1 = 0
            r0 = r17
            r0.h = r1
            int r3 = r17.getChildCount()
            r1 = 0
            r2 = 0
        L_0x00b2:
            if (r2 >= r3) goto L_0x00c1
            r0 = r17
            android.view.View r4 = r0.getChildAt(r2)
            boolean r4 = r4.isLayoutRequested()
            if (r4 == 0) goto L_0x019f
            r1 = 1
        L_0x00c1:
            if (r1 == 0) goto L_0x05aa
            r0 = r17
            java.util.ArrayList r1 = r0.b
            r1.clear()
            r0 = r17
            bv r1 = r0.j
            if (r1 == 0) goto L_0x01dd
            r0 = r17
            bv r4 = r0.j
            int r5 = r17.getChildCount()
            java.util.HashSet r6 = new java.util.HashSet
            java.util.HashMap r1 = r4.a
            java.util.Set r1 = r1.keySet()
            r6.<init>(r1)
            r1 = 0
            r3 = r1
        L_0x00e5:
            if (r3 >= r5) goto L_0x01a3
            r0 = r17
            android.view.View r7 = r0.getChildAt(r3)
            int r1 = r7.getId()
            java.util.HashMap r2 = r4.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r8)
            if (r2 == 0) goto L_0x0168
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r6.remove(r2)
            java.util.HashMap r2 = r4.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.get(r1)
            bw r1 = (defpackage.bw) r1
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            bu r2 = (defpackage.bu) r2
            r1.a(r2)
            r7.setLayoutParams(r2)
            int r2 = r1.G
            r7.setVisibility(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 17
            if (r2 < r8) goto L_0x0168
            float r2 = r1.R
            r7.setAlpha(r2)
            float r2 = r1.U
            r7.setRotationX(r2)
            float r2 = r1.V
            r7.setRotationY(r2)
            float r2 = r1.W
            r7.setScaleX(r2)
            float r2 = r1.X
            r7.setScaleY(r2)
            float r2 = r1.Y
            r7.setPivotX(r2)
            float r2 = r1.Z
            r7.setPivotY(r2)
            float r2 = r1.aa
            r7.setTranslationX(r2)
            float r2 = r1.ab
            r7.setTranslationY(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r2 < r8) goto L_0x0168
            float r2 = r1.ac
            r7.setTranslationZ(r2)
            boolean r2 = r1.S
            if (r2 == 0) goto L_0x0168
            float r1 = r1.T
            r7.setElevation(r1)
        L_0x0168:
            int r1 = r3 + 1
            r3 = r1
            goto L_0x00e5
        L_0x016d:
            int r5 = defpackage.bg.x
            goto L_0x0046
        L_0x0171:
            int r4 = defpackage.bg.x
            r16 = r5
            r5 = r4
            r4 = r16
            goto L_0x0046
        L_0x017a:
            r0 = r17
            int r5 = r0.f
            int r4 = java.lang.Math.min(r5, r4)
            int r4 = r4 - r10
            r5 = r6
            goto L_0x0046
        L_0x0186:
            int r2 = defpackage.bg.x
            goto L_0x004b
        L_0x018a:
            int r1 = defpackage.bg.x
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x004b
        L_0x0193:
            r0 = r17
            int r2 = r0.g
            int r1 = java.lang.Math.min(r2, r1)
            int r1 = r1 - r9
            r2 = r3
            goto L_0x004b
        L_0x019f:
            int r2 = r2 + 1
            goto L_0x00b2
        L_0x01a3:
            java.util.Iterator r3 = r6.iterator()
        L_0x01a7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01dd
            java.lang.Object r1 = r3.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.HashMap r2 = r4.a
            java.lang.Object r2 = r2.get(r1)
            bw r2 = (defpackage.bw) r2
            boolean r5 = r2.a
            if (r5 == 0) goto L_0x01a7
            bx r5 = new bx
            android.content.Context r6 = r17.getContext()
            r5.<init>(r6)
            int r1 = r1.intValue()
            r5.setId(r1)
            bu r1 = new bu
            r1.<init>()
            r2.a(r1)
            r0 = r17
            r0.addView(r5, r1)
            goto L_0x01a7
        L_0x01dd:
            int r15 = r17.getChildCount()
            r0 = r17
            ci r1 = r0.c
            java.util.ArrayList r1 = r1.af
            r1.clear()
            r1 = 0
            r10 = r1
        L_0x01ec:
            if (r10 >= r15) goto L_0x05aa
            r0 = r17
            android.view.View r3 = r0.getChildAt(r10)
            r0 = r17
            ch r1 = r0.a(r3)
            if (r1 == 0) goto L_0x0275
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r9 = r2
            bu r9 = (defpackage.bu) r9
            r1.a()
            int r2 = r3.getVisibility()
            r1.J = r2
            r1.I = r3
            r0 = r17
            ci r3 = r0.c
            java.util.ArrayList r2 = r3.af
            r2.add(r1)
            ch r2 = r1.o
            if (r2 == 0) goto L_0x0222
            ch r2 = r1.o
            cn r2 = (defpackage.cn) r2
            r2.a(r1)
        L_0x0222:
            r1.o = r3
            boolean r2 = r9.N
            if (r2 == 0) goto L_0x022c
            boolean r2 = r9.M
            if (r2 != 0) goto L_0x0233
        L_0x022c:
            r0 = r17
            java.util.ArrayList r2 = r0.b
            r2.add(r1)
        L_0x0233:
            boolean r2 = r9.P
            if (r2 == 0) goto L_0x027a
            cj r1 = (defpackage.cj) r1
            int r2 = r9.a
            r3 = -1
            if (r2 == r3) goto L_0x024b
            int r2 = r9.a
            if (r2 < 0) goto L_0x024b
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.ac = r3
            r1.ad = r2
            r2 = -1
            r1.ae = r2
        L_0x024b:
            int r2 = r9.b
            r3 = -1
            if (r2 == r3) goto L_0x025d
            int r2 = r9.b
            if (r2 < 0) goto L_0x025d
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.ac = r3
            r3 = -1
            r1.ad = r3
            r1.ae = r2
        L_0x025d:
            float r2 = r9.c
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0275
            float r2 = r9.c
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0275
            r1.ac = r2
            r2 = -1
            r1.ad = r2
            r2 = -1
            r1.ae = r2
        L_0x0275:
            int r1 = r10 + 1
            r10 = r1
            goto L_0x01ec
        L_0x027a:
            int r2 = r9.Q
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.R
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.S
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.T
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.h
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.i
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.j
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.k
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.l
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.J
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.K
            r3 = -1
            if (r2 != r3) goto L_0x02bb
            int r2 = r9.width
            r3 = -1
            if (r2 == r3) goto L_0x02bb
            int r2 = r9.height
            r3 = -1
            if (r2 != r3) goto L_0x0275
        L_0x02bb:
            int r8 = r9.Q
            int r7 = r9.R
            int r5 = r9.S
            int r4 = r9.T
            int r6 = r9.U
            int r3 = r9.V
            float r2 = r9.W
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 17
            if (r11 >= r12) goto L_0x082d
            int r8 = r9.d
            int r7 = r9.e
            int r5 = r9.f
            int r4 = r9.g
            int r6 = r9.q
            int r3 = r9.s
            float r2 = r9.w
            r11 = -1
            if (r8 != r11) goto L_0x02ea
            r11 = -1
            if (r7 != r11) goto L_0x02ea
            int r11 = r9.n
            r12 = -1
            if (r11 == r12) goto L_0x0469
            int r8 = r9.n
        L_0x02ea:
            r11 = -1
            if (r5 != r11) goto L_0x082d
            r11 = -1
            if (r4 != r11) goto L_0x082d
            int r11 = r9.o
            r12 = -1
            if (r11 == r12) goto L_0x0472
            int r5 = r9.o
            r11 = r2
            r12 = r5
            r2 = r7
            r7 = r3
            r3 = r8
            r8 = r4
        L_0x02fd:
            r4 = -1
            if (r3 == r4) goto L_0x0481
            r0 = r17
            ch r3 = r0.a(r3)
            if (r3 == 0) goto L_0x0311
            int r2 = defpackage.bg.n
            int r4 = defpackage.bg.n
            int r5 = r9.leftMargin
            r1.a(r2, r3, r4, r5, r6)
        L_0x0311:
            r2 = -1
            if (r12 == r2) goto L_0x0497
            r0 = r17
            ch r3 = r0.a(r12)
            if (r3 == 0) goto L_0x0326
            int r2 = defpackage.bg.p
            int r4 = defpackage.bg.n
            int r5 = r9.rightMargin
            r6 = r7
            r1.a(r2, r3, r4, r5, r6)
        L_0x0326:
            int r2 = r9.h
            r3 = -1
            if (r2 == r3) goto L_0x04ae
            int r2 = r9.h
            r0 = r17
            ch r3 = r0.a(r2)
            if (r3 == 0) goto L_0x0340
            int r2 = defpackage.bg.o
            int r4 = defpackage.bg.o
            int r5 = r9.topMargin
            int r6 = r9.r
            r1.a(r2, r3, r4, r5, r6)
        L_0x0340:
            int r2 = r9.j
            r3 = -1
            if (r2 == r3) goto L_0x04ca
            int r2 = r9.j
            r0 = r17
            ch r3 = r0.a(r2)
            if (r3 == 0) goto L_0x035a
            int r2 = defpackage.bg.q
            int r4 = defpackage.bg.o
            int r5 = r9.bottomMargin
            int r6 = r9.t
            r1.a(r2, r3, r4, r5, r6)
        L_0x035a:
            int r2 = r9.l
            r3 = -1
            if (r2 == r3) goto L_0x03b2
            r0 = r17
            android.util.SparseArray r2 = r0.a
            int r3 = r9.l
            java.lang.Object r2 = r2.get(r3)
            android.view.View r2 = (android.view.View) r2
            int r3 = r9.l
            r0 = r17
            ch r3 = r0.a(r3)
            if (r3 == 0) goto L_0x03b2
            if (r2 == 0) goto L_0x03b2
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            boolean r4 = r4 instanceof defpackage.bu
            if (r4 == 0) goto L_0x03b2
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            bu r2 = (defpackage.bu) r2
            r4 = 1
            r9.O = r4
            r4 = 1
            r2.O = r4
            int r2 = defpackage.bg.r
            cg r2 = r1.e(r2)
            int r4 = defpackage.bg.r
            cg r3 = r3.e(r4)
            r4 = 0
            r5 = -1
            int r6 = defpackage.bg.m
            r7 = 0
            r8 = 1
            r2.a(r3, r4, r5, r6, r7, r8)
            int r2 = defpackage.bg.o
            cg r2 = r1.e(r2)
            r2.c()
            int r2 = defpackage.bg.q
            cg r2 = r1.e(r2)
            r2.c()
        L_0x03b2:
            r2 = 0
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x03bf
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x03bf
            r1.E = r11
        L_0x03bf:
            float r2 = r9.x
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x03d2
            float r2 = r9.x
            r3 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x03d2
            float r2 = r9.x
            r1.F = r2
        L_0x03d2:
            boolean r2 = r17.isInEditMode()
            if (r2 == 0) goto L_0x03ea
            int r2 = r9.J
            r3 = -1
            if (r2 != r3) goto L_0x03e2
            int r2 = r9.K
            r3 = -1
            if (r2 == r3) goto L_0x03ea
        L_0x03e2:
            int r2 = r9.J
            int r3 = r9.K
            r1.t = r2
            r1.u = r3
        L_0x03ea:
            boolean r2 = r9.M
            if (r2 != 0) goto L_0x04f1
            int r2 = r9.width
            r3 = -1
            if (r2 != r3) goto L_0x04e6
            int r2 = defpackage.bg.z
            r1.f(r2)
            int r2 = defpackage.bg.n
            cg r2 = r1.e(r2)
            int r3 = r9.leftMargin
            r2.d = r3
            int r2 = defpackage.bg.p
            cg r2 = r1.e(r2)
            int r3 = r9.rightMargin
            r2.d = r3
        L_0x040c:
            boolean r2 = r9.N
            if (r2 != 0) goto L_0x0508
            int r2 = r9.height
            r3 = -1
            if (r2 != r3) goto L_0x04fd
            int r2 = defpackage.bg.z
            r1.g(r2)
            int r2 = defpackage.bg.o
            cg r2 = r1.e(r2)
            int r3 = r9.topMargin
            r2.d = r3
            int r2 = defpackage.bg.q
            cg r2 = r1.e(r2)
            int r3 = r9.bottomMargin
            r2.d = r3
        L_0x042e:
            java.lang.String r2 = r9.y
            if (r2 == 0) goto L_0x043f
            java.lang.String r5 = r9.y
            if (r5 == 0) goto L_0x043c
            int r2 = r5.length()
            if (r2 != 0) goto L_0x0514
        L_0x043c:
            r2 = 0
            r1.r = r2
        L_0x043f:
            float r2 = r9.z
            r1.Y = r2
            float r2 = r9.A
            r1.Z = r2
            int r2 = r9.B
            r1.U = r2
            int r2 = r9.C
            r1.V = r2
            int r2 = r9.D
            int r3 = r9.F
            int r4 = r9.H
            r1.c = r2
            r1.e = r3
            r1.f = r4
            int r2 = r9.E
            int r3 = r9.G
            int r4 = r9.I
            r1.d = r2
            r1.g = r3
            r1.h = r4
            goto L_0x0275
        L_0x0469:
            int r11 = r9.m
            r12 = -1
            if (r11 == r12) goto L_0x02ea
            int r7 = r9.m
            goto L_0x02ea
        L_0x0472:
            int r11 = r9.p
            r12 = -1
            if (r11 == r12) goto L_0x082d
            int r4 = r9.p
            r11 = r2
            r12 = r5
            r2 = r7
            r7 = r3
            r3 = r8
            r8 = r4
            goto L_0x02fd
        L_0x0481:
            r3 = -1
            if (r2 == r3) goto L_0x0311
            r0 = r17
            ch r3 = r0.a(r2)
            if (r3 == 0) goto L_0x0311
            int r2 = defpackage.bg.n
            int r4 = defpackage.bg.p
            int r5 = r9.leftMargin
            r1.a(r2, r3, r4, r5, r6)
            goto L_0x0311
        L_0x0497:
            r2 = -1
            if (r8 == r2) goto L_0x0326
            r0 = r17
            ch r3 = r0.a(r8)
            if (r3 == 0) goto L_0x0326
            int r2 = defpackage.bg.p
            int r4 = defpackage.bg.p
            int r5 = r9.rightMargin
            r6 = r7
            r1.a(r2, r3, r4, r5, r6)
            goto L_0x0326
        L_0x04ae:
            int r2 = r9.i
            r3 = -1
            if (r2 == r3) goto L_0x0340
            int r2 = r9.i
            r0 = r17
            ch r3 = r0.a(r2)
            if (r3 == 0) goto L_0x0340
            int r2 = defpackage.bg.o
            int r4 = defpackage.bg.q
            int r5 = r9.topMargin
            int r6 = r9.r
            r1.a(r2, r3, r4, r5, r6)
            goto L_0x0340
        L_0x04ca:
            int r2 = r9.k
            r3 = -1
            if (r2 == r3) goto L_0x035a
            int r2 = r9.k
            r0 = r17
            ch r3 = r0.a(r2)
            if (r3 == 0) goto L_0x035a
            int r2 = defpackage.bg.q
            int r4 = defpackage.bg.q
            int r5 = r9.bottomMargin
            int r6 = r9.t
            r1.a(r2, r3, r4, r5, r6)
            goto L_0x035a
        L_0x04e6:
            int r2 = defpackage.bg.y
            r1.f(r2)
            r2 = 0
            r1.a(r2)
            goto L_0x040c
        L_0x04f1:
            int r2 = defpackage.bg.w
            r1.f(r2)
            int r2 = r9.width
            r1.a(r2)
            goto L_0x040c
        L_0x04fd:
            int r2 = defpackage.bg.y
            r1.g(r2)
            r2 = 0
            r1.b(r2)
            goto L_0x042e
        L_0x0508:
            int r2 = defpackage.bg.w
            r1.g(r2)
            int r2 = r9.height
            r1.b(r2)
            goto L_0x042e
        L_0x0514:
            r2 = -1
            r4 = 0
            int r6 = r5.length()
            r3 = 44
            int r3 = r5.indexOf(r3)
            if (r3 <= 0) goto L_0x058d
            int r7 = r6 + -1
            if (r3 >= r7) goto L_0x058d
            r7 = 0
            java.lang.String r7 = r5.substring(r7, r3)
            java.lang.String r8 = "W"
            boolean r8 = r7.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0583
            r2 = 0
        L_0x0534:
            int r3 = r3 + 1
            r16 = r3
            r3 = r2
            r2 = r16
        L_0x053b:
            r7 = 58
            int r7 = r5.indexOf(r7)
            if (r7 < 0) goto L_0x059b
            int r6 = r6 + -1
            if (r7 >= r6) goto L_0x059b
            java.lang.String r2 = r5.substring(r2, r7)
            int r6 = r7 + 1
            java.lang.String r5 = r5.substring(r6)
            int r6 = r2.length()
            if (r6 <= 0) goto L_0x0578
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x0578
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0816 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x0816 }
            r6 = 0
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x082a
            r6 = 0
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x082a
            r6 = 1
            if (r3 != r6) goto L_0x0594
            float r2 = r5 / r2
            float r4 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0816 }
        L_0x0578:
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x043f
            r1.r = r4
            r1.s = r3
            goto L_0x043f
        L_0x0583:
            java.lang.String r8 = "H"
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x0534
            r2 = 1
            goto L_0x0534
        L_0x058d:
            r3 = 0
            r16 = r3
            r3 = r2
            r2 = r16
            goto L_0x053b
        L_0x0594:
            float r2 = r2 / r5
            float r2 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0816 }
        L_0x0599:
            r4 = r2
            goto L_0x0578
        L_0x059b:
            java.lang.String r2 = r5.substring(r2)
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x0578
            float r4 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0813 }
            goto L_0x0578
        L_0x05aa:
            int r1 = r17.getPaddingTop()
            int r2 = r17.getPaddingBottom()
            int r8 = r1 + r2
            int r1 = r17.getPaddingLeft()
            int r2 = r17.getPaddingRight()
            int r9 = r1 + r2
            int r10 = r17.getChildCount()
            r1 = 0
            r6 = r1
        L_0x05c4:
            if (r6 >= r10) goto L_0x066c
            r0 = r17
            android.view.View r11 = r0.getChildAt(r6)
            int r1 = r11.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x0654
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            bu r1 = (defpackage.bu) r1
            ch r12 = r1.X
            boolean r2 = r1.P
            if (r2 != 0) goto L_0x0654
            int r4 = r1.width
            int r5 = r1.height
            boolean r2 = r1.M
            if (r2 != 0) goto L_0x0608
            boolean r2 = r1.N
            if (r2 != 0) goto L_0x0608
            boolean r2 = r1.M
            if (r2 != 0) goto L_0x05f5
            int r2 = r1.D
            r3 = 1
            if (r2 == r3) goto L_0x0608
        L_0x05f5:
            int r2 = r1.width
            r3 = -1
            if (r2 == r3) goto L_0x0608
            boolean r2 = r1.N
            if (r2 != 0) goto L_0x0659
            int r2 = r1.E
            r3 = 1
            if (r2 == r3) goto L_0x0608
            int r2 = r1.height
            r3 = -1
            if (r2 != r3) goto L_0x0659
        L_0x0608:
            r2 = 1
            r7 = r2
        L_0x060a:
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L_0x0823
            if (r4 == 0) goto L_0x0613
            r7 = -1
            if (r4 != r7) goto L_0x065c
        L_0x0613:
            r2 = -2
            r0 = r18
            int r2 = getChildMeasureSpec(r0, r9, r2)
            r4 = 1
            r7 = r2
        L_0x061c:
            if (r5 == 0) goto L_0x0621
            r2 = -1
            if (r5 != r2) goto L_0x0665
        L_0x0621:
            r2 = -2
            r0 = r19
            int r2 = getChildMeasureSpec(r0, r8, r2)
            r3 = 1
        L_0x0629:
            r11.measure(r7, r2)
            int r5 = r11.getMeasuredWidth()
            int r2 = r11.getMeasuredHeight()
            r16 = r4
            r4 = r2
            r2 = r16
        L_0x0639:
            r12.a(r5)
            r12.b(r4)
            if (r2 == 0) goto L_0x0643
            r12.C = r5
        L_0x0643:
            if (r3 == 0) goto L_0x0647
            r12.D = r4
        L_0x0647:
            boolean r1 = r1.O
            if (r1 == 0) goto L_0x0654
            int r1 = r11.getBaseline()
            r2 = -1
            if (r1 == r2) goto L_0x0654
            r12.z = r1
        L_0x0654:
            int r1 = r6 + 1
            r6 = r1
            goto L_0x05c4
        L_0x0659:
            r2 = 0
            r7 = r2
            goto L_0x060a
        L_0x065c:
            r0 = r18
            int r4 = getChildMeasureSpec(r0, r9, r4)
            r7 = r4
            r4 = r2
            goto L_0x061c
        L_0x0665:
            r0 = r19
            int r2 = getChildMeasureSpec(r0, r8, r5)
            goto L_0x0629
        L_0x066c:
            int r1 = r17.getChildCount()
            if (r1 <= 0) goto L_0x0679
            r0 = r17
            ci r1 = r0.c
            r1.o()
        L_0x0679:
            r9 = 0
            r0 = r17
            java.util.ArrayList r1 = r0.b
            int r11 = r1.size()
            int r1 = r17.getPaddingBottom()
            int r12 = r14 + r1
            int r1 = r17.getPaddingRight()
            int r13 = r13 + r1
            if (r11 <= 0) goto L_0x07b3
            r8 = 0
            r0 = r17
            ci r1 = r0.c
            int r1 = r1.G
            int r2 = defpackage.bg.x
            if (r1 != r2) goto L_0x078a
            r1 = 1
            r4 = r1
        L_0x069c:
            r0 = r17
            ci r1 = r0.c
            int r1 = r1.H
            int r2 = defpackage.bg.x
            if (r1 != r2) goto L_0x078e
            r1 = 1
            r5 = r1
        L_0x06a8:
            r1 = 0
            r10 = r1
        L_0x06aa:
            if (r10 >= r11) goto L_0x07aa
            r0 = r17
            java.util.ArrayList r1 = r0.b
            java.lang.Object r1 = r1.get(r10)
            ch r1 = (defpackage.ch) r1
            boolean r2 = r1 instanceof defpackage.cj
            if (r2 != 0) goto L_0x0820
            java.lang.Object r2 = r1.I
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0820
            int r3 = r2.getVisibility()
            r6 = 8
            if (r3 == r6) goto L_0x0820
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            bu r3 = (defpackage.bu) r3
            int r6 = r3.width
            r7 = -2
            if (r6 != r7) goto L_0x0792
            int r6 = r3.width
            r0 = r18
            int r6 = getChildMeasureSpec(r0, r13, r6)
        L_0x06db:
            int r7 = r3.height
            r14 = -2
            if (r7 != r14) goto L_0x079e
            int r7 = r3.height
            r0 = r19
            int r7 = getChildMeasureSpec(r0, r12, r7)
        L_0x06e8:
            r2.measure(r6, r7)
            int r6 = r2.getMeasuredWidth()
            int r7 = r2.getMeasuredHeight()
            int r14 = r1.c()
            if (r6 == r14) goto L_0x081d
            r1.a(r6)
            if (r4 == 0) goto L_0x072a
            int r6 = r1.i()
            r0 = r17
            ci r8 = r0.c
            int r8 = r8.c()
            if (r6 <= r8) goto L_0x072a
            int r6 = r1.i()
            int r8 = defpackage.bg.p
            cg r8 = r1.e(r8)
            int r8 = r8.b()
            int r6 = r6 + r8
            r0 = r17
            ci r8 = r0.c
            r0 = r17
            int r14 = r0.d
            int r6 = java.lang.Math.max(r14, r6)
            r8.a(r6)
        L_0x072a:
            r6 = 1
        L_0x072b:
            int r8 = r1.f()
            if (r7 == r8) goto L_0x0763
            r1.b(r7)
            if (r5 == 0) goto L_0x0762
            int r6 = r1.j()
            r0 = r17
            ci r7 = r0.c
            int r7 = r7.f()
            if (r6 <= r7) goto L_0x0762
            int r6 = r1.j()
            int r7 = defpackage.bg.q
            cg r7 = r1.e(r7)
            int r7 = r7.b()
            int r6 = r6 + r7
            r0 = r17
            ci r7 = r0.c
            r0 = r17
            int r8 = r0.e
            int r6 = java.lang.Math.max(r8, r6)
            r7.b(r6)
        L_0x0762:
            r6 = 1
        L_0x0763:
            boolean r3 = r3.O
            if (r3 == 0) goto L_0x0775
            int r3 = r2.getBaseline()
            r7 = -1
            if (r3 == r7) goto L_0x0775
            int r7 = r1.z
            if (r3 == r7) goto L_0x0775
            r1.z = r3
            r6 = 1
        L_0x0775:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r1 < r3) goto L_0x0819
            int r1 = r2.getMeasuredState()
            int r1 = combineMeasuredStates(r9, r1)
            r8 = r6
        L_0x0784:
            int r2 = r10 + 1
            r10 = r2
            r9 = r1
            goto L_0x06aa
        L_0x078a:
            r1 = 0
            r4 = r1
            goto L_0x069c
        L_0x078e:
            r1 = 0
            r5 = r1
            goto L_0x06a8
        L_0x0792:
            int r6 = r1.c()
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            goto L_0x06db
        L_0x079e:
            int r7 = r1.f()
            r14 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r14)
            goto L_0x06e8
        L_0x07aa:
            if (r8 == 0) goto L_0x07b3
            r0 = r17
            ci r1 = r0.c
            r1.o()
        L_0x07b3:
            r0 = r17
            ci r1 = r0.c
            int r1 = r1.c()
            int r1 = r1 + r13
            r0 = r17
            ci r2 = r0.c
            int r2 = r2.f()
            int r2 = r2 + r12
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 11
            if (r3 < r4) goto L_0x080d
            r0 = r18
            int r1 = resolveSizeAndState(r1, r0, r9)
            int r3 = r9 << 16
            r0 = r19
            int r2 = resolveSizeAndState(r2, r0, r3)
            r0 = r17
            int r3 = r0.f
            int r1 = java.lang.Math.min(r3, r1)
            r0 = r17
            int r3 = r0.g
            int r2 = java.lang.Math.min(r3, r2)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            r0 = r17
            ci r3 = r0.c
            boolean r3 = r3.ad
            if (r3 == 0) goto L_0x07fc
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r3
        L_0x07fc:
            r0 = r17
            ci r3 = r0.c
            boolean r3 = r3.ae
            if (r3 == 0) goto L_0x0807
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 | r3
        L_0x0807:
            r0 = r17
            r0.setMeasuredDimension(r1, r2)
        L_0x080c:
            return
        L_0x080d:
            r0 = r17
            r0.setMeasuredDimension(r1, r2)
            goto L_0x080c
        L_0x0813:
            r2 = move-exception
            goto L_0x0578
        L_0x0816:
            r2 = move-exception
            goto L_0x0578
        L_0x0819:
            r8 = r6
            r1 = r9
            goto L_0x0784
        L_0x081d:
            r6 = r8
            goto L_0x072b
        L_0x0820:
            r1 = r9
            goto L_0x0784
        L_0x0823:
            r16 = r5
            r5 = r4
            r4 = r16
            goto L_0x0639
        L_0x082a:
            r2 = r4
            goto L_0x0599
        L_0x082d:
            r11 = r2
            r12 = r5
            r2 = r7
            r7 = r3
            r3 = r8
            r8 = r4
            goto L_0x02fd
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            defpackage.bu buVar = (defpackage.bu) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || buVar.P || isInEditMode) {
                defpackage.ch chVar = buVar.X;
                int g2 = chVar.g();
                int h2 = chVar.h();
                childAt.layout(g2, h2, chVar.c() + g2, chVar.f() + h2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.bu(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.bu;
    }

    public void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.bu();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.bu(getContext(), attributeSet);
    }
}
