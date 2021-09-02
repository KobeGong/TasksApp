package defpackage;

/* renamed from: kv reason: default package */
/* compiled from: PG */
final class kv extends defpackage.mj implements defpackage.mc {
    public final FragmentManagerImpl a;
    public java.util.ArrayList b = new java.util.ArrayList();
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public java.lang.String j;
    public boolean k;
    public int l = -1;
    public int m;
    public java.lang.CharSequence n;
    public int o;
    public java.lang.CharSequence p;
    public java.util.ArrayList q;
    public java.util.ArrayList r;
    public boolean s = false;
    private boolean t = true;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
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

    public kv(FragmentManagerImpl lpVar) {
        this.a = lpVar;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.kw kwVar) {
        this.b.add(kwVar);
        kwVar.c = this.c;
        kwVar.d = this.d;
        kwVar.e = this.e;
        kwVar.f = this.f;
    }

    public final defpackage.mj a(Fragment lcVar, java.lang.String str) {
        a(0, lcVar, str, 1);
        return this;
    }

    public final defpackage.mj a(Fragment lcVar) {
        a(2131755306, lcVar, null, 1);
        return this;
    }

    private final void a(int i2, Fragment lcVar, java.lang.String str, int i3) {
        java.lang.Class cls = lcVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            throw new java.lang.IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        lcVar.t = this.a;
        if (str != null) {
            if (lcVar.B == null || str.equals(lcVar.B)) {
                lcVar.B = str;
            } else {
                throw new java.lang.IllegalStateException("Can't change tag of fragment " + lcVar + ": was " + lcVar.B + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new java.lang.IllegalArgumentException("Can't add fragment " + lcVar + " with tag " + str + " to container view with no id");
            } else if (lcVar.z == 0 || lcVar.z == i2) {
                lcVar.z = i2;
                lcVar.A = i2;
            } else {
                throw new java.lang.IllegalStateException("Can't change container ID of fragment " + lcVar + ": was " + lcVar.z + " now " + i2);
            }
        }
        a(new defpackage.kw(i3, lcVar));
    }

    public final defpackage.mj b(Fragment lcVar) {
        return a(2131755276, lcVar, null);
    }

    public final defpackage.mj a(int i2, Fragment lcVar, java.lang.String str) {
        a(2131755276, lcVar, str, 2);
        return this;
    }

    public final defpackage.mj c(Fragment lcVar) {
        a(new defpackage.kw(3, lcVar));
        return this;
    }

    public final defpackage.mj a() {
        if (!this.t) {
            throw new java.lang.IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.j = null;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (this.i) {
            int size = this.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                defpackage.kw kwVar = (defpackage.kw) this.b.get(i3);
                if (kwVar.b != null) {
                    kwVar.b.s += i2;
                }
            }
        }
    }

    public final int b() {
        return b(false);
    }

    public final int c() {
        return b(true);
    }

    public final void d() {
        if (this.i) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.t = false;
        FragmentManagerImpl lpVar = this.a;
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
            throw new java.lang.IllegalStateException("commit already called");
        }
        this.k = true;
        if (this.i) {
            this.l = this.a.a(this);
        } else {
            this.l = -1;
        }
        this.a.a((defpackage.mc) this, z);
        return this.l;
    }

    public final boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        arrayList.add(this);
        arrayList2.add(java.lang.Boolean.valueOf(false));
        if (this.i) {
            FragmentManagerImpl lpVar = this.a;
            if (lpVar.c == null) {
                lpVar.c = new java.util.ArrayList();
            }
            lpVar.c.add(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(int i2) {
        int i3;
        int size = this.b.size();
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.kw kwVar = (defpackage.kw) this.b.get(i4);
            if (kwVar.b != null) {
                i3 = kwVar.b.A;
            } else {
                i3 = 0;
            }
            if (i3 != 0 && i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.kw kwVar = (defpackage.kw) this.b.get(i2);
            Fragment lcVar = kwVar.b;
            if (lcVar != null) {
                lcVar.a(this.g, this.h);
            }
            switch (kwVar.a) {
                case 1:
                    lcVar.b(kwVar.c);
                    this.a.a(lcVar, false);
                    break;
                case 3:
                    lcVar.b(kwVar.d);
                    this.a.c(lcVar);
                    break;
                case 4:
                    lcVar.b(kwVar.d);
                    FragmentManagerImpl.d(lcVar);
                    break;
                case 5:
                    lcVar.b(kwVar.c);
                    FragmentManagerImpl.e(lcVar);
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
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + kwVar.a);
            }
            if (!(this.s || kwVar.a == 1 || lcVar == null)) {
                this.a.a(lcVar);
            }
        }
        if (!this.s) {
            this.a.a(this.a.d, true);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            defpackage.kw kwVar = (defpackage.kw) this.b.get(size);
            Fragment lcVar = kwVar.b;
            if (lcVar != null) {
                lcVar.a(FragmentManagerImpl.d(this.g), this.h);
            }
            switch (kwVar.a) {
                case 1:
                    lcVar.b(kwVar.f);
                    this.a.c(lcVar);
                    break;
                case 3:
                    lcVar.b(kwVar.e);
                    this.a.a(lcVar, false);
                    break;
                case 4:
                    lcVar.b(kwVar.e);
                    FragmentManagerImpl.e(lcVar);
                    break;
                case 5:
                    lcVar.b(kwVar.f);
                    FragmentManagerImpl.d(lcVar);
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
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + kwVar.a);
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
