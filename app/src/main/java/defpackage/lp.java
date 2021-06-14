package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: lp */
//FragmentManagerImpl
public final class lp extends ln implements LayoutInflater.Factory2 {
    private static final Interpolator C = new DecelerateInterpolator(2.5f);
    private static final Interpolator D = new DecelerateInterpolator(1.5f);
    private static Field t = null;
    private ArrayList A;
    private Runnable B = new lq(this);
    public boolean a;
    public final ArrayList b = new ArrayList();
    public ArrayList c;
    public int d = 0;
    public lm e;
    public lk f;
    public lc g;
    public boolean h;
    public ArrayList i;
    public ArrayList j;
    public me k;
    private ArrayList l;
    private int m = 0;
    private SparseArray n;
    private ArrayList o;
    private ArrayList p;
    private ArrayList q;
    private final CopyOnWriteArrayList r = new CopyOnWriteArrayList();
    private lc s;
    private boolean u;
    private boolean v;
    private boolean w;
    private ArrayList x;
    private Bundle y = null;
    private SparseArray z = null;

    lp() {
    }

    private static boolean a(Animator animator) {
        PropertyValuesHolder[] values;
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
            return false;
        } else if (!(animator instanceof AnimatorSet)) {
            return false;
        } else {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (a(childAnimations.get(i2))) {
                    return true;
                }
            }
            return false;
        }
    }

    private final void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new qw());
        if (this.e != null) {
            try {
                this.e.a("  ", printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    @Override // defpackage.ln
    public final mj a() {
        return new kv(this);
    }

    @Override // defpackage.ln
    public final boolean b() {
        boolean j2 = j();
        x();
        return j2;
    }

    @Override // defpackage.ln
    public final void c() {
        a((mc) new md(this, -1, 0), false);
    }

    @Override // defpackage.ln
    public final boolean d() {
        w();
        return u();
    }

    @Override // defpackage.ln
    public final void e() {
        a((mc) new md(this, -1, 1), false);
    }

    @Override // defpackage.ln
    public final void b(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Bad id: " + i2);
        }
        a((mc) new md(this, i2, 1), false);
    }

    private final boolean u() {
        lp lpVar;
        j();
        a(true);
        if (this.g != null && (lpVar = this.g.v) != null && lpVar.d()) {
            return true;
        }
        boolean a2 = a(this.i, this.j, (String) null, -1, 0);
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

    @Override // defpackage.ln
    public final int f() {
        if (this.c != null) {
            return this.c.size();
        }
        return 0;
    }

    private final lc a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        lc lcVar = (lc) this.n.get(i2);
        if (lcVar != null) {
            return lcVar;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        return lcVar;
    }

    @Override // defpackage.ln
    public final List g() {
        List list;
        if (this.b.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.b) {
            list = (List) this.b.clone();
        }
        return list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.s != null) {
            jd.a((Object) this.s, sb);
        } else {
            jd.a((Object) this.e, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // defpackage.ln
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        String str2;
        int size4;
        int size5;
        String str3 = str + "    ";
        if (this.n != null && (size5 = this.n.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                lc lcVar = (lc) this.n.valueAt(i2);
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
        int size6 = this.b.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(((lc) this.b.get(i3)).toString());
            }
        }
        if (this.o != null && (size4 = this.o.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(((lc) this.o.get(i4)).toString());
            }
        }
        if (this.c != null && (size3 = this.c.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                kv kvVar = (kv) this.c.get(i5);
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
                    printWriter.print(Integer.toHexString(kvVar.g));
                    printWriter.print(" mTransitionStyle=#");
                    printWriter.println(Integer.toHexString(kvVar.h));
                }
                if (!(kvVar.c == 0 && kvVar.d == 0)) {
                    printWriter.print(str3);
                    printWriter.print("mEnterAnim=#");
                    printWriter.print(Integer.toHexString(kvVar.c));
                    printWriter.print(" mExitAnim=#");
                    printWriter.println(Integer.toHexString(kvVar.d));
                }
                if (!(kvVar.e == 0 && kvVar.f == 0)) {
                    printWriter.print(str3);
                    printWriter.print("mPopEnterAnim=#");
                    printWriter.print(Integer.toHexString(kvVar.e));
                    printWriter.print(" mPopExitAnim=#");
                    printWriter.println(Integer.toHexString(kvVar.f));
                }
                if (!(kvVar.m == 0 && kvVar.n == null)) {
                    printWriter.print(str3);
                    printWriter.print("mBreadCrumbTitleRes=#");
                    printWriter.print(Integer.toHexString(kvVar.m));
                    printWriter.print(" mBreadCrumbTitleText=");
                    printWriter.println(kvVar.n);
                }
                if (!(kvVar.o == 0 && kvVar.p == null)) {
                    printWriter.print(str3);
                    printWriter.print("mBreadCrumbShortTitleRes=#");
                    printWriter.print(Integer.toHexString(kvVar.o));
                    printWriter.print(" mBreadCrumbShortTitleText=");
                    printWriter.println(kvVar.p);
                }
                if (!kvVar.b.isEmpty()) {
                    printWriter.print(str3);
                    printWriter.println("Operations:");
                    new StringBuilder().append(str3).append("    ");
                    int size7 = kvVar.b.size();
                    for (int i6 = 0; i6 < size7; i6++) {
                        kw kwVar = (kw) kvVar.b.get(i6);
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
                            printWriter.print(Integer.toHexString(kwVar.c));
                            printWriter.print(" exitAnim=#");
                            printWriter.println(Integer.toHexString(kwVar.d));
                        }
                        if (kwVar.e != 0 || kwVar.f != 0) {
                            printWriter.print(str3);
                            printWriter.print("popEnterAnim=#");
                            printWriter.print(Integer.toHexString(kwVar.e));
                            printWriter.print(" popExitAnim=#");
                            printWriter.println(Integer.toHexString(kwVar.f));
                        }
                    }
                }
            }
        }
        synchronized (this) {
            if (this.p != null && (size2 = this.p.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i7 = 0; i7 < size2; i7++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i7);
                    printWriter.print(": ");
                    printWriter.println((kv) this.p.get(i7));
                }
            }
            if (this.q != null && this.q.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.q.toArray()));
            }
        }
        if (this.l != null && (size = this.l.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i8 = 0; i8 < size; i8++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println((mc) this.l.get(i8));
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

    private static ly a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(C);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(D);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new ly(animationSet);
    }

    private static ly a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(D);
        alphaAnimation.setDuration(220);
        return new ly(alphaAnimation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d A[SYNTHETIC, Splitter:B:11:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ly a(defpackage.lc r11, int r12, boolean r13, int r14) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.a(lc, int, boolean, int):ly");
    }

    private static void a(View view, ly lyVar) {
        boolean a2;
        boolean z2 = false;
        if (view != null && lyVar != null) {
            if (view != null && lyVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && sn.a.i(view)) {
                if (lyVar.a instanceof AlphaAnimation) {
                    a2 = true;
                } else if (lyVar.a instanceof AnimationSet) {
                    List<Animation> animations = ((AnimationSet) lyVar.a).getAnimations();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= animations.size()) {
                            a2 = false;
                            break;
                        } else if (animations.get(i2) instanceof AlphaAnimation) {
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
                lyVar.b.addListener(new lz(view));
                return;
            }
            Animation.AnimationListener a3 = a(lyVar.a);
            view.setLayerType(2, null);
            lyVar.a.setAnimationListener(new lv(view, a3));
        }
    }

    private static Animation.AnimationListener a(Animation animation) {
        try {
            if (t == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                t = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) t.get(animation);
        } catch (NoSuchFieldException e2) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e3);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.lc r11, int r12, int r13, int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 1684
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.a(lc, int, int, int, boolean):void");
    }

    private final void i(lc lcVar) {
        a(lcVar, this.d, 0, 0, false);
    }

    public final void a(lc lcVar) {
        boolean z2;
        int i2;
        lc lcVar2;
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (lcVar != null) {
            int i3 = this.d;
            if (lcVar.n) {
                if (lcVar.h()) {
                    i3 = Math.min(i3, 1);
                } else {
                    i3 = Math.min(i3, 0);
                }
            }
            a(lcVar, i3, lcVar.E(), lcVar.F(), false);
            if (lcVar.J != null) {
                ViewGroup viewGroup2 = lcVar.I;
                View view = lcVar.J;
                if (viewGroup2 != null && view != null) {
                    int indexOf = this.b.indexOf(lcVar) - 1;
                    while (true) {
                        if (indexOf < 0) {
                            lcVar2 = null;
                            break;
                        }
                        lcVar2 = (lc) this.b.get(indexOf);
                        if (lcVar2.I == viewGroup2 && lcVar2.J != null) {
                            break;
                        }
                        indexOf--;
                    }
                } else {
                    lcVar2 = null;
                }
                if (lcVar2 != null && (indexOfChild2 = viewGroup.indexOfChild(lcVar.J)) < (indexOfChild = (viewGroup = lcVar.I).indexOfChild(lcVar2.J))) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(lcVar.J, indexOfChild);
                }
                if (lcVar.O && lcVar.I != null) {
                    if (lcVar.Q > 0.0f) {
                        lcVar.J.setAlpha(lcVar.Q);
                    }
                    lcVar.Q = 0.0f;
                    lcVar.O = false;
                    ly a2 = a(lcVar, lcVar.E(), true, lcVar.F());
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
                    ly a3 = a(lcVar, E, z2, lcVar.F());
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
                            ViewGroup viewGroup3 = lcVar.I;
                            View view2 = lcVar.J;
                            viewGroup3.startViewTransition(view2);
                            a3.b.addListener(new lu(viewGroup3, view2, lcVar));
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
                lc.m();
            }
        }
    }

    public final void a(int i2, boolean z2) {
        if (this.e == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.d) {
            this.d = i2;
            if (this.n != null) {
                int size = this.b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    a((lc) this.b.get(i3));
                }
                int size2 = this.n.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    lc lcVar = (lc) this.n.valueAt(i4);
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
                lc lcVar = (lc) this.n.valueAt(i2);
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

    public final void b(lc lcVar) {
        if (lcVar.g < 0) {
            int i2 = this.m;
            this.m = i2 + 1;
            lcVar.a(i2, this.s);
            if (this.n == null) {
                this.n = new SparseArray();
            }
            this.n.put(lcVar.g, lcVar);
        }
    }

    public final void a(lc lcVar, boolean z2) {
        b(lcVar);
        if (lcVar.D) {
            return;
        }
        if (this.b.contains(lcVar)) {
            throw new IllegalStateException("Fragment already added: " + lcVar);
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

    public final void c(lc lcVar) {
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

    public static void d(lc lcVar) {
        boolean z2 = true;
        if (!lcVar.C) {
            lcVar.C = true;
            if (lcVar.P) {
                z2 = false;
            }
            lcVar.P = z2;
        }
    }

    public static void e(lc lcVar) {
        boolean z2 = false;
        if (lcVar.C) {
            lcVar.C = false;
            if (!lcVar.P) {
                z2 = true;
            }
            lcVar.P = z2;
        }
    }

    public final void f(lc lcVar) {
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

    public final void g(lc lcVar) {
        if (lcVar.D) {
            lcVar.D = false;
            if (lcVar.m) {
                return;
            }
            if (this.b.contains(lcVar)) {
                throw new IllegalStateException("Fragment already added: " + lcVar);
            }
            synchronized (this.b) {
                this.b.add(lcVar);
            }
            lcVar.m = true;
            boolean z2 = lcVar.G;
        }
    }

    @Override // defpackage.ln
    public final lc a(int i2) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            lc lcVar = (lc) this.b.get(size);
            if (lcVar != null && lcVar.z == i2) {
                return lcVar;
            }
        }
        if (this.n != null) {
            for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
                lc lcVar2 = (lc) this.n.valueAt(size2);
                if (lcVar2 != null && lcVar2.z == i2) {
                    return lcVar2;
                }
            }
        }
        return null;
    }

    @Override // defpackage.ln
    public final lc a(String str) {
        if (str != null) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                lc lcVar = (lc) this.b.get(size);
                if (lcVar != null && str.equals(lcVar.B)) {
                    return lcVar;
                }
            }
        }
        if (!(this.n == null || str == null)) {
            for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
                lc lcVar2 = (lc) this.n.valueAt(size2);
                if (lcVar2 != null && str.equals(lcVar2.B)) {
                    return lcVar2;
                }
            }
        }
        return null;
    }

    public final lc b(String str) {
        if (!(this.n == null || str == null)) {
            for (int size = this.n.size() - 1; size >= 0; size--) {
                lc lcVar = (lc) this.n.valueAt(size);
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
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    @Override // defpackage.ln
    public final boolean h() {
        return this.h || this.u;
    }

    public final void a(mc mcVar, boolean z2) {
        boolean z3 = true;
        if (!z2) {
            w();
        }
        synchronized (this) {
            if (!this.v && this.e != null) {
                if (this.l == null) {
                    this.l = new ArrayList();
                }
                this.l.add(mcVar);
                synchronized (this) {
                    boolean z4 = this.A != null && !this.A.isEmpty();
                    if (this.l == null || this.l.size() != 1) {
                        z3 = false;
                    }
                    if (z4 || z3) {
                        this.e.c.removeCallbacks(this.B);
                        this.e.c.post(this.B);
                    }
                }
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final int a(kv kvVar) {
        int i2;
        synchronized (this) {
            if (this.q == null || this.q.size() <= 0) {
                if (this.p == null) {
                    this.p = new ArrayList();
                }
                i2 = this.p.size();
                this.p.add(kvVar);
            } else {
                i2 = ((Integer) this.q.remove(this.q.size() - 1)).intValue();
                this.p.set(i2, kvVar);
            }
        }
        return i2;
    }

    public final void a(boolean z2) {
        if (this.a) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.e == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() != this.e.c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z2) {
                w();
            }
            if (this.i == null) {
                this.i = new ArrayList();
                this.j = new ArrayList();
            }
            this.a = true;
            try {
                b((ArrayList) null, (ArrayList) null);
            } finally {
                this.a = false;
            }
        }
    }

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
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.b(java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int i3 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            b(arrayList, arrayList2);
            int size = arrayList.size();
            int i4 = 0;
            while (i3 < size) {
                if (!((kv) arrayList.get(i3)).s) {
                    if (i4 != i3) {
                        a(arrayList, arrayList2, i4, i3);
                    }
                    int i5 = i3 + 1;
                    if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                        while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((kv) arrayList.get(i5)).s) {
                            i5++;
                        }
                    }
                    a(arrayList, arrayList2, i3, i5);
                    int i6 = i5 - 1;
                    i4 = i5;
                    i2 = i6;
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

    private final void a(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        lc lcVar;
        int i4;
        boolean z2;
        boolean z3 = ((kv) arrayList.get(i2)).s;
        if (this.x == null) {
            this.x = new ArrayList();
        } else {
            this.x.clear();
        }
        this.x.addAll(this.b);
        lc lcVar2 = this.g;
        int i5 = i2;
        while (i5 < i3) {
            kv kvVar = (kv) arrayList.get(i5);
            if (!((Boolean) arrayList2.get(i5)).booleanValue()) {
                ArrayList arrayList3 = this.x;
                int i6 = 0;
                while (true) {
                    lcVar = lcVar2;
                    if (i6 < kvVar.b.size()) {
                        kw kwVar = (kw) kvVar.b.get(i6);
                        switch (kwVar.a) {
                            case 1:
                            case 7:
                                arrayList3.add(kwVar.b);
                                lcVar2 = lcVar;
                                i4 = i6;
                                break;
                            case 2:
                                lc lcVar3 = kwVar.b;
                                int i7 = lcVar3.A;
                                boolean z4 = false;
                                int size = arrayList3.size() - 1;
                                lc lcVar4 = lcVar;
                                i4 = i6;
                                while (size >= 0) {
                                    lc lcVar5 = (lc) arrayList3.get(size);
                                    if (lcVar5.A != i7) {
                                        z2 = z4;
                                    } else if (lcVar5 == lcVar3) {
                                        z2 = true;
                                    } else {
                                        if (lcVar5 == lcVar4) {
                                            kvVar.b.add(i4, new kw(9, lcVar5));
                                            i4++;
                                            lcVar4 = null;
                                        }
                                        kw kwVar2 = new kw(3, lcVar5);
                                        kwVar2.c = kwVar.c;
                                        kwVar2.e = kwVar.e;
                                        kwVar2.d = kwVar.d;
                                        kwVar2.f = kwVar.f;
                                        kvVar.b.add(i4, kwVar2);
                                        arrayList3.remove(lcVar5);
                                        i4++;
                                        z2 = z4;
                                    }
                                    size--;
                                    z4 = z2;
                                }
                                if (z4) {
                                    kvVar.b.remove(i4);
                                    i4--;
                                    lcVar2 = lcVar4;
                                    break;
                                } else {
                                    kwVar.a = 1;
                                    arrayList3.add(lcVar3);
                                    lcVar2 = lcVar4;
                                    break;
                                }
                            case 3:
                            case 6:
                                arrayList3.remove(kwVar.b);
                                if (kwVar.b == lcVar) {
                                    kvVar.b.add(i6, new kw(9, kwVar.b));
                                    lcVar2 = null;
                                    i4 = i6 + 1;
                                    break;
                                }
                            case 4:
                            case 5:
                            default:
                                lcVar2 = lcVar;
                                i4 = i6;
                                break;
                            case 8:
                                kvVar.b.add(i6, new kw(9, lcVar));
                                lcVar2 = kwVar.b;
                                i4 = i6 + 1;
                                break;
                        }
                        i6 = i4 + 1;
                    }
                }
            } else {
                ArrayList arrayList4 = this.x;
                lcVar = lcVar2;
                for (int i8 = 0; i8 < kvVar.b.size(); i8++) {
                    kw kwVar3 = (kw) kvVar.b.get(i8);
                    switch (kwVar3.a) {
                        case 1:
                        case 7:
                            arrayList4.remove(kwVar3.b);
                            break;
                        case 3:
                        case 6:
                            arrayList4.add(kwVar3.b);
                            break;
                        case 8:
                            lcVar = null;
                            break;
                        case 9:
                            lcVar = kwVar3.b;
                            break;
                    }
                }
            }
            i5++;
            lcVar2 = lcVar;
        }
        this.x.clear();
        if (!z3) {
            mk.a(this, arrayList, arrayList2, i2, i3, false);
        }
        int i9 = i2;
        while (i9 < i3) {
            kv kvVar2 = (kv) arrayList.get(i9);
            if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                kvVar2.a(-1);
                kvVar2.a(i9 == i3 + -1);
            } else {
                kvVar2.a(1);
                kvVar2.e();
            }
            i9++;
        }
        if (z3) {
            qt qtVar = new qt();
            if (this.d > 0) {
                int min = Math.min(this.d, 4);
                int size2 = this.b.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    lc lcVar6 = (lc) this.b.get(i10);
                    if (lcVar6.d < min) {
                        a(lcVar6, min, lcVar6.D(), lcVar6.E(), false);
                        if (lcVar6.J != null && !lcVar6.C && lcVar6.O) {
                            qtVar.add(lcVar6);
                        }
                    }
                }
            }
            for (int i11 = i3 - 1; i11 >= i2; i11--) {
                kv kvVar3 = (kv) arrayList.get(i11);
                ((Boolean) arrayList2.get(i11)).booleanValue();
                for (int i12 = 0; i12 < kvVar3.b.size(); i12++) {
                    lc lcVar7 = ((kw) kvVar3.b.get(i12)).b;
                    if (lcVar7 != null && lcVar7.m && lcVar7.J != null && !lcVar7.D && !lcVar7.C) {
                        lcVar7.L();
                    }
                }
            }
            int size3 = qtVar.size();
            for (int i13 = 0; i13 < size3; i13++) {
                lc lcVar8 = (lc) qtVar.a[i13];
                if (!lcVar8.m) {
                    View view = lcVar8.J;
                    lcVar8.Q = view.getAlpha();
                    view.setAlpha(0.0f);
                }
            }
        }
        if (i3 != i2 && z3) {
            mk.a(this, arrayList, arrayList2, i2, i3, true);
            a(this.d, true);
        }
        while (i2 < i3) {
            kv kvVar4 = (kv) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue() && kvVar4.l >= 0) {
                int i14 = kvVar4.l;
                synchronized (this) {
                    this.p.set(i14, null);
                    if (this.q == null) {
                        this.q = new ArrayList();
                    }
                    this.q.add(Integer.valueOf(i14));
                }
                kvVar4.l = -1;
            }
            i2++;
        }
    }

    /* access modifiers changed from: public */
    private final void a(kv kvVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            kvVar.a(z4);
        } else {
            kvVar.e();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(kvVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            mk.a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            a(this.d, true);
        }
        if (this.n != null) {
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                lc lcVar = (lc) this.n.valueAt(i2);
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
                ((lf) this.A.remove(0)).a();
            }
        }
    }

    private final boolean c(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this) {
            if (this.l == null || this.l.size() == 0) {
                return false;
            }
            int size = this.l.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                z2 |= ((mc) this.l.get(i2)).a(arrayList, arrayList2);
            }
            this.l.clear();
            this.e.c.removeCallbacks(this.B);
            return z2;
        }
    }

    public final void k() {
        if (this.w) {
            this.w = false;
            v();
        }
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        if (this.c == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = this.c.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.c.remove(size));
            arrayList2.add(true);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = this.c.size() - 1;
                while (size2 >= 0) {
                    kv kvVar = (kv) this.c.get(size2);
                    if ((str != null && str.equals(kvVar.j)) || (i2 >= 0 && i2 == kvVar.l)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        kv kvVar2 = (kv) this.c.get(size2);
                        if ((str == null || !str.equals(kvVar2.j)) && (i2 < 0 || i2 != kvVar2.l)) {
                            break;
                        }
                        size2--;
                    }
                }
                i4 = size2;
            }
            if (i4 == this.c.size() - 1) {
                return false;
            }
            for (int size3 = this.c.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.c.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    static void a(me meVar) {
        if (meVar != null) {
            List<lc> list = meVar.a;
            if (list != null) {
                for (lc lcVar : list) {
                    lcVar.F = true;
                }
            }
            List<me> list2 = meVar.b;
            if (list2 != null) {
                for (me meVar2 : list2) {
                    a(meVar2);
                }
            }
        }
    }

    private final void y() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        me meVar;
        if (this.n != null) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            while (i2 < this.n.size()) {
                lc lcVar = (lc) this.n.valueAt(i2);
                if (lcVar != null) {
                    if (lcVar.E) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
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
                        arrayList2 = new ArrayList(this.n.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(meVar);
                    }
                    if (arrayList3 == null && lcVar.x != null) {
                        arrayList3 = new ArrayList(this.n.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(lcVar.x);
                    }
                }
                i2++;
                arrayList = arrayList;
                arrayList2 = arrayList2;
                arrayList3 = arrayList3;
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.k = null;
        } else {
            this.k = new me(arrayList, arrayList2, arrayList3);
        }
    }

    private final void j(lc lcVar) {
        if (lcVar.K != null) {
            if (this.z == null) {
                this.z = new SparseArray();
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

    public final Parcelable l() {
        int[] iArr;
        int size;
        boolean z2;
        Bundle bundle;
        Parcelable l2;
        kx[] kxVarArr = null;
        x();
        int size2 = this.n == null ? 0 : this.n.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lc lcVar = (lc) this.n.valueAt(i2);
            if (lcVar != null) {
                if (lcVar.I() != null) {
                    int K = lcVar.K();
                    View I = lcVar.I();
                    Animation animation = I.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        I.clearAnimation();
                    }
                    lcVar.a((View) null);
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
        int size3 = this.n.size();
        mh[] mhVarArr = new mh[size3];
        int i3 = 0;
        boolean z3 = false;
        while (i3 < size3) {
            lc lcVar2 = (lc) this.n.valueAt(i3);
            if (lcVar2 != null) {
                if (lcVar2.g < 0) {
                    a(new IllegalStateException("Failure saving state: active " + lcVar2 + " has cleared index: " + lcVar2.g));
                }
                mh mhVar = new mh(lcVar2);
                mhVarArr[i3] = mhVar;
                if (lcVar2.d <= 0 || mhVar.k != null) {
                    mhVar.k = lcVar2.e;
                } else {
                    if (this.y == null) {
                        this.y = new Bundle();
                    }
                    Bundle bundle2 = this.y;
                    lcVar2.d(bundle2);
                    if (!(lcVar2.v == null || (l2 = lcVar2.v.l()) == null)) {
                        bundle2.putParcelable("android:support:fragments", l2);
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
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", lcVar2.f);
                    }
                    if (!lcVar2.M) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", lcVar2.M);
                    }
                    mhVar.k = bundle;
                    if (lcVar2.j != null) {
                        if (lcVar2.j.g < 0) {
                            a(new IllegalStateException("Failure saving state: " + lcVar2 + " has target not in fragment manager: " + lcVar2.j));
                        }
                        if (mhVar.k == null) {
                            mhVar.k = new Bundle();
                        }
                        Bundle bundle3 = mhVar.k;
                        lc lcVar3 = lcVar2.j;
                        if (lcVar3.g < 0) {
                            a(new IllegalStateException("Fragment " + lcVar3 + " is not currently in the FragmentManager"));
                        }
                        bundle3.putInt("android:target_state", lcVar3.g);
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
        int size4 = this.b.size();
        if (size4 > 0) {
            iArr = new int[size4];
            for (int i4 = 0; i4 < size4; i4++) {
                iArr[i4] = ((lc) this.b.get(i4)).g;
                if (iArr[i4] < 0) {
                    a(new IllegalStateException("Failure saving state: active " + this.b.get(i4) + " has cleared index: " + iArr[i4]));
                }
            }
        } else {
            iArr = null;
        }
        if (this.c != null && (size = this.c.size()) > 0) {
            kxVarArr = new kx[size];
            for (int i5 = 0; i5 < size; i5++) {
                kxVarArr[i5] = new kx((kv) this.c.get(i5));
            }
        }
        mf mfVar = new mf();
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

    public final void a(Parcelable parcelable, me meVar) {
        List list;
        List list2;
        if (parcelable != null) {
            mf mfVar = (mf) parcelable;
            if (mfVar.a != null) {
                if (meVar != null) {
                    List list3 = meVar.a;
                    List list4 = meVar.b;
                    List list5 = meVar.c;
                    int size = list3 != null ? list3.size() : 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        lc lcVar = (lc) list3.get(i2);
                        int i3 = 0;
                        while (i3 < mfVar.a.length && mfVar.a[i3].b != lcVar.g) {
                            i3++;
                        }
                        if (i3 == mfVar.a.length) {
                            a(new IllegalStateException("Could not find active fragment with index " + lcVar.g));
                        }
                        mh mhVar = mfVar.a[i3];
                        mhVar.l = lcVar;
                        lcVar.f = null;
                        lcVar.s = 0;
                        lcVar.p = false;
                        lcVar.m = false;
                        lcVar.j = null;
                        if (mhVar.k != null) {
                            mhVar.k.setClassLoader(this.e.b.getClassLoader());
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
                this.n = new SparseArray(mfVar.a.length);
                for (int i4 = 0; i4 < mfVar.a.length; i4++) {
                    mh mhVar2 = mfVar.a[i4];
                    if (mhVar2 != null) {
                        me meVar2 = (list == null || i4 >= list.size()) ? null : (me) list.get(i4);
                        gt gtVar = null;
                        if (list2 != null && i4 < list2.size()) {
                            gtVar = (gt) list2.get(i4);
                        }
                        lm lmVar = this.e;
                        lk lkVar = this.f;
                        lc lcVar2 = this.s;
                        if (mhVar2.l == null) {
                            Context context = lmVar.b;
                            if (mhVar2.i != null) {
                                mhVar2.i.setClassLoader(context.getClassLoader());
                            }
                            if (lkVar != null) {
                                mhVar2.l = lkVar.a(context, mhVar2.a, mhVar2.i);
                            } else {
                                mhVar2.l = lc.a(context, mhVar2.a, mhVar2.i);
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
                            mhVar2.l.t = lmVar.d;
                        }
                        mhVar2.l.w = meVar2;
                        mhVar2.l.x = gtVar;
                        lc lcVar3 = mhVar2.l;
                        this.n.put(lcVar3.g, lcVar3);
                        mhVar2.l = null;
                    }
                }
                if (meVar != null) {
                    List list6 = meVar.a;
                    int size2 = list6 != null ? list6.size() : 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        lc lcVar4 = (lc) list6.get(i5);
                        if (lcVar4.k >= 0) {
                            lcVar4.j = (lc) this.n.get(lcVar4.k);
                            if (lcVar4.j == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + lcVar4 + " target no longer exists: " + lcVar4.k);
                            }
                        }
                    }
                }
                this.b.clear();
                if (mfVar.b != null) {
                    for (int i6 = 0; i6 < mfVar.b.length; i6++) {
                        lc lcVar5 = (lc) this.n.get(mfVar.b[i6]);
                        if (lcVar5 == null) {
                            a(new IllegalStateException("No instantiated fragment for index #" + mfVar.b[i6]));
                        }
                        lcVar5.m = true;
                        if (this.b.contains(lcVar5)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.b) {
                            this.b.add(lcVar5);
                        }
                    }
                }
                if (mfVar.c != null) {
                    this.c = new ArrayList(mfVar.c.length);
                    for (int i7 = 0; i7 < mfVar.c.length; i7++) {
                        kx kxVar = mfVar.c[i7];
                        kv kvVar = new kv(this);
                        int i8 = 0;
                        while (i8 < kxVar.a.length) {
                            kw kwVar = new kw();
                            int i9 = i8 + 1;
                            kwVar.a = kxVar.a[i8];
                            int i10 = i9 + 1;
                            int i11 = kxVar.a[i9];
                            if (i11 >= 0) {
                                kwVar.b = (lc) this.n.get(i11);
                            } else {
                                kwVar.b = null;
                            }
                            int i12 = i10 + 1;
                            kwVar.c = kxVar.a[i10];
                            int i13 = i12 + 1;
                            kwVar.d = kxVar.a[i12];
                            int i14 = i13 + 1;
                            kwVar.e = kxVar.a[i13];
                            i8 = i14 + 1;
                            kwVar.f = kxVar.a[i14];
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
                            int i15 = kvVar.l;
                            synchronized (this) {
                                if (this.p == null) {
                                    this.p = new ArrayList();
                                }
                                int size3 = this.p.size();
                                if (i15 < size3) {
                                    this.p.set(i15, kvVar);
                                } else {
                                    while (size3 < i15) {
                                        this.p.add(null);
                                        if (this.q == null) {
                                            this.q = new ArrayList();
                                        }
                                        this.q.add(Integer.valueOf(size3));
                                        size3++;
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
                    this.g = (lc) this.n.get(mfVar.d);
                }
                this.m = mfVar.e;
            }
        }
    }

    public final void m() {
        if (this.n != null) {
            for (int size = this.n.size() - 1; size >= 0; size--) {
                if (this.n.valueAt(size) == null) {
                    this.n.delete(this.n.keyAt(size));
                }
            }
        }
    }

    public final void a(lm lmVar, lk lkVar, lc lcVar) {
        if (this.e != null) {
            throw new IllegalStateException("Already attached");
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
            lc lcVar = (lc) this.b.get(i2);
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
            lc lcVar = (lc) this.b.get(size);
            if (!(lcVar == null || lcVar.v == null)) {
                lcVar.v.b(z2);
            }
        }
    }

    public final void c(boolean z2) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            lc lcVar = (lc) this.b.get(size);
            if (!(lcVar == null || lcVar.v == null)) {
                lcVar.v.c(z2);
            }
        }
    }

    public final void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            lc lcVar = (lc) this.b.get(i2);
            if (lcVar != null) {
                lcVar.onConfigurationChanged(configuration);
                if (lcVar.v != null) {
                    lcVar.v.a(configuration);
                }
            }
        }
    }

    public final void t() {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            lc lcVar = (lc) this.b.get(i2);
            if (lcVar != null) {
                lcVar.onLowMemory();
                if (lcVar.v != null) {
                    lcVar.v.t();
                }
            }
        }
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.d <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.b.size()) {
            lc lcVar = (lc) this.b.get(i2);
            if (lcVar != null) {
                if ((lcVar.C || lcVar.v == null) ? false : lcVar.v.a(menu, menuInflater) | false) {
                    z2 = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(lcVar);
                }
            }
            i2++;
            z2 = z2;
        }
        if (this.o != null) {
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                lc lcVar2 = (lc) this.o.get(i3);
                if (arrayList == null || !arrayList.contains(lcVar2)) {
                    lc.v();
                }
            }
        }
        this.o = arrayList;
        return z2;
    }

    public final boolean a(Menu menu) {
        if (this.d <= 0) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            lc lcVar = (lc) this.b.get(i2);
            if (lcVar != null) {
                if ((lcVar.C || lcVar.v == null) ? false : lcVar.v.a(menu) | false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final boolean a(MenuItem menuItem) {
        if (this.d <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            lc lcVar = (lc) this.b.get(i2);
            if (lcVar != null) {
                if (!lcVar.C && lcVar.v != null && lcVar.v.a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        if (this.d <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            lc lcVar = (lc) this.b.get(i2);
            if (lcVar != null) {
                if (!lcVar.C && lcVar.v != null && lcVar.v.b(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        if (this.d > 0) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                lc lcVar = (lc) this.b.get(i2);
                if (!(lcVar == null || lcVar.C || lcVar.v == null)) {
                    lcVar.v.b(menu);
                }
            }
        }
    }

    public final void h(lc lcVar) {
        if (lcVar == null || (this.n.get(lcVar.g) == lcVar && (lcVar.u == null || lcVar.t == this))) {
            this.g = lcVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + lcVar + " is not an active fragment of FragmentManager " + this);
    }

    private final void a(lc lcVar, Context context, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.a(lcVar, context, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void b(lc lcVar, Context context, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.b(lcVar, context, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void a(lc lcVar, Bundle bundle, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.a(lcVar, bundle, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void b(lc lcVar, Bundle bundle, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.b(lcVar, bundle, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void c(lc lcVar, Bundle bundle, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.c(lcVar, bundle, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void a(lc lcVar, View view, Bundle bundle, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.a(lcVar, view, bundle, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void b(lc lcVar, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.b(lcVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void c(lc lcVar, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.c(lcVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void d(lc lcVar, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.d(lcVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void e(lc lcVar, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.e(lcVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void d(lc lcVar, Bundle bundle, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.d(lcVar, bundle, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void f(lc lcVar, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.f(lcVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void g(lc lcVar, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.g(lcVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
            }
        }
    }

    private final void h(lc lcVar, boolean z2) {
        if (this.s != null) {
            lp lpVar = this.s.t;
            if (lpVar instanceof lp) {
                lpVar.h(lcVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            rf rfVar = (rf) it.next();
            if (z2) {
                ((Boolean) rfVar.a).booleanValue();
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

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        String str2;
        int i2;
        lc lcVar;
        int i3;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mb.a);
        if (attributeValue == null) {
            str2 = obtainStyledAttributes.getString(0);
        } else {
            str2 = attributeValue;
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!lc.a(this.e.b, str2)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        } else {
            i2 = 0;
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        lc a2 = resourceId != -1 ? a(resourceId) : null;
        if (a2 == null && string != null) {
            a2 = a(string);
        }
        if (a2 == null && i2 != -1) {
            a2 = a(i2);
        }
        if (a2 == null) {
            lc a3 = this.f.a(context, str2, null);
            a3.o = true;
            if (resourceId != 0) {
                i3 = resourceId;
            } else {
                i3 = i2;
            }
            a3.z = i3;
            a3.A = i2;
            a3.B = string;
            a3.p = true;
            a3.t = this;
            a3.u = this.e;
            Bundle bundle = a3.e;
            a3.o();
            a(a3, true);
            lcVar = a3;
        } else if (a2.p) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str2);
        } else {
            a2.p = true;
            a2.u = this.e;
            if (!a2.F) {
                Bundle bundle2 = a2.e;
                a2.o();
            }
            lcVar = a2;
        }
        if (this.d > 0 || !lcVar.o) {
            i(lcVar);
        } else {
            a(lcVar, 1, 0, 0, false);
        }
        if (lcVar.J == null) {
            throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        }
        if (resourceId != 0) {
            lcVar.J.setId(resourceId);
        }
        if (lcVar.J.getTag() == null) {
            lcVar.J.setTag(string);
        }
        return lcVar.J;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }
}
