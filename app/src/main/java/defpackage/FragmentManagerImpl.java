package defpackage;

/* renamed from: lp reason: default package */
/* compiled from: PG */
final class FragmentManagerImpl extends defpackage.ln implements android.view.LayoutInflater.Factory2 {
    private static final android.view.animation.Interpolator C = new android.view.animation.DecelerateInterpolator(2.5f);
    private static final android.view.animation.Interpolator D = new android.view.animation.DecelerateInterpolator(1.5f);
    private static java.lang.reflect.Field t = null;
    private java.util.ArrayList A;
    private java.lang.Runnable B = new defpackage.lq(this);
    public boolean a;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public java.util.ArrayList c;
    public int d = 0;
    public FragmentHostCallback e;
    public FragmentContainer f;
    public Fragment g;
    public boolean h;
    public java.util.ArrayList i;
    public java.util.ArrayList j;
    public defpackage.me k;
    private java.util.ArrayList l;
    private int m = 0;
    private android.util.SparseArray n;
    private java.util.ArrayList o;
    private java.util.ArrayList p;
    private java.util.ArrayList q;
    private final java.util.concurrent.CopyOnWriteArrayList r = new java.util.concurrent.CopyOnWriteArrayList();
    private Fragment s;
    private boolean u;
    private boolean v;
    private boolean w;
    private java.util.ArrayList x;
    private android.os.Bundle y = null;
    private android.util.SparseArray z = null;

    FragmentManagerImpl() {
    }

