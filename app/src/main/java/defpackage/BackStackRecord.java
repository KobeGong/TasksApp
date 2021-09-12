package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: kv reason: default package */
/* compiled from: PG */
final class BackStackRecord extends FragmentTransaction implements defpackage.mc {
    public final FragmentManagerImpl mManager;
    public java.util.ArrayList ops = new java.util.ArrayList();
    public int mEnterAnim;
    public int mExitAnim;
    public int mPopEnterAnim;
    public int mPopExitAnim;
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
    public boolean mReorderingAllowed = false;
    private boolean mAllowAddToBackStack = true;

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

    public BackStackRecord(FragmentManagerImpl lpVar) {
        this.mManager = lpVar;
    }

    /* access modifiers changed from: 0000 */
    public final void a(FragmentTransactionOP kwVar) {
        this.ops.add(kwVar);
        kwVar.mEnterAnim = this.mEnterAnim;
        kwVar.mExitAnim = this.mExitAnim;
        kwVar.mPopEnterAnim = this.mPopEnterAnim;
        kwVar.mPopExitAnim = this.mPopExitAnim;
    }

    public final FragmentTransaction add(Fragment lcVar, java.lang.String str) {
        a(0, lcVar, str, 1);
        return this;
    }

    public final FragmentTransaction add(Fragment lcVar) {
        a(R.id.license_menu_fragment_container, lcVar, null, 1);
        return this;
    }

    private final void a(int id, Fragment fragment, java.lang.String tag, int op) {
        java.lang.Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            throw new java.lang.IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        fragment.fragmentManager = this.mManager;
        if (tag != null) {
            if (fragment.tag == null || tag.equals(fragment.tag)) {
                fragment.tag = tag;
            } else {
                throw new java.lang.IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.tag + " now " + tag);
            }
        }
        if (id != 0) {
            if (id == -1) {
                throw new java.lang.IllegalArgumentException("Can't add fragment " + fragment + " with tag " + tag + " to container view with no id");
            } else if (fragment.mContainerId == 0 || fragment.mContainerId == id) {
                fragment.mContainerId = id;
                fragment.mFragmentId = id;
            } else {
                throw new java.lang.IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mContainerId + " now " + id);
            }
        }
        a(new FragmentTransactionOP(op, fragment));
    }

    public final FragmentTransaction replace(Fragment lcVar) {
        return replace(R.id.fragment_container, lcVar, null);
    }

    public final FragmentTransaction replace(int i2, Fragment lcVar, java.lang.String str) {
        a(R.id.fragment_container, lcVar, str, 2);
        return this;
    }

    public final FragmentTransaction remove(Fragment lcVar) {
        a(new FragmentTransactionOP(3, lcVar));
        return this;
    }

    public final FragmentTransaction addToBackStack() {
        if (!this.mAllowAddToBackStack) {
            throw new java.lang.IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.j = null;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (this.i) {
            int size = this.ops.size();
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransactionOP kwVar = (FragmentTransactionOP) this.ops.get(i3);
                if (kwVar.b != null) {
                    kwVar.b.s += i2;
                }
            }
        }
    }

    public final int commit() {
        return commitInternal(false);
    }

    public final int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    public final void d() {
        if (this.i) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.mAllowAddToBackStack = false;
        FragmentManagerImpl manager = this.mManager;
        manager.ensureExecReady(false);
        if (a(manager.mTmpRecords, manager.mTmpIsPop)) {
            manager.mExecutingActions = true;
            try {
                manager.a(manager.mTmpRecords, manager.mTmpIsPop);
            } finally {
                manager.i();
            }
        }
        manager.k();
        manager.m();
    }

    private final int commitInternal(boolean allowStateLoss) {
        if (this.k) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        this.k = true;
        if (this.i) {
            this.l = this.mManager.a(this);
        } else {
            this.l = -1;
        }
        this.mManager.a((defpackage.mc) this, allowStateLoss);
        return this.l;
    }

    public final boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.i) {
            FragmentManagerImpl lpVar = this.mManager;
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
        int size = this.ops.size();
        for (int i4 = 0; i4 < size; i4++) {
            FragmentTransactionOP kwVar = (FragmentTransactionOP) this.ops.get(i4);
            if (kwVar.b != null) {
                i3 = kwVar.b.mFragmentId;
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
        int size = this.ops.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransactionOP kwVar = (FragmentTransactionOP) this.ops.get(i2);
            Fragment lcVar = kwVar.b;
            if (lcVar != null) {
                lcVar.a(this.g, this.h);
            }
            switch (kwVar.mCmd) {
                case 1:
                    lcVar.setNextAnim(kwVar.mEnterAnim);
                    this.mManager.a(lcVar, false);
                    break;
                case 3:
                    lcVar.setNextAnim(kwVar.mExitAnim);
                    this.mManager.c(lcVar);
                    break;
                case 4:
                    lcVar.setNextAnim(kwVar.mExitAnim);
                    FragmentManagerImpl.hideFragment(lcVar);
                    break;
                case 5:
                    lcVar.setNextAnim(kwVar.mEnterAnim);
                    FragmentManagerImpl.showFragment(lcVar);
                    break;
                case 6:
                    lcVar.setNextAnim(kwVar.mExitAnim);
                    this.mManager.f(lcVar);
                    break;
                case 7:
                    lcVar.setNextAnim(kwVar.mEnterAnim);
                    this.mManager.g(lcVar);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(lcVar);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + kwVar.mCmd);
            }
            if (!(this.mReorderingAllowed || kwVar.mCmd == 1 || lcVar == null)) {
                this.mManager.moveFragmentToExpectedState(lcVar);
            }
        }
        if (!this.mReorderingAllowed) {
            this.mManager.moveToState(this.mManager.d, true);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean moveToState) {
        for (int size = this.ops.size() - 1; size >= 0; size--) {
            FragmentTransactionOP kwVar = (FragmentTransactionOP) this.ops.get(size);
            Fragment fragment = kwVar.b;
            if (fragment != null) {
                fragment.a(FragmentManagerImpl.d(this.g), this.h);
            }
            switch (kwVar.mCmd) {
                case 1:
                    fragment.setNextAnim(kwVar.mPopExitAnim);
                    this.mManager.c(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(kwVar.mPopEnterAnim);
                    this.mManager.a(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(kwVar.mPopEnterAnim);
                    FragmentManagerImpl.showFragment(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(kwVar.mPopExitAnim);
                    FragmentManagerImpl.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(kwVar.mPopEnterAnim);
                    this.mManager.g(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(kwVar.mPopExitAnim);
                    this.mManager.f(fragment);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(fragment);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + kwVar.mCmd);
            }
            if (!(this.mReorderingAllowed || kwVar.mCmd == 3 || fragment == null)) {
                this.mManager.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.mReorderingAllowed && moveToState) {
            this.mManager.moveToState(this.mManager.d, true);
        }
    }
}
