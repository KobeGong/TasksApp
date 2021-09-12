package defpackage;

/* renamed from: lc reason: default package */
/* compiled from: PG */
/* compiled from: Fragment */
public class Fragment implements ViewModelStoreOwner, android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, LifecycleOwner {
    private static final defpackage.ri a = new defpackage.ri();
    public static final java.lang.Object c = new java.lang.Object();
    public int mFragmentId;
    public java.lang.String tag;
    public boolean mHidden;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public android.view.ViewGroup I;
    public android.view.View mView;
    public android.view.View mInnerView;
    public boolean L;
    public boolean M = true;
    public defpackage.le N;
    public boolean O;
    public boolean mHiddenChanged;
    public float Q;
    public android.view.LayoutInflater layoutInflater;
    public boolean S;
    public defpackage.z T = new defpackage.z(this);
    private boolean b = true;
    public int d = 0;
    public android.os.Bundle e;
    public android.util.SparseArray f;
    public int g = -1;
    public java.lang.String h;
    public android.os.Bundle i;
    public Fragment j;
    public int k = -1;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public FragmentManagerImpl fragmentManager;
    public FragmentHostCallback mHost;
    public FragmentManagerImpl v;
    public defpackage.me w;
    public ViewModelStore x;
    public Fragment y;
    public int mContainerId;

    public final Lifecycle getLifecycle() {
        return this.T;
    }

    public final ViewModelStore getViewModelStore() {
        if (getContext() == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.x == null) {
            this.x = new ViewModelStore();
        }
        return this.x;
    }

    public static Fragment instantiate(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        try {
            java.lang.Class cls = (java.lang.Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            Fragment lcVar = (Fragment) cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(lcVar.getClass().getClassLoader());
                lcVar.e(bundle);
            }
            return lcVar;
        } catch (java.lang.ClassNotFoundException e2) {
            throw new defpackage.br("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", (java.lang.Exception) e2);
        } catch (java.lang.InstantiationException e3) {
            throw new defpackage.br("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", (java.lang.Exception) e3);
        } catch (java.lang.IllegalAccessException e4) {
            throw new defpackage.br("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", (java.lang.Exception) e4);
        } catch (java.lang.NoSuchMethodException e5) {
            throw new defpackage.br("Unable to instantiate fragment " + str + ": could not find Fragment constructor", (java.lang.Exception) e5);
        } catch (java.lang.reflect.InvocationTargetException e6) {
            throw new defpackage.br("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", (java.lang.Exception) e6);
        }
    }

