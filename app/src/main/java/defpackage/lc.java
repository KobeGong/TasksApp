package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: lc  reason: default package */
/* compiled from: PG */
public class lc implements ak, ComponentCallbacks, View.OnCreateContextMenuListener, y {
    private static final ri a = new ri();
    public static final Object c = new Object();
    public int A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ViewGroup I;
    public View J;
    public View K;
    public boolean L;
    public boolean M = true;
    public le N;
    public boolean O;
    public boolean P;
    public float Q;
    public LayoutInflater R;
    public boolean S;
    public z T = new z(this);
    private boolean b = true;
    public int d = 0;
    public Bundle e;
    public SparseArray f;
    public int g = -1;
    public String h;
    public Bundle i;
    public lc j;
    public int k = -1;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public lp t;
    public lm u;
    public lp v;
    public me w;
    public gt x;
    public lc y;
    public int z;

    @Override // defpackage.y
    public final u a() {
        return this.T;
    }

    @Override // defpackage.ak
    public final gt b() {
        if (i() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.x == null) {
            this.x = new gt();
        }
        return this.x;
    }

    public static lc a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = (Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            lc lcVar = (lc) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(lcVar.getClass().getClassLoader());
                lcVar.e(bundle);
            }
            return lcVar;
        } catch (ClassNotFoundException e2) {
            throw new br("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new br("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new br("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new br("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new br("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    static boolean a(Context context, String str) {
        try {
            Class<?> cls = (Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            return lc.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, lc lcVar) {
        this.g = i2;
        if (lcVar != null) {
            this.h = lcVar.h + ":" + this.g;
        } else {
            this.h = "android:fragment:" + this.g;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.s > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        jd.a((Object) this, sb);
        if (this.g >= 0) {
            sb.append(" #");
            sb.append(this.g);
        }
        if (this.z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.z));
        }
        if (this.B != null) {
            sb.append(" ");
            sb.append(this.B);
        }
        sb.append('}');
        return sb.toString();
    }

    public final void e(Bundle bundle) {
        boolean h2;
        if (this.g >= 0) {
            if (this.t == null) {
                h2 = false;
            } else {
                h2 = this.t.h();
            }
            if (h2) {
                throw new IllegalStateException("Fragment already active and state has been saved");
            }
        }
        this.i = bundle;
    }

    public final Context i() {
        if (this.u == null) {
            return null;
        }
        return this.u.b;
    }

    public final lg j() {
        if (this.u == null) {
            return null;
        }
        return (lg) this.u.a;
    }

    public final Resources k() {
        Context i2 = i();
        if (i2 != null) {
            return i2.getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final String a(int i2) {
        return k().getString(i2);
    }

    public final String a(int i2, Object... objArr) {
        return k().getString(i2, objArr);
    }

    public final boolean l() {
        return this.u != null && this.m;
    }

    public static void m() {
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (this.u == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.u.a(this, intent, i2);
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public static void n() {
    }

    public LayoutInflater b(Bundle bundle) {
        if (this.u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater c2 = this.u.c();
        if (this.v == null) {
            c();
            if (this.d >= 5) {
                this.v.q();
            } else if (this.d >= 4) {
                this.v.p();
            } else if (this.d >= 2) {
                this.v.o();
            } else if (this.d > 0) {
                this.v.n();
            }
        }
        rz.b(c2, this.v);
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final LayoutInflater f(Bundle bundle) {
        this.R = b(bundle);
        return this.R;
    }

    public final void o() {
        Activity activity;
        this.H = true;
        if (this.u == null) {
            activity = null;
        } else {
            activity = this.u.a;
        }
        if (activity != null) {
            this.H = false;
            this.H = true;
        }
    }

    public static void p() {
    }

    public void a(Context context) {
        Activity activity;
        this.H = true;
        if (this.u == null) {
            activity = null;
        } else {
            activity = this.u.a;
        }
        if (activity != null) {
            this.H = false;
            this.H = true;
        }
    }

    public static Animation q() {
        return null;
    }

    public static Animator r() {
        return null;
    }

    public void a(Bundle bundle) {
        boolean z2 = true;
        this.H = true;
        g(bundle);
        if (this.v != null) {
            if (this.v.d <= 0) {
                z2 = false;
            }
            if (!z2) {
                this.v.n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.v == null) {
                c();
            }
            this.v.a(parcelable, this.w);
            this.w = null;
            this.v.n();
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a(View view, Bundle bundle) {
    }

    public void c(Bundle bundle) {
        this.H = true;
    }

    public void e() {
        this.H = true;
    }

    public void s() {
        this.H = true;
    }

    public void d(Bundle bundle) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    public void t() {
        this.H = true;
    }

    public void f() {
        this.H = true;
    }

    public void onLowMemory() {
        this.H = true;
    }

    public void g() {
        this.H = true;
    }

    public void u() {
        this.H = true;
        if (this.x != null && !this.u.d.h) {
            this.x.a();
        }
    }

    public void d() {
        this.H = true;
    }

    public static void v() {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        j().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void a_(Object obj) {
        C().g = obj;
    }

    public final Object w() {
        if (this.N == null) {
            return null;
        }
        return this.N.g;
    }

    public final Object x() {
        if (this.N == null) {
            return null;
        }
        if (this.N.h == c) {
            return w();
        }
        return this.N.h;
    }

    public final void b(Object obj) {
        C().i = obj;
    }

    public final Object y() {
        if (this.N == null) {
            return null;
        }
        return this.N.i;
    }

    public final Object z() {
        if (this.N == null) {
            return null;
        }
        if (this.N.j == c) {
            return y();
        }
        return this.N.j;
    }

    public final Object A() {
        if (this.N == null) {
        }
        return null;
    }

    public final Object B() {
        if (this.N == null || this.N.k == c) {
            return null;
        }
        return this.N.k;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.d);
        printWriter.print(" mIndex=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.b);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mRetaining=");
        printWriter.print(this.F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.M);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.y);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.i);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.e);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.j);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.l);
        }
        if (D() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(D());
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.J);
        }
        if (I() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(I());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(K());
        }
        na.a(this).a(str, fileDescriptor, printWriter, strArr);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.v + ":");
            this.v.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    private final void c() {
        if (this.u == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.v = new lp();
        this.v.a(this.u, new ld(this), this);
    }

    /* access modifiers changed from: package-private */
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.v != null) {
            this.v.noteStateNotSaved();
        }
        this.r = true;
        return a(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: package-private */
    public final le C() {
        if (this.N == null) {
            this.N = new le();
        }
        return this.N;
    }

    /* access modifiers changed from: package-private */
    public final int D() {
        if (this.N == null) {
            return 0;
        }
        return this.N.d;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (this.N != null || i2 != 0) {
            C().d = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final int E() {
        if (this.N == null) {
            return 0;
        }
        return this.N.e;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (this.N != null || i2 != 0 || i3 != 0) {
            C();
            this.N.e = i2;
            this.N.f = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public final int F() {
        if (this.N == null) {
            return 0;
        }
        return this.N.f;
    }

    /* access modifiers changed from: package-private */
    public final jd G() {
        if (this.N == null) {
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final jd H() {
        if (this.N == null) {
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View I() {
        if (this.N == null) {
            return null;
        }
        return this.N.a;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        C().a = view;
    }

    /* access modifiers changed from: package-private */
    public final void a(Animator animator) {
        C().b = animator;
    }

    /* access modifiers changed from: package-private */
    public final Animator J() {
        if (this.N == null) {
            return null;
        }
        return this.N.b;
    }

    /* access modifiers changed from: package-private */
    public final int K() {
        if (this.N == null) {
            return 0;
        }
        return this.N.c;
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        C().c = i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean L() {
        if (this.N == null) {
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean M() {
        if (this.N == null) {
            return false;
        }
        return this.N.l;
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        C().l = z2;
    }
}
