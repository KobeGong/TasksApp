package defpackage;

/* renamed from: mj reason: default package */
/* compiled from: PG */
public abstract class FragmentTransaction {
    public abstract FragmentTransaction addToBackStack();

    public abstract FragmentTransaction replace(int i, Fragment lcVar, java.lang.String str);

    public abstract FragmentTransaction add(Fragment lcVar);

    public abstract FragmentTransaction add(Fragment lcVar, java.lang.String str);

    public abstract int commit();

    public abstract FragmentTransaction replace(Fragment lcVar);

    public abstract int commitAllowingStateLoss();

    public abstract FragmentTransaction remove(Fragment lcVar);

    public abstract void d();
}