    static boolean a(android.content.Context context, java.lang.String str) {
        try {
            java.lang.Class cls = (java.lang.Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (java.lang.ClassNotFoundException e2) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, Fragment lcVar) {
        this.g = i2;
        if (lcVar != null) {
            this.h = lcVar.h + ":" + this.g;
        } else {
            this.h = "android:fragment:" + this.g;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean h() {
        return this.s > 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        defpackage.jd.a((java.lang.Object) this, sb);
        if (this.g >= 0) {
            sb.append(" #");
            sb.append(this.g);
        }
        if (this.mContainerId != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(this.mContainerId));
        }
        if (this.tag != null) {
            sb.append(" ");
            sb.append(this.tag);
        }
        sb.append('}');
        return sb.toString();
    }

    public final void e(android.os.Bundle bundle) {
        boolean h2;
        if (this.g >= 0) {
            if (this.fragmentManager == null) {
                h2 = false;
            } else {
                h2 = this.fragmentManager.h();
            }
            if (h2) {
                throw new java.lang.IllegalStateException("Fragment already active and state has been saved");
            }
        }
        this.i = bundle;
    }

    public final android.content.Context getContext() {
        if (this.mHost == null) {
            return null;
        }
        return this.mHost.mContext;
    }

    public final FragmentActivity getActivity() {
        if (this.mHost == null) {
            return null;
        }
        return (FragmentActivity) this.mHost.mActivity;
    }

    public final android.content.res.Resources getResource() {
        android.content.Context i2 = getContext();
        if (i2 != null) {
            return i2.getResources();
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final java.lang.String a(int i2) {
        return getResource().getString(i2);
    }

    public final java.lang.String a(int i2, java.lang.Object... objArr) {
        return getResource().getString(i2, objArr);
    }

    public final boolean l() {
        return this.mHost != null && this.m;
    }

    public static void m() {
    }

    public void startActivityForResult(android.content.Intent intent, int i2) {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.mHost.startActivityForResult(this, intent, i2);
    }

    public void a(int i2, int i3, android.content.Intent intent) {
    }

    public static void n() {
    }

    public android.view.LayoutInflater b(android.os.Bundle bundle) {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        android.view.LayoutInflater c2 = this.mHost.onGetLayoutInflater();
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
        defpackage.rz.b(c2, this.v);
        return c2;
    }

    /* access modifiers changed from: 0000 */
    public final android.view.LayoutInflater f(android.os.Bundle bundle) {
        this.layoutInflater = b(bundle);
        return this.layoutInflater;
    }

    public final void o() {
        android.app.Activity activity;
        this.H = true;
        if (this.mHost == null) {
            activity = null;
        } else {
            activity = this.mHost.mActivity;
        }
        if (activity != null) {
            this.H = false;
            this.H = true;
        }
    }

    public static void p() {
    }

    public void a(android.content.Context context) {
        android.app.Activity activity;
        this.H = true;
        if (this.mHost == null) {
            activity = null;
        } else {
            activity = this.mHost.mActivity;
        }
        if (activity != null) {
            this.H = false;
            this.H = true;
        }
    }

    public static android.view.animation.Animation q() {
        return null;
    }

    public static android.animation.Animator r() {
        return null;
    }

    public void a(android.os.Bundle bundle) {
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

    /* access modifiers changed from: 0000 */
    public final void g(android.os.Bundle bundle) {
        if (bundle != null) {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.v == null) {
                    c();
                }
                this.v.a(parcelable, this.w);
                this.w = null;
                this.v.n();
            }
        }
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return null;
    }

    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
    }

    public void onActivityCreated(android.os.Bundle bundle) {
        this.H = true;
    }

    public void onStart() {
        this.H = true;
    }

    public void onResume() {
        this.H = true;
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.H = true;
    }

    public void onPause() {
        this.H = true;
    }

    public void onStop() {
        this.H = true;
    }

    public void onLowMemory() {
        this.H = true;
    }

    public void onDestroyView() {
        this.H = true;
    }

    public void onDestroy() {
        this.H = true;
        if (this.x != null && !this.mHost.mFragmentManager.h) {
            this.x.a();
        }
    }

    public void onDetach() {
        this.H = true;
    }

    public static void v() {
    }

    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void a_(java.lang.Object obj) {
        C().g = obj;
    }

    public final java.lang.Object w() {
        if (this.N == null) {
            return null;
        }
        return this.N.g;
    }

    public final java.lang.Object x() {
        if (this.N == null) {
            return null;
        }
        if (this.N.h == c) {
            return w();
        }
        return this.N.h;
    }

    public final void b(java.lang.Object obj) {
        C().i = obj;
    }

    public final java.lang.Object y() {
        if (this.N == null) {
            return null;
        }
        return this.N.i;
    }

    public final java.lang.Object z() {
        if (this.N == null) {
            return null;
        }
        if (this.N.j == c) {
            return y();
        }
        return this.N.j;
    }

    public final java.lang.Object A() {
        if (this.N == null) {
        }
        return null;
    }

    public final java.lang.Object B() {
        if (this.N == null || this.N.k == c) {
            return null;
        }
        return this.N.k;
    }

    public void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(java.lang.Integer.toHexString(this.mContainerId));
        printWriter.print(" mContainerId=#");
        printWriter.print(java.lang.Integer.toHexString(this.mFragmentId));
        printWriter.print(" mTag=");
        printWriter.println(this.tag);
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
        printWriter.print(this.mHidden);
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
        if (this.fragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.fragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
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
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (I() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(I());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(K());
        }
        defpackage.na.a(this).a(str, fileDescriptor, printWriter, strArr);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.v + ":");
            this.v.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    private final void c() {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException("Fragment has not been attached yet.");
        }
        this.v = new FragmentManagerImpl();
        this.v.a(this.mHost, (FragmentContainer) new defpackage.ld(this), this);
    }

    /* access modifiers changed from: 0000 */
    public final android.view.View b(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (this.v != null) {
            this.v.noteStateNotSaved();
        }
        this.r = true;
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.le C() {
        if (this.N == null) {
            this.N = new defpackage.le();
        }
        return this.N;
    }

    /* access modifiers changed from: 0000 */
    public final int D() {
        if (this.N == null) {
            return 0;
        }
        return this.N.d;
    }

    /* access modifiers changed from: 0000 */
    public final void setNextAnim(int i2) {
        if (this.N != null || i2 != 0) {
            C().d = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    public final int E() {
        if (this.N == null) {
            return 0;
        }
        return this.N.e;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3) {
        if (this.N != null || i2 != 0 || i3 != 0) {
            C();
            this.N.e = i2;
            this.N.f = i3;
        }
    }

    /* access modifiers changed from: 0000 */
    public final int F() {
        if (this.N == null) {
            return 0;
        }
        return this.N.f;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.jd G() {
        if (this.N == null) {
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.jd H() {
        if (this.N == null) {
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final android.view.View I() {
        if (this.N == null) {
            return null;
        }
        return this.N.a;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.view.View view) {
        C().a = view;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.animation.Animator animator) {
        C().b = animator;
    }

    /* access modifiers changed from: 0000 */
    public final android.animation.Animator J() {
        if (this.N == null) {
            return null;
        }
        return this.N.b;
    }

    /* access modifiers changed from: 0000 */
    public final int K() {
        if (this.N == null) {
            return 0;
        }
        return this.N.c;
    }

    /* access modifiers changed from: 0000 */
    public final void c(int i2) {
        C().c = i2;
    }

    /* access modifiers changed from: 0000 */
    public final boolean L() {
        if (this.N == null) {
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean M() {
        if (this.N == null) {
            return false;
        }
        return this.N.l;
    }

    /* access modifiers changed from: 0000 */
    public final void b(boolean z2) {
        C().l = z2;
    }
}
