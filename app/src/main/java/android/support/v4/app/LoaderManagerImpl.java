package android.support.v4.app;

import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* compiled from: PG */
public final class LoaderManagerImpl extends na {
    private final y a;
    private final LoaderViewModel b;

    public LoaderManagerImpl(y yVar, gt gtVar) {
        this.a = yVar;
        this.b = LoaderViewModel.a(gtVar);
    }

    /* compiled from: PG */
    public class LoaderViewModel extends gm {
        private static final gn c = new gn();
        public rj a = new rj();
        public boolean b = false;

        static LoaderViewModel a(gt gtVar) {
            gl glVar = new gl(gtVar, c);
            String canonicalName = LoaderViewModel.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
            gm gmVar = (gm) glVar.a.a.get(str);
            if (!LoaderViewModel.class.isInstance(gmVar)) {
                LoaderViewModel loaderViewModel = new LoaderViewModel();
                gt gtVar2 = glVar.a;
                gm gmVar2 = (gm) gtVar2.a.get(str);
                if (gmVar2 != null) {
                    gmVar2.a();
                }
                gtVar2.a.put(str, loaderViewModel);
                gmVar = loaderViewModel;
            }
            return (LoaderViewModel) gmVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Unknown variable types count: 2 */
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
        @Override // defpackage.gm
        public final void a() {
            super.a();
            int b2 = this.a.b();
            for (int i = 0; i < b2; i++) {
                ((nc) this.a.c(i)).d();
            }
            rj rjVar = this.a;
            int i2 = rjVar.e;
            Object[] objArr = rjVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            rjVar.e = 0;
            rjVar.b = false;
        }
    }

    /* JADX INFO: finally extract failed */
    private final oc b(int i, nb nbVar) {
        try {
            this.b.b = true;
            oc i_ = nbVar.i_();
            if (!i_.getClass().isMemberClass() || Modifier.isStatic(i_.getClass().getModifiers())) {
                nc ncVar = new nc(i, null, i_);
                this.b.a.a(i, ncVar);
                this.b.b = false;
                return ncVar.a(this.a, nbVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + i_);
        } catch (Throwable th) {
            this.b.b = false;
            throw th;
        }
    }

    @Override // defpackage.na
    public final oc a(int i, nb nbVar) {
        if (this.b.b) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        } else {
            nc a2 = this.b.a(i);
            if (a2 == null) {
                return b(i, nbVar);
            }
            return a2.a(this.a, nbVar);
        }
    }

    @Override // defpackage.na
    public final void a() {
        if (this.b.b) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        } else {
            nc a2 = this.b.a(54321);
            if (a2 != null) {
                a2.d();
                rj rjVar = this.b.a;
                int a3 = qv.a(rjVar.c, rjVar.e, 54321);
                if (a3 >= 0 && rjVar.d[a3] != rj.a) {
                    rjVar.d[a3] = rj.a;
                    rjVar.b = true;
                }
            }
        }
    }

    @Override // defpackage.na
    public final void b() {
        LoaderViewModel loaderViewModel = this.b;
        int b2 = loaderViewModel.a.b();
        for (int i = 0; i < b2; i++) {
            ((nc) loaderViewModel.a.c(i)).c();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        jd.a((Object) this.a, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // defpackage.na
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        LoaderViewModel loaderViewModel = this.b;
        if (loaderViewModel.a.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < loaderViewModel.a.b(); i++) {
                nc ncVar = (nc) loaderViewModel.a.c(i);
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
                    nd ndVar = ncVar.j;
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(ndVar.b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Object obj = ncVar.d;
                if (obj == ac.b) {
                    obj = null;
                }
                StringBuilder sb = new StringBuilder(64);
                jd.a(obj, sb);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(ncVar.c > 0);
            }
        }
    }
}
