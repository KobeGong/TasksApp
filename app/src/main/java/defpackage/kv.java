package defpackage;

import com.google.android.apps.tasks.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: kv  reason: default package */
/* compiled from: PG */
public final class kv extends mj implements mc {
    public final lp a;
    public ArrayList b = new ArrayList();
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String j;
    public boolean k;
    public int l = -1;
    public int m;
    public CharSequence n;
    public int o;
    public CharSequence p;
    public ArrayList q;
    public ArrayList r;
    public boolean s = false;
    private boolean t = true;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.l >= 0) {
            sb.append(" #");
            sb.append(this.l);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }

    public kv(lp lpVar) {
        this.a = lpVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(kw kwVar) {
        this.b.add(kwVar);
        kwVar.c = this.c;
        kwVar.d = this.d;
        kwVar.e = this.e;
        kwVar.f = this.f;
    }

    @Override // defpackage.mj
    public final mj a(lc lcVar, String str) {
        a(0, lcVar, str, 1);
        return this;
    }

    @Override // defpackage.mj
    public final mj a(lc lcVar) {
        a(R.id.license_menu_fragment_container, lcVar, null, 1);
        return this;
    }

    private final void a(int i2, lc lcVar, String str, int i3) {
        Class<?> cls = lcVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        lcVar.t = this.a;
        if (str != null) {
            if (lcVar.B == null || str.equals(lcVar.B)) {
                lcVar.B = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + lcVar + ": was " + lcVar.B + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + lcVar + " with tag " + str + " to container view with no id");
            } else if (lcVar.z == 0 || lcVar.z == i2) {
                lcVar.z = i2;
                lcVar.A = i2;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + lcVar + ": was " + lcVar.z + " now " + i2);
            }
        }
        a(new kw(i3, lcVar));
    }

    @Override // defpackage.mj
    public final mj b(lc lcVar) {
        return a(R.id.fragment_container, lcVar, null);
    }

    @Override // defpackage.mj
    public final mj a(int i2, lc lcVar, String str) {
        a(R.id.fragment_container, lcVar, str, 2);
        return this;
    }

    @Override // defpackage.mj
    public final mj c(lc lcVar) {
        a(new kw(3, lcVar));
        return this;
    }

    @Override // defpackage.mj
    public final mj a() {
        if (!this.t) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.j = null;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.i) {
            int size = this.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                kw kwVar = (kw) this.b.get(i3);
                if (kwVar.b != null) {
                    kwVar.b.s += i2;
                }
            }
        }
    }

    @Override // defpackage.mj
    public final int b() {
        return b(false);
    }

    @Override // defpackage.mj
    public final int c() {
        return b(true);
    }

    @Override // defpackage.mj
    public final void d() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.t = false;
        lp lpVar = this.a;
        lpVar.a(false);
        if (a(lpVar.i, lpVar.j)) {
            lpVar.a = true;
            try {
                lpVar.a(lpVar.i, lpVar.j);
            } finally {
                lpVar.i();
            }
        }
        lpVar.k();
        lpVar.m();
    }

    private final int b(boolean z) {
        if (this.k) {
            throw new IllegalStateException("commit already called");
        }
        this.k = true;
        if (this.i) {
            this.l = this.a.a(this);
        } else {
            this.l = -1;
        }
        this.a.a(this, z);
        return this.l;
    }

    @Override // defpackage.mc
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.i) {
            return true;
        }
        lp lpVar = this.a;
        if (lpVar.c == null) {
            lpVar.c = new ArrayList();
        }
        lpVar.c.add(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i2) {
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            kw kwVar = (kw) this.b.get(i3);
            int i4 = kwVar.b != null ? kwVar.b.A : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            kw kwVar = (kw) this.b.get(i2);
            lc lcVar = kwVar.b;
            if (lcVar != null) {
                lcVar.a(this.g, this.h);
            }
            switch (kwVar.a) {
                case 1:
                    lcVar.b(kwVar.c);
                    this.a.a(lcVar, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + kwVar.a);
                case 3:
                    lcVar.b(kwVar.d);
                    this.a.c(lcVar);
                    break;
                case 4:
                    lcVar.b(kwVar.d);
                    lp.d(lcVar);
                    break;
                case 5:
                    lcVar.b(kwVar.c);
                    lp.e(lcVar);
                    break;
                case 6:
                    lcVar.b(kwVar.d);
                    this.a.f(lcVar);
                    break;
                case 7:
                    lcVar.b(kwVar.c);
                    this.a.g(lcVar);
                    break;
                case 8:
                    this.a.h(lcVar);
                    break;
                case 9:
                    this.a.h(null);
                    break;
            }
            if (!(this.s || kwVar.a == 1 || lcVar == null)) {
                this.a.a(lcVar);
            }
        }
        if (!this.s) {
            this.a.a(this.a.d, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            kw kwVar = (kw) this.b.get(size);
            lc lcVar = kwVar.b;
            if (lcVar != null) {
                lcVar.a(lp.d(this.g), this.h);
            }
            switch (kwVar.a) {
                case 1:
                    lcVar.b(kwVar.f);
                    this.a.c(lcVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + kwVar.a);
                case 3:
                    lcVar.b(kwVar.e);
                    this.a.a(lcVar, false);
                    break;
                case 4:
                    lcVar.b(kwVar.e);
                    lp.e(lcVar);
                    break;
                case 5:
                    lcVar.b(kwVar.f);
                    lp.d(lcVar);
                    break;
                case 6:
                    lcVar.b(kwVar.e);
                    this.a.g(lcVar);
                    break;
                case 7:
                    lcVar.b(kwVar.f);
                    this.a.f(lcVar);
                    break;
                case 8:
                    this.a.h(null);
                    break;
                case 9:
                    this.a.h(lcVar);
                    break;
            }
            if (!(this.s || kwVar.a == 3 || lcVar == null)) {
                this.a.a(lcVar);
            }
        }
        if (!this.s && z) {
            this.a.a(this.a.d, true);
        }
    }
}
