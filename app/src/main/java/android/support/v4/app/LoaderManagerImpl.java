package android.support.v4.app;

import defpackage.LifecycleOwner;
import defpackage.ViewModelStore;

/* compiled from: PG */
public final class LoaderManagerImpl extends defpackage.na {
    private final LifecycleOwner a;
    private final android.support.v4.app.LoaderManagerImpl.LoaderViewModel b;

    /* compiled from: PG */
    public class LoaderViewModel extends defpackage.gm {
        private static final defpackage.gn c = new defpackage.gn();
        public defpackage.rj a = new defpackage.rj();
        public boolean b = false;

        static android.support.v4.app.LoaderManagerImpl.LoaderViewModel a(ViewModelStore gtVar) {
            defpackage.gl glVar = new defpackage.gl(gtVar, c);
            java.lang.Class<android.support.v4.app.LoaderManagerImpl.LoaderViewModel> cls = android.support.v4.app.LoaderManagerImpl.LoaderViewModel.class;
            java.lang.String canonicalName = cls.getCanonicalName();
            if (canonicalName == null) {
                throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            java.lang.String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
            defpackage.gm gmVar = (defpackage.gm) glVar.a.a.get(str);
            if (!cls.isInstance(gmVar)) {
                defpackage.gm loaderViewModel = new android.support.v4.app.LoaderManagerImpl.LoaderViewModel();
                ViewModelStore gtVar2 = glVar.a;
                defpackage.gm gmVar2 = (defpackage.gm) gtVar2.a.get(str);
                if (gmVar2 != null) {
                    gmVar2.a();
                }
                gtVar2.a.put(str, loaderViewModel);
                gmVar = loaderViewModel;
            }
            return (android.support.v4.app.LoaderManagerImpl.LoaderViewModel) gmVar;
        }

        /* JADX WARNING: type inference failed for: r0v5 */
        /* JADX WARNING: type inference failed for: r0v6 */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final defpackage.nc a(int r5) {
            /*
                r4 = this;
                rj r0 = r4.a
                int[] r1 = r0.c
                int r2 = r0.e
                int r1 = defpackage.qv.a(r1, r2, r5)
                if (r1 < 0) goto L_0x0014
                java.lang.Object[] r2 = r0.d
                r2 = r2[r1]
                java.lang.Object r3 = defpackage.rj.a
                if (r2 != r3) goto L_0x0018
            L_0x0014:
                r0 = 0
            L_0x0015:
                nc r0 = (defpackage.nc) r0
                return r0
            L_0x0018:
                java.lang.Object[] r0 = r0.d
                r0 = r0[r1]
                goto L_0x0015
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderViewModel.a(int):nc");
        }

        /* access modifiers changed from: protected */
        public final void a() {
            super.a();
            int b2 = this.a.b();
            for (int i = 0; i < b2; i++) {
                ((defpackage.nc) this.a.c(i)).d();
            }
            defpackage.rj rjVar = this.a;
            int i2 = rjVar.e;
            java.lang.Object[] objArr = rjVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            rjVar.e = 0;
            rjVar.b = false;
        }
    }

    public LoaderManagerImpl(LifecycleOwner yVar, ViewModelStore gtVar) {
        this.a = yVar;
        this.b = android.support.v4.app.LoaderManagerImpl.LoaderViewModel.a(gtVar);
    }

    /* JADX INFO: finally extract failed */
    private final defpackage.oc b(int i, defpackage.nb nbVar) {
        try {
            this.b.b = true;
            defpackage.oc i_ = nbVar.i_();
            if (!i_.getClass().isMemberClass() || java.lang.reflect.Modifier.isStatic(i_.getClass().getModifiers())) {
                defpackage.nc ncVar = new defpackage.nc(i, null, i_);
                this.b.a.a(i, ncVar);
                this.b.b = false;
                return ncVar.a(this.a, nbVar);
            }
            throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + i_);
        } catch (Throwable th) {
            this.b.b = false;
            throw th;
        }
    }

    public final defpackage.oc a(int i, defpackage.nb nbVar) {
        if (this.b.b) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        } else if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("initLoader must be called on the main thread");
        } else {
            defpackage.nc a2 = this.b.a(i);
            if (a2 == null) {
                return b(i, nbVar);
            }
            return a2.a(this.a, nbVar);
        }
    }

    public final void a() {
        if (this.b.b) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        } else if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("destroyLoader must be called on the main thread");
        } else {
            defpackage.nc a2 = this.b.a(54321);
            if (a2 != null) {
                a2.d();
                defpackage.rj rjVar = this.b.a;
                int a3 = defpackage.qv.a(rjVar.c, rjVar.e, 54321);
                if (a3 >= 0 && rjVar.d[a3] != defpackage.rj.a) {
                    rjVar.d[a3] = defpackage.rj.a;
                    rjVar.b = true;
                }
            }
        }
    }

    public final void b() {
        android.support.v4.app.LoaderManagerImpl.LoaderViewModel loaderViewModel = this.b;
        int b2 = loaderViewModel.a.b();
        for (int i = 0; i < b2; i++) {
            ((defpackage.nc) loaderViewModel.a.c(i)).c();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        defpackage.jd.a((java.lang.Object) this.a, sb);
        sb.append("}}");
        return sb.toString();
    }

    public final void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        boolean z;
        android.support.v4.app.LoaderManagerImpl.LoaderViewModel loaderViewModel = this.b;
        if (loaderViewModel.a.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            java.lang.String str2 = str + "    ";
            for (int i = 0; i < loaderViewModel.a.b(); i++) {
                defpackage.nc ncVar = (defpackage.nc) loaderViewModel.a.c(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(loaderViewModel.a.b(i));
                printWriter.print(": ");
                printWriter.println(ncVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(ncVar.g);
                printWriter.print(" mArgs=");
                printWriter.println(ncVar.h);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(ncVar.i);
                ncVar.i.a(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (ncVar.j != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(ncVar.j);
                    defpackage.nd ndVar = ncVar.j;
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(ndVar.b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                java.lang.Object obj = ncVar.d;
                if (obj == defpackage.ac.b) {
                    obj = null;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
                defpackage.jd.a(obj, sb);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                if (ncVar.c > 0) {
                    z = true;
                } else {
                    z = false;
                }
                printWriter.println(z);
            }
        }
    }
}