    private static boolean a(android.animation.Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof android.animation.ValueAnimator) {
            android.animation.PropertyValuesHolder[] values = ((android.animation.ValueAnimator) animator).getValues();
            for (android.animation.PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
            return false;
        } else if (!(animator instanceof android.animation.AnimatorSet)) {
            return false;
        } else {
            java.util.ArrayList childAnimations = ((android.animation.AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (a((android.animation.Animator) childAnimations.get(i2))) {
                    return true;
                }
            }
            return false;
        }
    }

    private final void a(java.lang.RuntimeException runtimeException) {
        android.util.Log.e("FragmentManager", runtimeException.getMessage());
        android.util.Log.e("FragmentManager", "Activity state:");
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new defpackage.qw());
        if (this.e != null) {
            try {
                this.e.a("  ", printWriter, new java.lang.String[0]);
            } catch (java.lang.Exception e2) {
                android.util.Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                a("  ", null, printWriter, new java.lang.String[0]);
            } catch (java.lang.Exception e3) {
                android.util.Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    public final defpackage.mj a() {
        return new defpackage.kv(this);
    }

    public final boolean b() {
        boolean j2 = j();
        x();
        return j2;
    }

    public final void c() {
        a((defpackage.mc) new defpackage.md(this, -1, 0), false);
    }

    public final boolean d() {
        w();
        return u();
    }

    public final void e() {
        a((defpackage.mc) new defpackage.md(this, -1, 1), false);
    }

    public final void b(int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Bad id: " + i2);
        }
        a((defpackage.mc) new defpackage.md(this, i2, 1), false);
    }

    private final boolean u() {
        j();
        a(true);
        if (this.g != null) {
            FragmentManagerImpl lpVar = this.g.v;
            if (lpVar != null && lpVar.d()) {
                return true;
            }
        }
        boolean a2 = a(this.i, this.j, (java.lang.String) null, -1, 0);
        if (a2) {
            this.a = true;
            try {
                a(this.i, this.j);
            } finally {
                i();
            }
        }
        k();
        m();
        return a2;
    }

    public final int f() {
        if (this.c != null) {
            return this.c.size();
        }
        return 0;
    }

    private final Fragment a(android.os.Bundle bundle, java.lang.String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        Fragment lcVar = (Fragment) this.n.get(i2);
        if (lcVar != null) {
            return lcVar;
        }
        a((java.lang.RuntimeException) new java.lang.IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        return lcVar;
    }

    public final java.util.List g() {
        java.util.List list;
        if (this.b.isEmpty()) {
            return java.util.Collections.EMPTY_LIST;
        }
        synchronized (this.b) {
            list = (java.util.List) this.b.clone();
        }
        return list;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        if (this.s != null) {
            defpackage.jd.a((java.lang.Object) this.s, sb);
        } else {
            defpackage.jd.a((java.lang.Object) this.e, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String str2;
        java.lang.String str3 = str + "    ";
        if (this.n != null) {
            int size = this.n.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
                printWriter.println(":");
                for (int i2 = 0; i2 < size; i2++) {
                    Fragment lcVar = (Fragment) this.n.valueAt(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(lcVar);
                    if (lcVar != null) {
                        lcVar.a(str3, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        int size2 = this.b.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size2; i3++) {
                Fragment lcVar2 = (Fragment) this.b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(lcVar2.toString());
            }
        }
        if (this.o != null) {
            int size3 = this.o.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i4 = 0; i4 < size3; i4++) {
                    Fragment lcVar3 = (Fragment) this.o.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(lcVar3.toString());
                }
            }
        }
        if (this.c != null) {
            int size4 = this.c.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i5 = 0; i5 < size4; i5++) {
                    defpackage.kv kvVar = (defpackage.kv) this.c.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(kvVar.toString());
                    printWriter.print(str3);
                    printWriter.print("mName=");
                    printWriter.print(kvVar.j);
                    printWriter.print(" mIndex=");
                    printWriter.print(kvVar.l);
                    printWriter.print(" mCommitted=");
                    printWriter.println(kvVar.k);
                    if (kvVar.g != 0) {
                        printWriter.print(str3);
                        printWriter.print("mTransition=#");
                        printWriter.print(java.lang.Integer.toHexString(kvVar.g));
                        printWriter.print(" mTransitionStyle=#");
                        printWriter.println(java.lang.Integer.toHexString(kvVar.h));
                    }
                    if (!(kvVar.c == 0 && kvVar.d == 0)) {
                        printWriter.print(str3);
                        printWriter.print("mEnterAnim=#");
                        printWriter.print(java.lang.Integer.toHexString(kvVar.c));
                        printWriter.print(" mExitAnim=#");
                        printWriter.println(java.lang.Integer.toHexString(kvVar.d));
                    }
                    if (!(kvVar.e == 0 && kvVar.f == 0)) {
                        printWriter.print(str3);
                        printWriter.print("mPopEnterAnim=#");
                        printWriter.print(java.lang.Integer.toHexString(kvVar.e));
                        printWriter.print(" mPopExitAnim=#");
                        printWriter.println(java.lang.Integer.toHexString(kvVar.f));
                    }
                    if (!(kvVar.m == 0 && kvVar.n == null)) {
                        printWriter.print(str3);
                        printWriter.print("mBreadCrumbTitleRes=#");
                        printWriter.print(java.lang.Integer.toHexString(kvVar.m));
                        printWriter.print(" mBreadCrumbTitleText=");
                        printWriter.println(kvVar.n);
                    }
                    if (!(kvVar.o == 0 && kvVar.p == null)) {
                        printWriter.print(str3);
                        printWriter.print("mBreadCrumbShortTitleRes=#");
                        printWriter.print(java.lang.Integer.toHexString(kvVar.o));
                        printWriter.print(" mBreadCrumbShortTitleText=");
                        printWriter.println(kvVar.p);
                    }
                    if (!kvVar.b.isEmpty()) {
                        printWriter.print(str3);
                        printWriter.println("Operations:");
                        new java.lang.StringBuilder().append(str3).append("    ");
                        int size5 = kvVar.b.size();
                        for (int i6 = 0; i6 < size5; i6++) {
                            defpackage.kw kwVar = (defpackage.kw) kvVar.b.get(i6);
                            switch (kwVar.a) {
                                case 0:
                                    str2 = "NULL";
                                    break;
                                case 1:
                                    str2 = "ADD";
                                    break;
                                case 2:
                                    str2 = "REPLACE";
                                    break;
                                case 3:
                                    str2 = "REMOVE";
                                    break;
                                case 4:
                                    str2 = "HIDE";
                                    break;
                                case 5:
                                    str2 = "SHOW";
                                    break;
                                case 6:
                                    str2 = "DETACH";
                                    break;
                                case 7:
                                    str2 = "ATTACH";
                                    break;
                                case 8:
                                    str2 = "SET_PRIMARY_NAV";
                                    break;
                                case 9:
                                    str2 = "UNSET_PRIMARY_NAV";
                                    break;
                                default:
                                    str2 = "cmd=" + kwVar.a;
                                    break;
                            }
                            printWriter.print(str3);
                            printWriter.print("  Op #");
                            printWriter.print(i6);
                            printWriter.print(": ");
                            printWriter.print(str2);
                            printWriter.print(" ");
                            printWriter.println(kwVar.b);
                            if (!(kwVar.c == 0 && kwVar.d == 0)) {
                                printWriter.print(str3);
                                printWriter.print("enterAnim=#");
                                printWriter.print(java.lang.Integer.toHexString(kwVar.c));
                                printWriter.print(" exitAnim=#");
                                printWriter.println(java.lang.Integer.toHexString(kwVar.d));
                            }
                            if (kwVar.e != 0 || kwVar.f != 0) {
                                printWriter.print(str3);
                                printWriter.print("popEnterAnim=#");
                                printWriter.print(java.lang.Integer.toHexString(kwVar.e));
                                printWriter.print(" popExitAnim=#");
                                printWriter.println(java.lang.Integer.toHexString(kwVar.f));
                            }
                        }
                    }
                }
            }
        }
        synchronized (this) {
            if (this.p != null) {
                int size6 = this.p.size();
                if (size6 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i7 = 0; i7 < size6; i7++) {
                        defpackage.kv kvVar2 = (defpackage.kv) this.p.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println(kvVar2);
                    }
                }
            }
            if (this.q != null && this.q.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(java.util.Arrays.toString(this.q.toArray()));
            }
        }
        if (this.l != null) {
            int size7 = this.l.size();
            if (size7 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i8 = 0; i8 < size7; i8++) {
                    defpackage.mc mcVar = (defpackage.mc) this.l.get(i8);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i8);
                    printWriter.print(": ");
                    printWriter.println(mcVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.e);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.d);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.h);
        printWriter.print(" mStopped=");
        printWriter.print(this.u);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.v);
    }

    private static defpackage.ly a(float f2, float f3, float f4, float f5) {
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(C);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(D);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new defpackage.ly((android.view.animation.Animation) animationSet);
    }

    private static defpackage.ly a(float f2, float f3) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(D);
        alphaAnimation.setDuration(220);
        return new defpackage.ly((android.view.animation.Animation) alphaAnimation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d A[SYNTHETIC, Splitter:B:11:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ly a(Fragment r11, int r12, boolean r13, int r14) {
        /*
            r10 = this;
            r0 = 1
            r9 = 1064933786(0x3f79999a, float:0.975)
            r2 = 0
            r8 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            int r4 = r11.D()
            defpackage.lc.q()
            defpackage.lc.r()
            if (r4 == 0) goto L_0x0067
            lm r1 = r10.e
            android.content.Context r1 = r1.b
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceTypeName(r4)
            java.lang.String r3 = "anim"
            boolean r5 = r3.equals(r1)
            r3 = 0
            if (r5 == 0) goto L_0x0051
            lm r1 = r10.e     // Catch:{ NotFoundException -> 0x004e, RuntimeException -> 0x0050 }
            android.content.Context r1 = r1.b     // Catch:{ NotFoundException -> 0x004e, RuntimeException -> 0x0050 }
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r1, r4)     // Catch:{ NotFoundException -> 0x004e, RuntimeException -> 0x0050 }
            if (r6 == 0) goto L_0x003a
            ly r1 = new ly     // Catch:{ NotFoundException -> 0x004e, RuntimeException -> 0x0050 }
            r1.<init>(r6)     // Catch:{ NotFoundException -> 0x004e, RuntimeException -> 0x0050 }
            r0 = r1
        L_0x0039:
            return r0
        L_0x003a:
            r1 = r0
        L_0x003b:
            if (r1 != 0) goto L_0x0067
            lm r1 = r10.e     // Catch:{ RuntimeException -> 0x0053 }
            android.content.Context r1 = r1.b     // Catch:{ RuntimeException -> 0x0053 }
            android.animation.Animator r3 = android.animation.AnimatorInflater.loadAnimator(r1, r4)     // Catch:{ RuntimeException -> 0x0053 }
            if (r3 == 0) goto L_0x0067
            ly r1 = new ly     // Catch:{ RuntimeException -> 0x0053 }
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x0053 }
            r0 = r1
            goto L_0x0039
        L_0x004e:
            r0 = move-exception
            throw r0
        L_0x0050:
            r1 = move-exception
        L_0x0051:
            r1 = r3
            goto L_0x003b
        L_0x0053:
            r1 = move-exception
            if (r5 == 0) goto L_0x0057
            throw r1
        L_0x0057:
            lm r1 = r10.e
            android.content.Context r1 = r1.b
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r4)
            if (r1 == 0) goto L_0x0067
            ly r0 = new ly
            r0.<init>(r1)
            goto L_0x0039
        L_0x0067:
            if (r12 != 0) goto L_0x006b
            r0 = r2
            goto L_0x0039
        L_0x006b:
            r1 = -1
            switch(r12) {
                case 4097: goto L_0x0074;
                case 4099: goto L_0x007e;
                case 8194: goto L_0x0078;
                default: goto L_0x006f;
            }
        L_0x006f:
            r0 = r1
        L_0x0070:
            if (r0 >= 0) goto L_0x0084
            r0 = r2
            goto L_0x0039
        L_0x0074:
            if (r13 != 0) goto L_0x0070
            r0 = 2
            goto L_0x0070
        L_0x0078:
            if (r13 == 0) goto L_0x007c
            r0 = 3
            goto L_0x0070
        L_0x007c:
            r0 = 4
            goto L_0x0070
        L_0x007e:
            if (r13 == 0) goto L_0x0082
            r0 = 5
            goto L_0x0070
        L_0x0082:
            r0 = 6
            goto L_0x0070
        L_0x0084:
            switch(r0) {
                case 1: goto L_0x009b;
                case 2: goto L_0x00a2;
                case 3: goto L_0x00a7;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00b4;
                case 6: goto L_0x00b9;
                default: goto L_0x0087;
            }
        L_0x0087:
            if (r14 != 0) goto L_0x0097
            lm r0 = r10.e
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0097
            lm r0 = r10.e
            int r14 = r0.e()
        L_0x0097:
            if (r14 != 0) goto L_0x00bf
            r0 = r2
            goto L_0x0039
        L_0x009b:
            r0 = 1066401792(0x3f900000, float:1.125)
            ly r0 = a(r0, r7, r8, r7)
            goto L_0x0039
        L_0x00a2:
            ly r0 = a(r7, r9, r7, r8)
            goto L_0x0039
        L_0x00a7:
            ly r0 = a(r9, r7, r8, r7)
            goto L_0x0039
        L_0x00ac:
            r0 = 1065982362(0x3f89999a, float:1.075)
            ly r0 = a(r7, r0, r7, r8)
            goto L_0x0039
        L_0x00b4:
            ly r0 = a(r8, r7)
            goto L_0x0039
        L_0x00b9:
            ly r0 = a(r7, r8)
            goto L_0x0039
        L_0x00bf:
            r0 = r2
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.a(lc, int, boolean, int):ly");
    }

    private static void a(android.view.View view, defpackage.ly lyVar) {
        boolean a2;
        boolean z2 = false;
        if (view != null && lyVar != null) {
            if (view != null && lyVar != null && android.os.Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && defpackage.sn.a.i(view)) {
                if (lyVar.a instanceof android.view.animation.AlphaAnimation) {
                    a2 = true;
                } else if (lyVar.a instanceof android.view.animation.AnimationSet) {
                    java.util.List animations = ((android.view.animation.AnimationSet) lyVar.a).getAnimations();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= animations.size()) {
                            a2 = false;
                            break;
                        } else if (animations.get(i2) instanceof android.view.animation.AlphaAnimation) {
                            a2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    a2 = a(lyVar.b);
                }
                if (a2) {
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
            if (lyVar.b != null) {
                lyVar.b.addListener(new defpackage.lz(view));
                return;
            }
            android.view.animation.Animation.AnimationListener a3 = a(lyVar.a);
            view.setLayerType(2, null);
            lyVar.a.setAnimationListener(new defpackage.lv(view, a3));
        }
    }

    private static android.view.animation.Animation.AnimationListener a(android.view.animation.Animation animation) {
        try {
            if (t == null) {
                java.lang.reflect.Field declaredField = android.view.animation.Animation.class.getDeclaredField("mListener");
                t = declaredField;
                declaredField.setAccessible(true);
            }
            return (android.view.animation.Animation.AnimationListener) t.get(animation);
        } catch (java.lang.NoSuchFieldException e2) {
            android.util.Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e2);
            return null;
        } catch (java.lang.IllegalAccessException e3) {
            android.util.Log.e("FragmentManager", "Cannot access Animation's mListener field", e3);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0235, code lost:
        if (r11.q != false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r1 = r11.k().getResourceName(r11.A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02f9, code lost:
        r11.K = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02fe, code lost:
        r1 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03fb, code lost:
        if (r12 > 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03ff, code lost:
        if (r10.v == false) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0405, code lost:
        if (r11.I() == null) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0407, code lost:
        r0 = r11.I();
        r11.a((android.view.View) null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0415, code lost:
        if (r11.I() != null) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x041b, code lost:
        if (r11.J() == null) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x041d, code lost:
        r11.c(r12);
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x045f, code lost:
        if (r12 >= 4) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0461, code lost:
        r11.T.a(defpackage.v.ON_STOP);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x046a, code lost:
        if (r11.v == null) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x046c, code lost:
        r11.v.r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0471, code lost:
        r11.d = 3;
        r11.H = false;
        r11.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x047a, code lost:
        if (r11.H != false) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0496, code lost:
        throw new defpackage.nu("Fragment " + r11 + " did not call through to super.onStop()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0497, code lost:
        e(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x049a, code lost:
        if (r12 >= 3) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x049e, code lost:
        if (r11.v == null) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04a0, code lost:
        r11.v.c(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04a6, code lost:
        r11.d = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04aa, code lost:
        if (r12 >= 2) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04ae, code lost:
        if (r11.J == null) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04b6, code lost:
        if (r10.e.b() == false) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04ba, code lost:
        if (r11.f != null) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04bc, code lost:
        j(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04c1, code lost:
        if (r11.v == null) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04c3, code lost:
        r11.v.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04c8, code lost:
        r11.d = 1;
        r11.H = false;
        r11.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04d1, code lost:
        if (r11.H != false) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04ed, code lost:
        throw new defpackage.nu("Fragment " + r11 + " did not call through to super.onDestroyView()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04ee, code lost:
        defpackage.na.a(r11).b();
        r11.r = false;
        f(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04fc, code lost:
        if (r11.J == null) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0500, code lost:
        if (r11.I == null) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0502, code lost:
        r11.I.endViewTransition(r11.J);
        r11.J.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0510, code lost:
        if (r10.d <= 0) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0514, code lost:
        if (r10.v != false) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x051c, code lost:
        if (r11.J.getVisibility() != 0) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0523, code lost:
        if (r11.Q < 0.0f) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0525, code lost:
        r0 = a(r11, r13, false, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0529, code lost:
        r11.Q = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x052c, code lost:
        if (r0 == null) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x052e, code lost:
        r1 = r11.J;
        r2 = r11.I;
        r2.startViewTransition(r1);
        r11.c(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x053a, code lost:
        if (r0.a == null) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x053c, code lost:
        r4 = new defpackage.ma(r0.a, r2, r1);
        r11.a(r11.J);
        r4.setAnimationListener(new defpackage.lr(r10, a((android.view.animation.Animation) r4), r2, r11));
        a(r1, r0);
        r11.J.startAnimation(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x055c, code lost:
        r11.I.removeView(r11.J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0563, code lost:
        r11.I = null;
        r11.J = null;
        r11.K = null;
        r11.p = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x056d, code lost:
        r4 = r0.b;
        r11.a(r0.b);
        r4.addListener(new defpackage.lt(r10, r2, r1, r11));
        r4.setTarget(r11.J);
        a(r11.J, r0);
        r4.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x058e, code lost:
        if (r11.J() == null) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0590, code lost:
        r0 = r11.J();
        r11.a((android.animation.Animator) null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x059e, code lost:
        if (r11.F != false) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a0, code lost:
        r11.T.a(defpackage.v.ON_DESTROY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05a9, code lost:
        if (r11.v == null) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05ab, code lost:
        r11.v.s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05b0, code lost:
        r11.d = 0;
        r11.H = false;
        r11.S = false;
        r11.u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05bb, code lost:
        if (r11.H != false) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05d7, code lost:
        throw new defpackage.nu("Fragment " + r11 + " did not call through to super.onDestroy()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05d8, code lost:
        r11.v = null;
        g(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05dd, code lost:
        r11.H = false;
        r11.d();
        r11.R = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05e6, code lost:
        if (r11.H != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0602, code lost:
        throw new defpackage.nu("Fragment " + r11 + " did not call through to super.onDetach()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0603, code lost:
        r11.d = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0608, code lost:
        if (r11.v == null) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x060c, code lost:
        if (r11.F != false) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0628, code lost:
        throw new java.lang.IllegalStateException("Child FragmentManager of " + r11 + " was not  destroyed and this fragment is not retaining instance");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0629, code lost:
        r11.v.s();
        r11.v = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0630, code lost:
        h(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0633, code lost:
        if (r15 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0637, code lost:
        if (r11.F != false) goto L_0x0669;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x063b, code lost:
        if (r11.g < 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x063d, code lost:
        r10.n.put(r11.g, null);
        r11.g = -1;
        r11.h = null;
        r11.m = false;
        r11.n = false;
        r11.o = false;
        r11.p = false;
        r11.q = false;
        r11.s = 0;
        r11.t = null;
        r11.v = null;
        r11.u = null;
        r11.z = 0;
        r11.A = 0;
        r11.B = null;
        r11.C = false;
        r11.D = false;
        r11.F = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0669, code lost:
        r11.u = null;
        r11.y = null;
        r11.t = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0671, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0674, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c1, code lost:
        if (r11.o == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c5, code lost:
        if (r11.r != false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c7, code lost:
        r11.J = r11.b(r11.f(r11.e), null, r11.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d7, code lost:
        if (r11.J == null) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d9, code lost:
        r11.K = r11.J;
        r11.J.setSaveFromParentEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e4, code lost:
        if (r11.C == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e6, code lost:
        r11.J.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ed, code lost:
        r11.a(r11.J, r11.e);
        a(r11, r11.J, r11.e, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fb, code lost:
        if (r12 <= 1) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ff, code lost:
        if (r11.o != false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0203, code lost:
        if (r11.A == 0) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0208, code lost:
        if (r11.A != -1) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x020a, code lost:
        a((java.lang.RuntimeException) new java.lang.IllegalArgumentException("Cannot create fragment " + r11 + " for a container view with no id"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0227, code lost:
        r0 = (android.view.ViewGroup) r10.f.a(r11.A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0231, code lost:
        if (r0 != null) goto L_0x0272;
     */
    /* JADX WARNING: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(Fragment r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            r9 = 4
            r6 = 3
            r5 = 1
            r7 = 0
            r3 = 0
            boolean r0 = r11.m
            if (r0 == 0) goto L_0x000d
            boolean r0 = r11.D
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            if (r12 <= r5) goto L_0x0010
            r12 = r5
        L_0x0010:
            boolean r0 = r11.n
            if (r0 == 0) goto L_0x0023
            int r0 = r11.d
            if (r12 <= r0) goto L_0x0023
            int r0 = r11.d
            if (r0 != 0) goto L_0x003b
            boolean r0 = r11.h()
            if (r0 == 0) goto L_0x003b
            r12 = r5
        L_0x0023:
            boolean r0 = r11.L
            if (r0 == 0) goto L_0x002e
            int r0 = r11.d
            if (r0 >= r9) goto L_0x002e
            if (r12 <= r6) goto L_0x002e
            r12 = r6
        L_0x002e:
            int r0 = r11.d
            if (r0 > r12) goto L_0x03f0
            boolean r0 = r11.o
            if (r0 == 0) goto L_0x003e
            boolean r0 = r11.p
            if (r0 != 0) goto L_0x003e
        L_0x003a:
            return
        L_0x003b:
            int r12 = r11.d
            goto L_0x0023
        L_0x003e:
            android.view.View r0 = r11.I()
            if (r0 != 0) goto L_0x004a
            android.animation.Animator r0 = r11.J()
            if (r0 == 0) goto L_0x005a
        L_0x004a:
            r11.a(r7)
            r11.a(r7)
            int r2 = r11.K()
            r0 = r10
            r1 = r11
            r4 = r3
            r0.a(r1, r2, r3, r4, r5)
        L_0x005a:
            int r0 = r11.d
            switch(r0) {
                case 0: goto L_0x0090;
                case 1: goto L_0x01bf;
                case 2: goto L_0x034d;
                case 3: goto L_0x0352;
                case 4: goto L_0x039b;
                default: goto L_0x005f;
            }
        L_0x005f:
            int r0 = r11.d
            if (r0 == r12) goto L_0x003a
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " not updated inline; expected state "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = " found "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r11.d
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            r11.d = r12
            goto L_0x003a
        L_0x0090:
            if (r12 <= 0) goto L_0x01bf
            android.os.Bundle r0 = r11.e
            if (r0 == 0) goto L_0x00d8
            android.os.Bundle r0 = r11.e
            lm r1 = r10.e
            android.content.Context r1 = r1.b
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r11.e
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r11.f = r0
            android.os.Bundle r0 = r11.e
            java.lang.String r1 = "android:target_state"
            lc r0 = r10.a(r0, r1)
            r11.j = r0
            lc r0 = r11.j
            if (r0 == 0) goto L_0x00c5
            android.os.Bundle r0 = r11.e
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r3)
            r11.l = r0
        L_0x00c5:
            android.os.Bundle r0 = r11.e
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r5)
            r11.M = r0
            boolean r0 = r11.M
            if (r0 != 0) goto L_0x00d8
            r11.L = r5
            if (r12 <= r6) goto L_0x00d8
            r12 = r6
        L_0x00d8:
            lm r0 = r10.e
            r11.u = r0
            lc r0 = r10.s
            r11.y = r0
            lc r0 = r10.s
            if (r0 == 0) goto L_0x0123
            lc r0 = r10.s
            lp r0 = r0.v
        L_0x00e8:
            r11.t = r0
            lc r0 = r11.j
            if (r0 == 0) goto L_0x0136
            android.util.SparseArray r0 = r10.n
            lc r1 = r11.j
            int r1 = r1.g
            java.lang.Object r0 = r0.get(r1)
            lc r1 = r11.j
            if (r0 == r1) goto L_0x0128
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " declared target fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            lc r2 = r11.j
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0123:
            lm r0 = r10.e
            lp r0 = r0.d
            goto L_0x00e8
        L_0x0128:
            lc r0 = r11.j
            int r0 = r0.d
            if (r0 > 0) goto L_0x0136
            lc r1 = r11.j
            r0 = r10
            r2 = r5
            r4 = r3
            r0.a(r1, r2, r3, r4, r5)
        L_0x0136:
            lm r0 = r10.e
            android.content.Context r0 = r0.b
            r10.a(r11, r0, r3)
            r11.H = r3
            lm r0 = r10.e
            android.content.Context r0 = r0.b
            r11.a(r0)
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x0165
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0165:
            lc r0 = r11.y
            if (r0 == 0) goto L_0x016e
            lc r0 = r11.y
            defpackage.lc.p()
        L_0x016e:
            lm r0 = r10.e
            android.content.Context r0 = r0.b
            r10.b(r11, r0, r3)
            boolean r0 = r11.S
            if (r0 != 0) goto L_0x02f0
            android.os.Bundle r0 = r11.e
            r10.a(r11, r0, r3)
            android.os.Bundle r0 = r11.e
            lp r1 = r11.v
            if (r1 == 0) goto L_0x0189
            lp r1 = r11.v
            r1.noteStateNotSaved()
        L_0x0189:
            r11.d = r5
            r11.H = r3
            r11.a(r0)
            r11.S = r5
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x01b1
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onCreate()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b1:
            z r0 = r11.T
            v r1 = defpackage.v.ON_CREATE
            r0.a(r1)
            android.os.Bundle r0 = r11.e
            r10.b(r11, r0, r3)
        L_0x01bd:
            r11.F = r3
        L_0x01bf:
            boolean r0 = r11.o
            if (r0 == 0) goto L_0x01fb
            boolean r0 = r11.r
            if (r0 != 0) goto L_0x01fb
            android.os.Bundle r0 = r11.e
            android.view.LayoutInflater r0 = r11.f(r0)
            android.os.Bundle r1 = r11.e
            android.view.View r0 = r11.b(r0, r7, r1)
            r11.J = r0
            android.view.View r0 = r11.J
            if (r0 == 0) goto L_0x02f9
            android.view.View r0 = r11.J
            r11.K = r0
            android.view.View r0 = r11.J
            r0.setSaveFromParentEnabled(r3)
            boolean r0 = r11.C
            if (r0 == 0) goto L_0x01ed
            android.view.View r0 = r11.J
            r1 = 8
            r0.setVisibility(r1)
        L_0x01ed:
            android.view.View r0 = r11.J
            android.os.Bundle r1 = r11.e
            r11.a(r0, r1)
            android.view.View r0 = r11.J
            android.os.Bundle r1 = r11.e
            r10.a(r11, r0, r1, r3)
        L_0x01fb:
            if (r12 <= r5) goto L_0x034d
            boolean r0 = r11.o
            if (r0 != 0) goto L_0x02be
            int r0 = r11.A
            if (r0 == 0) goto L_0x0674
            int r0 = r11.A
            r1 = -1
            if (r0 != r1) goto L_0x0227
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot create fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " for a container view with no id"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r10.a(r0)
        L_0x0227:
            lk r0 = r10.f
            int r1 = r11.A
            android.view.View r0 = r0.a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0272
            boolean r1 = r11.q
            if (r1 != 0) goto L_0x0272
            android.content.res.Resources r1 = r11.k()     // Catch:{ NotFoundException -> 0x02fd }
            int r2 = r11.A     // Catch:{ NotFoundException -> 0x02fd }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x02fd }
        L_0x0241:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "No view found for id 0x"
            r4.<init>(r8)
            int r8 = r11.A
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r8 = " ("
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = ") for fragment "
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            r10.a(r2)
        L_0x0272:
            r11.I = r0
            android.os.Bundle r1 = r11.e
            android.view.LayoutInflater r1 = r11.f(r1)
            android.os.Bundle r2 = r11.e
            android.view.View r1 = r11.b(r1, r0, r2)
            r11.J = r1
            android.view.View r1 = r11.J
            if (r1 == 0) goto L_0x0304
            android.view.View r1 = r11.J
            r11.K = r1
            android.view.View r1 = r11.J
            r1.setSaveFromParentEnabled(r3)
            if (r0 == 0) goto L_0x0296
            android.view.View r1 = r11.J
            r0.addView(r1)
        L_0x0296:
            boolean r0 = r11.C
            if (r0 == 0) goto L_0x02a1
            android.view.View r0 = r11.J
            r1 = 8
            r0.setVisibility(r1)
        L_0x02a1:
            android.view.View r0 = r11.J
            android.os.Bundle r1 = r11.e
            r11.a(r0, r1)
            android.view.View r0 = r11.J
            android.os.Bundle r1 = r11.e
            r10.a(r11, r0, r1, r3)
            android.view.View r0 = r11.J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0302
            android.view.ViewGroup r0 = r11.I
            if (r0 == 0) goto L_0x0302
            r0 = r5
        L_0x02bc:
            r11.O = r0
        L_0x02be:
            android.os.Bundle r0 = r11.e
            lp r1 = r11.v
            if (r1 == 0) goto L_0x02c9
            lp r1 = r11.v
            r1.noteStateNotSaved()
        L_0x02c9:
            r1 = 2
            r11.d = r1
            r11.H = r3
            r11.c(r0)
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x0307
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onActivityCreated()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02f0:
            android.os.Bundle r0 = r11.e
            r11.g(r0)
            r11.d = r5
            goto L_0x01bd
        L_0x02f9:
            r11.K = r7
            goto L_0x01fb
        L_0x02fd:
            r1 = move-exception
            java.lang.String r1 = "unknown"
            goto L_0x0241
        L_0x0302:
            r0 = r3
            goto L_0x02bc
        L_0x0304:
            r11.K = r7
            goto L_0x02be
        L_0x0307:
            lp r0 = r11.v
            if (r0 == 0) goto L_0x0310
            lp r0 = r11.v
            r0.o()
        L_0x0310:
            android.os.Bundle r0 = r11.e
            r10.c(r11, r0, r3)
            android.view.View r0 = r11.J
            if (r0 == 0) goto L_0x034b
            android.os.Bundle r0 = r11.e
            android.util.SparseArray r0 = r11.f
            if (r0 == 0) goto L_0x0328
            android.view.View r0 = r11.K
            android.util.SparseArray r1 = r11.f
            r0.restoreHierarchyState(r1)
            r11.f = r7
        L_0x0328:
            r11.H = r3
            r11.H = r5
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x034b
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onViewStateRestored()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x034b:
            r11.e = r7
        L_0x034d:
            r0 = 2
            if (r12 <= r0) goto L_0x0352
            r11.d = r6
        L_0x0352:
            if (r12 <= r6) goto L_0x039b
            lp r0 = r11.v
            if (r0 == 0) goto L_0x0362
            lp r0 = r11.v
            r0.noteStateNotSaved()
            lp r0 = r11.v
            r0.j()
        L_0x0362:
            r11.d = r9
            r11.H = r3
            r11.e()
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x0388
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onStart()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0388:
            lp r0 = r11.v
            if (r0 == 0) goto L_0x0391
            lp r0 = r11.v
            r0.p()
        L_0x0391:
            z r0 = r11.T
            v r1 = defpackage.v.ON_START
            r0.a(r1)
            r10.b(r11, r3)
        L_0x039b:
            if (r12 <= r9) goto L_0x005f
            lp r0 = r11.v
            if (r0 == 0) goto L_0x03ab
            lp r0 = r11.v
            r0.noteStateNotSaved()
            lp r0 = r11.v
            r0.j()
        L_0x03ab:
            r0 = 5
            r11.d = r0
            r11.H = r3
            r11.s()
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x03d2
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onResume()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03d2:
            lp r0 = r11.v
            if (r0 == 0) goto L_0x03e0
            lp r0 = r11.v
            r0.q()
            lp r0 = r11.v
            r0.j()
        L_0x03e0:
            z r0 = r11.T
            v r1 = defpackage.v.ON_RESUME
            r0.a(r1)
            r10.c(r11, r3)
            r11.e = r7
            r11.f = r7
            goto L_0x005f
        L_0x03f0:
            int r0 = r11.d
            if (r0 <= r12) goto L_0x005f
            int r0 = r11.d
            switch(r0) {
                case 1: goto L_0x03fb;
                case 2: goto L_0x04a9;
                case 3: goto L_0x049a;
                case 4: goto L_0x045f;
                case 5: goto L_0x0423;
                default: goto L_0x03f9;
            }
        L_0x03f9:
            goto L_0x005f
        L_0x03fb:
            if (r12 > 0) goto L_0x005f
            boolean r0 = r10.v
            if (r0 == 0) goto L_0x0411
            android.view.View r0 = r11.I()
            if (r0 == 0) goto L_0x058a
            android.view.View r0 = r11.I()
            r11.a(r7)
            r0.clearAnimation()
        L_0x0411:
            android.view.View r0 = r11.I()
            if (r0 != 0) goto L_0x041d
            android.animation.Animator r0 = r11.J()
            if (r0 == 0) goto L_0x059c
        L_0x041d:
            r11.c(r12)
            r12 = r5
            goto L_0x005f
        L_0x0423:
            r0 = 5
            if (r12 >= r0) goto L_0x045f
            z r0 = r11.T
            v r1 = defpackage.v.ON_PAUSE
            r0.a(r1)
            lp r0 = r11.v
            if (r0 == 0) goto L_0x0436
            lp r0 = r11.v
            r0.c(r9)
        L_0x0436:
            r11.d = r9
            r11.H = r3
            r11.t()
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x045c
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onPause()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x045c:
            r10.d(r11, r3)
        L_0x045f:
            if (r12 >= r9) goto L_0x049a
            z r0 = r11.T
            v r1 = defpackage.v.ON_STOP
            r0.a(r1)
            lp r0 = r11.v
            if (r0 == 0) goto L_0x0471
            lp r0 = r11.v
            r0.r()
        L_0x0471:
            r11.d = r6
            r11.H = r3
            r11.f()
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x0497
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onStop()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0497:
            r10.e(r11, r3)
        L_0x049a:
            if (r12 >= r6) goto L_0x04a9
            lp r0 = r11.v
            if (r0 == 0) goto L_0x04a6
            lp r0 = r11.v
            r1 = 2
            r0.c(r1)
        L_0x04a6:
            r0 = 2
            r11.d = r0
        L_0x04a9:
            r0 = 2
            if (r12 >= r0) goto L_0x03fb
            android.view.View r0 = r11.J
            if (r0 == 0) goto L_0x04bf
            lm r0 = r10.e
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x04bf
            android.util.SparseArray r0 = r11.f
            if (r0 != 0) goto L_0x04bf
            r10.j(r11)
        L_0x04bf:
            lp r0 = r11.v
            if (r0 == 0) goto L_0x04c8
            lp r0 = r11.v
            r0.c(r5)
        L_0x04c8:
            r11.d = r5
            r11.H = r3
            r11.g()
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x04ee
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onDestroyView()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04ee:
            na r0 = defpackage.na.a(r11)
            r0.b()
            r11.r = r3
            r10.f(r11, r3)
            android.view.View r0 = r11.J
            if (r0 == 0) goto L_0x0563
            android.view.ViewGroup r0 = r11.I
            if (r0 == 0) goto L_0x0563
            android.view.ViewGroup r0 = r11.I
            android.view.View r1 = r11.J
            r0.endViewTransition(r1)
            android.view.View r0 = r11.J
            r0.clearAnimation()
            int r0 = r10.d
            if (r0 <= 0) goto L_0x0671
            boolean r0 = r10.v
            if (r0 != 0) goto L_0x0671
            android.view.View r0 = r11.J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0671
            float r0 = r11.Q
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0671
            ly r0 = r10.a(r11, r13, r3, r14)
        L_0x0529:
            r1 = 0
            r11.Q = r1
            if (r0 == 0) goto L_0x055c
            android.view.View r1 = r11.J
            android.view.ViewGroup r2 = r11.I
            r2.startViewTransition(r1)
            r11.c(r12)
            android.view.animation.Animation r4 = r0.a
            if (r4 == 0) goto L_0x056d
            ma r4 = new ma
            android.view.animation.Animation r6 = r0.a
            r4.<init>(r6, r2, r1)
            android.view.View r6 = r11.J
            r11.a(r6)
            android.view.animation.Animation$AnimationListener r6 = a(r4)
            lr r8 = new lr
            r8.<init>(r10, r6, r2, r11)
            r4.setAnimationListener(r8)
            a(r1, r0)
            android.view.View r0 = r11.J
            r0.startAnimation(r4)
        L_0x055c:
            android.view.ViewGroup r0 = r11.I
            android.view.View r1 = r11.J
            r0.removeView(r1)
        L_0x0563:
            r11.I = r7
            r11.J = r7
            r11.K = r7
            r11.p = r3
            goto L_0x03fb
        L_0x056d:
            android.animation.Animator r4 = r0.b
            android.animation.Animator r6 = r0.b
            r11.a(r6)
            lt r6 = new lt
            r6.<init>(r10, r2, r1, r11)
            r4.addListener(r6)
            android.view.View r1 = r11.J
            r4.setTarget(r1)
            android.view.View r1 = r11.J
            a(r1, r0)
            r4.start()
            goto L_0x055c
        L_0x058a:
            android.animation.Animator r0 = r11.J()
            if (r0 == 0) goto L_0x0411
            android.animation.Animator r0 = r11.J()
            r11.a(r7)
            r0.cancel()
            goto L_0x0411
        L_0x059c:
            boolean r0 = r11.F
            if (r0 != 0) goto L_0x0603
            z r0 = r11.T
            v r1 = defpackage.v.ON_DESTROY
            r0.a(r1)
            lp r0 = r11.v
            if (r0 == 0) goto L_0x05b0
            lp r0 = r11.v
            r0.s()
        L_0x05b0:
            r11.d = r3
            r11.H = r3
            r11.S = r3
            r11.u()
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x05d8
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onDestroy()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x05d8:
            r11.v = r7
            r10.g(r11, r3)
        L_0x05dd:
            r11.H = r3
            r11.d()
            r11.R = r7
            boolean r0 = r11.H
            if (r0 != 0) goto L_0x0606
            nu r0 = new nu
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onDetach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0603:
            r11.d = r3
            goto L_0x05dd
        L_0x0606:
            lp r0 = r11.v
            if (r0 == 0) goto L_0x0630
            boolean r0 = r11.F
            if (r0 != 0) goto L_0x0629
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Child FragmentManager of "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " was not  destroyed and this fragment is not retaining instance"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0629:
            lp r0 = r11.v
            r0.s()
            r11.v = r7
        L_0x0630:
            r10.h(r11, r3)
            if (r15 != 0) goto L_0x005f
            boolean r0 = r11.F
            if (r0 != 0) goto L_0x0669
            int r0 = r11.g
            if (r0 < 0) goto L_0x005f
            android.util.SparseArray r0 = r10.n
            int r1 = r11.g
            r0.put(r1, r7)
            r0 = -1
            r11.g = r0
            r11.h = r7
            r11.m = r3
            r11.n = r3
            r11.o = r3
            r11.p = r3
            r11.q = r3
            r11.s = r3
            r11.t = r7
            r11.v = r7
            r11.u = r7
            r11.z = r3
            r11.A = r3
            r11.B = r7
            r11.C = r3
            r11.D = r3
            r11.F = r3
            goto L_0x005f
        L_0x0669:
            r11.u = r7
            r11.y = r7
            r11.t = r7
            goto L_0x005f
        L_0x0671:
            r0 = r7
            goto L_0x0529
        L_0x0674:
            r0 = r7
            goto L_0x0272
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.a(lc, int, int, int, boolean):void");
    }

    private final void i(Fragment lcVar) {
        a(lcVar, this.d, 0, 0, false);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Fragment lcVar) {
        boolean z2;
        int i2;
        Fragment lcVar2;
        if (lcVar != null) {
            int i3 = this.d;
            if (lcVar.n) {
                if (lcVar.h()) {
                    i3 = java.lang.Math.min(i3, 1);
                } else {
                    i3 = java.lang.Math.min(i3, 0);
                }
            }
            a(lcVar, i3, lcVar.E(), lcVar.F(), false);
            if (lcVar.J != null) {
                android.view.ViewGroup viewGroup = lcVar.I;
                android.view.View view = lcVar.J;
                if (viewGroup != null && view != null) {
                    int indexOf = this.b.indexOf(lcVar) - 1;
                    while (true) {
                        if (indexOf < 0) {
                            lcVar2 = null;
                            break;
                        }
                        lcVar2 = (Fragment) this.b.get(indexOf);
                        if (lcVar2.I == viewGroup && lcVar2.J != null) {
                            break;
                        }
                        indexOf--;
                    }
                } else {
                    lcVar2 = null;
                }
                if (lcVar2 != null) {
                    android.view.View view2 = lcVar2.J;
                    android.view.ViewGroup viewGroup2 = lcVar.I;
                    int indexOfChild = viewGroup2.indexOfChild(view2);
                    int indexOfChild2 = viewGroup2.indexOfChild(lcVar.J);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup2.removeViewAt(indexOfChild2);
                        viewGroup2.addView(lcVar.J, indexOfChild);
                    }
                }
                if (lcVar.O && lcVar.I != null) {
                    if (lcVar.Q > 0.0f) {
                        lcVar.J.setAlpha(lcVar.Q);
                    }
                    lcVar.Q = 0.0f;
                    lcVar.O = false;
                    defpackage.ly a2 = a(lcVar, lcVar.E(), true, lcVar.F());
                    if (a2 != null) {
                        a(lcVar.J, a2);
                        if (a2.a != null) {
                            lcVar.J.startAnimation(a2.a);
                        } else {
                            a2.b.setTarget(lcVar.J);
                            a2.b.start();
                        }
                    }
                }
            }
            if (lcVar.P) {
                if (lcVar.J != null) {
                    int E = lcVar.E();
                    if (!lcVar.C) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    defpackage.ly a3 = a(lcVar, E, z2, lcVar.F());
                    if (a3 == null || a3.b == null) {
                        if (a3 != null) {
                            a(lcVar.J, a3);
                            lcVar.J.startAnimation(a3.a);
                            a3.a.start();
                        }
                        if (!lcVar.C || lcVar.M()) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        lcVar.J.setVisibility(i2);
                        if (lcVar.M()) {
                            lcVar.b(false);
                        }
                    } else {
                        a3.b.setTarget(lcVar.J);
                        if (!lcVar.C) {
                            lcVar.J.setVisibility(0);
                        } else if (lcVar.M()) {
                            lcVar.b(false);
                        } else {
                            android.view.ViewGroup viewGroup3 = lcVar.I;
                            android.view.View view3 = lcVar.J;
                            viewGroup3.startViewTransition(view3);
                            a3.b.addListener(new defpackage.lu(viewGroup3, view3, lcVar));
                        }
                        a(lcVar.J, a3);
                        a3.b.start();
                    }
                }
                if (lcVar.m) {
                    boolean z3 = lcVar.G;
                }
                lcVar.P = false;
                boolean z4 = lcVar.C;
                Fragment.m();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, boolean z2) {
        if (this.e == null && i2 != 0) {
            throw new java.lang.IllegalStateException("No activity");
        } else if (z2 || i2 != this.d) {
            this.d = i2;
            if (this.n != null) {
                int size = this.b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    a((Fragment) this.b.get(i3));
                }
                int size2 = this.n.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Fragment lcVar = (Fragment) this.n.valueAt(i4);
                    if (lcVar != null && ((lcVar.n || lcVar.D) && !lcVar.O)) {
                        a(lcVar);
                    }
                }
                v();
            }
        }
    }

    private final void v() {
        if (this.n != null) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                Fragment lcVar = (Fragment) this.n.valueAt(i2);
                if (lcVar != null && lcVar.L) {
                    if (this.a) {
                        this.w = true;
                    } else {
                        lcVar.L = false;
                        a(lcVar, this.d, 0, 0, false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(Fragment lcVar) {
        if (lcVar.g < 0) {
            int i2 = this.m;
            this.m = i2 + 1;
            lcVar.a(i2, this.s);
            if (this.n == null) {
                this.n = new android.util.SparseArray();
            }
            this.n.put(lcVar.g, lcVar);
        }
    }

    public final void a(Fragment lcVar, boolean z2) {
        b(lcVar);
        if (lcVar.D) {
            return;
        }
        if (this.b.contains(lcVar)) {
            throw new java.lang.IllegalStateException("Fragment already added: " + lcVar);
        }
        synchronized (this.b) {
            this.b.add(lcVar);
        }
        lcVar.m = true;
        lcVar.n = false;
        if (lcVar.J == null) {
            lcVar.P = false;
        }
        boolean z3 = lcVar.G;
        if (z2) {
            i(lcVar);
        }
    }

    public final void c(Fragment lcVar) {
        boolean z2 = !lcVar.h();
        if (!lcVar.D || z2) {
            synchronized (this.b) {
                this.b.remove(lcVar);
            }
            boolean z3 = lcVar.G;
            lcVar.m = false;
            lcVar.n = true;
        }
    }

    public static void d(Fragment lcVar) {
        boolean z2 = true;
        if (!lcVar.C) {
            lcVar.C = true;
            if (lcVar.P) {
                z2 = false;
            }
            lcVar.P = z2;
        }
    }

    public static void e(Fragment lcVar) {
        boolean z2 = false;
        if (lcVar.C) {
            lcVar.C = false;
            if (!lcVar.P) {
                z2 = true;
            }
            lcVar.P = z2;
        }
    }

    public final void f(Fragment lcVar) {
        if (!lcVar.D) {
            lcVar.D = true;
            if (lcVar.m) {
                synchronized (this.b) {
                    this.b.remove(lcVar);
                }
                boolean z2 = lcVar.G;
                lcVar.m = false;
            }
        }
    }

    public final void g(Fragment lcVar) {
        if (lcVar.D) {
            lcVar.D = false;
            if (lcVar.m) {
                return;
            }
            if (this.b.contains(lcVar)) {
                throw new java.lang.IllegalStateException("Fragment already added: " + lcVar);
            }
            synchronized (this.b) {
                this.b.add(lcVar);
            }
            lcVar.m = true;
            boolean z2 = lcVar.G;
        }
    }

    public final Fragment findFragmentById(int i2) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            Fragment lcVar = (Fragment) this.b.get(size);
            if (lcVar != null && lcVar.z == i2) {
                return lcVar;
            }
        }
        if (this.n != null) {
            for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
                Fragment lcVar2 = (Fragment) this.n.valueAt(size2);
                if (lcVar2 != null && lcVar2.z == i2) {
                    return lcVar2;
                }
            }
        }
        return null;
    }

    public final Fragment a(java.lang.String str) {
        if (str != null) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                Fragment lcVar = (Fragment) this.b.get(size);
                if (lcVar != null && str.equals(lcVar.B)) {
                    return lcVar;
                }
            }
        }
        if (!(this.n == null || str == null)) {
            for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
                Fragment lcVar2 = (Fragment) this.n.valueAt(size2);
                if (lcVar2 != null && str.equals(lcVar2.B)) {
                    return lcVar2;
                }
            }
        }
        return null;
    }

    public final Fragment b(java.lang.String str) {
        if (!(this.n == null || str == null)) {
            for (int size = this.n.size() - 1; size >= 0; size--) {
                Fragment lcVar = (Fragment) this.n.valueAt(size);
                if (lcVar != null) {
                    if (!str.equals(lcVar.h)) {
                        lcVar = lcVar.v != null ? lcVar.v.b(str) : null;
                    }
                    if (lcVar != null) {
                        return lcVar;
                    }
                }
            }
        }
        return null;
    }

    private final void w() {
        if (h()) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final boolean h() {
        return this.h || this.u;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.mc r5, boolean r6) {
        /*
            r4 = this;
            r1 = 0
            r0 = 1
            if (r6 != 0) goto L_0x0007
            r4.w()
        L_0x0007:
            monitor-enter(r4)
            boolean r2 = r4.v     // Catch:{ all -> 0x001c }
            if (r2 != 0) goto L_0x0010
            lm r2 = r4.e     // Catch:{ all -> 0x001c }
            if (r2 != 0) goto L_0x001f
        L_0x0010:
            if (r6 == 0) goto L_0x0014
            monitor-exit(r4)     // Catch:{ all -> 0x001c }
        L_0x0013:
            return
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Activity has been destroyed"
            r0.<init>(r1)     // Catch:{ all -> 0x001c }
            throw r0     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001c }
            throw r0
        L_0x001f:
            java.util.ArrayList r2 = r4.l     // Catch:{ all -> 0x001c }
            if (r2 != 0) goto L_0x002a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x001c }
            r2.<init>()     // Catch:{ all -> 0x001c }
            r4.l = r2     // Catch:{ all -> 0x001c }
        L_0x002a:
            java.util.ArrayList r2 = r4.l     // Catch:{ all -> 0x001c }
            r2.add(r5)     // Catch:{ all -> 0x001c }
            monitor-enter(r4)     // Catch:{ all -> 0x001c }
            java.util.ArrayList r2 = r4.A     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x0062
            java.util.ArrayList r2 = r4.A     // Catch:{ all -> 0x0066 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0062
            r2 = r0
        L_0x003d:
            java.util.ArrayList r3 = r4.l     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0064
            java.util.ArrayList r3 = r4.l     // Catch:{ all -> 0x0066 }
            int r3 = r3.size()     // Catch:{ all -> 0x0066 }
            if (r3 != r0) goto L_0x0064
        L_0x0049:
            if (r2 != 0) goto L_0x004d
            if (r0 == 0) goto L_0x005f
        L_0x004d:
            lm r0 = r4.e     // Catch:{ all -> 0x0066 }
            android.os.Handler r0 = r0.c     // Catch:{ all -> 0x0066 }
            java.lang.Runnable r1 = r4.B     // Catch:{ all -> 0x0066 }
            r0.removeCallbacks(r1)     // Catch:{ all -> 0x0066 }
            lm r0 = r4.e     // Catch:{ all -> 0x0066 }
            android.os.Handler r0 = r0.c     // Catch:{ all -> 0x0066 }
            java.lang.Runnable r1 = r4.B     // Catch:{ all -> 0x0066 }
            r0.post(r1)     // Catch:{ all -> 0x0066 }
        L_0x005f:
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x001c }
            goto L_0x0013
        L_0x0062:
            r2 = r1
            goto L_0x003d
        L_0x0064:
            r0 = r1
            goto L_0x0049
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x001c }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.a(mc, boolean):void");
    }

    public final int a(defpackage.kv kvVar) {
        int i2;
        synchronized (this) {
            if (this.q == null || this.q.size() <= 0) {
                if (this.p == null) {
                    this.p = new java.util.ArrayList();
                }
                i2 = this.p.size();
                this.p.add(kvVar);
            } else {
                i2 = ((java.lang.Integer) this.q.remove(this.q.size() - 1)).intValue();
                this.p.set(i2, kvVar);
            }
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z2) {
        if (this.a) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.e == null) {
            throw new java.lang.IllegalStateException("Fragment host has been destroyed");
        } else if (android.os.Looper.myLooper() != this.e.mHandler.getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z2) {
                w();
            }
            if (this.i == null) {
                this.i = new java.util.ArrayList();
                this.j = new java.util.ArrayList();
            }
            this.a = true;
            try {
                b((java.util.ArrayList) null, (java.util.ArrayList) null);
            } finally {
                this.a = false;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void i() {
        this.a = false;
        this.j.clear();
        this.i.clear();
    }

    /* JADX INFO: finally extract failed */
    public final boolean j() {
        a(true);
        boolean z2 = false;
        while (c(this.i, this.j)) {
            this.a = true;
            try {
                a(this.i, this.j);
                i();
                z2 = true;
            } catch (Throwable th) {
                i();
                throw th;
            }
        }
        k();
        m();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r2 != false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.util.ArrayList r17, java.util.ArrayList r18) {
        /*
            r16 = this;
            r0 = r16
            java.util.ArrayList r1 = r0.A
            if (r1 != 0) goto L_0x003d
            r1 = 0
        L_0x0007:
            r5 = 0
            r6 = r1
        L_0x0009:
            if (r5 >= r6) goto L_0x00f1
            r0 = r16
            java.util.ArrayList r1 = r0.A
            java.lang.Object r1 = r1.get(r5)
            lf r1 = (defpackage.lf) r1
            if (r17 == 0) goto L_0x0046
            boolean r2 = r1.a
            if (r2 != 0) goto L_0x0046
            kv r2 = r1.b
            r0 = r17
            int r2 = r0.indexOf(r2)
            r3 = -1
            if (r2 == r3) goto L_0x0046
            r0 = r18
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0046
            r1.b()
            r1 = r5
            r2 = r6
        L_0x0039:
            int r5 = r1 + 1
            r6 = r2
            goto L_0x0009
        L_0x003d:
            r0 = r16
            java.util.ArrayList r1 = r0.A
            int r1 = r1.size()
            goto L_0x0007
        L_0x0046:
            int r2 = r1.c
            if (r2 != 0) goto L_0x00d2
            r2 = 1
        L_0x004b:
            if (r2 != 0) goto L_0x00a1
            if (r17 == 0) goto L_0x00f2
            kv r11 = r1.b
            r9 = 0
            int r12 = r17.size()
            if (r12 == r9) goto L_0x00e8
            java.util.ArrayList r2 = r11.b
            int r13 = r2.size()
            r3 = -1
            r2 = 0
            r10 = r2
        L_0x0061:
            if (r10 >= r13) goto L_0x00e8
            java.util.ArrayList r2 = r11.b
            java.lang.Object r2 = r2.get(r10)
            kw r2 = (defpackage.kw) r2
            lc r4 = r2.b
            if (r4 == 0) goto L_0x00d5
            lc r2 = r2.b
            int r4 = r2.A
        L_0x0073:
            if (r4 == 0) goto L_0x00f6
            if (r4 == r3) goto L_0x00f6
            r8 = r9
        L_0x0078:
            if (r8 >= r12) goto L_0x00e1
            r0 = r17
            java.lang.Object r2 = r0.get(r8)
            kv r2 = (defpackage.kv) r2
            java.util.ArrayList r3 = r2.b
            int r14 = r3.size()
            r3 = 0
            r7 = r3
        L_0x008a:
            if (r7 >= r14) goto L_0x00dd
            java.util.ArrayList r3 = r2.b
            java.lang.Object r3 = r3.get(r7)
            kw r3 = (defpackage.kw) r3
            lc r15 = r3.b
            if (r15 == 0) goto L_0x00d7
            lc r3 = r3.b
            int r3 = r3.A
        L_0x009c:
            if (r3 != r4) goto L_0x00d9
            r2 = 1
        L_0x009f:
            if (r2 == 0) goto L_0x00f2
        L_0x00a1:
            r0 = r16
            java.util.ArrayList r2 = r0.A
            r2.remove(r5)
            int r3 = r5 + -1
            int r4 = r6 + -1
            if (r17 == 0) goto L_0x00ea
            boolean r2 = r1.a
            if (r2 != 0) goto L_0x00ea
            kv r2 = r1.b
            r0 = r17
            int r2 = r0.indexOf(r2)
            r5 = -1
            if (r2 == r5) goto L_0x00ea
            r0 = r18
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00ea
            r1.b()
            r1 = r3
            r2 = r4
            goto L_0x0039
        L_0x00d2:
            r2 = 0
            goto L_0x004b
        L_0x00d5:
            r4 = 0
            goto L_0x0073
        L_0x00d7:
            r3 = 0
            goto L_0x009c
        L_0x00d9:
            int r3 = r7 + 1
            r7 = r3
            goto L_0x008a
        L_0x00dd:
            int r2 = r8 + 1
            r8 = r2
            goto L_0x0078
        L_0x00e1:
            r2 = r4
        L_0x00e2:
            int r3 = r10 + 1
            r10 = r3
            r3 = r2
            goto L_0x0061
        L_0x00e8:
            r2 = 0
            goto L_0x009f
        L_0x00ea:
            r1.a()
            r1 = r3
            r2 = r4
            goto L_0x0039
        L_0x00f1:
            return
        L_0x00f2:
            r1 = r5
            r2 = r6
            goto L_0x0039
        L_0x00f6:
            r2 = r3
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.b(java.util.ArrayList, java.util.ArrayList):void");
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        int i2;
        int i3 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new java.lang.IllegalStateException("Internal error with the back stack records");
            }
            b(arrayList, arrayList2);
            int size = arrayList.size();
            int i4 = 0;
            while (i3 < size) {
                if (!((defpackage.kv) arrayList.get(i3)).s) {
                    if (i4 != i3) {
                        a(arrayList, arrayList2, i4, i3);
                    }
                    int i5 = i3 + 1;
                    if (((java.lang.Boolean) arrayList2.get(i3)).booleanValue()) {
                        while (i5 < size && ((java.lang.Boolean) arrayList2.get(i5)).booleanValue() && !((defpackage.kv) arrayList.get(i5)).s) {
                            i5++;
                        }
                    }
                    int i6 = i5;
                    a(arrayList, arrayList2, i3, i6);
                    i4 = i6;
                    i2 = i6 - 1;
                } else {
                    i2 = i3;
                }
                i3 = i2 + 1;
            }
            if (i4 != size) {
                a(arrayList, arrayList2, i4, size);
            }
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.ArrayList r18, java.util.ArrayList r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            java.lang.Object r2 = r0.get(r1)
            kv r2 = (defpackage.kv) r2
            boolean r10 = r2.s
            r0 = r17
            java.util.ArrayList r2 = r0.x
            if (r2 != 0) goto L_0x006c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = r17
            r0.x = r2
        L_0x001b:
            r0 = r17
            java.util.ArrayList r2 = r0.x
            r0 = r17
            java.util.ArrayList r3 = r0.b
            r2.addAll(r3)
            r0 = r17
            lc r4 = r0.g
            r9 = r20
        L_0x002c:
            r0 = r21
            if (r9 >= r0) goto L_0x0158
            r0 = r18
            java.lang.Object r2 = r0.get(r9)
            kv r2 = (defpackage.kv) r2
            r0 = r19
            java.lang.Object r3 = r0.get(r9)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0121
            r0 = r17
            java.util.ArrayList r11 = r0.x
            r3 = 0
            r5 = r4
            r4 = r3
        L_0x004d:
            java.util.ArrayList r3 = r2.b
            int r3 = r3.size()
            if (r4 >= r3) goto L_0x0152
            java.util.ArrayList r3 = r2.b
            java.lang.Object r3 = r3.get(r4)
            kw r3 = (defpackage.kw) r3
            int r6 = r3.a
            switch(r6) {
                case 1: goto L_0x0074;
                case 2: goto L_0x009f;
                case 3: goto L_0x007f;
                case 4: goto L_0x0062;
                case 5: goto L_0x0062;
                case 6: goto L_0x007f;
                case 7: goto L_0x0074;
                case 8: goto L_0x010a;
                default: goto L_0x0062;
            }
        L_0x0062:
            r16 = r4
            r4 = r5
            r5 = r16
        L_0x0067:
            int r3 = r5 + 1
            r5 = r4
            r4 = r3
            goto L_0x004d
        L_0x006c:
            r0 = r17
            java.util.ArrayList r2 = r0.x
            r2.clear()
            goto L_0x001b
        L_0x0074:
            lc r3 = r3.b
            r11.add(r3)
            r16 = r4
            r4 = r5
            r5 = r16
            goto L_0x0067
        L_0x007f:
            lc r6 = r3.b
            r11.remove(r6)
            lc r6 = r3.b
            if (r6 != r5) goto L_0x0062
            java.util.ArrayList r5 = r2.b
            kw r6 = new kw
            r7 = 9
            lc r3 = r3.b
            r6.<init>(r7, r3)
            r5.add(r4, r6)
            int r4 = r4 + 1
            r5 = 0
            r16 = r4
            r4 = r5
            r5 = r16
            goto L_0x0067
        L_0x009f:
            lc r12 = r3.b
            int r13 = r12.A
            r7 = 0
            int r6 = r11.size()
            int r6 = r6 + -1
            r8 = r6
            r6 = r5
            r5 = r4
        L_0x00ad:
            if (r8 < 0) goto L_0x00f4
            java.lang.Object r4 = r11.get(r8)
            lc r4 = (defpackage.lc) r4
            int r14 = r4.A
            if (r14 != r13) goto L_0x02d2
            if (r4 != r12) goto L_0x00c1
            r4 = 1
        L_0x00bc:
            int r7 = r8 + -1
            r8 = r7
            r7 = r4
            goto L_0x00ad
        L_0x00c1:
            if (r4 != r6) goto L_0x00d2
            java.util.ArrayList r6 = r2.b
            kw r14 = new kw
            r15 = 9
            r14.<init>(r15, r4)
            r6.add(r5, r14)
            int r5 = r5 + 1
            r6 = 0
        L_0x00d2:
            kw r14 = new kw
            r15 = 3
            r14.<init>(r15, r4)
            int r15 = r3.c
            r14.c = r15
            int r15 = r3.e
            r14.e = r15
            int r15 = r3.d
            r14.d = r15
            int r15 = r3.f
            r14.f = r15
            java.util.ArrayList r15 = r2.b
            r15.add(r5, r14)
            r11.remove(r4)
            int r5 = r5 + 1
            r4 = r7
            goto L_0x00bc
        L_0x00f4:
            if (r7 == 0) goto L_0x0101
            java.util.ArrayList r3 = r2.b
            r3.remove(r5)
            int r4 = r5 + -1
            r5 = r4
            r4 = r6
            goto L_0x0067
        L_0x0101:
            r4 = 1
            r3.a = r4
            r11.add(r12)
            r4 = r6
            goto L_0x0067
        L_0x010a:
            java.util.ArrayList r6 = r2.b
            kw r7 = new kw
            r8 = 9
            r7.<init>(r8, r5)
            r6.add(r4, r7)
            int r4 = r4 + 1
            lc r5 = r3.b
            r16 = r4
            r4 = r5
            r5 = r16
            goto L_0x0067
        L_0x0121:
            r0 = r17
            java.util.ArrayList r6 = r0.x
            r3 = 0
            r5 = r4
            r4 = r3
        L_0x0128:
            java.util.ArrayList r3 = r2.b
            int r3 = r3.size()
            if (r4 >= r3) goto L_0x0152
            java.util.ArrayList r3 = r2.b
            java.lang.Object r3 = r3.get(r4)
            kw r3 = (defpackage.kw) r3
            int r7 = r3.a
            switch(r7) {
                case 1: goto L_0x0141;
                case 2: goto L_0x013d;
                case 3: goto L_0x0147;
                case 4: goto L_0x013d;
                case 5: goto L_0x013d;
                case 6: goto L_0x0147;
                case 7: goto L_0x0141;
                case 8: goto L_0x0150;
                case 9: goto L_0x014d;
                default: goto L_0x013d;
            }
        L_0x013d:
            int r3 = r4 + 1
            r4 = r3
            goto L_0x0128
        L_0x0141:
            lc r3 = r3.b
            r6.remove(r3)
            goto L_0x013d
        L_0x0147:
            lc r3 = r3.b
            r6.add(r3)
            goto L_0x013d
        L_0x014d:
            lc r5 = r3.b
            goto L_0x013d
        L_0x0150:
            r5 = 0
            goto L_0x013d
        L_0x0152:
            int r2 = r9 + 1
            r9 = r2
            r4 = r5
            goto L_0x002c
        L_0x0158:
            r0 = r17
            java.util.ArrayList r2 = r0.x
            r2.clear()
            if (r10 != 0) goto L_0x016f
            r7 = 0
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            defpackage.mk.a(r2, r3, r4, r5, r6, r7)
        L_0x016f:
            r4 = r20
        L_0x0171:
            r0 = r21
            if (r4 >= r0) goto L_0x01a5
            r0 = r18
            java.lang.Object r2 = r0.get(r4)
            kv r2 = (defpackage.kv) r2
            r0 = r19
            java.lang.Object r3 = r0.get(r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x019d
            r3 = -1
            r2.a(r3)
            int r3 = r21 + -1
            if (r4 != r3) goto L_0x019b
            r3 = 1
        L_0x0194:
            r2.a(r3)
        L_0x0197:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x0171
        L_0x019b:
            r3 = 0
            goto L_0x0194
        L_0x019d:
            r3 = 1
            r2.a(r3)
            r2.e()
            goto L_0x0197
        L_0x01a5:
            if (r10 == 0) goto L_0x0264
            qt r9 = new qt
            r9.<init>()
            r0 = r17
            int r2 = r0.d
            if (r2 <= 0) goto L_0x01f6
            r0 = r17
            int r2 = r0.d
            r3 = 4
            int r4 = java.lang.Math.min(r2, r3)
            r0 = r17
            java.util.ArrayList r2 = r0.b
            int r11 = r2.size()
            r2 = 0
            r8 = r2
        L_0x01c5:
            if (r8 >= r11) goto L_0x01f6
            r0 = r17
            java.util.ArrayList r2 = r0.b
            java.lang.Object r3 = r2.get(r8)
            lc r3 = (defpackage.lc) r3
            int r2 = r3.d
            if (r2 >= r4) goto L_0x01f2
            int r5 = r3.D()
            int r6 = r3.E()
            r7 = 0
            r2 = r17
            r2.a(r3, r4, r5, r6, r7)
            android.view.View r2 = r3.J
            if (r2 == 0) goto L_0x01f2
            boolean r2 = r3.C
            if (r2 != 0) goto L_0x01f2
            boolean r2 = r3.O
            if (r2 == 0) goto L_0x01f2
            r9.add(r3)
        L_0x01f2:
            int r2 = r8 + 1
            r8 = r2
            goto L_0x01c5
        L_0x01f6:
            int r2 = r21 + -1
            r5 = r2
        L_0x01f9:
            r0 = r20
            if (r5 < r0) goto L_0x0242
            r0 = r18
            java.lang.Object r2 = r0.get(r5)
            r3 = r2
            kv r3 = (defpackage.kv) r3
            r0 = r19
            java.lang.Object r2 = r0.get(r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.booleanValue()
            r2 = 0
            r4 = r2
        L_0x0213:
            java.util.ArrayList r2 = r3.b
            int r2 = r2.size()
            if (r4 >= r2) goto L_0x023e
            java.util.ArrayList r2 = r3.b
            java.lang.Object r2 = r2.get(r4)
            kw r2 = (defpackage.kw) r2
            lc r2 = r2.b
            if (r2 == 0) goto L_0x023a
            boolean r6 = r2.m
            if (r6 == 0) goto L_0x023a
            android.view.View r6 = r2.J
            if (r6 == 0) goto L_0x023a
            boolean r6 = r2.D
            if (r6 != 0) goto L_0x023a
            boolean r6 = r2.C
            if (r6 != 0) goto L_0x023a
            r2.L()
        L_0x023a:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x0213
        L_0x023e:
            int r2 = r5 + -1
            r5 = r2
            goto L_0x01f9
        L_0x0242:
            int r4 = r9.size()
            r2 = 0
            r3 = r2
        L_0x0248:
            if (r3 >= r4) goto L_0x0264
            java.lang.Object[] r2 = r9.a
            r2 = r2[r3]
            lc r2 = (defpackage.lc) r2
            boolean r5 = r2.m
            if (r5 != 0) goto L_0x0260
            android.view.View r5 = r2.J
            float r6 = r5.getAlpha()
            r2.Q = r6
            r2 = 0
            r5.setAlpha(r2)
        L_0x0260:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x0248
        L_0x0264:
            r6 = r21
            r0 = r20
            if (r6 == r0) goto L_0x0282
            if (r10 == 0) goto L_0x0282
            r7 = 1
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            defpackage.mk.a(r2, r3, r4, r5, r6, r7)
            r0 = r17
            int r2 = r0.d
            r3 = 1
            r0 = r17
            r0.a(r2, r3)
        L_0x0282:
            r0 = r20
            r1 = r21
            if (r0 >= r1) goto L_0x02d1
            r0 = r18
            r1 = r20
            java.lang.Object r2 = r0.get(r1)
            kv r2 = (defpackage.kv) r2
            java.lang.Object r3 = r19.get(r20)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x02cb
            int r3 = r2.l
            if (r3 < 0) goto L_0x02cb
            int r3 = r2.l
            monitor-enter(r17)
            r0 = r17
            java.util.ArrayList r4 = r0.p     // Catch:{ all -> 0x02ce }
            r5 = 0
            r4.set(r3, r5)     // Catch:{ all -> 0x02ce }
            r0 = r17
            java.util.ArrayList r4 = r0.q     // Catch:{ all -> 0x02ce }
            if (r4 != 0) goto L_0x02bc
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02ce }
            r4.<init>()     // Catch:{ all -> 0x02ce }
            r0 = r17
            r0.q = r4     // Catch:{ all -> 0x02ce }
        L_0x02bc:
            r0 = r17
            java.util.ArrayList r4 = r0.q     // Catch:{ all -> 0x02ce }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02ce }
            r4.add(r3)     // Catch:{ all -> 0x02ce }
            monitor-exit(r17)     // Catch:{ all -> 0x02ce }
            r3 = -1
            r2.l = r3
        L_0x02cb:
            int r20 = r20 + 1
            goto L_0x0282
        L_0x02ce:
            r2 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x02ce }
            throw r2
        L_0x02d1:
            return
        L_0x02d2:
            r4 = r7
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.a(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* access modifiers changed from: private */
    public final void a(defpackage.kv kvVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            kvVar.a(z4);
        } else {
            kvVar.e();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        arrayList.add(kvVar);
        arrayList2.add(java.lang.Boolean.valueOf(z2));
        if (z3) {
            defpackage.mk.a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            a(this.d, true);
        }
        if (this.n != null) {
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment lcVar = (Fragment) this.n.valueAt(i2);
                if (lcVar != null && lcVar.J != null && lcVar.O && kvVar.b(lcVar.A)) {
                    if (lcVar.Q > 0.0f) {
                        lcVar.J.setAlpha(lcVar.Q);
                    }
                    if (z4) {
                        lcVar.Q = 0.0f;
                    } else {
                        lcVar.Q = -1.0f;
                        lcVar.O = false;
                    }
                }
            }
        }
    }

    private final void x() {
        if (this.A != null) {
            while (!this.A.isEmpty()) {
                ((defpackage.lf) this.A.remove(0)).a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean c(java.util.ArrayList r5, java.util.ArrayList r6) {
        /*
            r4 = this;
            r0 = 0
            monitor-enter(r4)
            java.util.ArrayList r1 = r4.l     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x000e
            java.util.ArrayList r1 = r4.l     // Catch:{ all -> 0x003c }
            int r1 = r1.size()     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
        L_0x000f:
            return r0
        L_0x0010:
            java.util.ArrayList r1 = r4.l     // Catch:{ all -> 0x003c }
            int r3 = r1.size()     // Catch:{ all -> 0x003c }
            r2 = r0
            r1 = r0
        L_0x0018:
            if (r2 >= r3) goto L_0x002b
            java.util.ArrayList r0 = r4.l     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x003c }
            mc r0 = (defpackage.mc) r0     // Catch:{ all -> 0x003c }
            boolean r0 = r0.a(r5, r6)     // Catch:{ all -> 0x003c }
            r1 = r1 | r0
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0018
        L_0x002b:
            java.util.ArrayList r0 = r4.l     // Catch:{ all -> 0x003c }
            r0.clear()     // Catch:{ all -> 0x003c }
            lm r0 = r4.e     // Catch:{ all -> 0x003c }
            android.os.Handler r0 = r0.c     // Catch:{ all -> 0x003c }
            java.lang.Runnable r2 = r4.B     // Catch:{ all -> 0x003c }
            r0.removeCallbacks(r2)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            r0 = r1
            goto L_0x000f
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* access modifiers changed from: 0000 */
    public final void k() {
        if (this.w) {
            this.w = false;
            v();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str, int i2, int i3) {
        int i4;
        if (this.c == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = this.c.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.c.remove(size));
            arrayList2.add(java.lang.Boolean.valueOf(true));
        } else {
            int i5 = -1;
            if (str != null || i2 >= 0) {
                int size2 = this.c.size() - 1;
                while (i4 >= 0) {
                    defpackage.kv kvVar = (defpackage.kv) this.c.get(i4);
                    if ((str != null && str.equals(kvVar.j)) || (i2 >= 0 && i2 == kvVar.l)) {
                        break;
                    }
                    size2 = i4 - 1;
                }
                if (i4 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    i4--;
                    while (i4 >= 0) {
                        defpackage.kv kvVar2 = (defpackage.kv) this.c.get(i4);
                        if ((str == null || !str.equals(kvVar2.j)) && (i2 < 0 || i2 != kvVar2.l)) {
                            break;
                        }
                        i4--;
                    }
                }
                i5 = i4;
            }
            if (i5 == this.c.size() - 1) {
                return false;
            }
            for (int size3 = this.c.size() - 1; size3 > i5; size3--) {
                arrayList.add(this.c.remove(size3));
                arrayList2.add(java.lang.Boolean.valueOf(true));
            }
        }
        return true;
    }

    static void a(defpackage.me meVar) {
        if (meVar != null) {
            java.util.List<Fragment> list = meVar.a;
            if (list != null) {
                for (Fragment lcVar : list) {
                    lcVar.F = true;
                }
            }
            java.util.List<defpackage.me> list2 = meVar.b;
            if (list2 != null) {
                for (defpackage.me a2 : list2) {
                    a(a2);
                }
            }
        }
    }

    private final void y() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        defpackage.me meVar;
        if (this.n != null) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            while (i2 < this.n.size()) {
                Fragment lcVar = (Fragment) this.n.valueAt(i2);
                if (lcVar != null) {
                    if (lcVar.E) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(lcVar);
                        lcVar.k = lcVar.j != null ? lcVar.j.g : -1;
                    }
                    if (lcVar.v != null) {
                        lcVar.v.y();
                        meVar = lcVar.v.k;
                    } else {
                        meVar = lcVar.w;
                    }
                    if (arrayList2 == null && meVar != null) {
                        arrayList2 = new java.util.ArrayList(this.n.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(meVar);
                    }
                    if (arrayList3 == null && lcVar.x != null) {
                        arrayList3 = new java.util.ArrayList(this.n.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(lcVar.x);
                    }
                }
                java.util.ArrayList arrayList4 = arrayList3;
                i2++;
                arrayList = arrayList;
                arrayList2 = arrayList2;
                arrayList3 = arrayList4;
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.k = null;
        } else {
            this.k = new defpackage.me(arrayList, arrayList2, arrayList3);
        }
    }

    private final void j(Fragment lcVar) {
        if (lcVar.K != null) {
            if (this.z == null) {
                this.z = new android.util.SparseArray();
            } else {
                this.z.clear();
            }
            lcVar.K.saveHierarchyState(this.z);
            if (this.z.size() > 0) {
                lcVar.f = this.z;
                this.z = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final android.os.Parcelable l() {
        int size;
        int[] iArr;
        boolean z2;
        android.os.Bundle bundle;
        defpackage.kx[] kxVarArr = null;
        x();
        if (this.n == null) {
            size = 0;
        } else {
            size = this.n.size();
        }
        for (int i2 = 0; i2 < size; i2++) {
            Fragment lcVar = (Fragment) this.n.valueAt(i2);
            if (lcVar != null) {
                if (lcVar.I() != null) {
                    int K = lcVar.K();
                    android.view.View I = lcVar.I();
                    android.view.animation.Animation animation = I.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        I.clearAnimation();
                    }
                    lcVar.a((android.view.View) null);
                    a(lcVar, K, 0, 0, false);
                } else if (lcVar.J() != null) {
                    lcVar.J().end();
                }
            }
        }
        j();
        this.h = true;
        this.k = null;
        if (this.n == null || this.n.size() <= 0) {
            return null;
        }
        int size2 = this.n.size();
        defpackage.mh[] mhVarArr = new defpackage.mh[size2];
        int i3 = 0;
        boolean z3 = false;
        while (i3 < size2) {
            Fragment lcVar2 = (Fragment) this.n.valueAt(i3);
            if (lcVar2 != null) {
                if (lcVar2.g < 0) {
                    a((java.lang.RuntimeException) new java.lang.IllegalStateException("Failure saving state: active " + lcVar2 + " has cleared index: " + lcVar2.g));
                }
                defpackage.mh mhVar = new defpackage.mh(lcVar2);
                mhVarArr[i3] = mhVar;
                if (lcVar2.d <= 0 || mhVar.k != null) {
                    mhVar.k = lcVar2.e;
                } else {
                    if (this.y == null) {
                        this.y = new android.os.Bundle();
                    }
                    android.os.Bundle bundle2 = this.y;
                    lcVar2.d(bundle2);
                    if (lcVar2.v != null) {
                        android.os.Parcelable l2 = lcVar2.v.l();
                        if (l2 != null) {
                            bundle2.putParcelable("android:support:fragments", l2);
                        }
                    }
                    d(lcVar2, this.y, false);
                    if (!this.y.isEmpty()) {
                        bundle = this.y;
                        this.y = null;
                    } else {
                        bundle = null;
                    }
                    if (lcVar2.J != null) {
                        j(lcVar2);
                    }
                    if (lcVar2.f != null) {
                        if (bundle == null) {
                            bundle = new android.os.Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", lcVar2.f);
                    }
                    if (!lcVar2.M) {
                        if (bundle == null) {
                            bundle = new android.os.Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", lcVar2.M);
                    }
                    mhVar.k = bundle;
                    if (lcVar2.j != null) {
                        if (lcVar2.j.g < 0) {
                            a((java.lang.RuntimeException) new java.lang.IllegalStateException("Failure saving state: " + lcVar2 + " has target not in fragment manager: " + lcVar2.j));
                        }
                        if (mhVar.k == null) {
                            mhVar.k = new android.os.Bundle();
                        }
                        android.os.Bundle bundle3 = mhVar.k;
                        java.lang.String str = "android:target_state";
                        Fragment lcVar3 = lcVar2.j;
                        if (lcVar3.g < 0) {
                            a((java.lang.RuntimeException) new java.lang.IllegalStateException("Fragment " + lcVar3 + " is not currently in the FragmentManager"));
                        }
                        bundle3.putInt(str, lcVar3.g);
                        if (lcVar2.l != 0) {
                            mhVar.k.putInt("android:target_req_state", lcVar2.l);
                            z2 = true;
                        }
                    }
                }
                z2 = true;
            } else {
                z2 = z3;
            }
            i3++;
            z3 = z2;
        }
        if (!z3) {
            return null;
        }
        int size3 = this.b.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                iArr[i4] = ((Fragment) this.b.get(i4)).g;
                if (iArr[i4] < 0) {
                    a((java.lang.RuntimeException) new java.lang.IllegalStateException("Failure saving state: active " + this.b.get(i4) + " has cleared index: " + iArr[i4]));
                }
            }
        } else {
            iArr = null;
        }
        if (this.c != null) {
            int size4 = this.c.size();
            if (size4 > 0) {
                kxVarArr = new defpackage.kx[size4];
                for (int i5 = 0; i5 < size4; i5++) {
                    kxVarArr[i5] = new defpackage.kx((defpackage.kv) this.c.get(i5));
                }
            }
        }
        defpackage.mf mfVar = new defpackage.mf();
        mfVar.a = mhVarArr;
        mfVar.b = iArr;
        mfVar.c = kxVarArr;
        if (this.g != null) {
            mfVar.d = this.g.g;
        }
        mfVar.e = this.m;
        y();
        return mfVar;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.os.Parcelable parcelable, defpackage.me meVar) {
        java.util.List list;
        java.util.List list2;
        defpackage.me meVar2;
        if (parcelable != null) {
            defpackage.mf mfVar = (defpackage.mf) parcelable;
            if (mfVar.a != null) {
                if (meVar != null) {
                    java.util.List list3 = meVar.a;
                    java.util.List list4 = meVar.b;
                    java.util.List list5 = meVar.c;
                    int i2 = list3 != null ? list3.size() : 0;
                    for (int i3 = 0; i3 < i2; i3++) {
                        Fragment lcVar = (Fragment) list3.get(i3);
                        int i4 = 0;
                        while (i4 < mfVar.a.length && mfVar.a[i4].b != lcVar.g) {
                            i4++;
                        }
                        if (i4 == mfVar.a.length) {
                            a((java.lang.RuntimeException) new java.lang.IllegalStateException("Could not find active fragment with index " + lcVar.g));
                        }
                        defpackage.mh mhVar = mfVar.a[i4];
                        mhVar.l = lcVar;
                        lcVar.f = null;
                        lcVar.s = 0;
                        lcVar.p = false;
                        lcVar.m = false;
                        lcVar.j = null;
                        if (mhVar.k != null) {
                            mhVar.k.setClassLoader(this.e.mContext.getClassLoader());
                            lcVar.f = mhVar.k.getSparseParcelableArray("android:view_state");
                            lcVar.e = mhVar.k;
                        }
                    }
                    list2 = list5;
                    list = list4;
                } else {
                    list = null;
                    list2 = null;
                }
                this.n = new android.util.SparseArray(mfVar.a.length);
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 >= mfVar.a.length) {
                        break;
                    }
                    defpackage.mh mhVar2 = mfVar.a[i6];
                    if (mhVar2 != null) {
                        if (list == null || i6 >= list.size()) {
                            meVar2 = null;
                        } else {
                            meVar2 = (defpackage.me) list.get(i6);
                        }
                        ViewModelStore gtVar = null;
                        if (list2 != null && i6 < list2.size()) {
                            gtVar = (ViewModelStore) list2.get(i6);
                        }
                        FragmentHostCallback lmVar = this.e;
                        FragmentContainer lkVar = this.f;
                        Fragment lcVar2 = this.s;
                        if (mhVar2.l == null) {
                            android.content.Context context = lmVar.mContext;
                            if (mhVar2.i != null) {
                                mhVar2.i.setClassLoader(context.getClassLoader());
                            }
                            if (lkVar != null) {
                                mhVar2.l = lkVar.instantiate(context, mhVar2.a, mhVar2.i);
                            } else {
                                mhVar2.l = Fragment.instantiate(context, mhVar2.a, mhVar2.i);
                            }
                            if (mhVar2.k != null) {
                                mhVar2.k.setClassLoader(context.getClassLoader());
                                mhVar2.l.e = mhVar2.k;
                            }
                            mhVar2.l.a(mhVar2.b, lcVar2);
                            mhVar2.l.o = mhVar2.c;
                            mhVar2.l.q = true;
                            mhVar2.l.z = mhVar2.d;
                            mhVar2.l.A = mhVar2.e;
                            mhVar2.l.B = mhVar2.f;
                            mhVar2.l.E = mhVar2.g;
                            mhVar2.l.D = mhVar2.h;
                            mhVar2.l.C = mhVar2.j;
                            mhVar2.l.t = lmVar.mFragmentManager;
                        }
                        mhVar2.l.w = meVar2;
                        mhVar2.l.x = gtVar;
                        Fragment lcVar3 = mhVar2.l;
                        this.n.put(lcVar3.g, lcVar3);
                        mhVar2.l = null;
                    }
                    i5 = i6 + 1;
                }
                if (meVar != null) {
                    java.util.List list6 = meVar.a;
                    int i7 = list6 != null ? list6.size() : 0;
                    for (int i8 = 0; i8 < i7; i8++) {
                        Fragment lcVar4 = (Fragment) list6.get(i8);
                        if (lcVar4.k >= 0) {
                            lcVar4.j = (Fragment) this.n.get(lcVar4.k);
                            if (lcVar4.j == null) {
                                android.util.Log.w("FragmentManager", "Re-attaching retained fragment " + lcVar4 + " target no longer exists: " + lcVar4.k);
                            }
                        }
                    }
                }
                this.b.clear();
                if (mfVar.b != null) {
                    for (int i9 = 0; i9 < mfVar.b.length; i9++) {
                        Fragment lcVar5 = (Fragment) this.n.get(mfVar.b[i9]);
                        if (lcVar5 == null) {
                            a((java.lang.RuntimeException) new java.lang.IllegalStateException("No instantiated fragment for index #" + mfVar.b[i9]));
                        }
                        lcVar5.m = true;
                        if (this.b.contains(lcVar5)) {
                            throw new java.lang.IllegalStateException("Already added!");
                        }
                        synchronized (this.b) {
                            this.b.add(lcVar5);
                        }
                    }
                }
                if (mfVar.c != null) {
                    this.c = new java.util.ArrayList(mfVar.c.length);
                    for (defpackage.kx kxVar : mfVar.c) {
                        defpackage.kv kvVar = new defpackage.kv(this);
                        int i10 = 0;
                        while (i10 < kxVar.a.length) {
                            defpackage.kw kwVar = new defpackage.kw();
                            int i11 = i10 + 1;
                            kwVar.a = kxVar.a[i10];
                            int i12 = i11 + 1;
                            int i13 = kxVar.a[i11];
                            if (i13 >= 0) {
                                kwVar.b = (Fragment) this.n.get(i13);
                            } else {
                                kwVar.b = null;
                            }
                            int i14 = i12 + 1;
                            kwVar.c = kxVar.a[i12];
                            int i15 = i14 + 1;
                            kwVar.d = kxVar.a[i14];
                            int i16 = i15 + 1;
                            kwVar.e = kxVar.a[i15];
                            i10 = i16 + 1;
                            kwVar.f = kxVar.a[i16];
                            kvVar.c = kwVar.c;
                            kvVar.d = kwVar.d;
                            kvVar.e = kwVar.e;
                            kvVar.f = kwVar.f;
                            kvVar.a(kwVar);
                        }
                        kvVar.g = kxVar.b;
                        kvVar.h = kxVar.c;
                        kvVar.j = kxVar.d;
                        kvVar.l = kxVar.e;
                        kvVar.i = true;
                        kvVar.m = kxVar.f;
                        kvVar.n = kxVar.g;
                        kvVar.o = kxVar.h;
                        kvVar.p = kxVar.i;
                        kvVar.q = kxVar.j;
                        kvVar.r = kxVar.k;
                        kvVar.s = kxVar.l;
                        kvVar.a(1);
                        this.c.add(kvVar);
                        if (kvVar.l >= 0) {
                            int i17 = kvVar.l;
                            synchronized (this) {
                                if (this.p == null) {
                                    this.p = new java.util.ArrayList();
                                }
                                int size = this.p.size();
                                if (i17 < size) {
                                    this.p.set(i17, kvVar);
                                } else {
                                    while (size < i17) {
                                        this.p.add(null);
                                        if (this.q == null) {
                                            this.q = new java.util.ArrayList();
                                        }
                                        this.q.add(java.lang.Integer.valueOf(size));
                                        size++;
                                    }
                                    this.p.add(kvVar);
                                }
                            }
                        }
                    }
                } else {
                    this.c = null;
                }
                if (mfVar.d >= 0) {
                    this.g = (Fragment) this.n.get(mfVar.d);
                }
                this.m = mfVar.e;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void m() {
        if (this.n != null) {
            for (int size = this.n.size() - 1; size >= 0; size--) {
                if (this.n.valueAt(size) == null) {
                    this.n.delete(this.n.keyAt(size));
                }
            }
        }
    }

    public final void a(FragmentHostCallback lmVar, FragmentContainer lkVar, Fragment lcVar) {
        if (this.e != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.e = lmVar;
        this.f = lkVar;
        this.s = lcVar;
    }

    public final void noteStateNotSaved() {
        this.k = null;
        this.h = false;
        this.u = false;
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment lcVar = (Fragment) this.b.get(i2);
            if (!(lcVar == null || lcVar.v == null)) {
                lcVar.v.noteStateNotSaved();
            }
        }
    }

    public final void n() {
        this.h = false;
        this.u = false;
        c(1);
    }

    public final void o() {
        this.h = false;
        this.u = false;
        c(2);
    }

    public final void p() {
        this.h = false;
        this.u = false;
        c(4);
    }

    public final void q() {
        this.h = false;
        this.u = false;
        c(5);
    }

    public final void r() {
        this.u = true;
        c(3);
    }

    public final void s() {
        this.v = true;
        j();
        c(0);
        this.e = null;
        this.f = null;
        this.s = null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public final void c(int i2) {
        try {
            this.a = true;
            a(i2, false);
            this.a = false;
            j();
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public final void b(boolean z2) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            Fragment lcVar = (Fragment) this.b.get(size);
            if (!(lcVar == null || lcVar.v == null)) {
                lcVar.v.b(z2);
            }
        }
    }

    public final void c(boolean z2) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            Fragment lcVar = (Fragment) this.b.get(size);
            if (!(lcVar == null || lcVar.v == null)) {
                lcVar.v.c(z2);
            }
        }
    }

    public final void a(android.content.res.Configuration configuration) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.b.size()) {
                Fragment lcVar = (Fragment) this.b.get(i3);
                if (lcVar != null) {
                    lcVar.onConfigurationChanged(configuration);
                    if (lcVar.v != null) {
                        lcVar.v.a(configuration);
                    }
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    public final void t() {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.b.size()) {
                Fragment lcVar = (Fragment) this.b.get(i3);
                if (lcVar != null) {
                    lcVar.onLowMemory();
                    if (lcVar.v != null) {
                        lcVar.v.t();
                    }
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    public final boolean a(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        boolean z2;
        if (this.d <= 0) {
            return false;
        }
        java.util.ArrayList arrayList = null;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.b.size()) {
            Fragment lcVar = (Fragment) this.b.get(i2);
            if (lcVar != null) {
                if (lcVar.C || lcVar.v == null) {
                    z2 = false;
                } else {
                    z2 = lcVar.v.a(menu, menuInflater) | false;
                }
                if (z2) {
                    z3 = true;
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(lcVar);
                }
            }
            i2++;
            z3 = z3;
        }
        if (this.o != null) {
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                Fragment lcVar2 = (Fragment) this.o.get(i3);
                if (arrayList == null || !arrayList.contains(lcVar2)) {
                    Fragment.v();
                }
            }
        }
        this.o = arrayList;
        return z3;
    }

    public final boolean a(android.view.Menu menu) {
        boolean z2;
        if (this.d <= 0) {
            return false;
        }
        boolean z3 = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            Fragment lcVar = (Fragment) this.b.get(i2);
            if (lcVar != null) {
                if (lcVar.C || lcVar.v == null) {
                    z2 = false;
                } else {
                    z2 = lcVar.v.a(menu) | false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final boolean a(android.view.MenuItem menuItem) {
        boolean z2;
        if (this.d <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            Fragment lcVar = (Fragment) this.b.get(i2);
            if (lcVar != null) {
                if (lcVar.C || lcVar.v == null || !lcVar.v.a(menuItem)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(android.view.MenuItem menuItem) {
        boolean z2;
        if (this.d <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            Fragment lcVar = (Fragment) this.b.get(i2);
            if (lcVar != null) {
                if (lcVar.C || lcVar.v == null || !lcVar.v.b(menuItem)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(android.view.Menu menu) {
        if (this.d > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.b.size()) {
                    Fragment lcVar = (Fragment) this.b.get(i3);
                    if (!(lcVar == null || lcVar.C || lcVar.v == null)) {
                        lcVar.v.b(menu);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Fragment lcVar) {
        if (lcVar == null || (this.n.get(lcVar.g) == lcVar && (lcVar.u == null || lcVar.t == this))) {
            this.g = lcVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("Fragment " + lcVar + " is not an active fragment of FragmentManager " + this);
    }

    private final void a(Fragment lcVar, android.content.Context context, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.a(lcVar, context, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void b(Fragment lcVar, android.content.Context context, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.b(lcVar, context, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void a(Fragment lcVar, android.os.Bundle bundle, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.a(lcVar, bundle, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void b(Fragment lcVar, android.os.Bundle bundle, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.b(lcVar, bundle, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void c(Fragment lcVar, android.os.Bundle bundle, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.c(lcVar, bundle, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void a(Fragment lcVar, android.view.View view, android.os.Bundle bundle, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.a(lcVar, view, bundle, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void b(Fragment lcVar, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.b(lcVar, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void c(Fragment lcVar, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.c(lcVar, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void d(Fragment lcVar, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.d(lcVar, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void e(Fragment lcVar, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.e(lcVar, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void d(Fragment lcVar, android.os.Bundle bundle, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.d(lcVar, bundle, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void f(Fragment lcVar, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.f(lcVar, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void g(Fragment lcVar, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.g(lcVar, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void h(Fragment lcVar, boolean z2) {
        if (this.s != null) {
            FragmentManagerImpl lpVar = this.s.t;
            if (lpVar instanceof FragmentManagerImpl) {
                lpVar.h(lcVar, true);
            }
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            defpackage.rf rfVar = (defpackage.rf) it.next();
            if (z2) {
                ((java.lang.Boolean) rfVar.a).booleanValue();
            }
        }
    }

    public static int d(int i2) {
        switch (i2) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        java.lang.String str2;
        int i2;
        Fragment lcVar;
        int i3;
        if (!"fragment".equals(str)) {
            return null;
        }
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.mb.a);
        if (attributeValue == null) {
            str2 = obtainStyledAttributes.getString(0);
        } else {
            str2 = attributeValue;
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        java.lang.String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.a(this.e.mContext, str2)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        } else {
            i2 = 0;
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment lcVar2 = resourceId != -1 ? findFragmentById(resourceId) : null;
        if (lcVar2 == null && string != null) {
            lcVar2 = a(string);
        }
        if (lcVar2 == null && i2 != -1) {
            lcVar2 = findFragmentById(i2);
        }
        if (lcVar2 == null) {
            Fragment a2 = this.f.instantiate(context, str2, null);
            a2.o = true;
            if (resourceId != 0) {
                i3 = resourceId;
            } else {
                i3 = i2;
            }
            a2.z = i3;
            a2.A = i2;
            a2.B = string;
            a2.p = true;
            a2.t = this;
            a2.u = this.e;
            android.os.Bundle bundle = a2.e;
            a2.o();
            a(a2, true);
            lcVar = a2;
        } else if (lcVar2.p) {
            throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + java.lang.Integer.toHexString(i2) + " with another fragment for " + str2);
        } else {
            lcVar2.p = true;
            lcVar2.u = this.e;
            if (!lcVar2.F) {
                android.os.Bundle bundle2 = lcVar2.e;
                lcVar2.o();
            }
            lcVar = lcVar2;
        }
        if (this.d > 0 || !lcVar.o) {
            i(lcVar);
        } else {
            a(lcVar, 1, 0, 0, false);
        }
        if (lcVar.J == null) {
            throw new java.lang.IllegalStateException("Fragment " + str2 + " did not create a view.");
        }
        if (resourceId != 0) {
            lcVar.J.setId(resourceId);
        }
        if (lcVar.J.getTag() == null) {
            lcVar.J.setTag(string);
        }
        return lcVar.J;
    }

    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    static {
        new android.view.animation.AccelerateInterpolator(2.5f);
        new android.view.animation.AccelerateInterpolator(1.5f);
    }
}
